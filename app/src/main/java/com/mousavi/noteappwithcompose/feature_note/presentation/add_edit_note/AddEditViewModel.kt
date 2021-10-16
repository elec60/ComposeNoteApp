package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mousavi.noteappwithcompose.feature_note.domain.model.InvalidNoteException
import com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditEvent
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditNoteState
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.OneTimeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddEditViewModel @Inject constructor(
    private val useCases: NoteUseCases,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private var _state = mutableStateOf(AddEditNoteState())
    val state: State<AddEditNoteState> = _state

    private var noteId: Int? = -1

    private val _flowEvent = MutableSharedFlow<OneTimeUiState>()
    val flowEvent = _flowEvent.asSharedFlow()

    init {
        noteId = savedStateHandle.get<Int>("noteId")

        if (noteId != -1) {
            viewModelScope.launch {
                useCases.getNote(noteId!!)?.let { note ->
                    _state.value = state.value.copy(
                        title = note.title,
                        content = note.content,
                        color = Color(note.color)
                    )
                }
            }
        }
    }

    fun onEvent(event: AddEditEvent) {
        when (event) {
            is AddEditEvent.Save -> {
                viewModelScope.launch {
                    try {
                        useCases.addNote(event.note.copy(id = noteId))
                        _flowEvent.emit(OneTimeUiState.NavigateUp)
                    } catch (e: InvalidNoteException) {
                        _flowEvent.emit(
                            OneTimeUiState.Snackbar(
                                e.message ?: "an error occurred."
                            )
                        )
                    }

                }
            }
            is AddEditEvent.Content -> {
                _state.value = state.value.copy(
                    content = event.value
                )
            }
            is AddEditEvent.Title -> {
                _state.value = state.value.copy(
                    title = event.value
                )
            }
        }
    }
}