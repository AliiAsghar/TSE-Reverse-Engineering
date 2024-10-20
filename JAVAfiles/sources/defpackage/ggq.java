package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggq extends nq {
    private final ghj a;

    public ggq(ghj ghjVar) {
        d.s(true);
        this.a = ghjVar;
    }

    @Override // defpackage.nq
    public final void dB(int i, int i2, Object obj) {
        if (!"Selection-Changed".equals(obj)) {
            this.a.g();
        }
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        this.a.d();
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        this.a.d();
        this.a.g();
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        this.a.d();
    }

    @Override // defpackage.nq
    public final void dz() {
        this.a.g();
    }
}
