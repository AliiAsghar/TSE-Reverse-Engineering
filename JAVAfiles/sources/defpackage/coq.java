package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coq extends cor {
    private final long a;
    private float b = 1.0f;
    private ckv c;

    public coq(long j) {
        this.a = j;
    }

    @Override // defpackage.cor
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cor
    protected final void b(cny cnyVar) {
        cnw.l(cnyVar, this.a, 0L, 0L, this.b, this.c, 86);
    }

    @Override // defpackage.cor
    protected final void c(float f) {
        this.b = f;
    }

    @Override // defpackage.cor
    protected final void d(ckv ckvVar) {
        this.c = ckvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof coq) && a.bB(this.a, ((coq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) cku.g(this.a)) + ')';
    }
}
