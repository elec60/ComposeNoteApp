package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
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
    private var color: Int? = -1

    private val _flowEvent = MutableSharedFlow<Boolean>()
    val flowEvent: SharedFlow<Boolean> = _flowEvent

    init {
        noteId = savedStateHandle.get<Int>("noteId")
        color = savedStateHandle.get<Int>("color")
    }

    fun onEvent(event: AddEditEvent) {
        when (event) {
            is AddEditEvent.Save -> {
                viewModelScope.launch {
                    useCases.addNote(event.note)
                    _flowEvent.emit(true)
                }
            }
        }
    }
}