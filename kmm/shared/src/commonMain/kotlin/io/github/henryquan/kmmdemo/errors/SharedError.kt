package io.github.henryquan.kmmdemo.errors

import kotlin.js.JsExport

@JsExport
sealed class SharedError : Throwable() {
    object NoInternet : SharedError()
    object Unknown : SharedError()

    // more examples with params
    object Unexpected : SharedError()
    object NoData : SharedError()
    class Generic(val why: String?) : SharedError()
    class NotFound(val id: String) : SharedError()
}
