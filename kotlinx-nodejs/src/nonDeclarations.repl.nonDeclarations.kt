@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "EXTERNAL_DELEGATION")
package repl

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
import vm.Context
import tsstdlib.SyntaxError

typealias REPLEval = (self: REPLServer, evalCmd: String, context: Context, file: String, cb: (err: Error?, result: Any) -> Unit) -> Unit

typealias REPLWriter = (self: REPLServer, obj: Any) -> String

typealias REPLCommandAction = (self: REPLServer, text: String) -> Unit

typealias Recoverable = SyntaxError
