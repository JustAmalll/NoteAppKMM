package dev.justamal.noteappkmm.data.note

import dev.justamal.noteappkmm.domain.note.Note
import dev.justamal.noteappkmm.domain.time.DateTimeUtil

class SearchNotes {

    fun execute(notes: List<Note>, query: String): List<Note> {
        if (query.isBlank()) return notes

        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy {
            DateTimeUtil.toEpochMills(it.created)
        }
    }

}