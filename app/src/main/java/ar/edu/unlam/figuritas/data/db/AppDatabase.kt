package ar.edu.unlam.figuritas.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ar.edu.unlam.figuritas.data.db.model.FiguritaEntity

@Database(version = 1, entities = [FiguritaEntity::class])
abstract class AppDatabase : RoomDatabase() {
    abstract fun figuritaDao(): FiguritaDao

    companion object {
        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "figuritas-db")
                .build()
        }
    }
}