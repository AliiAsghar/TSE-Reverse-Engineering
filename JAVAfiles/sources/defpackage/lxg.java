package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxg {
    public final UUID a;
    public final lxf b;
    public final int c;

    public lxg(int i, UUID uuid, lxf lxfVar) {
        this.c = i;
        this.a = uuid;
        this.b = lxfVar;
    }

    public final boolean a() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxg)) {
            return false;
        }
        lxg lxgVar = (lxg) obj;
        if (this.c == lxgVar.c && d.F(this.a, lxgVar.a) && d.F(this.b, lxgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            i = 0;
        } else {
            a.bm(i);
        }
        return (((i * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HandshakeResult(failureReason=");
        int i = this.c;
        if (i != 0) {
            str = akec.P(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", sessionId=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
