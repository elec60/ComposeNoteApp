package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util

import androidx.compose.ui.graphics.Color
import com.mousavi.noteappwithcompose.feature_note.domain.model.Note

data class AddEditNoteState(
    val title: String = "",
    val content: String = "",
    val color: Color = Note.noteColors.random()
)
