package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ana extends cga.c implements cxi {
    public float a;
    public float b;

    /* compiled from: PG */
    /* renamed from: ana$1, reason: invalid class name */
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

    public ana(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        int d;
        int c;
        cuf et;
        if (!dqy.b(this.a, Float.NaN) && dqs.d(j) == 0) {
            d = arrn.r(arrn.s(cuhVar.eo(this.a), dqs.b(j)), 0);
        } else {
            d = dqs.d(j);
        }
        int b = dqs.b(j);
        if (!dqy.b(this.b, Float.NaN) && dqs.c(j) == 0) {
            c = arrn.r(arrn.s(cuhVar.eo(this.b), dqs.a(j)), 0);
        } else {
            c = dqs.c(j);
        }
        cvc e = cucVar.e(dqt.d(d, b, c, dqs.a(j)));
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
        return et;
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        int i2;
        int a = ctcVar.a(i);
        if (!dqy.b(this.b, Float.NaN)) {
            i2 = ctdVar.eo(this.b);
        } else {
            i2 = 0;
        }
        return arrn.r(a, i2);
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        int i2;
        int b = ctcVar.b(i);
        if (!dqy.b(this.a, Float.NaN)) {
            i2 = ctdVar.eo(this.a);
        } else {
            i2 = 0;
        }
        return arrn.r(b, i2);
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        int i2;
        int c = ctcVar.c(i);
        if (!dqy.b(this.b, Float.NaN)) {
            i2 = ctdVar.eo(this.b);
        } else {
            i2 = 0;
        }
        return arrn.r(c, i2);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        int i2;
        int d = ctcVar.d(i);
        if (!dqy.b(this.a, Float.NaN)) {
            i2 = ctdVar.eo(this.a);
        } else {
            i2 = 0;
        }
        return arrn.r(d, i2);
    }
}
