package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnr implements flw {
    public final long a;
    private final flw b;

    public fnr(long j, flw flwVar) {
        this.a = j;
        this.b = flwVar;
    }

    @Override // defpackage.flw
    public final fmq p(int i, int i2) {
        return this.b.p(i, i2);
    }

    @Override // defpackage.flw
    public final void r() {
        this.b.r();
    }

    @Override // defpackage.flw
    public final void w(fmk fmkVar) {
        this.b.w(new fnq(this, fmkVar, fmkVar));
    }
}
