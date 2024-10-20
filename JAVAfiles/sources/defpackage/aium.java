package defpackage;

import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aium extends Provider {
    public aium() {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        String name = aiuj.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }
}
