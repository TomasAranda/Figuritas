package ar.edu.unlam.figuritas.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import ar.edu.unlam.figuritas.data.db.model.FiguritaEntity

@Dao
interface FiguritaDao {
    @Insert()
    suspend fun insert(figurita: FiguritaEntity)

    @Delete
    suspend fun delete(figurita: FiguritaEntity): Int
}