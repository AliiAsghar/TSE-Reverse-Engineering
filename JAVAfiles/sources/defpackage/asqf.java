package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqf implements asqg {
    private asqg a;
    private final asqc b;

    public asqf(asqc asqcVar) {
        this.b = asqcVar;
    }

    private final synchronized asqg e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> cls2 = cls;
            while (cls2 != null && !d.F(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            cls2.getClass();
            this.a = new asqd(cls2);
        }
        return this.a;
    }

    @Override // defpackage.asqg
    public final String a(SSLSocket sSLSocket) {
        asqg e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.asqg
    public final void b(SSLSocket sSLSocket, String str, List list) {
        asqg e = e(sSLSocket);
        if (e != null) {
            e.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.asqg
    public final boolean c() {
        return true;
    }

    @Override // defpackage.asqg
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }
}
