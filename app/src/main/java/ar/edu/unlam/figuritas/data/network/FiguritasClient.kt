package ar.edu.unlam.figuritas.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FiguritasClient {
    @GET("")
    suspend fun getFigurita(id: Int) : FiguritaDto

    companion object {
        private const val BASE_URL = "" // API URL

        fun create(): FiguritasClient {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(FiguritasClient::class.java)
        }
    }
}