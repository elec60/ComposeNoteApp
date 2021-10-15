package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note

import com.mousavi.noteappwithcompose.feature_note.domain.model.Note

sealed class AddEditEvent {
    class Save(val note: Note) : AddEditEvent()
}
