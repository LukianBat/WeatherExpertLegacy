package com.lukianbat.feature.city.domain.model

data class CityModel(
    val city: String,
    val name: String,
    val country: String,
    val countryCode: String,
    val region: String,
    val regionCode: String,
    val latitude: Double,
    val longitude: Double
)
