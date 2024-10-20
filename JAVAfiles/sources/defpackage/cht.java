package defpackage;

import defpackage.cga;
import defpackage.cnr;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cht extends cga.c implements cxi, cwx {
    public cor a;
    public boolean b;
    public cfq c;
    public csv d;
    public float e;
    public ckv f;

    /* compiled from: PG */
    /* renamed from: cht$1, reason: invalid class name */
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

    public cht(cor corVar, boolean z, cfq cfqVar, csv csvVar, float f, ckv ckvVar) {
        this.a = corVar;
        this.b = z;
        this.c = cfqVar;
        this.d = csvVar;
        this.e = f;
        this.f = ckvVar;
    }

    private final long a(long j) {
        boolean z;
        int d;
        int c;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = true;
        if (dqs.h(j) && dqs.g(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!dqs.j(j) || !dqs.i(j)) {
            z2 = false;
        }
        if ((!h() && z) || z2) {
            return dqs.k(j, dqs.b(j), 0, dqs.a(j), 0, 10);
        }
        long a = this.a.a();
        if (j(a)) {
            d = Math.round(Float.intBitsToFloat((int) (a >> 32)));
        } else {
            d = dqs.d(j);
        }
        if (i(a)) {
            c = Math.round(Float.intBitsToFloat((int) (a & 4294967295L)));
        } else {
            c = dqs.c(j);
        }
        int c2 = dqt.c(j, d);
        int b = dqt.b(j, c);
        long floatToRawIntBits = (Float.floatToRawIntBits(c2) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
        if (h()) {
            int i = (int) (floatToRawIntBits >> 32);
            if (!j(this.a.a())) {
                intBitsToFloat = Float.intBitsToFloat(i);
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.a.a() >> 32));
            }
            if (!i(this.a.a())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            }
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2);
            long j2 = floatToRawIntBits2 << 32;
            long j3 = floatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) != brg.a && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) != brg.a) {
                long j4 = j2 | j3;
                floatToRawIntBits = cvk.a(j4, this.d.a(j4, floatToRawIntBits));
            } else {
                floatToRawIntBits = 0;
            }
        }
        return dqs.k(j, dqt.c(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, dqt.b(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
    }

    private final boolean h() {
        if (this.b && this.a.a() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    private static final boolean i(long j) {
        if (!a.bB(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    private static final boolean j(long j) {
        if (!a.bB(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(a(j));
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
        return et;
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        if (h()) {
            long a = a(dqt.l(i, 0, 13));
            return Math.max(dqs.c(a), ctcVar.a(i));
        }
        return ctcVar.a(i);
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        if (h()) {
            long a = a(dqt.l(0, i, 7));
            return Math.max(dqs.d(a), ctcVar.b(i));
        }
        return ctcVar.b(i);
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        if (h()) {
            long a = a(dqt.l(i, 0, 13));
            return Math.max(dqs.c(a), ctcVar.c(i));
        }
        return ctcVar.c(i);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        if (h()) {
            long a = a(dqt.l(0, i, 7));
            return Math.max(dqs.d(a), ctcVar.d(i));
        }
        return ctcVar.d(i);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        long a = this.a.a();
        if (j(a)) {
            intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (cntVar.o() >> 32));
        }
        if (i(a)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (a & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (cntVar.o() & 4294967295L));
        }
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
        if (Float.intBitsToFloat((int) (cntVar.o() >> 32)) != brg.a && Float.intBitsToFloat((int) (cntVar.o() & 4294967295L)) != brg.a) {
            long j2 = floatToRawIntBits2 | floatToRawIntBits;
            j = cvk.a(j2, this.d.a(j2, cntVar.o()));
        } else {
            j = 0;
        }
        long j3 = j;
        long round = Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L;
        long a2 = this.c.a(round | (Math.round(Float.intBitsToFloat((int) (j3 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (cntVar.o() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (cntVar.o() & 4294967295L))) & 4294967295L), cntVar.r());
        float a3 = dre.a(a2);
        float b = dre.b(a2);
        ((cnr.AnonymousClass1) cntVar.q()).a.e(a3, b);
        float f = -a3;
        float f2 = -b;
        try {
            this.a.e(cntVar, j3, this.e, this.f);
            ((cnr.AnonymousClass1) cntVar.q()).a.e(f, f2);
            cntVar.p();
        } catch (Throwable th) {
            ((cnr.AnonymousClass1) cntVar.q()).a.e(f, f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
