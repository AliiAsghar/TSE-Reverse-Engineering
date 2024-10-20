package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yx extends xu {
    public zr a;
    public cfq b;
    private boolean e;
    private long c = -9223372034707292160L;
    private long d = dqt.l(0, 0, 15);
    private final byn f = new byu(null, cav.a);

    /* compiled from: PG */
    /* renamed from: yx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ long b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ cuh e;
        final /* synthetic */ cvc f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, int i, int i2, cuh cuhVar, cvc cvcVar) {
            super(1);
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = cuhVar;
            this.f = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.n((cvc.a) obj, this.f, yx.this.b.a(this.b, (this.c << 32) | (this.d & 4294967295L), this.e.q()));
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final zj a;
        public long b;

        public a(zj zjVar, long j) {
            this.a = zjVar;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && defpackage.a.bB(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + defpackage.a.A(this.b);
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) dri.c(this.b)) + ')';
        }
    }

    public yx(zr zrVar, cfq cfqVar) {
        this.a = zrVar;
        this.b = cfqVar;
    }

    public final void a(a aVar) {
        this.f.h(aVar);
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuc cucVar2;
        long j2;
        cvc e;
        long e2;
        cuf et;
        boolean z = true;
        if (cuhVar.ev()) {
            this.d = j;
            this.e = true;
            e = cucVar.e(j);
        } else {
            if (this.e) {
                j2 = this.d;
                cucVar2 = cucVar;
            } else {
                cucVar2 = cucVar;
                j2 = j;
            }
            e = cucVar2.e(j2);
        }
        cvc cvcVar = e;
        long j3 = (cvcVar.a << 32) | (cvcVar.b & 4294967295L);
        if (cuhVar.ev()) {
            this.c = j3;
            e2 = j3;
        } else {
            long j4 = this.c;
            if (true != wj.a(j4)) {
                j4 = j3;
            }
            a aVar = (a) this.f.a();
            if (aVar != null) {
                if (defpackage.a.bB(j4, ((dri) aVar.a.d()).a) || ((Boolean) aVar.a.c.a()).booleanValue()) {
                    z = false;
                }
                if (!defpackage.a.bB(j4, ((dri) aVar.a.c()).a) || z) {
                    aVar.b = ((dri) aVar.a.d()).a;
                    arrn.J(B(), null, null, new yy(aVar, j4, this, null), 3);
                }
            } else {
                aVar = new a(new zj(new dri(j4), aci.h, new dri(4294967297L), 8), j4);
            }
            a(aVar);
            e2 = dqt.e(j, ((dri) aVar.a.d()).a);
        }
        int i = (int) (e2 >> 32);
        int i2 = (int) (e2 & 4294967295L);
        et = cuhVar.et(i, i2, arnw.a, new AnonymousClass1(j3, i, i2, cuhVar, cvcVar));
        return et;
    }

    @Override // cga.c
    public final void dQ() {
        this.c = -9223372034707292160L;
        this.e = false;
    }

    @Override // cga.c
    public final void eb() {
        a(null);
    }
}
