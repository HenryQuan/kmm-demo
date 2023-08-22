package io.github.henryquan.kmmdemo.services

import io.ktor.client.HttpClient

interface PlatformHttpClient {
    val client: HttpClient
}

expect fun getHttpClient(): PlatformHttpClient
