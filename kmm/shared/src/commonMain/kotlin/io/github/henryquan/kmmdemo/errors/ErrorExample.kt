package io.github.henryquan.kmmdemo.errors

import kotlin.experimental.ExperimentalObjCName
import kotlin.js.JsExport
import kotlin.native.ObjCName

@JsExport
object ErrorExample {
    @Throws(SharedError::class)
    fun throwSharedError() {
        throw SharedError.NoInternet
    }

    @Throws(SharedError.Generic::class)
    fun throwGeneric(message: String) {
        throw SharedError.Generic(message)
    }

    @OptIn(ExperimentalObjCName::class)
    @ObjCName("throwError")
    @Throws(SharedError.Generic::class)
    fun throwErrorCode(@ObjCName("with") code: Int) {
        throw SharedError.Generic("Error code: $code")
    }

    fun returnError(): SharedError {
        return SharedError.NoInternet
    }

    fun returnResultFailure(): KMMResult<String, SharedError> {
        return KMMResult.Error(SharedError.NoInternet)
    }

    fun returnResultSuccess(): KMMResult<String, SharedError> {
        return KMMResult.Ok("Hello")
    }
}
