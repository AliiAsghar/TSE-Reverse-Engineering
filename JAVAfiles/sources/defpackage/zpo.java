package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpo extends nq {
    final /* synthetic */ zpp a;
    private final zjm b;

    public zpo(zpp zppVar, zjm zjmVar) {
        this.a = zppVar;
        this.b = zjmVar;
    }

    @Override // defpackage.nq
    public final void dA(int i, int i2) {
        this.a.u(i + this.a.G(this.b), i2);
    }

    @Override // defpackage.nq
    public final void dB(int i, int i2, Object obj) {
        this.a.v(i + this.a.G(this.b), i2, obj);
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        this.a.w(i + this.a.G(this.b), i2);
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        this.a.x(i + this.a.G(this.b), i2);
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        int G = this.a.G(this.b);
        this.a.t(i + G, i2 + G);
    }

    @Override // defpackage.nq
    public final void dz() {
        this.a.p();
    }
}
