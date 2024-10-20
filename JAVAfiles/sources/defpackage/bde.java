package defpackage;

import defpackage.bcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bde {

    /* compiled from: PG */
    /* renamed from: bde$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bcy.a> {
        final /* synthetic */ bcx a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ bdq d;
        final /* synthetic */ arml e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bcx bcxVar, int i, int i2, bdq bdqVar, arml armlVar) {
            super(0);
            this.a = bcxVar;
            this.b = i;
            this.c = i2;
            this.d = bdqVar;
            this.e = armlVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            int i;
            int f;
            boolean z;
            bcx bcxVar = this.a;
            diy diyVar = bcxVar.f;
            int i2 = this.b;
            int a = bde.a(this.e);
            bdq bdqVar = this.d;
            boolean m = bdqVar.m();
            bcn e = bdqVar.e();
            bcn bcnVar = bcn.a;
            long k = diyVar.k(i2);
            if (bcxVar.f.g(djc.e(k)) == a) {
                i = djc.e(k);
            } else if (a >= bcxVar.f.e()) {
                i = bcxVar.f.i(r1.e() - 1);
            } else {
                i = bcxVar.f.i(a);
            }
            if (bcxVar.f.g(djc.a(k)) == a) {
                f = djc.a(k);
            } else if (a < bcxVar.f.e()) {
                f = bcxVar.f.f(a, false);
            } else {
                f = bcxVar.f.f(r3.e() - 1, false);
            }
            int i3 = this.c;
            if (i == i3) {
                return bcxVar.c(f);
            }
            if (f == i3) {
                return bcxVar.c(i);
            }
            if (e == bcnVar) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ m) ? i2 >= i : i2 > f) {
                i = f;
            }
            return bcxVar.c(i);
        }
    }

    /* compiled from: PG */
    /* renamed from: bde$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Integer> {
        final /* synthetic */ bcx a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bcx bcxVar, int i) {
            super(0);
            this.a = bcxVar;
            this.b = i;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Integer.valueOf(this.a.f.g(this.b));
        }
    }

    public static final int a(arml armlVar) {
        return ((Number) armlVar.a()).intValue();
    }

    public static final bcy.a b(bcy.a aVar, bcx bcxVar, int i) {
        return new bcy.a(bcxVar.f.p(i), i, aVar.c);
    }

    public static final bcy.a c(bdq bdqVar, bcx bcxVar, bcy.a aVar) {
        int i;
        int a;
        int i2;
        boolean z;
        if (bdqVar.m()) {
            i = bcxVar.c;
        } else {
            i = bcxVar.d;
        }
        if (bdqVar.m()) {
            a = bdqVar.c();
        } else {
            a = bdqVar.a();
        }
        if (a != bcxVar.b) {
            return bcxVar.c(i);
        }
        arml b = armd.b(3, new AnonymousClass2(bcxVar, i));
        if (bdqVar.m()) {
            i2 = bcxVar.d;
        } else {
            i2 = bcxVar.c;
        }
        arml b2 = armd.b(3, new AnonymousClass1(bcxVar, i, i2, bdqVar, b));
        if (bcxVar.a == aVar.c) {
            int i3 = bcxVar.e;
            if (i != i3) {
                if (a(b) == bcxVar.f.g(i3)) {
                    int i4 = aVar.b;
                    long k = bcxVar.f.k(i4);
                    boolean m = bdqVar.m();
                    int i5 = bcxVar.e;
                    if (i5 != -1) {
                        if (i != i5) {
                            if (bcxVar.b() == bcn.a) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(m ^ z)) {
                            }
                        }
                        return bcxVar.c(i);
                    }
                    if (i4 != djc.e(k) && i4 != djc.a(k)) {
                        return bcxVar.c(i);
                    }
                    return f(b2);
                }
                return f(b2);
            }
            return aVar;
        }
        return f(b2);
    }

    public static final bcy d(bdq bdqVar, bcl bclVar) {
        boolean z;
        if (bdqVar.e() == bcn.a) {
            z = true;
        } else {
            z = false;
        }
        return new bcy(e(bdqVar.j(), z, true, bdqVar.c(), bclVar), e(bdqVar.g(), z, false, bdqVar.a(), bclVar), z);
    }

    private static final bcy.a e(bcx bcxVar, boolean z, boolean z2, int i, bcl bclVar) {
        int i2;
        int a;
        if (z2) {
            i2 = bcxVar.c;
        } else {
            i2 = bcxVar.d;
        }
        if (i != bcxVar.b) {
            return bcxVar.c(i2);
        }
        long a2 = bclVar.a(bcxVar, i2);
        if (z ^ z2) {
            a = djc.e(a2);
        } else {
            a = djc.a(a2);
        }
        return bcxVar.c(a);
    }

    private static final bcy.a f(arml armlVar) {
        return (bcy.a) armlVar.a();
    }
}
