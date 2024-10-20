package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjn {
    public final tqc a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;
    public final long f;

    public xjn(tqc tqcVar, boolean z, boolean z2, String str, int i, long j) {
        tqcVar.getClass();
        this.a = tqcVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = i;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjn)) {
            return false;
        }
        xjn xjnVar = (xjn) obj;
        if (this.a == xjnVar.a && this.b == xjnVar.b && this.c == xjnVar.c && d.F(this.d, xjnVar.d) && this.e == xjnVar.e && this.f == xjnVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((hashCode2 + a.v(this.b)) * 31) + a.v(this.c)) * 31) + hashCode) * 31) + this.e) * 31) + a.A(this.f);
    }

    public final String toString() {
        return "ConversationCustomization(archiveStatus=" + this.a + ", isMuted=" + this.b + ", noVibrate=" + this.c + ", notificationSoundUri=" + this.d + ", joinStatus=" + this.e + ", rcsSessionId=" + this.f + ")";
    }
}
