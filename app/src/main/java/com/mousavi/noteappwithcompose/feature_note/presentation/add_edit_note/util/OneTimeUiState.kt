package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util

sealed class OneTimeUiState {
    class Snackbar(val message: String): OneTimeUiState()
    object NavigateUp: OneTimeUiState()
}
