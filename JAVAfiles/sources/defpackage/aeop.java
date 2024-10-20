package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeop {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aeop() {
        /*
            r2 = this;
            r0 = 0
            r1 = 63
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeop.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeop)) {
            return false;
        }
        aeop aeopVar = (aeop) obj;
        if (this.a == aeopVar.a && this.b == aeopVar.b && this.c == aeopVar.c && this.d == aeopVar.d && this.e == aeopVar.e && this.f == aeopVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public final String toString() {
        return "Flags(useRevisedLayout=" + this.a + ", useMagicEdit=" + this.b + ", useSingleLineCompose=" + this.c + ", verifyTextFieldDisposition=" + this.d + ", hideInputIfNullUiData=" + this.e + ", useWideCursor=" + this.f + ")";
    }

    public aeop(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public /* synthetic */ aeop(boolean z, boolean z2, boolean z3, int i) {
        this(false, false, ((i & 4) == 0) & z, false, ((i & 16) == 0) & z2, ((i & 32) == 0) & z3);
    }
}
