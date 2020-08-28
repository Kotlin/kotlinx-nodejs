@file:JsModule("url")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
package url

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

external fun parse(urlStr: String): UrlWithStringQuery

external fun parse(urlStr: String, parseQueryString: Boolean?, slashesDenoteHost: Boolean = definedExternally): UrlWithStringQuery

external fun parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean = definedExternally): dynamic /* UrlWithParsedQuery | Url */

external fun format(URL: URL, options: URLFormatOptions = definedExternally): String

external fun format(urlObject: UrlObject): String

external fun format(urlObject: String): String

external fun resolve(from: String, to: String): String

external fun domainToASCII(domain: String): String

external fun domainToUnicode(domain: String): String

external fun fileURLToPath(url: String): String

external fun fileURLToPath(url: URL): String

external fun pathToFileURL(url: String): URL

external open class URL {
    constructor(input: String, base: String = definedExternally)
    constructor(input: String, base: URL = definedExternally)
    open var hash: String
    open var host: String
    open var hostname: String
    open var href: String
    open var origin: String
    open var password: String
    open var pathname: String
    open var port: String
    open var protocol: String
    open var search: String
    open var searchParams: URLSearchParams
    open var username: String
    override fun toString(): String
    open fun toJSON(): String
}