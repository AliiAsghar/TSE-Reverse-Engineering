package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qip {
    public final arpi a;
    private final arpi b;

    public qip() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qip)) {
            return false;
        }
        qip qipVar = (qip) obj;
        if (d.F(this.a, qipVar.a) && d.F(this.b, qipVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CompositionLocalTikTokCoroutineContext(lightweight=" + this.a + ", background=" + this.b + ")";
    }

    public qip(arpi arpiVar, arpi arpiVar2) {
        this.a = arpiVar;
        this.b = arpiVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ qip(byte[] r1) {
        /*
            r0 = this;
            arpj r1 = defpackage.arpj.a
            r0.<init>(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qip.<init>(byte[]):void");
    }
}
