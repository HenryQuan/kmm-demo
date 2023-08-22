package io.github.henryquan.kmmdemo.services

import io.ktor.client.HttpClient
import io.ktor.client.engine.js.Js

class JsHttpClient : PlatformHttpClient {
    override val client: HttpClient = HttpClient(Js)
}

actual fun getHttpClient(): PlatformHttpClient {
    return JsHttpClient()
}
