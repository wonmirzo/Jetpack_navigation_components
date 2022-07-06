package com.wonmirzo.model

import java.io.Serializable

data class User(
    val name: String,
    val age: Int
) : Serializable
