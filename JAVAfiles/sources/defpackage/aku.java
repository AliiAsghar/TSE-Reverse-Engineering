package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku extends cga.c implements cxi {
    public aks a;
    public float b;

    /* compiled from: PG */
    /* renamed from: aku$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.m((cvc.a) obj, this.a, 0, 0);
            return arnb.a;
        }
    }

    public aku(aks aksVar, float f) {
        this.a = aksVar;
        this.b = f;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        int d;
        int b;
        int a;
        int i;
        cuf et;
        if (dqs.h(j) && this.a != aks.a) {
            d = arrn.u(Math.round(dqs.b(j) * this.b), dqs.d(j), dqs.b(j));
            b = d;
        } else {
            d = dqs.d(j);
            b = dqs.b(j);
        }
        if (dqs.g(j) && this.a != aks.b) {
            i = arrn.u(Math.round(dqs.a(j) * this.b), dqs.c(j), dqs.a(j));
            a = i;
        } else {
            int c = dqs.c(j);
            a = dqs.a(j);
            i = c;
        }
        cvc e = cucVar.e(dqt.d(d, b, i, a));
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
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
