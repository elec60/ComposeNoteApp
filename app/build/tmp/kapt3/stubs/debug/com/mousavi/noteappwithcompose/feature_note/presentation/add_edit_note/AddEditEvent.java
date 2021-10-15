package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/AddEditEvent;", "", "()V", "Save", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/AddEditEvent$Save;", "app_debug"})
public abstract class AddEditEvent {
    
    private AddEditEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/AddEditEvent$Save;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/AddEditEvent;", "note", "Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;)V", "getNote", "()Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;", "app_debug"})
    public static final class Save extends com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.AddEditEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.mousavi.noteappwithcompose.feature_note.domain.model.Note note = null;
        
        public Save(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.model.Note note) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.domain.model.Note getNote() {
            return null;
        }
    }
}