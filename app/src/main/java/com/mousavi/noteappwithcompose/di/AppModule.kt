package com.mousavi.noteappwithcompose.di

import android.app.Application
import androidx.room.Room
import com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase
import com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import com.mousavi.noteappwithcompose.feature_note.data.repository.NoteRepositoryImpl
import com.mousavi.noteappwithcompose.feature_note.domain.repository.NoteRepository
import com.mousavi.noteappwithcompose.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNotesRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.dao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            addNote = AddNote(repository),
            deleteNote = DeleteNote(repository),
            getNote = GetNote(repository),
            getNotes = GetNotes(repository)
        )
    }

}