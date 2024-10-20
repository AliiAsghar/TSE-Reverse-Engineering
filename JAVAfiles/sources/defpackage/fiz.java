package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiz extends fjb implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public fiz(int i, esa esaVar, int i2, fiv fivVar, int i3, String str) {
        super(i, esaVar, i2);
        boolean z;
        boolean z2;
        alog alogVar;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5 = 0;
        this.f = dzn.j(i3, false);
        int i6 = this.d.e & (~fivVar.v);
        if (1 != (i6 & 1)) {
            z = false;
        } else {
            z = true;
        }
        this.g = z;
        if ((i6 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        if (fivVar.t.isEmpty()) {
            alogVar = alog.r("");
        } else {
            alogVar = fivVar.t;
        }
        int i7 = 0;
        while (true) {
            if (i7 < ((alsx) alogVar).c) {
                eqn eqnVar = this.d;
                String str2 = (String) alogVar.get(i7);
                boolean z6 = fivVar.w;
                i4 = fjd.a(eqnVar, str2, false);
                if (i4 > 0) {
                    break;
                } else {
                    i7++;
                }
            } else {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
        }
        this.i = i7;
        this.j = i4;
        int b = fjd.b(this.d.f, fivVar.u);
        this.k = b;
        if ((this.d.f & 1088) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.m = z3;
        if (fjd.f(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int a = fjd.a(this.d, str, z4);
        this.l = a;
        if (i4 <= 0 && ((!fivVar.t.isEmpty() || b <= 0) && !this.g && (!this.h || a <= 0))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (dzn.j(i3, fivVar.N) && z5) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fiz fizVar) {
        Comparator comparator;
        almj e = almj.b.e(this.f, fizVar.f).d(Integer.valueOf(this.i), Integer.valueOf(fizVar.i), alti.a).b(this.j, fizVar.j).b(this.k, fizVar.k).e(this.g, fizVar.g);
        Boolean valueOf = Boolean.valueOf(this.h);
        Boolean valueOf2 = Boolean.valueOf(fizVar.h);
        if (this.j == 0) {
            comparator = also.a;
        } else {
            comparator = alti.a;
        }
        almj b = e.d(valueOf, valueOf2, comparator).b(this.l, fizVar.l);
        if (this.k == 0) {
            b = b.f(this.m, fizVar.m);
        }
        return b.a();
    }

    @Override // defpackage.fjb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fjb
    public final /* bridge */ /* synthetic */ boolean c(fjb fjbVar) {
        return false;
    }
}
