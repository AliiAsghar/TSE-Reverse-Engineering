package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnj extends asop {
    public final asmq a;
    public Socket b;
    public Socket c;
    public aslu d;
    public asmf e;
    public aspc f;
    public asqw g;
    public asqv h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean o;
    private int p;
    private int q;

    public asnj(asmq asmqVar) {
        asmqVar.getClass();
        this.a = asmqVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            asmt.q(socket);
        }
    }

    public final synchronized void c() {
        this.p++;
    }

    public final synchronized void d() {
        this.o = true;
    }

    public final synchronized void e() {
        this.i = true;
    }

    @Override // defpackage.asop
    public final void f(aspj aspjVar) {
        aspjVar.k(8, null);
    }

    public final synchronized void g(asnh asnhVar, IOException iOException) {
        if (iOException instanceof aspq) {
            aspq aspqVar = (aspq) iOException;
            if (aspqVar.a == 8) {
                int i = this.q + 1;
                this.q = i;
                if (i > 1) {
                    this.i = true;
                    this.j++;
                }
            } else if (aspqVar.a != 9 || !asnhVar.n) {
                this.i = true;
                this.j++;
            }
        } else if (!i() || (iOException instanceof asoh)) {
            this.i = true;
            if (this.p == 0) {
                asme asmeVar = asnhVar.a;
                asmq asmqVar = this.a;
                if (asmqVar.b.type() != Proxy.Type.DIRECT) {
                    aslb aslbVar = asmqVar.a;
                    aslbVar.g.connectFailed(aslbVar.h.f(), asmqVar.b.address(), iOException);
                }
                asmeVar.p.e(asmqVar);
                this.j++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (defpackage.asqm.b(r7, (java.security.cert.X509Certificate) r0) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.aslb r6, java.util.List r7) {
        /*
            r5 = this;
            byte[] r0 = defpackage.asmt.a
            java.util.List r0 = r5.l
            int r0 = r0.size()
            int r1 = r5.k
            r2 = 0
            if (r0 >= r1) goto Lca
            boolean r0 = r5.i
            if (r0 == 0) goto L13
            goto Lca
        L13:
            asmq r0 = r5.a
            aslb r0 = r0.a
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto Lca
            aslx r0 = r6.h
            asmq r1 = r5.a
            aslb r1 = r1.a
            aslx r1 = r1.h
            java.lang.String r0 = r0.c
            java.lang.String r1 = r1.c
            boolean r0 = defpackage.d.F(r0, r1)
            r1 = 1
            if (r0 == 0) goto L31
            return r1
        L31:
            aspc r0 = r5.f
            if (r0 != 0) goto L36
            return r2
        L36:
            if (r7 == 0) goto Lca
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L40
            goto Lca
        L40:
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r7.next()
            asmq r0 = (defpackage.asmq) r0
            java.net.Proxy r3 = r0.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            asmq r3 = r5.a
            java.net.Proxy r3 = r3.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            asmq r3 = r5.a
            java.net.InetSocketAddress r0 = r0.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r0 = defpackage.d.F(r3, r0)
            if (r0 == 0) goto L44
            javax.net.ssl.HostnameVerifier r7 = r6.d
            asqm r0 = defpackage.asqm.a
            if (r7 != r0) goto Lca
            aslx r7 = r6.h
            asmq r0 = r5.a
            int r3 = r7.d
            aslb r0 = r0.a
            aslx r0 = r0.h
            int r4 = r0.d
            if (r3 == r4) goto L87
            goto Lca
        L87:
            java.lang.String r3 = r7.c
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.d.F(r3, r0)
            if (r0 == 0) goto L92
            goto Lb5
        L92:
            boolean r0 = r5.o
            if (r0 != 0) goto Lca
            aslu r0 = r5.d
            if (r0 == 0) goto Lca
            java.util.List r0 = r0.a()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lca
            java.lang.String r7 = r7.c
            java.lang.Object r0 = r0.get(r2)
            r0.getClass()
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r7 = defpackage.asqm.b(r7, r0)
            if (r7 == 0) goto Lca
        Lb5:
            aslh r6 = r6.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            aslu r7 = r5.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.util.List r7 = r7.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            return r1
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asnj.h(aslb, java.util.List):boolean");
    }

    public final boolean i() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.asop
    public final synchronized void j(aspp asppVar) {
        asppVar.getClass();
        this.k = asppVar.d();
    }

    public final void k() {
        this.i = true;
    }

    public final void l() {
        Socket socket;
        int i;
        asmq asmqVar = this.a;
        Proxy proxy = asmqVar.b;
        Proxy.Type type = proxy.type();
        if (type == null || ((i = asni.a[type.ordinal()]) != 1 && i != 2)) {
            socket = new Socket(proxy);
        } else {
            socket = asmqVar.a.b.createSocket();
            socket.getClass();
        }
        this.b = socket;
        socket.setSoTimeout(10000);
        try {
            aspx.b.h(socket, this.a.c);
            try {
                this.g = new asrk(asre.c(socket));
                this.h = new asri(asre.a(socket));
            } catch (NullPointerException e) {
                if (!d.F(e.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void m() {
        Socket socket = this.c;
        socket.getClass();
        asqw asqwVar = this.g;
        asqwVar.getClass();
        asqv asqvVar = this.h;
        asqvVar.getClass();
        socket.setSoTimeout(0);
        ason asonVar = new ason(asmy.a);
        asonVar.b = socket;
        asonVar.c = asmt.f + " " + this.a.a.h.c;
        asonVar.d = asqwVar;
        asonVar.e = asqvVar;
        asonVar.f = this;
        aspc aspcVar = new aspc(asonVar);
        this.f = aspcVar;
        this.k = aspc.a.d();
        asmy asmyVar = asmy.a;
        asmyVar.getClass();
        aspcVar.u.b();
        aspcVar.u.h(aspcVar.q);
        if (aspcVar.q.c() != 65535) {
            aspcVar.u.i(0, r2 - 65535);
        }
        asmyVar.a().f(new asmw(aspcVar.d, aspcVar.v));
    }

    public final String toString() {
        Object obj;
        aslu asluVar = this.d;
        if (asluVar != null) {
            obj = asluVar.b;
        } else {
            obj = "none";
        }
        asmq asmqVar = this.a;
        asmf asmfVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        aslx aslxVar = asmqVar.a.h;
        sb.append(aslxVar.c);
        sb.append(":");
        sb.append(aslxVar.d);
        sb.append(", proxy=");
        sb.append(asmqVar.b);
        sb.append(" hostAddress=");
        sb.append(asmqVar.c);
        sb.append(" cipherSuite=");
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(asmfVar);
        sb.append("}");
        return sb.toString();
    }
}
