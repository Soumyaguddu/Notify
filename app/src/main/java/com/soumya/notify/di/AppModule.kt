package com.soumya.notify.di

import android.app.Application
import androidx.room.Room
import com.soumya.notify.feature_note.data.data_source.NoteDatabase
import com.soumya.notify.feature_note.data.repository.NoteRepositoryImpl
import com.soumya.notify.feature_note.domain.repository.NoteRepository
import com.soumya.notify.feature_note.domain.usecase.*
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
    fun provideNoteDatabase(application: Application): NoteDatabase {
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {

        return NoteUseCases(
            getNote = GetNote(repository),
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addEditNote = AddEditNote(repository)
        )
    }
}