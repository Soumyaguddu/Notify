package com.soumya.notify.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.soumya.notify.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {

        val noteColors = listOf(RedOrange, BabyBlue, Violet, LightGreen, RedPink, SkyBlue)
    }
}
class InvalidNoteException(message:String):Exception(message)