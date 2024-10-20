package defpackage;

import defpackage.cvc;
import defpackage.cxt;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cya extends cvc implements cye, cyh {
    private static final arqr f = AnonymousClass1.a;
    private uu g;
    private ve h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final cvc.a l = new ctw(this);
    public uu m;

    /* compiled from: PG */
    /* renamed from: cya$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<czg, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            czg czgVar = (czg) obj;
            if (czgVar.J()) {
                czgVar.b.M(czgVar);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cya$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        final /* synthetic */ czg a;
        final /* synthetic */ cya b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(czg czgVar, cya cyaVar) {
            super(0);
            this.a = czgVar;
            this.b = cyaVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            arqr n = this.a.a.n();
            if (n != null) {
                n.a(new cyb(this.b));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void Q(cyn cynVar) {
        cxn cxnVar;
        cwe cweVar;
        cyn cynVar2 = cynVar.u;
        if (cynVar2 != null) {
            cxnVar = cynVar2.r;
        } else {
            cxnVar = null;
        }
        if (!d.F(cxnVar, cynVar.r)) {
            ((cxt.b) cynVar.X()).u.e();
            return;
        }
        cwf h = cynVar.X().h();
        if (h != null && (cweVar = ((cxt.b) h).u) != null) {
            cweVar.e();
        }
    }

    public abstract long F();

    public abstract cti G();

    public abstract cuf H();

    @Override // defpackage.cye
    public abstract cxn I();

    public abstract cya K();

    public abstract cya L();

    public final void M(czg czgVar) {
        cya L;
        cya L2;
        cze czeVar;
        if (!this.k && czgVar.a.n() != null) {
            uu uuVar = this.g;
            byte[] bArr = null;
            if (uuVar == null) {
                uuVar = new uu(bArr);
                this.g = uuVar;
            }
            uu uuVar2 = this.m;
            if (uuVar2 == null) {
                uuVar2 = new uu(bArr);
                this.m = uuVar2;
            }
            Object[] objArr = uuVar2.b;
            float[] fArr = uuVar2.c;
            long[] jArr = uuVar2.a;
            int length = jArr.length - 2;
            char c = 7;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                uuVar.d(objArr[i4], fArr[i4]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    c = 7;
                }
            }
            uuVar2.c();
            czb czbVar = I().l;
            if (czbVar != null && (czeVar = ((dai) czbVar).s) != null) {
                czeVar.d(czgVar, f, new AnonymousClass2(czgVar, this));
            }
            Object[] objArr2 = uuVar2.b;
            long[] jArr2 = uuVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                cvh cvhVar = (cvh) objArr2[(i5 << 3) + i7];
                                if (!uuVar.b(cvhVar) && (L = L()) != null) {
                                    cya cyaVar = L;
                                    while (true) {
                                        uu uuVar3 = cyaVar.m;
                                        if ((uuVar3 == null || !uuVar3.b(cvhVar)) && (L2 = cyaVar.L()) != null) {
                                            cyaVar = L2;
                                        }
                                    }
                                    ve veVar = cyaVar.h;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            uuVar.c();
        }
    }

    public final void N(cuf cufVar) {
        M(new czg(cufVar, this));
    }

    public abstract void O();

    public abstract boolean P();

    @Override // defpackage.drc
    public final /* synthetic */ float ef(long j) {
        return drb.a(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eg(float f2) {
        return dqu.a(this, f2);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eh(int i) {
        return dqu.b(this, i);
    }

    @Override // defpackage.cui
    public final int ei(csh cshVar) {
        int s;
        int b;
        if (!P() || (s = s(cshVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = cshVar instanceof cvp;
        long j = this.e;
        if (z) {
            b = dre.a(j);
        } else {
            b = dre.b(j);
        }
        return s + b;
    }

    @Override // defpackage.cyh
    public final void ej(boolean z) {
        this.i = z;
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float el(long j) {
        return dqu.c(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float em(float f2) {
        return dqu.d(this, f2);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int en(long j) {
        return dqu.e(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int eo(float f2) {
        return dqu.f(this, f2);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long ep(long j) {
        return dqu.g(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long eq(long j) {
        return dqu.h(this, j);
    }

    @Override // defpackage.drc
    public final /* synthetic */ long er(float f2) {
        return drb.b(this, f2);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long es(float f2) {
        return dqu.i(this, f2);
    }

    @Override // defpackage.cuh
    public final /* synthetic */ cuf et(int i, int i2, Map map, arqr arqrVar) {
        return cug.a(this, i, i2, map, arqrVar);
    }

    @Override // defpackage.cuh
    public final cuf eu(final int i, final int i2, final Map map, final arqr arqrVar, final arqr arqrVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            csg.c(a.cl(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new cuf() { // from class: cya.3
            @Override // defpackage.cuf
            public final int j() {
                return i2;
            }

            @Override // defpackage.cuf
            public final int k() {
                return i;
            }

            @Override // defpackage.cuf
            public final Map m() {
                return map;
            }

            @Override // defpackage.cuf
            public final arqr n() {
                return arqrVar;
            }

            @Override // defpackage.cuf
            public final void o() {
                arqrVar2.a(this.l);
            }
        };
    }

    @Override // defpackage.ctd
    public boolean ev() {
        return false;
    }

    public abstract int s(csh cshVar);
}
