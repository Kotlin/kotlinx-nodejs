@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package tls

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
import Buffer
import net.Server
import net.Socket
import net.LookupFunction

external interface Certificate {
    var C: String
    var ST: String
    var L: String
    var O: String
    var OU: String
    var CN: String
}

external interface PeerCertificate {
    var subject: Certificate
    var issuer: Certificate
    var subjectaltname: String
    var infoAccess: Dict<Array<String>>
    var modulus: String
    var exponent: String
    var valid_from: String
    var valid_to: String
    var fingerprint: String
    var fingerprint256: String
    var ext_key_usage: Array<String>
    var serialNumber: String
    var raw: Buffer
}

external interface DetailedPeerCertificate : PeerCertificate {
    var issuerCertificate: DetailedPeerCertificate
}

external interface CipherNameAndProtocol {
    var name: String
    var version: String
    var standardName: String
}

external interface EphemeralKeyInfo {
    var type: String
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number
}

external interface KeyObject {
    var pem: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PxfObject {
    var buf: dynamic /* String | Buffer */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TLSSocketOptions : SecureContextOptions, CommonConnectionOptions {
    var isServer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var server: Server?
        get() = definedExternally
        set(value) = definedExternally
    var session: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    var requestOCSP: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$58` {
    var rejectUnauthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var requestCert: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CommonConnectionOptions {
    var secureContext: SecureContext?
        get() = definedExternally
        set(value) = definedExternally
    var enableTrace: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var requestCert: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ALPNProtocols: dynamic /* Array<String>? | Array<Uint8Array>? | Uint8Array? */
        get() = definedExternally
        set(value) = definedExternally
    var SNICallback: ((servername: String, cb: (err: Error?, ctx: SecureContext) -> Unit) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var rejectUnauthorized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TlsOptions : SecureContextOptions, CommonConnectionOptions {
    var handshakeTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sessionTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ticketKeys: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    val pskCallback: ((socket: TLSSocket, identity: String) -> dynamic)?
        get() = definedExternally
    var pskIdentityHint: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PSKCallbackNegotation {
    var psk: dynamic /* DataView | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array */
        get() = definedExternally
        set(value) = definedExternally
    var identitty: String
}

external interface ConnectionOptions : SecureContextOptions, CommonConnectionOptions {
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var port: Number?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var socket: Socket?
        get() = definedExternally
        set(value) = definedExternally
    var checkServerIdentity: Any?
        get() = definedExternally
        set(value) = definedExternally
    var servername: String?
        get() = definedExternally
        set(value) = definedExternally
    var session: Buffer?
        get() = definedExternally
        set(value) = definedExternally
    var minDHSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lookup: LookupFunction?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    val pskCallback: ((hint: String?) -> PSKCallbackNegotation?)?
        get() = definedExternally
}

external interface SecurePair {
    var encrypted: TLSSocket
    var cleartext: TLSSocket
}

external interface SecureContextOptions {
    var ca: dynamic /* String? | Buffer? | Array<dynamic /* String | Buffer */>? */
        get() = definedExternally
        set(value) = definedExternally
    var cert: dynamic /* String? | Buffer? | Array<dynamic /* String | Buffer */>? */
        get() = definedExternally
        set(value) = definedExternally
    var sigalgs: String?
        get() = definedExternally
        set(value) = definedExternally
    var ciphers: String?
        get() = definedExternally
        set(value) = definedExternally
    var clientCertEngine: String?
        get() = definedExternally
        set(value) = definedExternally
    var crl: dynamic /* String? | Buffer? | Array<dynamic /* String | Buffer */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dhparam: dynamic /* String? | Buffer? */
        get() = definedExternally
        set(value) = definedExternally
    var ecdhCurve: String?
        get() = definedExternally
        set(value) = definedExternally
    var honorCipherOrder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var key: dynamic /* String? | Buffer? | Array<dynamic /* Buffer | KeyObject */>? */
        get() = definedExternally
        set(value) = definedExternally
    var privateKeyEngine: String?
        get() = definedExternally
        set(value) = definedExternally
    var privateKeyIdentifier: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxVersion: String? /* "TLSv1.3" | "TLSv1.2" | "TLSv1.1" | "TLSv1" */
        get() = definedExternally
        set(value) = definedExternally
    var minVersion: String? /* "TLSv1.3" | "TLSv1.2" | "TLSv1.1" | "TLSv1" */
        get() = definedExternally
        set(value) = definedExternally
    var passphrase: String?
        get() = definedExternally
        set(value) = definedExternally
    var pfx: dynamic /* String? | Buffer? | Array<dynamic /* String | Buffer | PxfObject */>? */
        get() = definedExternally
        set(value) = definedExternally
    var secureOptions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var secureProtocol: String?
        get() = definedExternally
        set(value) = definedExternally
    var sessionIdContext: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SecureContext {
    var context: Any
}