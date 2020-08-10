@file:JsModule("buffer")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package buffer

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
import Buffer

external var INSPECT_MAX_BYTES: Number

external var kMaxLength: Number

external var kStringMaxLength: Number

external object constants {
    var MAX_LENGTH: Number
    var MAX_STRING_LENGTH: Number
}

external var BuffType: Any

external fun transcode(source: Uint8Array, fromEnc: String /* "binary" */, toEnc: String /* "ascii" | "utf8" | "utf16le" | "ucs2" | "latin1" | "binary" */): Buffer

external object SlowBuffer {
    var prototype: Buffer
}