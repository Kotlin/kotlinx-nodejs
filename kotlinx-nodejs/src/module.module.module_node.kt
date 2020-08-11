@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package module

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
import NodeJS.Require
import module.Module.SourceMapPayload
import module.Module.SourceMapping
import NodeModule
import NodeRequire
import module.Module.SourceMap

@JsModule("module")
external open class Module(id: String, parent: Module = definedExternally) : NodeModule {
    override var exports: Any
    override var require: Require
    override var id: String
    override var filename: String
    override var loaded: Boolean
    override var path: String
    override var parent: NodeJS.Module?
    override var children: Array<NodeJS.Module>
    override var paths: Array<String>
    interface SourceMapPayload {
        var file: String
        var version: Number
        var sources: Array<String>
        var sourcesContent: Array<String>
        var names: Array<String>
        var mappings: String
        var sourceRoot: String
    }
    interface SourceMapping {
        var generatedLine: Number
        var generatedColumn: Number
        var originalSource: String
        var originalLine: Number
        var originalColumn: Number
    }
    open class SourceMap(payload: SourceMapPayload) {
        open var payload: SourceMapPayload
        open fun findEntry(line: Number, column: Number): SourceMapping
    }

    companion object {
        fun runMain()
        fun wrap(code: String): String
        fun createRequireFromPath(path: String): NodeRequire
        fun createRequire(path: String): NodeRequire
        fun createRequire(path: URL): NodeRequire
        var builtinModules: Array<String>
        var Module: Any
        fun syncBuiltinESMExports()
        fun findSourceMap(path: String, error: Error = definedExternally): SourceMap
    }
}