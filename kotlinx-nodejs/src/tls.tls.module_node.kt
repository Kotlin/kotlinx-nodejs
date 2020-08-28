@file:JsModule("tls")
@file:JsNonModule
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
import net.Socket
import Buffer

external var CLIENT_RENEG_LIMIT: Number

external var CLIENT_RENEG_WINDOW: Number

external open class TLSSocket(socket: Socket, options: TLSSocketOptions = definedExternally) : Socket {
    open var authorized: Boolean
    open var authorizationError: Error
    open var encrypted: Boolean
    open var alpnProtocol: String
    open fun getCertificate(): dynamic /* PeerCertificate? | Any? */
    open fun getCipher(): CipherNameAndProtocol
    open fun getEphemeralKeyInfo(): dynamic /* EphemeralKeyInfo? | Any? */
    open fun getFinished(): Buffer?
    open fun getPeerCertificate(detailed: Boolean): dynamic /* DetailedPeerCertificate | PeerCertificate | PeerCertificate | DetailedPeerCertificate */
    open fun getPeerFinished(): Buffer?
    open fun getProtocol(): String?
    open fun getSession(): Buffer?
    open fun getSharedSigalgs(): Array<String>
    open fun getTLSTicket(): Buffer?
    open fun isSessionReused(): Boolean
    open fun renegotiate(options: `T$58`, callback: (err: Error?) -> Unit): Boolean?
    open fun setMaxSendFragment(size: Number): Boolean
    open fun disableRenegotiation()
    open fun enableTrace()
    open fun exportKeyingMaterial(length: Number, label: String, context: Buffer): Buffer
    override fun addListener(event: String, listener: (args: Any) -> Unit): TLSSocket /* this */
    override fun addListener(event: String /* "OCSPResponse" */, listener: (response: Buffer) -> Unit): TLSSocket /* this */
    override fun addListener(event: String /* "secureConnect" */, listener: () -> Unit): TLSSocket /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    override fun emit(event: String /* "OCSPResponse" | "session" | "keylog" */, response: Buffer): Boolean
    override fun emit(event: String /* "secureConnect" */): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): TLSSocket /* this */
    override fun on(event: String /* "OCSPResponse" */, listener: (response: Buffer) -> Unit): TLSSocket /* this */
    override fun on(event: String /* "secureConnect" */, listener: () -> Unit): TLSSocket /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): TLSSocket /* this */
    override fun once(event: String /* "OCSPResponse" */, listener: (response: Buffer) -> Unit): TLSSocket /* this */
    override fun once(event: String /* "secureConnect" */, listener: () -> Unit): TLSSocket /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): TLSSocket /* this */
    override fun prependListener(event: String /* "OCSPResponse" */, listener: (response: Buffer) -> Unit): TLSSocket /* this */
    override fun prependListener(event: String /* "secureConnect" */, listener: () -> Unit): TLSSocket /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): TLSSocket /* this */
    override fun prependOnceListener(event: String /* "OCSPResponse" */, listener: (response: Buffer) -> Unit): TLSSocket /* this */
    override fun prependOnceListener(event: String /* "secureConnect" */, listener: () -> Unit): TLSSocket /* this */
}

