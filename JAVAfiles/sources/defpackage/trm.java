package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trm {
    public final aqfn a;
    public final String b;
    public final tqe c;
    public final boolean d;
    public final tro e;
    private final long f;

    public trm() {
        throw null;
    }

    public static trl a() {
        trl trlVar = new trl();
        trlVar.f(0L);
        return trlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trm) {
            trm trmVar = (trm) obj;
            if (this.a.equals(trmVar.a) && this.b.equals(trmVar.b) && this.f == trmVar.f && this.c.equals(trmVar.c) && this.d == trmVar.d && this.e.equals(trmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.f;
        int hashCode2 = (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        tro troVar = this.e;
        tqe tqeVar = this.c;
        return "DesktopInformation{desktopId=" + String.valueOf(this.a) + ", requestId=" + this.b + ", lastConnectionTimeMillis=" + this.f + ", desktopType=" + String.valueOf(tqeVar) + ", isPersistent=" + this.d + ", dittoIdContainer=" + String.valueOf(troVar) + "}";
    }

    public trm(aqfn aqfnVar, String str, long j, tqe tqeVar, boolean z, tro troVar) {
        this.a = aqfnVar;
        this.b = str;
        this.f = j;
        this.c = tqeVar;
        this.d = z;
        this.e = troVar;
    }
}
