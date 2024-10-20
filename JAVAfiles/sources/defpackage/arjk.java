package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
class arjk {
    public static final arjk b;
    protected final arkd c;
    public static final Logger a = Logger.getLogger(arjk.class.getName());
    private static final arkd d = arkd.b;

    static {
        arjk arjkVar;
        ClassLoader classLoader = arjk.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                arjkVar = new arjk(d);
            }
        }
        arjkVar = new arjj(d);
        b = arjkVar;
    }

    public arjk(arkd arkdVar) {
        arkdVar.getClass();
        this.c = arkdVar;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a2 = a(sSLSocket);
            if (a2 != null) {
                return a2;
            }
            throw new RuntimeException(a.cr(list, "TLS ALPN negotiation failed with protocols: "));
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.c.b(sSLSocket, str, list);
    }
}
