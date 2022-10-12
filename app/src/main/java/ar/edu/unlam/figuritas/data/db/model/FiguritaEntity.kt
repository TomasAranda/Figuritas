package ar.edu.unlam.figuritas.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "figurita")
data class FiguritaEntity(
    @PrimaryKey @ColumnInfo(name = "id")
    val id: Int,
    val name: String,
    val imageUrl: String
)