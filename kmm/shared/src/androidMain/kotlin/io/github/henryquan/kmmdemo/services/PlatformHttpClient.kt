package io.github.henryquan.kmmdemo.services

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android

class AndroidHttpClient : PlatformHttpClient {
    override val client: HttpClient = HttpClient(Android)
}

actual fun getHttpClient(): PlatformHttpClient {
    return AndroidHttpClient()
}
