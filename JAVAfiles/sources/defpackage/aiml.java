package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiml {
    public static final Hashtable a = new Hashtable();

    static {
        a("CSeq", ailt.class);
        a("Record-Route", aimq.class);
        a("Via", ainb.class);
        a("From", aimg.class);
        a("Call-Id", ailu.class);
        a("Max-Forwards", aimj.class);
        a("Proxy-Authenticate", aimo.class);
        a(assi.a, aimb.class);
        a("Content-Length", aima.class);
        a("Route", aimt.class);
        a("Contact", ailx.class);
        a("WWW-Authenticate", aind.class);
        a("Proxy-Authorization", aimp.class);
        a("Date", aimc.class);
        a("Expires", aime.class);
        a("Authorization", ails.class);
        a("Session-Expires", aimw.class);
    }

    protected static void a(String str, Class cls) {
        a.put(str.toLowerCase(Locale.US), cls);
    }
}
