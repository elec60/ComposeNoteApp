package com.mousavi.noteappwithcompose.feature_note.presentation.notes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mousavi.noteappwithcompose.feature_note.domain.model.Note
import com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases
import com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder
import com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
      private val noteUseCases: NoteUseCases
): ViewModel(){

      private val _state = mutableStateOf(NotesState())
      val state: State<NotesState> = _state

      private var getNotesJob: Job? = null

      private var recentlyDeletedNote: Note? = null

      init {
            getNotes(NoteOrder.Date(OrderType.Descending))
      }

      fun onEvent(event: NotesEvent) {
            when (event) {
                  is NotesEvent.DeleteNote -> {
                        viewModelScope.launch {
                              noteUseCases.deleteNote.invoke(event.note)
                              recentlyDeletedNote = event.note
                        }
                  }
                  is NotesEvent.Order -> {
                        getNotes(event.noteOrder)
                  }
                  is NotesEvent.RestoreNote -> {
                        viewModelScope.launch {
                              recentlyDeletedNote?.let {
                                    noteUseCases.addNote(it)
                              }
                              recentlyDeletedNote = null
                        }
                  }
                  is NotesEvent.ToggleOrderSection -> {
                        _state.value = state.value.copy(
                              isOrderSectionVisible = !state.value.isOrderSectionVisible
                        )
                  }
            }
      }

      private fun getNotes(noteOrder: NoteOrder) {
            getNotesJob?.cancel()
            getNotesJob = noteUseCases.getNotes(noteOrder)
                  .onEach { notes ->
                        _state.value = state.value.copy(
                              notes = notes
                        )
                  }
                  .launchIn(viewModelScope)
      }

}