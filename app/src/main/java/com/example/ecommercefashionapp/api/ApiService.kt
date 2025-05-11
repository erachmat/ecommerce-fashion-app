package com.example.ecommercefashionapp.api

import retrofit2.http.*
import retrofit2.Response

data class LoginRequest(val email: String, val password: String)

data class AuthResponse(val token: String?, val message: String?)

interface ApiService {
    @POST("api/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<AuthResponse>
}