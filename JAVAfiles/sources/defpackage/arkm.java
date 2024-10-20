package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arkm {
    public static final asqx a = aotl.R(":");
    public static final arkj[] b = {new arkj(arkj.e, ""), new arkj(arkj.b, "GET"), new arkj(arkj.b, "POST"), new arkj(arkj.c, "/"), new arkj(arkj.c, "/index.html"), new arkj(arkj.d, "http"), new arkj(arkj.d, "https"), new arkj(arkj.a, "200"), new arkj(arkj.a, "204"), new arkj(arkj.a, "206"), new arkj(arkj.a, "304"), new arkj(arkj.a, "400"), new arkj(arkj.a, "404"), new arkj(arkj.a, "500"), new arkj("accept-charset", ""), new arkj("accept-encoding", "gzip, deflate"), new arkj("accept-language", ""), new arkj("accept-ranges", ""), new arkj("accept", ""), new arkj("access-control-allow-origin", ""), new arkj("age", ""), new arkj("allow", ""), new arkj("authorization", ""), new arkj("cache-control", ""), new arkj("content-disposition", ""), new arkj("content-encoding", ""), new arkj("content-language", ""), new arkj("content-length", ""), new arkj("content-location", ""), new arkj("content-range", ""), new arkj("content-type", ""), new arkj("cookie", ""), new arkj("date", ""), new arkj("etag", ""), new arkj("expect", ""), new arkj("expires", ""), new arkj("from", ""), new arkj("host", ""), new arkj("if-match", ""), new arkj("if-modified-since", ""), new arkj("if-none-match", ""), new arkj("if-range", ""), new arkj("if-unmodified-since", ""), new arkj("last-modified", ""), new arkj("link", ""), new arkj("location", ""), new arkj("max-forwards", ""), new arkj("proxy-authenticate", ""), new arkj("proxy-authorization", ""), new arkj("range", ""), new arkj("referer", ""), new arkj("refresh", ""), new arkj("retry-after", ""), new arkj("server", ""), new arkj("set-cookie", ""), new arkj("strict-transport-security", ""), new arkj("transfer-encoding", ""), new arkj("user-agent", ""), new arkj("vary", ""), new arkj("via", ""), new arkj("www-authenticate", "")};
    public static final Map c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            arkj[] arkjVarArr = b;
            int length = arkjVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(arkjVarArr[i].f)) {
                    linkedHashMap.put(arkjVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            } else {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(asqx asqxVar) {
        int b2 = asqxVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = asqxVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(asqxVar.e()));
            }
        }
    }
}
