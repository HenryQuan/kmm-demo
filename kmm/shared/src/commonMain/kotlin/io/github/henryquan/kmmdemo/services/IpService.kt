package io.github.henryquan.kmmdemo.services

import io.github.henryquan.kmmdemo.models.IpLocation
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlin.js.JsExport

open class IpService {
    private val httpClient = getHttpClient().client.config {
        install(ContentNegotiation) {
            json()
        }
    }

    @JsExport.Ignore
    suspend fun getIpLocation(): IpLocation {
        return httpClient.get("http://ip-api.com/json/").body()
    }
}
