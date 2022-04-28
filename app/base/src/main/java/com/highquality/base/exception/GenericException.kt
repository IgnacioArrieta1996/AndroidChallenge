package com.highquality.base.exception

data class GenericException(
    val statusCode: Int,
    val statusMessage: String
) : Exception()