package com.example.ecommercefashionapp.api

import retrofit2.http.*
import retrofit2.Response

data class LoginRequest(val email: String, val password: String)
data class RegisterRequest(val name: String, val email: String, val password: String, val phone_number: String)
data class ForgotPasswordRequest(val email: String)

data class AuthResponse(val token: String?, val message: String?)

interface ApiService {
    @POST("api/login")
    suspend fun login(@Body request: LoginRequest): Response<AuthResponse>

    @POST("api/register")
    suspend fun register(@Body request: RegisterRequest): Response<AuthResponse>

    @POST("api/forgot-password")
    suspend fun forgotPassword(@Body request: ForgotPasswordRequest): Response<AuthResponse>
}