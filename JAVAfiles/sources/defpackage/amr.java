package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amr implements cue, amn {
    public final cfq.c a;
    private final ajw.b b;

    /* compiled from: PG */
    /* renamed from: amr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc[] a;
        final /* synthetic */ amr b;
        final /* synthetic */ int c;
        final /* synthetic */ int[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc[] cvcVarArr, amr amrVar, int i, int[] iArr) {
            super(1);
            this.a = cvcVarArr;
            this.b = amrVar;
            this.c = i;
            this.d = iArr;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            akr akrVar;
            int a;
            cvc.a aVar = (cvc.a) obj;
            int i = 0;
            int i2 = 0;
            while (true) {
                cvc[] cvcVarArr = this.a;
                if (i < cvcVarArr.length) {
                    cvc cvcVar = cvcVarArr[i];
                    int i3 = i2 + 1;
                    cvcVar.getClass();
                    amp c = amm.c(cvcVar);
                    if (c != null) {
                        akrVar = c.c;
                    } else {
                        akrVar = null;
                    }
                    int i4 = this.c;
                    if (akrVar != null) {
                        a = akrVar.a(i4 - cvcVar.b, drk.a);
                    } else {
                        a = this.b.a.a(0, i4 - cvcVar.b);
                    }
                    aVar.e(cvcVar, this.d[i2], a, brg.a);
                    i++;
                    i2 = i3;
                } else {
                    return arnb.a;
                }
            }
        }
    }

    public amr(ajw.b bVar, cfq.c cVar) {
        this.b = bVar;
        this.a = cVar;
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        int round;
        int i2;
        int i3;
        int eo = ctdVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * eo, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            ctc ctcVar = (ctc) list.get(i5);
            float a = amm.a(amm.b(ctcVar));
            if (a == brg.a) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(ctcVar.b(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ctcVar.a(min2));
            } else if (a > brg.a) {
                f += a;
            }
        }
        if (f == brg.a) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ctc ctcVar2 = (ctc) list.get(i6);
            float a2 = amm.a(amm.b(ctcVar2));
            if (a2 > brg.a) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * a2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, ctcVar2.a(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        int eo = ctdVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ctc ctcVar = (ctc) list.get(i4);
            float a = amm.a(amm.b(ctcVar));
            int b = ctcVar.b(i);
            if (a == brg.a) {
                i3 += b;
            } else if (a > brg.a) {
                f += a;
                i2 = Math.max(i2, Math.round(b / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        int round;
        int i2;
        int i3;
        int eo = ctdVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * eo, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            ctc ctcVar = (ctc) list.get(i5);
            float a = amm.a(amm.b(ctcVar));
            if (a == brg.a) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(ctcVar.b(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ctcVar.c(min2));
            } else if (a > brg.a) {
                f += a;
            }
        }
        if (f == brg.a) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ctc ctcVar2 = (ctc) list.get(i6);
            float a2 = amm.a(amm.b(ctcVar2));
            if (a2 > brg.a) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * a2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, ctcVar2.c(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        int eo = ctdVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ctc ctcVar = (ctc) list.get(i4);
            float a = amm.a(amm.b(ctcVar));
            int d = ctcVar.d(i);
            if (a == brg.a) {
                i3 += d;
            } else if (a > brg.a) {
                f += a;
                i2 = Math.max(i2, Math.round(d / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf a;
        a = amo.a(this, dqs.d(j), dqs.c(j), dqs.b(j), dqs.a(j), cuhVar.eo(this.b.a()), cuhVar, list, new cvc[list.size()], 0, list.size(), null, 0);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amr)) {
            return false;
        }
        amr amrVar = (amr) obj;
        if (d.F(this.b, amrVar.b) && d.F(this.a, amrVar.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.amn
    public final int f(cvc cvcVar) {
        return cvcVar.b;
    }

    @Override // defpackage.amn
    public final int g(cvc cvcVar) {
        return cvcVar.a;
    }

    @Override // defpackage.amn
    public final void h(int i, int[] iArr, int[] iArr2, cuh cuhVar) {
        this.b.b(cuhVar, i, iArr, cuhVar.q(), iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.amn
    public final long i(int i, int i2, int i3, boolean z) {
        return amq.b(z, i, i2, i3);
    }

    @Override // defpackage.amn
    public final cuf j(cvc[] cvcVarArr, cuh cuhVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        cuf et;
        et = cuhVar.et(i, i2, arnw.a, new AnonymousClass1(cvcVarArr, this, i2, iArr));
        return et;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.b + ", verticalAlignment=" + this.a + ')';
    }
}
