package com.mousavi.noteappwithcompose.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/mousavi/noteappwithcompose/di/AppModule;", "", "()V", "provideNoteUseCases", "Lcom/mousavi/noteappwithcompose/feature_note/domain/use_case/NoteUseCases;", "repository", "Lcom/mousavi/noteappwithcompose/feature_note/domain/repository/NoteRepository;", "provideNotesRepository", "db", "Lcom/mousavi/noteappwithcompose/feature_note/data/data_source/NoteDatabase;", "provideRoomDatabase", "app", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.mousavi.noteappwithcompose.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mousavi.noteappwithcompose.feature_note.domain.repository.NoteRepository provideNotesRepository(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases provideNoteUseCases(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.domain.repository.NoteRepository repository) {
        return null;
    }
}