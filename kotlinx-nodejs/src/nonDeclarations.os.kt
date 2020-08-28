@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package os

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$20` {
    var user: Number
    var nice: Number
    var sys: Number
    var idle: Number
    var irq: Number
}

external interface CpuInfo {
    var model: String
    var speed: Number
    var times: `T$20`
}

external interface NetworkInterfaceBase {
    var address: String
    var netmask: String
    var mac: String
    var internal: Boolean
    var cidr: String?
}

external interface NetworkInterfaceInfoIPv4 : NetworkInterfaceBase {
    var family: String /* "IPv4" */
}

external interface NetworkInterfaceInfoIPv6 : NetworkInterfaceBase {
    var family: String /* "IPv6" */
    var scopeid: Number
}

external interface UserInfo<T> {
    var username: T
    var uid: Number
    var gid: Number
    var shell: T
    var homedir: T
}

external interface `T$21` {
    var encoding: String /* "buffer" */
}

typealias SignalConstants = Any