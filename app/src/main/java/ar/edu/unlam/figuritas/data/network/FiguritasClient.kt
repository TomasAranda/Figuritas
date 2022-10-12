package ar.edu.unlam.figuritas.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FiguritasClient {
    @GET("")
    suspend fun getFigurita() : FiguritaDto

    companion object {
        private const val BASE_URL = ""

        fun create(): FiguritasClient {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(FiguritasClient::class.java)
        }
    }
}