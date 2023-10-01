package com.soumya.notify.feature_note.domain.usecase

data class NoteUseCases(
    val getNote: GetNote,
    val getNotes: GetNotes,
    val addEditNote: AddEditNote,
    val deleteNote: DeleteNote
)