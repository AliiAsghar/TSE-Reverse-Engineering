package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class als implements ctq, cvu, cwa {
    private final and a;
    private final byn b;
    private final byn c;

    /* compiled from: PG */
    /* renamed from: als$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, int i, int i2) {
            super(1);
            this.a = cvcVar;
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, this.b, this.c, brg.a);
            return arnb.a;
        }
    }

    public als(and andVar) {
        this.a = andVar;
        this.b = new byu(andVar, cav.a);
        this.c = new byu(andVar, cav.a);
    }

    private final and l() {
        return (and) this.b.a();
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.cvu
    public final void d(cwb cwbVar) {
        and andVar = (and) cwbVar.q(anh.a);
        this.b.h(new akt(this.a, andVar));
        this.c.h(new amz(andVar, this.a));
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.a(this, ctdVar, ctcVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof als)) {
            return false;
        }
        return d.F(((als) obj).a, this.a);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int h(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.d(this, ctdVar, ctcVar, i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ctq
    public final cuf i(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        int b = l().b(cuhVar, cuhVar.q());
        int d = l().d(cuhVar);
        int c = l().c(cuhVar, cuhVar.q()) + b;
        int a = l().a(cuhVar) + d;
        cvc e = cucVar.e(dqt.h(j, -c, -a));
        int i = e.a + c;
        int i2 = e.b + a;
        et = cuhVar.et(dqt.c(j, i), dqt.b(j, i2), arnw.a, new AnonymousClass1(e, b, d));
        return et;
    }

    @Override // defpackage.cwa
    public final cwc j() {
        return anh.a;
    }

    @Override // defpackage.cwa
    public final /* synthetic */ Object k() {
        return (and) this.c.a();
    }
}
