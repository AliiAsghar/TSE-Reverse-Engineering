package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmq {
    public final aslb a;
    public final Proxy b;
    public final InetSocketAddress c;

    public asmq(aslb aslbVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = aslbVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        if (this.a.c != null && this.b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof asmq) {
            asmq asmqVar = (asmq) obj;
            if (d.F(asmqVar.a, this.a) && d.F(asmqVar.b, this.b) && d.F(asmqVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
