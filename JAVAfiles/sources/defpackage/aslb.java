package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslb {
    public final aslq a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final aslh e;
    public final asld f;
    public final ProxySelector g;
    public final aslx h;
    public final List i;
    public final List j;

    public aslb(String str, int i, aslq aslqVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, aslh aslhVar, asld asldVar, List list, List list2, ProxySelector proxySelector) {
        String str2;
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = aslqVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = aslhVar;
        this.f = asldVar;
        this.g = proxySelector;
        aslw aslwVar = new aslw();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (arsd.x(str2, "http", true)) {
            aslwVar.a = "http";
        } else if (arsd.x(str2, "https", true)) {
            aslwVar.a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        char[] cArr = aslx.a;
        String ak = aotl.ak(aotl.ap(str, 0, 0, false, 7));
        if (ak != null) {
            aslwVar.d = ak;
            if (i > 0) {
                aslwVar.e = i;
                this.h = aslwVar.a();
                this.i = asmt.n(list);
                this.j = asmt.n(list2);
                return;
            }
            throw new IllegalArgumentException(a.bV(i, "unexpected port: "));
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(aslb aslbVar) {
        aslbVar.getClass();
        if (d.F(this.a, aslbVar.a) && d.F(this.f, aslbVar.f) && d.F(this.i, aslbVar.i) && d.F(this.j, aslbVar.j) && d.F(this.g, aslbVar.g) && d.F(null, null) && d.F(this.c, aslbVar.c) && d.F(this.d, aslbVar.d) && d.F(this.e, aslbVar.e)) {
            if (this.h.d == aslbVar.h.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aslb) {
            aslb aslbVar = (aslb) obj;
            if (d.F(this.h, aslbVar.h) && a(aslbVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.h.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        ProxySelector proxySelector = this.g;
        java.util.Objects.toString(proxySelector);
        String concat = "proxySelector=".concat(proxySelector.toString());
        StringBuilder sb = new StringBuilder("Address{");
        aslx aslxVar = this.h;
        sb.append(aslxVar.c);
        sb.append(":");
        sb.append(aslxVar.d);
        sb.append(", ");
        sb.append(concat);
        sb.append("}");
        return sb.toString();
    }
}
