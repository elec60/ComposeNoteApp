package com.mousavi.noteappwithcompose.feature_note.data.data_source;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDao;", "", "deleteNote", "", "note", "Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "Lkotlinx/coroutines/flow/Flow;", "", "insertNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM note")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.mousavi.noteappwithcompose.feature_note.domain.model.Note>> getNotes();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM note WHERE id=:id")
    public abstract java.lang.Object getNoteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mousavi.noteappwithcompose.feature_note.domain.model.Note> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}