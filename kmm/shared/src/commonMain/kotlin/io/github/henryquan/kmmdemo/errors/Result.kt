package io.github.henryquan.kmmdemo.errors

sealed class Result<T> {
    class Success<T>(val value: T) : Result<T>()
    class Failure(val error: Any) : Result<Nothing>()
}