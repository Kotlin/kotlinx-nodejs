@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package v8

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

external interface HeapSpaceInfo {
    var space_name: String
    var space_size: Number
    var space_used_size: Number
    var space_available_size: Number
    var physical_space_size: Number
}

external interface HeapInfo {
    var total_heap_size: Number
    var total_heap_size_executable: Number
    var total_physical_size: Number
    var total_available_size: Number
    var used_heap_size: Number
    var heap_size_limit: Number
    var malloced_memory: Number
    var peak_malloced_memory: Number
    var does_zap_garbage: Number /* 0 | 1 */
    var number_of_native_contexts: Number
    var number_of_detached_contexts: Number
}

external interface HeapCodeStatistics {
    var code_and_metadata_size: Number
    var bytecode_and_metadata_size: Number
    var external_script_source_size: Number
}