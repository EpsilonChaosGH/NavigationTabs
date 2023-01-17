package com.example.navigationtabs

import kotlinx.coroutines.flow.Flow

interface Repository {

    fun listenCurrentNumber(): Flow<Int>

    suspend fun getRandomNumber()

    suspend fun loadNumber()

}
