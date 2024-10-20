package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fir extends fjb implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final fiv h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;

    /* JADX WARN: Multi-variable type inference failed */
    public fir(int i, esa esaVar, int i2, fiv fivVar, int i3, boolean z, algy algyVar) {
        super(i, esaVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        LocaleList locales;
        String languageTags;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        this.h = fivVar;
        int i9 = 1;
        if (true != fivVar.L) {
            i4 = 16;
        } else {
            i4 = 24;
        }
        boolean z8 = fivVar.H;
        this.g = fjd.f(this.d.d);
        this.i = dzn.j(i3, false);
        int i10 = 0;
        while (true) {
            alog alogVar = fivVar.n;
            i5 = Integer.MAX_VALUE;
            if (i10 < ((alsx) alogVar).c) {
                i6 = fjd.a(this.d, (String) alogVar.get(i10), false);
                if (i6 > 0) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i6 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            }
        }
        this.k = i10;
        this.j = i6;
        int i11 = this.d.f;
        int i12 = fivVar.o;
        this.l = fjd.b(i11, 0);
        eqn eqnVar = this.d;
        int i13 = eqnVar.f;
        if (i13 != 0 && (i13 & 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.m = z2;
        if (1 != (eqnVar.e & 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.p = z3;
        this.q = eqnVar.D;
        this.r = eqnVar.E;
        this.s = eqnVar.j;
        int i14 = eqnVar.j;
        if ((i14 != -1 && i14 > fivVar.q) || (((i7 = eqnVar.D) != -1 && i7 > fivVar.p) || !algyVar.a(eqnVar))) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f = z4;
        locales = Resources.getSystem().getConfiguration().getLocales();
        languageTags = locales.toLanguageTags();
        String[] ae = eul.ae(languageTags, ",");
        for (int i15 = 0; i15 < ae.length; i15++) {
            ae[i15] = eul.O(ae[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 < ae.length) {
                i8 = fjd.a(this.d, ae[i16], false);
                if (i8 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i8 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
        }
        this.n = i16;
        this.o = i8;
        int i17 = 0;
        while (true) {
            alog alogVar2 = fivVar.r;
            if (i17 >= ((alsx) alogVar2).c) {
                break;
            }
            String str = this.d.o;
            if (str != null && str.equals(alogVar2.get(i17))) {
                i5 = i17;
                break;
            }
            i17++;
        }
        this.t = i5;
        if (dzn.g(i3) == 128) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.u = z5;
        if (dzn.i(i3) == 64) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.v = z6;
        fiv fivVar2 = this.h;
        if (!dzn.j(i3, fivVar2.N) || (!(z7 = this.f) && !fivVar2.G)) {
            i9 = 0;
        } else {
            int i18 = fivVar2.s.b;
            if (dzn.j(i3, false) && z7 && this.d.j != -1 && !fivVar2.z) {
                boolean z9 = fivVar2.y;
                if ((fivVar2.P || !z) && (i4 & i3) != 0) {
                    i9 = 2;
                }
            }
        }
        this.e = i9;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fir firVar) {
        alsr a;
        if (this.f && this.i) {
            a = fjd.a;
        } else {
            a = fjd.a.a();
        }
        almj d = almj.b.e(this.i, firVar.i).d(Integer.valueOf(this.k), Integer.valueOf(firVar.k), alti.a).b(this.j, firVar.j).b(this.l, firVar.l).e(this.p, firVar.p).e(this.m, firVar.m).d(Integer.valueOf(this.n), Integer.valueOf(firVar.n), alti.a).b(this.o, firVar.o).e(this.f, firVar.f).d(Integer.valueOf(this.t), Integer.valueOf(firVar.t), alti.a);
        boolean z = this.h.y;
        almj d2 = d.e(this.u, firVar.u).e(this.v, firVar.v).d(Integer.valueOf(this.q), Integer.valueOf(firVar.q), a).d(Integer.valueOf(this.r), Integer.valueOf(firVar.r), a);
        if (Objects.equals(this.g, firVar.g)) {
            d2 = d2.d(Integer.valueOf(this.s), Integer.valueOf(firVar.s), a);
        }
        return d2.a();
    }

    @Override // defpackage.fjb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fjb
    public final /* bridge */ /* synthetic */ boolean c(fjb fjbVar) {
        String str;
        fir firVar = (fir) fjbVar;
        boolean z = this.h.J;
        eqn eqnVar = this.d;
        int i = eqnVar.D;
        if (i != -1) {
            eqn eqnVar2 = firVar.d;
            if (i == eqnVar2.D && (str = eqnVar.o) != null && TextUtils.equals(str, eqnVar2.o)) {
                fiv fivVar = this.h;
                boolean z2 = fivVar.I;
                int i2 = this.d.E;
                if (i2 != -1 && i2 == firVar.d.E) {
                    boolean z3 = fivVar.K;
                    if (this.u == firVar.u && this.v == firVar.v) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
