package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuz {
    public final boolean a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aeuz() {
        /*
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeuz.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeuz)) {
            return false;
        }
        aeuz aeuzVar = (aeuz) obj;
        if (this.a == aeuzVar.a && this.b == aeuzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "Flags(useWrappingMetatext=" + this.a + ", useClickableWithPosition=" + this.b + ")";
    }

    public /* synthetic */ aeuz(boolean z, boolean z2, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = ((i & 2) == 0) & z2;
    }
}
