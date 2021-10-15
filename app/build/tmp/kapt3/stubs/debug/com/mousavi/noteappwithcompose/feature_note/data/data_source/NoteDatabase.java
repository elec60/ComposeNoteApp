package com.mousavi.noteappwithcompose.feature_note.data.data_source;

import java.lang.System;

@androidx.room.Database(entities = {com.mousavi.noteappwithcompose.feature_note.domain.model.Note.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDao;", "getDao", "()Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDao;", "Companion", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "notes_db";
    
    public NoteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDao getDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}