package com.mousavi.noteappwithcompose.feature_note.domain.use_case

import com.mousavi.noteappwithcompose.feature_note.domain.model.InvalidNoteException
import com.mousavi.noteappwithcompose.feature_note.domain.model.Note
import com.mousavi.noteappwithcompose.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("title can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("content can't be empty.")
        }
        repository.insertNote(note)
    }
}