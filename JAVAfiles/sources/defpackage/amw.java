package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amw extends cga.c implements cxi {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    /* compiled from: PG */
    /* renamed from: amw$1, reason: invalid class name */
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

    public amw(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    private final long a(dqv dqvVar) {
        int i;
        int i2;
        int i3;
        int r;
        int i4 = 0;
        if (!dqy.b(this.c, Float.NaN)) {
            i = arrn.r(dqvVar.eo(this.c), 0);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!dqy.b(this.d, Float.NaN)) {
            i2 = arrn.r(dqvVar.eo(this.d), 0);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (dqy.b(this.a, Float.NaN) || (i3 = arrn.r(arrn.s(dqvVar.eo(this.a), i), 0)) == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (!dqy.b(this.b, Float.NaN) && (r = arrn.r(arrn.s(dqvVar.eo(this.b), i2), 0)) != Integer.MAX_VALUE) {
            i4 = r;
        }
        return dqt.d(i3, i, i4, i2);
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        int s;
        int r;
        int s2;
        int r2;
        long d;
        cuf et;
        long a = a(cuhVar);
        if (this.e) {
            d = dqt.f(j, a);
        } else {
            if (!dqy.b(this.a, Float.NaN)) {
                s = dqs.d(a);
            } else {
                s = arrn.s(dqs.d(j), dqs.b(a));
            }
            if (!dqy.b(this.c, Float.NaN)) {
                r = dqs.b(a);
            } else {
                r = arrn.r(dqs.b(j), dqs.d(a));
            }
            if (!dqy.b(this.b, Float.NaN)) {
                s2 = dqs.c(a);
            } else {
                s2 = arrn.s(dqs.c(j), dqs.a(a));
            }
            if (!dqy.b(this.d, Float.NaN)) {
                r2 = dqs.a(a);
            } else {
                r2 = arrn.r(dqs.a(j), dqs.c(a));
            }
            d = dqt.d(s, r, s2, r2);
        }
        cvc e = cucVar.e(d);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
        return et;
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        long a = a(ctdVar);
        if (dqs.i(a)) {
            return dqs.a(a);
        }
        return dqt.b(a, ctcVar.a(i));
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        long a = a(ctdVar);
        if (dqs.j(a)) {
            return dqs.b(a);
        }
        return dqt.c(a, ctcVar.b(i));
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        long a = a(ctdVar);
        if (dqs.i(a)) {
            return dqs.a(a);
        }
        return dqt.b(a, ctcVar.c(i));
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        long a = a(ctdVar);
        if (dqs.j(a)) {
            return dqs.b(a);
        }
        return dqt.c(a, ctcVar.d(i));
    }
}
