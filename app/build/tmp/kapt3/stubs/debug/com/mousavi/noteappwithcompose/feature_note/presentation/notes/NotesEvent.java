package com.mousavi.noteappwithcompose.feature_note.presentation.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent;", "", "()V", "DeleteNote", "Order", "RestoreNote", "ToggleOrderSection", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$Order;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$DeleteNote;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$RestoreNote;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$ToggleOrderSection;", "app_debug"})
public abstract class NotesEvent {
    
    private NotesEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$Order;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent;", "noteOrder", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;)V", "getNoteOrder", "()Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Order extends com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder noteOrder = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent.Order copy(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder noteOrder) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Order(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder noteOrder) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder getNoteOrder() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$DeleteNote;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent;", "note", "Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;)V", "getNote", "()Lcom/mousavi/noteappwithcompose/feature_note/domain/model/Note;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteNote extends com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.mousavi.noteappwithcompose.feature_note.domain.model.Note note = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent.DeleteNote copy(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.model.Note note) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteNote(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.model.Note note) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.domain.model.Note component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mousavi.noteappwithcompose.feature_note.domain.model.Note getNote() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$RestoreNote;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent;", "()V", "app_debug"})
    public static final class RestoreNote extends com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent.RestoreNote INSTANCE = null;
        
        private RestoreNote() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent$ToggleOrderSection;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/notes/NotesEvent;", "()V", "app_debug"})
    public static final class ToggleOrderSection extends com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mousavi.noteappwithcompose.feature_note.presentation.notes.NotesEvent.ToggleOrderSection INSTANCE = null;
        
        private ToggleOrderSection() {
            super();
        }
    }
}