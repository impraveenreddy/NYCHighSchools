package com.example.nychighschools.data.network

import com.example.nychighschools.data.model.School
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface SchoolApiService {

    @GET("s3k6-pzi2.json")
    suspend fun getSchools(): List<School>

    @GET("schools/{dbn}")
    suspend fun getSchoolDetails(@Path("dbn") dbn: String): School

    companion object {
        private const val BASE_URL = "https://data.cityofnewyork.us/resource/"

        fun create(): SchoolApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(SchoolApiService::class.java)
        }
    }
}
