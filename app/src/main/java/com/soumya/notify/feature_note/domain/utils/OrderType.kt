package com.soumya.notify.feature_note.domain.utils

import androidx.room.FtsOptions.Order

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
