package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainx {
    private static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("t", aiog.class);
        hashtable.put("To".toLowerCase(Locale.US), aiog.class);
        hashtable.put("From".toLowerCase(Locale.US), ainv.class);
        hashtable.put("f", ainv.class);
        hashtable.put("CSeq".toLowerCase(Locale.US), ainm.class);
        hashtable.put("X-Pidgey-Conference-Params".toLowerCase(Locale.US), aino.class);
        hashtable.put("X-Pidgey-Selected-Experiments".toLowerCase(Locale.US), aiod.class);
        hashtable.put("Via".toLowerCase(Locale.US), aioh.class);
        hashtable.put("v", aioh.class);
        hashtable.put("Contact".toLowerCase(Locale.US), ainp.class);
        hashtable.put("m", ainp.class);
        hashtable.put(assi.a.toLowerCase(Locale.US), ainr.class);
        hashtable.put("c", ainr.class);
        hashtable.put("Content-Length".toLowerCase(Locale.US), ainq.class);
        hashtable.put("l", ainq.class);
        hashtable.put("Authorization".toLowerCase(Locale.US), ainl.class);
        hashtable.put("WWW-Authenticate".toLowerCase(Locale.US), aioi.class);
        hashtable.put("Call-Id".toLowerCase(Locale.US), ainn.class);
        hashtable.put("i", ainn.class);
        hashtable.put("Route".toLowerCase(Locale.US), aioc.class);
        hashtable.put("Record-Route".toLowerCase(Locale.US), aioa.class);
        hashtable.put("Date".toLowerCase(Locale.US), ains.class);
        hashtable.put("Proxy-Authorization".toLowerCase(Locale.US), ainz.class);
        hashtable.put("Proxy-Authenticate".toLowerCase(Locale.US), ainy.class);
        hashtable.put("Max-Forwards".toLowerCase(Locale.US), ainw.class);
        hashtable.put("Expires".toLowerCase(Locale.US), ainu.class);
        hashtable.put("Event".toLowerCase(Locale.US), aint.class);
        hashtable.put("o", aint.class);
        hashtable.put("Session-Expires".toLowerCase(Locale.US), aioe.class);
        hashtable.put("Referred-By".toLowerCase(Locale.US), aiob.class);
        hashtable.put("b", aiob.class);
    }

    public static ailc a(String str) {
        String l = aiky.l(str);
        String m = aiky.m(str);
        if (l != null && m != null) {
            Class cls = (Class) a.get(l.toLowerCase(Locale.US));
            if (cls != null) {
                try {
                    ailc ailcVar = (ailc) cls.getDeclaredConstructor(null).newInstance(null);
                    ailcVar.j(str);
                    return ailcVar;
                } catch (Exception unused) {
                    return null;
                }
            }
            return new ailc(str, (byte[]) null);
        }
        throw new ailb("The header name or value is null");
    }
}
