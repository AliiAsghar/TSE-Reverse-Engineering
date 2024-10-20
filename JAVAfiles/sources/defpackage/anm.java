package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anm extends cga.c implements cxi {
    public aks a;
    public arqv b;

    /* compiled from: PG */
    /* renamed from: anm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ int b;
        final /* synthetic */ cvc c;
        final /* synthetic */ int d;
        final /* synthetic */ cuh e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, cvc cvcVar, int i2, cuh cuhVar) {
            super(1);
            this.b = i;
            this.c = cvcVar;
            this.d = i2;
            this.e = cuhVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i = this.b;
            ((cvc.a) obj).f(this.c, ((dre) anm.this.b.a(new dri(((this.d - r2.b) & 4294967295L) | ((i - this.c.a) << 32)), this.e.q())).a, brg.a);
            return arnb.a;
        }
    }

    public anm(aks aksVar, arqv arqvVar) {
        this.a = aksVar;
        this.b = arqvVar;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        int d;
        cuf et;
        int i = 0;
        if (this.a != aks.a) {
            d = 0;
        } else {
            d = dqs.d(j);
        }
        if (this.a == aks.b) {
            i = dqs.c(j);
        }
        cvc e = cucVar.e(dqt.d(d, dqs.b(j), i, dqs.a(j)));
        int u = arrn.u(e.a, dqs.d(j), dqs.b(j));
        int u2 = arrn.u(e.b, dqs.c(j), dqs.a(j));
        et = cuhVar.et(u, u2, arnw.a, new AnonymousClass1(u, e, u2, cuhVar));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.d(this, ctdVar, ctcVar, i);
    }
}
