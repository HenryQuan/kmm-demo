package io.github.henryquan.kmm_demo

class JSPlatform: Platform {
    override val name: String = "JS"
}

actual fun getPlatform(): Platform = JSPlatform()