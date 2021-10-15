package com.mousavi.noteappwithcompose.feature_note.domain.use_case

data class NoteUseCases(
    val addNote: AddNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote,
    val getNotes: GetNotes
)