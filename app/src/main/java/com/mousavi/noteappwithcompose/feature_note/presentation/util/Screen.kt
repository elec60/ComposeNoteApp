package com.mousavi.noteappwithcompose.feature_note.presentation.util

sealed class Screen(val route: String) {
    class NotesScreen : Screen("notes_screen")
    class AddEditScreen : Screen("add_edit_screen")
}
