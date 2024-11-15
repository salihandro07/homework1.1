package com.example.homework11

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String = "",
    val email: String = "",
    val password: String = ""
) : Parcelable