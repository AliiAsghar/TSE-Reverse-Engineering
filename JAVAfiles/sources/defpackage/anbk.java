package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbk {
    public static final anbk b;
    private static final Map d;
    private static final alhm j;
    private final String e;
    private final String f;
    private final aloi g;
    private String h;
    private int i;
    private static final aloi c = aloi.g("charset", albo.ap(StandardCharsets.UTF_8.name()));
    public static final algc a = new alfk(new alfk(new alfk(alfn.a, new alfy(alfv.a)), new alfu(' ')), algc.m("()<>@,;:\\\"/[]?="));

    static {
        algc.m("\"\\\r");
        algc.l(" \t\r\n");
        d = new HashMap();
        a("*", "*");
        a(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "cache-manifest");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "css");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "csv");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "html");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "calendar");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "markdown");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "plain");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "javascript");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "tab-separated-values");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vcard");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vnd.wap.wml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "xml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        d("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        d("application", "xml");
        d("application", "atom+xml");
        a("application", "x-bzip2");
        d("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        b = a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", assi.e);
        a("application", "cbor");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        d("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        d("application", "json");
        a("application", "jwt");
        d("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        d("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        d("application", "rdf+xml");
        d("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        d("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        d("application", "xhtml+xml");
        d("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new alhm(new algs("; "), "=");
    }

    private anbk(String str, String str2, aloi aloiVar) {
        this.e = str;
        this.f = str2;
        this.g = aloiVar;
    }

    private static anbk a(String str, String str2) {
        anbk anbkVar = new anbk(str, str2, almq.a);
        c(anbkVar);
        return anbkVar;
    }

    private final Map b() {
        return new alrw(this.g.map, new alrn(new akdg(16)));
    }

    private static void c(anbk anbkVar) {
        d.put(anbkVar, anbkVar);
    }

    private static void d(String str, String str2) {
        c(new anbk(str, str2, c));
        algw.i(StandardCharsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anbk) {
            anbk anbkVar = (anbk) obj;
            if (this.e.equals(anbkVar.e) && this.f.equals(anbkVar.f) && b().equals(anbkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        if (i == 0) {
            int hashCode = Arrays.hashCode(new Object[]{this.e, this.f, b()});
            this.i = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str = this.h;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append('/');
            sb.append(this.f);
            if (!this.g.x()) {
                sb.append("; ");
                j.b(sb, new alsg(this.g, new alrn(new akdg(15))).r());
            }
            String sb2 = sb.toString();
            this.h = sb2;
            return sb2;
        }
        return str;
    }
}
