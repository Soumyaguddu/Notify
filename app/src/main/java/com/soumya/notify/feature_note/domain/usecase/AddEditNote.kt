package com.soumya.notify.feature_note.domain.usecase

import com.soumya.notify.feature_note.domain.model.InvalidNoteException
import com.soumya.notify.feature_note.domain.model.Note
import com.soumya.notify.feature_note.domain.repository.NoteRepository

class AddEditNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("title can not empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("content can not empty")
        }
        repository.insertNote(note)
    }
}