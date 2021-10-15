package com.mousavi.noteappwithcompose.feature_note.domain.use_case

import com.mousavi.noteappwithcompose.feature_note.domain.model.Note
import com.mousavi.noteappwithcompose.feature_note.domain.repository.NoteRepository
import com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder
import com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(orderType = OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType) {
                OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Title -> notes.sortedBy { it.title }
                    }
                }
                OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Title -> notes.sortedByDescending { it.title }
                    }
                }
            }
        }
    }
}