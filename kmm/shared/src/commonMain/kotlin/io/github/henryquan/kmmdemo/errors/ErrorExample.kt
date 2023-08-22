package io.github.henryquan.kmmdemo.errors

import kotlin.experimental.ExperimentalObjCName
import kotlin.js.JsExport
import kotlin.native.ObjCName

@JsExport
object ErrorExample {
    fun throwSharedError() {
        throw SharedError.NoInternet
    }

    fun throwGeneric(message: String) {
        throw SharedError.Generic(message)
    }

    @OptIn(ExperimentalObjCName::class)
    @ObjCName("throwError")
    fun throwErrorCode(@ObjCName("with") code: Int) {
        throw SharedError.Generic("Error code: $code")
    }
}
