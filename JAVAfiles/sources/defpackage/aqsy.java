package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsy extends aqvn {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public aqsy(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        albo.X(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqsy)) {
            return false;
        }
        aqsy aqsyVar = (aqsy) obj;
        if (!d.B(this.a, aqsyVar.a) || !d.B(this.b, aqsyVar.b) || !d.B(this.c, aqsyVar.c) || !d.B(this.d, aqsyVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        boolean z;
        algv aj = albo.aj(this);
        aj.b("proxyAddr", this.a);
        aj.b("targetAddr", this.b);
        aj.b("username", this.c);
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        aj.h("hasPassword", z);
        return aj.toString();
    }
}
