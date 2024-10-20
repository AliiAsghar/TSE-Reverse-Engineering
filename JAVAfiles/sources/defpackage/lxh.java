package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxh {
    public final boolean a;
    public final boolean b;
    public final UUID c;
    public final lxf d;
    public final abnf e;
    public final int f;

    public lxh(boolean z, boolean z2, int i, UUID uuid, lxf lxfVar, abnf abnfVar) {
        uuid.getClass();
        this.a = z;
        this.b = z2;
        this.f = i;
        this.c = uuid;
        this.d = lxfVar;
        this.e = abnfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxh)) {
            return false;
        }
        lxh lxhVar = (lxh) obj;
        if (this.a == lxhVar.a && this.b == lxhVar.b && this.f == lxhVar.f && d.F(this.c, lxhVar.c) && d.F(this.d, lxhVar.d) && this.e == lxhVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        } else {
            a.bm(i);
        }
        int v = (((((((a.v(this.a) * 31) + a.v(this.b)) * 31) + i) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        abnf abnfVar = this.e;
        if (abnfVar != null) {
            i2 = abnfVar.hashCode();
        }
        return (v * 31) + i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RestoreCustomD2DItemResult(isSuccess=");
        sb.append(this.a);
        sb.append(", shouldLogSuccess=");
        sb.append(this.b);
        sb.append(", failureReason=");
        int i = this.f;
        if (i != 0) {
            str = akec.P(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", sessionId=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ lxh(int i, UUID uuid, lxf lxfVar, abnf abnfVar, int i2) {
        this(false, (i2 & 2) != 0, (i2 & 4) != 0 ? 0 : i, uuid, lxfVar, (i2 & 32) != 0 ? null : abnfVar);
    }
}
