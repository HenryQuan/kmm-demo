package io.github.henryquan.kmmdemo

class JSPlatform: Platform {
    override val name: String = "JavaScript"
}

actual fun getPlatform(): Platform = JSPlatform()