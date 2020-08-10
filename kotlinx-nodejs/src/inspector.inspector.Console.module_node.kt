@file:JsQualifier("inspector.Console")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package inspector.Console

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

external interface ConsoleMessage {
    var source: String
    var level: String
    var text: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var line: Number?
        get() = definedExternally
        set(value) = definedExternally
    var column: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessageAddedEventDataType {
    var message: ConsoleMessage
}