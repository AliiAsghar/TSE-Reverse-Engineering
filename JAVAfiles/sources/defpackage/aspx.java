package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aspx {
    private static final Logger a;
    public static volatile aspx b;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (java.lang.Integer.parseInt(r0) >= 9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    static {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspx.<clinit>():void");
    }

    public static /* synthetic */ void l(aspx aspxVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        aspxVar.k(str, i, null);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public asql b(X509TrustManager x509TrustManager) {
        return new asqj(e(x509TrustManager));
    }

    public boolean d(String str) {
        return true;
    }

    public asqn e(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new asqk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(str, 5, (Throwable) obj);
    }

    public Object g() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress) {
        socket.getClass();
        socket.connect(inetSocketAddress, 10000);
    }

    public final SSLSocketFactory j(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final void k(String str, int i, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        a.log(level, str, th);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    public void i(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
