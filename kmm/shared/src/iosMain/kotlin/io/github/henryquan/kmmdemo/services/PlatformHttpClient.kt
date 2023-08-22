package io.github.henryquan.kmmdemo.services

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

class IosHttpClient : PlatformHttpClient {
    override val client: HttpClient = HttpClient(Darwin)
}

actual fun getHttpClient(): PlatformHttpClient {
    return IosHttpClient()
}
