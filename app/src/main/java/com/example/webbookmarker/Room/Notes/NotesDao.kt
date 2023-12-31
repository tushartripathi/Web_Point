package com.example.webbookmarker.Room.Notes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface NoteDao {
    @Insert
    fun insert(note: NotesEntity?)

    @Query("SELECT * FROM NotesTable WHERE id = :noteId")
    fun getNoteById(noteId: Long): NotesEntity?

    @Query("SELECT * FROM NotesTable Where url = :urlValue") // Query to select all records
    fun getAllNotes(urlValue :String): List<NotesEntity> //

    @Update
    fun update(note: NotesEntity?)

    @Delete
    fun delete(note: NotesEntity?)
}