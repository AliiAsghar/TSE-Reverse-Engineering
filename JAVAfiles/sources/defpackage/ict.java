package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ict {
    public final boolean a;
    public final icq b;
    public final int c;

    public ict(boolean z, int i, icq icqVar) {
        this.a = z;
        this.c = i;
        this.b = icqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ict)) {
            return false;
        }
        ict ictVar = (ict) obj;
        if (this.a == ictVar.a && this.c == ictVar.c && d.F(this.b, ictVar.b)) {
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
        return (((a.v(this.a) * 31) + i) * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HandshakeResult(isSuccess=");
        sb.append(this.a);
        sb.append(", failureReason=");
        int i = this.c;
        if (i != 0) {
            str = akec.P(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
