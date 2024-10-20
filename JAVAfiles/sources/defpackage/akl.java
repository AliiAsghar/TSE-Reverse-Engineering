package defpackage;

import defpackage.ajw;
import defpackage.cfq;
import defpackage.cvc;
import defpackage.dqs;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akl implements cue, amn {
    public final cfq.b a;
    private final ajw.e b;

    /* compiled from: PG */
    /* renamed from: akl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc[] a;
        final /* synthetic */ akl b;
        final /* synthetic */ int c;
        final /* synthetic */ cuh d;
        final /* synthetic */ int[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc[] cvcVarArr, akl aklVar, int i, cuh cuhVar, int[] iArr) {
            super(1);
            this.a = cvcVarArr;
            this.b = aklVar;
            this.c = i;
            this.d = cuhVar;
            this.e = iArr;
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
                    cuh cuhVar = this.d;
                    cvc cvcVar = cvcVarArr[i];
                    int i3 = i2 + 1;
                    cvcVar.getClass();
                    amp c = amm.c(cvcVar);
                    drk q = cuhVar.q();
                    if (c != null) {
                        akrVar = c.c;
                    } else {
                        akrVar = null;
                    }
                    int i4 = this.c;
                    if (akrVar != null) {
                        a = akrVar.a(i4 - cvcVar.a, q);
                    } else {
                        a = this.b.a.a(0, i4 - cvcVar.a, q);
                    }
                    aVar.e(cvcVar, a, this.e[i2], brg.a);
                    i++;
                    i2 = i3;
                } else {
                    return arnb.a;
                }
            }
        }
    }

    public akl(ajw.e eVar, cfq.b bVar) {
        this.b = eVar;
        this.a = bVar;
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
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
            int a2 = ctcVar.a(i);
            if (a == brg.a) {
                i3 += a2;
            } else if (a > brg.a) {
                f += a;
                i2 = Math.max(i2, Math.round(a2 / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
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
                int min2 = Math.min(ctcVar.a(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ctcVar.b(min2));
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
                i4 = Math.max(i4, ctcVar2.b(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
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
            int c = ctcVar.c(i);
            if (a == brg.a) {
                i3 += c;
            } else if (a > brg.a) {
                f += a;
                i2 = Math.max(i2, Math.round(c / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
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
                int min2 = Math.min(ctcVar.a(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ctcVar.d(min2));
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
                i4 = Math.max(i4, ctcVar2.d(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf a;
        a = amo.a(this, dqs.c(j), dqs.d(j), dqs.a(j), dqs.b(j), cuhVar.eo(this.b.a()), cuhVar, list, new cvc[list.size()], 0, list.size(), null, 0);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akl)) {
            return false;
        }
        akl aklVar = (akl) obj;
        if (d.F(this.b, aklVar.b) && d.F(this.a, aklVar.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.amn
    public final int f(cvc cvcVar) {
        return cvcVar.a;
    }

    @Override // defpackage.amn
    public final int g(cvc cvcVar) {
        return cvcVar.b;
    }

    @Override // defpackage.amn
    public final void h(int i, int[] iArr, int[] iArr2, cuh cuhVar) {
        this.b.b(cuhVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.amn
    public final long i(int i, int i2, int i3, boolean z) {
        int i4 = akk.a;
        if (!z) {
            return dqt.d(0, i3, i, i2);
        }
        return dqs.a.a(0, i3, i, i2);
    }

    @Override // defpackage.amn
    public final cuf j(cvc[] cvcVarArr, cuh cuhVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        cuf et;
        et = cuhVar.et(i2, i, arnw.a, new AnonymousClass1(cvcVarArr, this, i2, cuhVar, iArr));
        return et;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
