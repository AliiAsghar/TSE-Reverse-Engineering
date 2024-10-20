package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ics {
    public final boolean a;
    public final UUID b;
    public final boolean c;
    public final icq d;
    private final int e;

    public /* synthetic */ ics(boolean z, UUID uuid, int i, boolean z2, icq icqVar, int i2) {
        this.a = z;
        this.b = (i2 & 2) != 0 ? null : uuid;
        this.e = (i2 & 4) != 0 ? 0 : i;
        this.c = (!((i2 & 8) == 0)) | z2;
        this.d = icqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ics)) {
            return false;
        }
        ics icsVar = (ics) obj;
        if (this.a == icsVar.a && d.F(this.b, icsVar.b) && this.e == icsVar.e && this.c == icsVar.c && d.F(this.d, icsVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.b;
        int i = 0;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        boolean z = this.a;
        int i2 = this.e;
        if (i2 != 0) {
            a.bm(i2);
            i = i2;
        }
        return (((((((a.v(z) * 31) + hashCode) * 31) + i) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("GetMetadataResult(isSuccess=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", failureReason=");
        int i = this.e;
        if (i != 0) {
            str = akec.P(i);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", shouldLog=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
