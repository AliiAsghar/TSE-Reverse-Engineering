package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihx {
    public final InetAddress a;
    public final int b;
    public final aiic c;

    public aihx() {
        throw null;
    }

    public final String a() {
        return this.a.getHostAddress();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aihx) {
            aihx aihxVar = (aihx) obj;
            if (this.a.equals(aihxVar.a) && this.b == aihxVar.b && this.c.equals(aihxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        aiic aiicVar = this.c;
        return "DnsTransportAddress{inetAddress=" + this.a.toString() + ", port=" + this.b + ", transport=" + aiicVar.toString() + "}";
    }

    public aihx(InetAddress inetAddress, int i, aiic aiicVar) {
        if (inetAddress == null) {
            throw new NullPointerException("Null inetAddress");
        }
        this.a = inetAddress;
        this.b = i;
        if (aiicVar != null) {
            this.c = aiicVar;
            return;
        }
        throw new NullPointerException("Null transport");
    }
}
