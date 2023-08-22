package io.github.henryquan.kmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform