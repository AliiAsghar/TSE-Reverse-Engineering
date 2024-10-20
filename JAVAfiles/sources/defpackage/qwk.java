package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwk implements rvm {
    public final qvq a;
    public final oeo b;
    public final agnq c;
    public final arpi d;
    private final arwe e;
    private final arwe f;
    private final tqb g;

    public qwk(qvq qvqVar, oeo oeoVar, agnq agnqVar, arwe arweVar, arpi arpiVar, arwe arweVar2) {
        qvqVar.getClass();
        agnqVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        arweVar2.getClass();
        this.a = qvqVar;
        this.b = oeoVar;
        this.c = agnqVar;
        this.e = arweVar;
        this.d = arpiVar;
        this.f = arweVar2;
        this.g = tqb.PARTICIPANTS_TABLE_MY_IDENTITY;
    }

    @Override // defpackage.rvm
    public final tqb a() {
        return this.g;
    }

    @Override // defpackage.rvm
    public final akul b() {
        akul c;
        c = qjh.c(this.e, arpj.a, arwf.a, new qrr(this, (arpe) null, 10));
        return c;
    }

    @Override // defpackage.rvm
    public final akul c(long j) {
        akul c;
        c = qjh.c(this.f, arpj.a, arwf.a, new qvt(this, j, (arpe) null, 2));
        return c;
    }

    @Override // defpackage.rvm
    public final akul d(Optional optional) {
        akul c;
        optional.getClass();
        c = qjh.c(this.f, arpj.a, arwf.a, new qsk(this, optional, (arpe) null, 9));
        return c;
    }

    @Override // defpackage.rvm
    public final void f() {
    }
}
