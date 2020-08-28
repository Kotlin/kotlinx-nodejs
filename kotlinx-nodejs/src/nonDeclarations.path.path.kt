@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package path.path

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

external interface ParsedPath {
    var root: String
    var dir: String
    var base: String
    var ext: String
    var name: String
}

external interface FormatInputPathObject {
    var root: String?
        get() = definedExternally
        set(value) = definedExternally
    var dir: String?
        get() = definedExternally
        set(value) = definedExternally
    var base: String?
        get() = definedExternally
        set(value) = definedExternally
    var ext: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PlatformPath {
    fun normalize(p: String): String
    fun join(vararg paths: String): String
    fun resolve(vararg pathSegments: String): String
    fun isAbsolute(p: String): Boolean
    fun relative(from: String, to: String): String
    fun dirname(p: String): String
    fun basename(p: String, ext: String = definedExternally): String
    fun extname(p: String): String
    var sep: String
    var delimiter: String
    fun parse(p: String): ParsedPath
    fun format(pP: FormatInputPathObject): String
    fun toNamespacedPath(path: String): String
    var posix: PlatformPath
    var win32: PlatformPath
}