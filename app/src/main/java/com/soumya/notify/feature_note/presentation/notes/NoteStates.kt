package com.soumya.notify.feature_note.presentation.notes

import com.soumya.notify.feature_note.domain.model.Note
import com.soumya.notify.feature_note.domain.utils.NoteOrder
import com.soumya.notify.feature_note.domain.utils.OrderType

data class NoteStates(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
