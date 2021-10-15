package com.mousavi.noteappwithcompose.feature_note.presentation.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "AddEditScreen", "NotesScreen", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen$NotesScreen;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen$AddEditScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen$NotesScreen;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen;", "()V", "app_debug"})
    public static final class NotesScreen extends com.mousavi.noteappwithcompose.feature_note.presentation.util.Screen {
        
        public NotesScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen$AddEditScreen;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/util/Screen;", "()V", "app_debug"})
    public static final class AddEditScreen extends com.mousavi.noteappwithcompose.feature_note.presentation.util.Screen {
        
        public AddEditScreen() {
            super(null);
        }
    }
}