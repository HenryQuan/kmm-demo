package io.github.henryquan.kmmdemo.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@Serializable
@JsExport
data class IpLocation(
    val query: String,
    val status: String,
    val country: String,
    val countryCode: String,
    val region: String,
    val regionName: String,
    val city: String,
    val zip: String,
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val isp: String,
    val org: String,

    @SerialName("as")
    val namedAs: String
) {
    val location: String
        get() = "$city, $regionName, $country"

    val coordinates: String
        get() = "$lat, $lon"

    val ispAndOrg: String
        get() = "$isp, $org"

    val countryAndRegion: String
        get() = "$country, $regionName"
}
