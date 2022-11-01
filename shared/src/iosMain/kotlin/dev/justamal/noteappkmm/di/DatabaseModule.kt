package dev.justamal.noteappkmm.di

import dev.justamal.noteappkmm.data.local.DatabaseDriverFactory
import dev.justamal.noteappkmm.data.note.SqlDelightNoteDataSource
import dev.justamal.noteappkmm.database.NoteDatabase
import dev.justamal.noteappkmm.domain.note.NoteDataSource

class DatabaseModule {
    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}