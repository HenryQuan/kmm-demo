package io.github.henryquan.kmmdemo.services

import io.github.henryquan.kmmdemo.models.IpLocation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.promise
import kotlin.js.Promise

@JsExport
class IpServiceJs : IpService() {

    fun getIpLocationJs(): Promise<IpLocation> {
        return CoroutineScope(Dispatchers.Default).promise {
            getIpLocation()
        }
    }
}
