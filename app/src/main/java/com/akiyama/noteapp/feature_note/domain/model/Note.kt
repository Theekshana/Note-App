package com.akiyama.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.akiyama.noteapp.ui.theme.BabyBlue
import com.akiyama.noteapp.ui.theme.LightGreen
import com.akiyama.noteapp.ui.theme.RedOrange
import com.akiyama.noteapp.ui.theme.RedPink
import com.akiyama.noteapp.ui.theme.Violet
import java.sql.Timestamp

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
