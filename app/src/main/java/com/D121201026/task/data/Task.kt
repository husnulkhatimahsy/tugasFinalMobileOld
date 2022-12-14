package com.D121201017.task.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")

data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val category: String
)