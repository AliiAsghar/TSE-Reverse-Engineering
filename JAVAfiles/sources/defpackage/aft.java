package defpackage;

import defpackage.ces;
import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aft extends cga.c implements cxi, czk {
    public afv a;
    public boolean b;
    public boolean c;

    /* compiled from: PG */
    /* renamed from: aft$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Float> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(aft.this.a.c());
        }
    }

    /* compiled from: PG */
    /* renamed from: aft$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Float> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(aft.this.a.b());
        }
    }

    /* compiled from: PG */
    /* renamed from: aft$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ int b;
        final /* synthetic */ cvc c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, cvc cvcVar) {
            super(1);
            this.b = i;
            this.c = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i;
            int i2;
            cvc.a aVar = (cvc.a) obj;
            int c = aft.this.a.c();
            int i3 = 0;
            if (c < 0) {
                c = 0;
            }
            aft aftVar = aft.this;
            int i4 = this.b;
            boolean z = aftVar.b;
            if (c > i4) {
                c = i4;
            }
            if (z) {
                i = c - i4;
            } else {
                i = -c;
            }
            boolean z2 = aftVar.c;
            if (true != z2) {
                i2 = i;
            } else {
                i2 = 0;
            }
            if (true == z2) {
                i3 = i;
            }
            aVar.j(new afu(this.c, i2, i3));
            return arnb.a;
        }
    }

    public aft(afv afvVar, boolean z, boolean z2) {
        this.a = afvVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        ahp ahpVar;
        int a;
        arqr arqrVar;
        int i;
        cuf et;
        if (this.c) {
            ahpVar = ahp.a;
        } else {
            ahpVar = ahp.b;
        }
        adu.a(j, ahpVar);
        boolean z = this.c;
        int i2 = Integer.MAX_VALUE;
        if (z) {
            a = Integer.MAX_VALUE;
        } else {
            a = dqs.a(j);
        }
        if (z) {
            i2 = dqs.b(j);
        }
        cvc e = cucVar.e(dqs.k(j, 0, i2, 0, a, 5));
        int i3 = e.a;
        int s = arrn.s(i3, dqs.b(j));
        int i4 = e.b;
        int s2 = arrn.s(i4, dqs.a(j));
        int i5 = i4 - s2;
        int i6 = i3 - s;
        if (true != this.c) {
            i5 = i6;
        }
        afv afvVar = this.a;
        afvVar.d.d(i5);
        ces a2 = ces.a.a();
        if (a2 != null) {
            arqrVar = a2.i();
        } else {
            arqrVar = null;
        }
        ces b = ces.a.b(a2);
        try {
            if (afvVar.c() > i5) {
                afvVar.f(i5);
            }
            ces.a.f(a2, b, arqrVar);
            afv afvVar2 = this.a;
            if (true != this.c) {
                i = s;
            } else {
                i = s2;
            }
            afvVar2.b.d(i);
            et = cuhVar.et(s, s2, arnw.a, new AnonymousClass3(i5, e));
            return et;
        } catch (Throwable th) {
            ces.a.f(a2, b, arqrVar);
            throw th;
        }
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        if (this.c) {
            return ctcVar.a(i);
        }
        return ctcVar.a(Integer.MAX_VALUE);
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        dhl.F(dhoVar);
        dgw dgwVar = new dgw(new AnonymousClass1(), new AnonymousClass2(), this.b);
        if (this.c) {
            dhl.u(dhoVar, dgwVar);
        } else {
            dhl.h(dhoVar, dgwVar);
        }
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        if (this.c) {
            return ctcVar.b(Integer.MAX_VALUE);
        }
        return ctcVar.b(i);
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        if (this.c) {
            return ctcVar.c(i);
        }
        return ctcVar.c(Integer.MAX_VALUE);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        if (this.c) {
            return ctcVar.d(Integer.MAX_VALUE);
        }
        return ctcVar.d(i);
    }
}
