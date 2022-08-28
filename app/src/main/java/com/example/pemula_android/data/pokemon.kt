package com.example.pemula_android.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class pokemon(
    var namepokemon: String = "",
    var detailpokemon : String="",
    var typepokemon : String="",
    var photo : Int = 0,
    var photoevolution: Int = 0
): Parcelable
