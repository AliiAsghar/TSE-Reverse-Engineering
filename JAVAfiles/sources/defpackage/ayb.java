package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayb {
    public static final ayb a;
    public final arqr b;
    public final arqr c;
    public final arqr d;
    public final arqr e;
    private final arqr f;
    private final arqr g;

    static {
        arqr arqrVar = null;
        a = new ayb(arqrVar, arqrVar, arqrVar, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ayb() {
        /*
            r2 = this;
            r0 = 0
            r1 = 63
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayb.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayb)) {
            return false;
        }
        ayb aybVar = (ayb) obj;
        if (this.b == aybVar.b) {
            arqr arqrVar = aybVar.f;
            arqr arqrVar2 = aybVar.c;
            arqr arqrVar3 = aybVar.g;
            if (this.d == aybVar.d && this.e == aybVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        arqr arqrVar = this.b;
        int i3 = 0;
        if (arqrVar != null) {
            i = arqrVar.hashCode();
        } else {
            i = 0;
        }
        arqr arqrVar2 = this.d;
        if (arqrVar2 != null) {
            i2 = arqrVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i * 923521;
        arqr arqrVar3 = this.e;
        if (arqrVar3 != null) {
            i3 = arqrVar3.hashCode();
        }
        return ((i4 + i2) * 31) + i3;
    }

    public /* synthetic */ ayb(arqr arqrVar, arqr arqrVar2, arqr arqrVar3, int i) {
        this.b = 1 == (i & 1) ? null : arqrVar;
        this.f = null;
        this.c = null;
        this.g = null;
        this.d = (i & 16) != 0 ? null : arqrVar2;
        this.e = (i & 32) != 0 ? null : arqrVar3;
    }
}
