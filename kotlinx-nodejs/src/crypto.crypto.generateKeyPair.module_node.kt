@file:JsQualifier("crypto.generateKeyPair")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package crypto.generateKeyPair

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
import crypto.RSAKeyPairOptions
import crypto.RSAKeyPairKeyObjectOptions
import crypto.KeyPairKeyObjectResult
import crypto.DSAKeyPairOptions
import crypto.DSAKeyPairKeyObjectOptions
import crypto.ECKeyPairOptions
import crypto.ECKeyPairKeyObjectOptions

external fun __promisify__(type: String /* "rsa" */, options: RSAKeyPairOptions<String /* "pem" | "der" | "der" */, String /* "pem" | "der" | "pem" | "der" */>): dynamic /* Promise */

external fun __promisify__(type: String /* "rsa" */, options: RSAKeyPairKeyObjectOptions): Promise<KeyPairKeyObjectResult>

external fun __promisify__(type: String /* "dsa" */, options: DSAKeyPairOptions<String /* "pem" | "der" | "der" */, String /* "pem" | "der" | "pem" | "der" */>): dynamic /* Promise */

external fun __promisify__(type: String /* "dsa" */, options: DSAKeyPairKeyObjectOptions): Promise<KeyPairKeyObjectResult>

external fun __promisify__(type: String /* "ec" */, options: ECKeyPairOptions<String /* "pem" | "der" | "der" */, String /* "pem" | "der" | "pem" | "der" */>): dynamic /* Promise */

external fun __promisify__(type: String /* "ec" */, options: ECKeyPairKeyObjectOptions): Promise<KeyPairKeyObjectResult>