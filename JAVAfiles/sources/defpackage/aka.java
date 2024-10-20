package defpackage;

import defpackage.cga;
import defpackage.cvc;
import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aka extends cga.c implements cxi {
    public float a = 1.0f;

    /* compiled from: PG */
    /* renamed from: aka$1, reason: invalid class name */
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

    private final long a(long j, boolean z) {
        int a = dqs.a(j);
        if (a != Integer.MAX_VALUE) {
            int round = Math.round(a * this.a);
            if (round > 0) {
                if (!z || ajz.a(j, round, a)) {
                    return (round << 32) | a;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    private final long h(long j, boolean z) {
        int b = dqs.b(j);
        if (b != Integer.MAX_VALUE) {
            int round = Math.round(b / this.a);
            if (round > 0) {
                if (!z || ajz.a(j, b, round)) {
                    return (b << 32) | (round & 4294967295L);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    private final long i(long j, boolean z) {
        int c = dqs.c(j);
        int round = Math.round(c * this.a);
        if (round > 0) {
            if (!z || ajz.a(j, round, c)) {
                return (round << 32) | c;
            }
            return 0L;
        }
        return 0L;
    }

    private final long j(long j, boolean z) {
        int d = dqs.d(j);
        int round = Math.round(d / this.a);
        if (round > 0) {
            if (!z || ajz.a(j, d, round)) {
                return (d << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        long h = h(j, true);
        if (a.bB(h, 0L)) {
            h = a(j, true);
            if (a.bB(h, 0L)) {
                h = j(j, true);
                if (a.bB(h, 0L)) {
                    h = i(j, true);
                    if (a.bB(h, 0L)) {
                        h = h(j, false);
                        if (a.bB(h, 0L)) {
                            h = a(j, false);
                            if (a.bB(h, 0L)) {
                                h = j(j, false);
                                if (a.bB(h, 0L)) {
                                    h = i(j, false);
                                    if (a.bB(h, 0L)) {
                                        h = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!a.bB(h, 0L)) {
            j = dqs.a.c((int) (h >> 32), (int) (h & 4294967295L));
        }
        cvc e = cucVar.e(j);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
        return et;
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.a);
        }
        return ctcVar.a(Integer.MAX_VALUE);
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.a);
        }
        return ctcVar.b(Integer.MAX_VALUE);
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.a);
        }
        return ctcVar.c(Integer.MAX_VALUE);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.a);
        }
        return ctcVar.d(Integer.MAX_VALUE);
    }
}
