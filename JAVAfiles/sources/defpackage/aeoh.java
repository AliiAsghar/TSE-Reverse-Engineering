package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeoh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aeoh() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeoh.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeoh)) {
            return false;
        }
        aeoh aeohVar = (aeoh) obj;
        if (this.a == aeohVar.a && this.b == aeohVar.b && this.c == aeohVar.c && this.d == aeohVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        boolean z = this.d;
        return (((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z);
    }

    public final String toString() {
        return "Flags(disableSendButtonRevealAnimation=" + this.a + ", enableDraftContentsCheck=" + this.b + ", enableInvertedColors=" + this.c + ", enableFixForMirroredCheckmark=" + this.d + ")";
    }

    public aeoh(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public /* synthetic */ aeoh(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) | (i & 1)), (i & 2) != 0, false, z2 & ((i & 8) == 0));
    }
}
