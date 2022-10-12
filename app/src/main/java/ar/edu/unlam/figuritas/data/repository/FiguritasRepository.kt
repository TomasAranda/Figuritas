package ar.edu.unlam.figuritas.data.repository

import ar.edu.unlam.figuritas.data.db.FiguritaDao
import ar.edu.unlam.figuritas.data.db.model.FiguritaEntity
import ar.edu.unlam.figuritas.data.network.FiguritaDto
import ar.edu.unlam.figuritas.data.network.FiguritasClient

class FiguritasRepository(private val figuritasClient: FiguritasClient, private val figuritaDao: FiguritaDao) {
    suspend fun get(id: Int): FiguritaDto {
        return figuritasClient.getFigurita(id)
    }

    suspend fun insert(figurita: FiguritaEntity) {
        figuritaDao.insert(figurita)
    }
}
