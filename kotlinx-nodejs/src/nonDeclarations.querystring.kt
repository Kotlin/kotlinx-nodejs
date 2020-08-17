@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package querystring

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
import NodeJS.Dict

external interface StringifyOptions {
    var encodeURIComponent: ((str: String) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParseOptions {
    var maxKeys: Number?
        get() = definedExternally
        set(value) = definedExternally
    var decodeURIComponent: ((str: String) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParsedUrlQuery : Dict<dynamic /* String | Array<String> */>

external interface ParsedUrlQueryInput : Dict<dynamic /* String? | Number? | Boolean? | Array<String>? | Array<Number>? | Array<Boolean>? */>