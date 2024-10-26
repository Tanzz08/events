package com.example.myapplication.data.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "events")
data class EventsEntity(
    @PrimaryKey(autoGenerate = false)
    var id: String = "",
    var name: String = "",
    var mediaCover: String? = null,
    var description: String = "",
    var beginTime: String = "",
    var endTime: String = "",
    var ownerName: String = "",
    var summary: String = "",
    var category: String = "",
    var cityName: String = "",
    var quota: Int = 0,
    var registrants: Int = 0,
    var link: String = "",
    var imageLogo: String = ""

)