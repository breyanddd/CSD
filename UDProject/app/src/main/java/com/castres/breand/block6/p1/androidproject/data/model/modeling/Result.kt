package com.castres.breand.block6.p1.androidproject.data.model.modeling

sealed class Result<T>(
    val data: T? = null,
    val message: String? = null

    ){
    class Success<T> (data: T): Result<T>(data)
    class Error<T> (data: T? = null, message: String?): Result<T>(data, message)

   }