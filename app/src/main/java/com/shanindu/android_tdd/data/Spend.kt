package com.shanindu.android_tdd.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spend")
data class Spend(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val date: String,
    val amount: Double,
    val description: String
)