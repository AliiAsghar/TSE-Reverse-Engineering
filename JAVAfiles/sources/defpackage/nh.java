package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nh extends nq {
    final /* synthetic */ ni a;

    public nh(ni niVar) {
        this.a = niVar;
    }

    @Override // defpackage.nq
    public final void dA(int i, int i2) {
        ni niVar = this.a;
        ((lt) niVar.d).e(niVar, i, i2, null);
    }

    @Override // defpackage.nq
    public final void dB(int i, int i2, Object obj) {
        ni niVar = this.a;
        ((lt) niVar.d).e(niVar, i, i2, obj);
    }

    @Override // defpackage.nq
    public final void dC(int i, int i2) {
        ni niVar = this.a;
        niVar.a += i2;
        lt ltVar = (lt) niVar.d;
        ltVar.a.w(i + ltVar.a(niVar), i2);
        ni niVar2 = this.a;
        if (niVar2.a > 0 && ((no) niVar2.c).b == 2) {
            ((lt) niVar2.d).d();
        }
    }

    @Override // defpackage.nq
    public final void dD(int i, int i2) {
        ni niVar = this.a;
        niVar.a -= i2;
        lt ltVar = (lt) niVar.d;
        ltVar.a.x(i + ltVar.a(niVar), i2);
        ni niVar2 = this.a;
        if (niVar2.a <= 0 && ((no) niVar2.c).b == 2) {
            ((lt) niVar2.d).d();
        }
    }

    @Override // defpackage.nq
    public final void dE() {
        ((lt) this.a.d).d();
    }

    @Override // defpackage.nq
    public final void dF(int i, int i2) {
        d.t(true, "moving more than 1 item is not supported in RecyclerView");
        ni niVar = this.a;
        lt ltVar = (lt) niVar.d;
        int a = ltVar.a(niVar);
        ltVar.a.t(i + a, i2 + a);
    }

    @Override // defpackage.nq
    public final void dz() {
        ni niVar = this.a;
        niVar.a = ((no) niVar.c).b();
        lt ltVar = (lt) niVar.d;
        ltVar.a.p();
        ltVar.d();
    }
}
