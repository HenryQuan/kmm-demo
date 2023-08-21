package io.github.henryquan.kmm_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform