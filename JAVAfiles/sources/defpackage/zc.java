package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zc extends cga.c implements cxi {
    public final byn a;
    public final byn b;
    private dqs c;

    /* compiled from: PG */
    /* renamed from: zc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ cuh e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, long j, long j2, cuh cuhVar) {
            super(1);
            this.b = cvcVar;
            this.c = j;
            this.d = j2;
            this.e = cuhVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long floatToRawIntBits;
            cvc.a aVar = (cvc.a) obj;
            xx xxVar = (xx) zc.this.a.a();
            if (!((Boolean) ((arqg) zc.this.b.a()).a()).booleanValue() || xxVar == null) {
                aVar.e(this.b, 0, 0, brg.a);
            } else {
                long j = this.c;
                if (((int) (j >> 32)) != 0 && ((int) (j & 4294967295L)) != 0) {
                    floatToRawIntBits = xxVar.a.a(drj.c(j), drj.c(this.d));
                } else {
                    long floatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
                    int i = cvj.a;
                    floatToRawIntBits = (Float.floatToRawIntBits(1.0f) & 4294967295L) | (floatToRawIntBits2 << 32);
                }
                cfq cfqVar = xxVar.b;
                float intBitsToFloat = ((int) (this.c >> 32)) * Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                long j2 = this.c & 4294967295L;
                long a = cfqVar.a((arsk.g(intBitsToFloat) << 32) | (4294967295L & arsk.g(((int) j2) * Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), this.d, this.e.q());
                cvc.a.q(aVar, this.b, dre.a(a), dre.b(a), new zb(floatToRawIntBits), 4);
            }
            return arnb.a;
        }
    }

    public zc(xx xxVar, arqg arqgVar) {
        this.a = new byu(xxVar, cav.a);
        this.b = new byu(arqgVar, cav.a);
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        if (cuhVar.ev()) {
            this.c = new dqs(j);
        }
        dqs dqsVar = this.c;
        dqsVar.getClass();
        cvc e = cucVar.e(dqsVar.a);
        long j2 = (e.b & 4294967295L) | (e.a << 32);
        long e2 = dqt.e(j, j2);
        et = cuhVar.et((int) (e2 >> 32), (int) (e2 & 4294967295L), arnw.a, new AnonymousClass1(e, j2, e2, cuhVar));
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
