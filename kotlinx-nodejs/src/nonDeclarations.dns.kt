@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package dns

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

external interface LookupOptions {
    var family: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hints: Number?
        get() = definedExternally
        set(value) = definedExternally
    var all: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var verbatim: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LookupOneOptions : LookupOptions {
    override var all: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LookupAllOptions : LookupOptions

external interface LookupAddress {
    var address: String
    var family: Number
}

external interface ResolveOptions {
    var ttl: Boolean
}

external interface ResolveWithTtlOptions : ResolveOptions {
    override var ttl: Boolean
}

external interface RecordWithTtl {
    var address: String
    var ttl: Number
}

external interface AnyARecord : RecordWithTtl {
    var type: String /* "A" */
}

external interface AnyAaaaRecord : RecordWithTtl {
    var type: String /* "AAAA" */
}

external interface MxRecord {
    var priority: Number
    var exchange: String
}

external interface AnyMxRecord : MxRecord {
    var type: String /* "MX" */
}

external interface NaptrRecord {
    var flags: String
    var service: String
    var regexp: String
    var replacement: String
    var order: Number
    var preference: Number
}

external interface AnyNaptrRecord : NaptrRecord {
    var type: String /* "NAPTR" */
}

external interface SoaRecord {
    var nsname: String
    var hostmaster: String
    var serial: Number
    var refresh: Number
    var retry: Number
    var expire: Number
    var minttl: Number
}

external interface AnySoaRecord : SoaRecord {
    var type: String /* "SOA" */
}

external interface SrvRecord {
    var priority: Number
    var weight: Number
    var port: Number
    var name: String
}

external interface AnySrvRecord : SrvRecord {
    var type: String /* "SRV" */
}

external interface AnyTxtRecord {
    var type: String /* "TXT" */
    var entries: Array<String>
}

external interface AnyNsRecord {
    var type: String /* "NS" */
    var value: String
}

external interface AnyPtrRecord {
    var type: String /* "PTR" */
    var value: String
}

external interface AnyCnameRecord {
    var type: String /* "CNAME" */
    var value: String
}