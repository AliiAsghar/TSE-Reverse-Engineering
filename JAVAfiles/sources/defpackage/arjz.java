package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arjz extends arkd {
    private final int d;
    private final asqe e;
    private final asqe f;
    private final asqe g;
    private final asqe h;

    public arjz(asqe asqeVar, asqe asqeVar2, asqe asqeVar3, asqe asqeVar4, Provider provider, int i) {
        super(provider);
        this.e = asqeVar;
        this.f = asqeVar2;
        this.g = asqeVar3;
        this.h = asqeVar4;
        this.d = i;
    }

    @Override // defpackage.arkd
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.g.b(sSLSocket) && (bArr = (byte[]) this.g.a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, arkg.b);
        }
        return null;
    }

    @Override // defpackage.arkd
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.c(sSLSocket, true);
            this.f.c(sSLSocket, str);
        }
        if (this.h.b(sSLSocket)) {
            this.h.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.arkd
    public final int c() {
        return this.d;
    }
}
