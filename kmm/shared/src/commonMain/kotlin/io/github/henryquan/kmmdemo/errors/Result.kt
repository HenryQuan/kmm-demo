package io.github.henryquan.kmmdemo.errors

import kotlin.js.JsExport

@JsExport
sealed class KMMResult<out T, out E> {
    data class Ok<out T>(val value: T) : KMMResult<T, Nothing>()
    data class Error<out E>(val error: E) : KMMResult<Nothing, E>()

    fun isOk(): Boolean = this is Ok
    fun isError(): Boolean = this is Error

    fun valueOrNull(): T? = when (this) {
        is Ok -> value
        is Error -> null
    }

    fun errorOrNull(): E? = when (this) {
        is Ok -> null
        is Error -> error
    }
}