external open class Server : net.Server {
    open fun addContext(hostName: String, credentials: SecureContextOptions)
    open fun getTicketKeys(): Buffer
    open fun setSecureContext(details: SecureContextOptions)
    open fun setTicketKeys(keys: Buffer)
    override fun addListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun addListener(event: String /* "tlsClientError" */, listener: (err: Error, tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun addListener(event: String /* "newSession" */, listener: (sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun addListener(event: String /* "OCSPRequest" */, listener: (certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun addListener(event: String /* "resumeSession" */, listener: (sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit) -> Unit): Server /* this */
    open fun addListener(event: String /* "secureConnection" */, listener: (tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun addListener(event: String /* "keylog" */, listener: (line: Buffer, tlsSocket: TLSSocket) -> Unit): Server /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any, vararg args: Any): Boolean
    open fun emit(event: String /* "tlsClientError" */, err: Error, tlsSocket: TLSSocket): Boolean
    open fun emit(event: String /* "newSession" */, sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit): Boolean
    open fun emit(event: String /* "OCSPRequest" */, certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit): Boolean
    open fun emit(event: String /* "resumeSession" */, sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit): Boolean
    open fun emit(event: String /* "secureConnection" */, tlsSocket: TLSSocket): Boolean
    open fun emit(event: String /* "keylog" */, line: Buffer, tlsSocket: TLSSocket): Boolean
    override fun on(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun on(event: String /* "tlsClientError" */, listener: (err: Error, tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun on(event: String /* "newSession" */, listener: (sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun on(event: String /* "OCSPRequest" */, listener: (certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun on(event: String /* "resumeSession" */, listener: (sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit) -> Unit): Server /* this */
    open fun on(event: String /* "secureConnection" */, listener: (tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun on(event: String /* "keylog" */, listener: (line: Buffer, tlsSocket: TLSSocket) -> Unit): Server /* this */
    override fun once(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun once(event: String /* "tlsClientError" */, listener: (err: Error, tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun once(event: String /* "newSession" */, listener: (sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun once(event: String /* "OCSPRequest" */, listener: (certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun once(event: String /* "resumeSession" */, listener: (sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit) -> Unit): Server /* this */
    open fun once(event: String /* "secureConnection" */, listener: (tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun once(event: String /* "keylog" */, listener: (line: Buffer, tlsSocket: TLSSocket) -> Unit): Server /* this */
    override fun prependListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun prependListener(event: String /* "tlsClientError" */, listener: (err: Error, tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun prependListener(event: String /* "newSession" */, listener: (sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependListener(event: String /* "OCSPRequest" */, listener: (certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependListener(event: String /* "resumeSession" */, listener: (sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependListener(event: String /* "secureConnection" */, listener: (tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun prependListener(event: String /* "keylog" */, listener: (line: Buffer, tlsSocket: TLSSocket) -> Unit): Server /* this */
    override fun prependOnceListener(event: String, listener: (args: Any) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "tlsClientError" */, listener: (err: Error, tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "newSession" */, listener: (sessionId: Buffer, sessionData: Buffer, callback: (err: Error, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "OCSPRequest" */, listener: (certificate: Buffer, issuer: Buffer, callback: (err: Error?, resp: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "resumeSession" */, listener: (sessionId: Buffer, callback: (err: Error, sessionData: Buffer) -> Unit) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "secureConnection" */, listener: (tlsSocket: TLSSocket) -> Unit): Server /* this */
    open fun prependOnceListener(event: String /* "keylog" */, listener: (line: Buffer, tlsSocket: TLSSocket) -> Unit): Server /* this */
}

external fun checkServerIdentity(host: String, cert: PeerCertificate): Error?

external fun createServer(secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally): Server

external fun createServer(options: TlsOptions, secureConnectionListener: (socket: TLSSocket) -> Unit = definedExternally): Server

external fun connect(options: ConnectionOptions, secureConnectListener: () -> Unit = definedExternally): TLSSocket

external fun connect(port: Number, host: String = definedExternally, options: ConnectionOptions = definedExternally, secureConnectListener: () -> Unit = definedExternally): TLSSocket

external fun connect(port: Number, options: ConnectionOptions = definedExternally, secureConnectListener: () -> Unit = definedExternally): TLSSocket

external fun createSecurePair(credentials: SecureContext = definedExternally, isServer: Boolean = definedExternally, requestCert: Boolean = definedExternally, rejectUnauthorized: Boolean = definedExternally): SecurePair

external fun createSecureContext(details: SecureContextOptions): SecureContext

external fun getCiphers(): Array<String>

external var DEFAULT_ECDH_CURVE: String

external var DEFAULT_MAX_VERSION: String /* "TLSv1.3" | "TLSv1.2" | "TLSv1.1" | "TLSv1" */

external var DEFAULT_MIN_VERSION: String /* "TLSv1.3" | "TLSv1.2" | "TLSv1.1" | "TLSv1" */

external var rootCertificates: Array<String>