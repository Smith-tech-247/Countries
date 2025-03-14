package com.example.walmartapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import javax.annotation.Nonnull

@Serializable
@Entity("country_table")
data class Country(
    @PrimaryKey(autoGenerate = true) // Auto-generated unique ID
    var id: Int = 0,
    @SerialName(value = "capital")
    var capital: String = "",
    @SerialName(value = "code")
    var code: String = "null",
    @SerialName(value = "currency")
    var currency: Currency? = Currency(),
    @SerialName(value = "flag")
    var flag: String = "",
    @SerialName(value = "language")
    var language: Language? = Language(),
    @SerialName(value = "name")
    var name: String = "",
    @SerialName(value = "region")
    var region: String = ""
)

@Serializable
data class Currency(
    @SerialName(value = "code") var code: String? = null,
    @SerialName(value = "name") var name: String? = null,
    @SerialName(value = "symbol") var symbol: String? = null
)

@Serializable
data class Language(
    @SerialName(value = "code") var code: String? = null,
    @SerialName(value = "name") var name: String? = null
)