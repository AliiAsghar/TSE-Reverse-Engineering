package defpackage;

import defpackage.ces;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cyn extends cya implements cuc, cti, czc {
    public ckr A;
    public boolean B;
    public cyz C;
    private boolean D;
    private boolean E;
    private dqv F;
    private drk G;
    private cuf I;
    private cjl J;
    private cxf K;
    private arqv L;
    private cof N;
    private uv O;
    public final cxn r;
    public boolean s;
    public boolean t;
    public cyn u;
    public cyn v;
    public arqr w;
    public float y;
    public cof z;
    private static final arqr f = AnonymousClass4.a;
    public static final arqr n = AnonymousClass3.a;
    public static final cly o = new cly();
    private static final cxf g = new cxf();
    private static final float[] h = cll.e();
    public static final a p = new a() { // from class: cyn.1
        @Override // cyn.a
        public final int a() {
            return 16;
        }

        @Override // cyn.a
        public final void b(cxn cxnVar, long j, cxa cxaVar, boolean z, boolean z2) {
            cxnVar.L(j, cxaVar, z, z2);
        }

        @Override // cyn.a
        public final boolean c(cxn cxnVar) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [cbh] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [cbh] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [cga$c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [cga$c] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [cga$c] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // cyn.a
        public final void d(cga.c cVar) {
            ?? r1 = 0;
            while (cVar != 0) {
                if (cVar instanceof czi) {
                    ((czi) cVar).x();
                } else if ((cVar.q & 16) != 0 && (cVar instanceof cwr)) {
                    cga.c cVar2 = cVar.B;
                    int i = 0;
                    r1 = r1;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.q & 16) != 0) {
                            i++;
                            r1 = r1;
                            if (i == 1) {
                                cVar = cVar2;
                            } else {
                                if (r1 == 0) {
                                    r1 = new cbh(new cga.c[16]);
                                }
                                if (cVar != 0) {
                                    r1.n(cVar);
                                }
                                r1.n(cVar2);
                                cVar = 0;
                            }
                        }
                        cVar2 = cVar2.t;
                        r1 = r1;
                        cVar = cVar;
                    }
                    if (i != 1) {
                    }
                }
                cVar = cwp.a(r1);
            }
        }
    };
    public static final a q = new a() { // from class: cyn.2
        @Override // cyn.a
        public final int a() {
            return 8;
        }

        @Override // cyn.a
        public final void b(cxn cxnVar, long j, cxa cxaVar, boolean z, boolean z2) {
            cxnVar.ar(j, cxaVar, z2);
        }

        @Override // cyn.a
        public final boolean c(cxn cxnVar) {
            dgy z = cxnVar.z();
            if (z == null || !z.b) {
                return true;
            }
            return false;
        }

        @Override // cyn.a
        public final void d(cga.c cVar) {
        }
    };
    private float H = 0.8f;
    public long x = 0;
    private final arqg M = new AnonymousClass7();

    /* compiled from: PG */
    /* renamed from: cyn$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cyn, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cyz cyzVar = ((cyn) obj).C;
            if (cyzVar != null) {
                cyzVar.invalidate();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cyn$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<cyn, arnb> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cyn cynVar = (cyn) obj;
            if (cynVar.J() && cynVar.az(true)) {
                cxn cxnVar = cynVar.r;
                cxt cxtVar = cxnVar.x;
                if (cxtVar.n > 0) {
                    if (cxtVar.m || cxtVar.l) {
                        cxnVar.ab(false);
                    }
                    cxtVar.r.q();
                }
                czb a2 = cxq.a(cxnVar);
                ((dai) a2).O.c(cxnVar);
                a2.y(cxnVar);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cyn$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<ckr, cof, arnb> {
        final /* synthetic */ arqg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqg arqgVar) {
            super(2);
            this.b = arqgVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cyn cynVar;
            boolean z;
            ckr ckrVar = (ckr) obj;
            cof cofVar = (cof) obj2;
            if (cyn.this.r.ew()) {
                cyn cynVar2 = cyn.this;
                cynVar2.A = ckrVar;
                cynVar2.z = cofVar;
                cynVar2.Z().d(cynVar2, cyn.n, this.b);
                cynVar = cyn.this;
                z = false;
            } else {
                cynVar = cyn.this;
                z = true;
            }
            cynVar.B = z;
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cyn$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<arnb> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cyn cynVar = cyn.this;
            ckr ckrVar = cynVar.A;
            ckrVar.getClass();
            cynVar.ac(ckrVar, cynVar.z);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cyn$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqg<arnb> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cyn cynVar = cyn.this.v;
            if (cynVar != null) {
                cynVar.ae();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cyn$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqg<arnb> {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(arqr arqrVar) {
            super(0);
            this.a = arqrVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.a(cyn.o);
            cly clyVar = cyn.o;
            clyVar.v = clyVar.o.a(clyVar.r, clyVar.t, clyVar.s);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        void b(cxn cxnVar, long j, cxa cxaVar, boolean z, boolean z2);

        boolean c(cxn cxnVar);

        void d(cga.c cVar);
    }

    public cyn(cxn cxnVar) {
        this.r = cxnVar;
        this.F = cxnVar.q;
        this.G = cxnVar.r;
    }

    private final arqv D() {
        arqv arqvVar = this.L;
        if (arqvVar == null) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(new AnonymousClass6());
            this.L = anonymousClass5;
            return anonymousClass5;
        }
        return arqvVar;
    }

    private final void E(cyn cynVar, cjl cjlVar, boolean z) {
        if (cynVar != this) {
            cyn cynVar2 = this.v;
            if (cynVar2 != null) {
                cynVar2.E(cynVar, cjlVar, z);
            }
            long j = this.x;
            float a2 = dre.a(j);
            cjlVar.a -= a2;
            cjlVar.c -= a2;
            float b = dre.b(j);
            cjlVar.b -= b;
            cjlVar.d -= b;
            cyz cyzVar = this.C;
            if (cyzVar != null) {
                cyzVar.e(cjlVar, true);
                if (this.E && z) {
                    long j2 = this.c;
                    cjlVar.a(brg.a, brg.a, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    private final long aA(cyn cynVar, long j) {
        if (cynVar == this) {
            return j;
        }
        cyn cynVar2 = this.v;
        if (cynVar2 != null && !d.F(cynVar, cynVar2)) {
            return as(cynVar2.aA(cynVar, j));
        }
        return as(j);
    }

    private static final cyn aB(cti ctiVar) {
        ctx ctxVar;
        cyn a2;
        if (ctiVar instanceof ctx) {
            ctxVar = (ctx) ctiVar;
        } else {
            ctxVar = null;
        }
        if (ctxVar != null && (a2 = ctxVar.a()) != null) {
            return a2;
        }
        ctiVar.getClass();
        return (cyn) ctiVar;
    }

    private final void aw(cga.c cVar, a aVar, long j, cxa cxaVar, boolean z, boolean z2) {
        if (cVar == null) {
            B(aVar, j, cxaVar, z, z2);
            return;
        }
        int i = cxaVar.c;
        cxaVar.c = i + 1;
        cxaVar.c();
        Object[] objArr = cxaVar.a;
        int i2 = cxaVar.c;
        objArr[i2] = cVar;
        cxaVar.b[i2] = cxb.a(-1.0f, z2);
        cxaVar.d();
        aw(cyo.a(cVar, aVar.a()), aVar, j, cxaVar, z, z2);
        cxaVar.c = i;
    }

    private final void ax(cga.c cVar, a aVar, long j, cxa cxaVar, boolean z, boolean z2, float f2) {
        if (cVar == null) {
            B(aVar, j, cxaVar, z, z2);
            return;
        }
        int i = cxaVar.c;
        cxaVar.c = i + 1;
        cxaVar.c();
        Object[] objArr = cxaVar.a;
        int i2 = cxaVar.c;
        objArr[i2] = cVar;
        cxaVar.b[i2] = cxb.a(f2, z2);
        cxaVar.d();
        ax(cyo.a(cVar, aVar.a()), aVar, j, cxaVar, z, z2, f2);
        cxaVar.c = i;
    }

    private final void ay(cyn cynVar, float[] fArr) {
        if (!d.F(cynVar, this)) {
            cyn cynVar2 = this.v;
            cynVar2.getClass();
            cynVar2.ay(cynVar, fArr);
            if (!defpackage.a.bB(this.x, 0L)) {
                float[] fArr2 = h;
                cll.c(fArr2);
                long j = this.x;
                cll.f(fArr2, -dre.a(j), -dre.b(j));
                cll.d(fArr, fArr2);
            }
            cyz cyzVar = this.C;
            if (cyzVar != null) {
                cyzVar.d(fArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean az(boolean z) {
        cxn cxnVar;
        czb czbVar;
        boolean z2 = false;
        if (this.N != null) {
            return false;
        }
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            arqr arqrVar = this.w;
            if (arqrVar != null) {
                cly clyVar = o;
                clyVar.x(1.0f);
                clyVar.y(1.0f);
                clyVar.o(1.0f);
                clyVar.D(brg.a);
                clyVar.E(brg.a);
                clyVar.z(brg.a);
                clyVar.p(clf.a);
                clyVar.B(clf.a);
                clyVar.u(brg.a);
                clyVar.v(brg.a);
                clyVar.w(brg.a);
                clyVar.q(8.0f);
                clyVar.C(cmg.a);
                clyVar.A(clw.a);
                clyVar.r(false);
                clyVar.t(null);
                clyVar.s(0);
                clyVar.r = 9205357640488583168L;
                clyVar.v = null;
                clyVar.a = 0;
                cxn cxnVar2 = this.r;
                clyVar.s = cxnVar2.q;
                clyVar.t = cxnVar2.r;
                clyVar.r = drj.c(this.c);
                Z().d(this, f, new AnonymousClass8(arqrVar));
                cxf cxfVar = this.K;
                if (cxfVar == null) {
                    cxfVar = new cxf();
                    this.K = cxfVar;
                }
                cxf cxfVar2 = g;
                cxfVar2.a = cxfVar.a;
                cxfVar2.b = cxfVar.b;
                cxfVar2.c = cxfVar.c;
                cxfVar2.d = cxfVar.d;
                cxfVar2.e = cxfVar.e;
                cxfVar2.f = cxfVar.f;
                cxfVar2.g = cxfVar.g;
                cxfVar2.h = cxfVar.h;
                cxfVar2.i = cxfVar.i;
                cxfVar.a = clyVar.b;
                cxfVar.b = clyVar.c;
                cxfVar.c = clyVar.e;
                cxfVar.d = clyVar.f;
                cxfVar.e = clyVar.j;
                cxfVar.f = clyVar.k;
                cxfVar.g = clyVar.l;
                cxfVar.h = clyVar.m;
                cxfVar.i = clyVar.n;
                cyzVar.k(clyVar);
                boolean z3 = this.E;
                boolean z4 = clyVar.p;
                this.E = z4;
                this.H = clyVar.d;
                if (cxfVar2.a == cxfVar.a && cxfVar2.b == cxfVar.b && cxfVar2.c == cxfVar.c && cxfVar2.d == cxfVar.d && cxfVar2.e == cxfVar.e && cxfVar2.f == cxfVar.f && cxfVar2.g == cxfVar.g && cxfVar2.h == cxfVar.h && defpackage.a.bB(cxfVar2.i, cxfVar.i)) {
                    z2 = true;
                }
                boolean z5 = !z2;
                if (z && ((!z2 || z3 != z4) && (czbVar = (cxnVar = this.r).l) != null)) {
                    czbVar.t(cxnVar);
                }
                return z5;
            }
            csg.a("updateLayerParameters requires a non-null layerBlock");
            throw new armj();
        }
        if (this.w != null) {
            csg.c("null layer with a non-null layerBlock");
        }
        return false;
    }

    public abstract void A();

    public void B(a aVar, long j, cxa cxaVar, boolean z, boolean z2) {
        cyn cynVar = this.u;
        if (cynVar != null) {
            cynVar.ad(aVar, cynVar.as(j), cxaVar, z, z2);
        }
    }

    public void C(ckr ckrVar, cof cofVar) {
        throw null;
    }

    @Override // defpackage.cya
    public final long F() {
        return this.x;
    }

    @Override // defpackage.cya
    public final cuf H() {
        cuf cufVar = this.I;
        if (cufVar != null) {
            return cufVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.cya, defpackage.cye
    public final cxn I() {
        return this.r;
    }

    @Override // defpackage.czc
    public final boolean J() {
        if (this.C != null && !this.D && this.r.am()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cya
    public final cya K() {
        return this.u;
    }

    @Override // defpackage.cya
    public final cya L() {
        return this.v;
    }

    @Override // defpackage.cya
    public final void O() {
        cof cofVar = this.N;
        if (cofVar != null) {
            v(this.x, this.y, cofVar);
        } else {
            ee(this.x, this.y, this.w);
        }
    }

    @Override // defpackage.cya
    public final boolean P() {
        if (this.I != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float R(long j, long j2) {
        float u;
        float t;
        if (u() < Float.intBitsToFloat((int) (j2 >> 32)) || t() < Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long S = S(j2);
            float intBitsToFloat = Float.intBitsToFloat((int) (S >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (S & 4294967295L));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            if (intBitsToFloat3 < brg.a) {
                u = -intBitsToFloat3;
            } else {
                u = intBitsToFloat3 - u();
            }
            float max = Math.max(brg.a, u);
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat4 < brg.a) {
                t = -intBitsToFloat4;
            } else {
                t = intBitsToFloat4 - t();
            }
            float max2 = Math.max(brg.a, t);
            long floatToRawIntBits = Float.floatToRawIntBits(max) << 32;
            long floatToRawIntBits2 = Float.floatToRawIntBits(max2) & 4294967295L;
            if (intBitsToFloat > brg.a || intBitsToFloat2 > brg.a) {
                long j3 = floatToRawIntBits2 | floatToRawIntBits;
                int i = (int) (j3 >> 32);
                if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                    int i2 = (int) (j3 & 4294967295L);
                    if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                        float intBitsToFloat5 = Float.intBitsToFloat(i);
                        float intBitsToFloat6 = Float.intBitsToFloat(i2);
                        return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat6 * intBitsToFloat6);
                    }
                    return Float.POSITIVE_INFINITY;
                }
                return Float.POSITIVE_INFINITY;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long S(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - u();
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - t()) / 2.0f;
        float max = Math.max(brg.a, intBitsToFloat / 2.0f);
        float max2 = Math.max(brg.a, intBitsToFloat2);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final long T() {
        return this.F.eq(this.r.s.g());
    }

    public final cga.c U(int i) {
        cga.c cVar;
        boolean h2 = cyp.h(i);
        if (h2) {
            cVar = y();
        } else {
            cVar = y().s;
            if (cVar == null) {
                return null;
            }
        }
        for (cga.c V = V(h2); V != null && (V.r & i) != 0; V = V.t) {
            if ((V.q & i) != 0) {
                return V;
            }
            if (V == cVar) {
                return null;
            }
        }
        return null;
    }

    public final cga.c V(boolean z) {
        cga.c y;
        if (this.r.y() == this) {
            return this.r.w.e;
        }
        if (z) {
            cyn cynVar = this.v;
            if (cynVar != null && (y = cynVar.y()) != null) {
                return y.t;
            }
        } else {
            cyn cynVar2 = this.v;
            if (cynVar2 != null) {
                return cynVar2.y();
            }
        }
        return null;
    }

    public final cjl W() {
        cjl cjlVar = this.J;
        if (cjlVar == null) {
            cjl cjlVar2 = new cjl();
            this.J = cjlVar2;
            return cjlVar2;
        }
        return cjlVar;
    }

    public final cwf X() {
        return this.r.x.r;
    }

    public final cyn Y(cyn cynVar) {
        cxn cxnVar = cynVar.r;
        cxn cxnVar2 = this.r;
        if (cxnVar == cxnVar2) {
            cga.c y = cynVar.y();
            cga.c y2 = y();
            if (!y2.A().z) {
                csg.c("visitLocalAncestors called on an unattached node");
            }
            cga.c A = y2.A();
            while (true) {
                A = A.s;
                if (A != null) {
                    if ((A.q & 2) != 0 && A == y) {
                        return cynVar;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (cxnVar.n > cxnVar2.n) {
                cxnVar = cxnVar.t();
                cxnVar.getClass();
            }
            while (cxnVar2.n > cxnVar.n) {
                cxnVar2 = cxnVar2.t();
                cxnVar2.getClass();
            }
            while (cxnVar != cxnVar2) {
                cxnVar = cxnVar.t();
                cxnVar2 = cxnVar2.t();
                if (cxnVar == null || cxnVar2 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (cxnVar2 != this.r) {
                if (cxnVar != cynVar.r) {
                    return cxnVar.x();
                }
                return cynVar;
            }
            return this;
        }
    }

    public final cze Z() {
        return ((dai) cxq.a(this.r)).s;
    }

    public final void aa(ckr ckrVar, cof cofVar) {
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            cyzVar.c(ckrVar, cofVar);
            return;
        }
        long j = this.x;
        float a2 = dre.a(j);
        float b = dre.b(j);
        ckrVar.o(a2, b);
        ac(ckrVar, cofVar);
        ckrVar.o(-a2, -b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(ckr ckrVar, clp clpVar) {
        long j = this.c;
        ckrVar.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, clpVar);
    }

    public final void ac(ckr ckrVar, cof cofVar) {
        cga.c U = U(4);
        if (U == null) {
            C(ckrVar, cofVar);
            return;
        }
        cxp u = this.r.u();
        long c = drj.c(this.c);
        cbh cbhVar = null;
        while (U != null) {
            if (U instanceof cwx) {
                u.t(ckrVar, c, this, (cwx) U, cofVar);
            } else if ((U.q & 4) != 0 && (U instanceof cwr)) {
                int i = 0;
                for (cga.c cVar = ((cwr) U).B; cVar != null; cVar = cVar.t) {
                    if ((cVar.q & 4) != 0) {
                        i++;
                        if (i == 1) {
                            U = cVar;
                        } else {
                            if (cbhVar == null) {
                                cbhVar = new cbh(new cga.c[16]);
                            }
                            if (U != null) {
                                cbhVar.n(U);
                            }
                            cbhVar.n(cVar);
                            U = null;
                        }
                    }
                }
                if (i != 1) {
                }
            }
            U = cwp.a(cbhVar);
        }
    }

    public final void ad(a aVar, long j, cxa cxaVar, boolean z, boolean z2) {
        float R;
        cga.c U = U(aVar.a());
        if (!ar(j)) {
            if (z) {
                float R2 = R(j, T());
                if ((Float.floatToRawIntBits(R2) & Integer.MAX_VALUE) < 2139095040 && cxaVar.e(R2, false)) {
                    ax(U, aVar, j, cxaVar, true, false, R2);
                    return;
                }
                return;
            }
            return;
        }
        if (U == null) {
            B(aVar, j, cxaVar, z, z2);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (intBitsToFloat >= brg.a && intBitsToFloat2 >= brg.a && intBitsToFloat < u() && intBitsToFloat2 < t()) {
            aw(U, aVar, j, cxaVar, z, z2);
            return;
        }
        if (!z) {
            R = Float.POSITIVE_INFINITY;
        } else {
            R = R(j, T());
        }
        float f2 = R;
        if ((Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) < 2139095040 && cxaVar.e(f2, z2)) {
            ax(U, aVar, j, cxaVar, z, z2, f2);
        } else {
            ao(U, aVar, j, cxaVar, z, z2, f2);
        }
    }

    public final void ae() {
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            cyzVar.invalidate();
            return;
        }
        cyn cynVar = this.v;
        if (cynVar != null) {
            cynVar.ae();
        }
    }

    public final void af() {
        this.r.x.h();
    }

    public final void ag() {
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            cyzVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void ah() {
        arqr arqrVar;
        cga.c cVar;
        cga.c V = V(cyp.h(128));
        if (V != null && (V.A().r & 128) != 0) {
            ces a2 = ces.a.a();
            if (a2 != null) {
                arqrVar = a2.i();
            } else {
                arqrVar = null;
            }
            ces b = ces.a.b(a2);
            try {
                boolean h2 = cyp.h(128);
                if (h2) {
                    cVar = y();
                } else {
                    cVar = y().s;
                    if (cVar == null) {
                    }
                }
                for (cga.c V2 = V(h2); V2 != null; V2 = V2.t) {
                    if ((V2.r & 128) == 0) {
                        break;
                    }
                    if ((V2.q & 128) != 0) {
                        ?? r8 = 0;
                        cwr cwrVar = V2;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof cxg) {
                                ((cxg) cwrVar).dX(this.c);
                            } else if ((cwrVar.q & 128) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r8 = r8;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 128) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r8.n(cwrVar);
                                            }
                                            r8.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r8 = r8;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r8);
                        }
                    }
                    if (V2 == cVar) {
                        break;
                    }
                }
            } finally {
                ces.a.f(a2, b, arqrVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void ai() {
        cga.c cVar;
        boolean h2 = cyp.h(128);
        if (h2) {
            cVar = y();
        } else {
            cVar = y().s;
            if (cVar == null) {
                return;
            }
        }
        for (cga.c V = V(h2); V != null && (V.r & 128) != 0; V = V.t) {
            if ((V.q & 128) != 0) {
                cwr cwrVar = V;
                ?? r5 = 0;
                while (cwrVar != 0) {
                    if (cwrVar instanceof cxg) {
                        ((cxg) cwrVar).dW(this);
                    } else if ((cwrVar.q & 128) != 0 && (cwrVar instanceof cwr)) {
                        cga.c cVar2 = cwrVar.B;
                        int i = 0;
                        cwrVar = cwrVar;
                        r5 = r5;
                        while (cVar2 != null) {
                            if ((cVar2.q & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    cwrVar = cVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new cbh(new cga.c[16]);
                                    }
                                    if (cwrVar != 0) {
                                        r5.n(cwrVar);
                                    }
                                    r5.n(cVar2);
                                    cwrVar = 0;
                                }
                            }
                            cVar2 = cVar2.t;
                            cwrVar = cwrVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    cwrVar = cwp.a(r5);
                }
            }
            if (V == cVar) {
                return;
            }
        }
    }

    public final void aj() {
        this.D = true;
        this.M.a();
        am();
    }

    public final void ak(long j, float f2, arqr arqrVar, cof cofVar) {
        if (cofVar != null) {
            if (arqrVar != null) {
                csg.b("both ways to create layers shouldn't be used together");
            }
            if (this.N != cofVar) {
                this.N = null;
                ap(null, false);
                this.N = cofVar;
            }
            if (this.C == null) {
                cyz a2 = cza.a(cxq.a(this.r), D(), this.M, cofVar, false, 8);
                a2.g(this.c);
                a2.f(j);
                this.C = a2;
                this.r.ax();
                this.M.a();
            }
        } else {
            if (this.N != null) {
                this.N = null;
                ap(null, false);
            }
            ap(arqrVar, false);
        }
        if (!defpackage.a.bB(this.x, j)) {
            this.x = j;
            this.r.x.r.q();
            cyz cyzVar = this.C;
            if (cyzVar != null) {
                cyzVar.f(j);
            } else {
                cyn cynVar = this.v;
                if (cynVar != null) {
                    cynVar.ae();
                }
            }
            Q(this);
            cxn cxnVar = this.r;
            czb czbVar = cxnVar.l;
            if (czbVar != null) {
                czbVar.t(cxnVar);
            }
        }
        this.y = f2;
        if (!this.k) {
            N(H());
        }
    }

    public final void al(cjl cjlVar, boolean z, boolean z2) {
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            if (this.E) {
                if (z2) {
                    long T = T();
                    float intBitsToFloat = Float.intBitsToFloat((int) (T >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (T & 4294967295L)) / 2.0f;
                    long j = this.c;
                    cjlVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (4294967295L & j)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    cjlVar.a(brg.a, brg.a, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (cjlVar.c()) {
                    return;
                }
            }
            cyzVar.e(cjlVar, false);
        }
        long j3 = this.x;
        float a2 = dre.a(j3);
        cjlVar.a += a2;
        cjlVar.c += a2;
        float b = dre.b(j3);
        cjlVar.b += b;
        cjlVar.d += b;
    }

    public final void am() {
        if (this.C != null) {
            if (this.N != null) {
                this.N = null;
            }
            ap(null, false);
            this.r.ab(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0069, code lost:
    
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [cbh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void an(defpackage.cuf r21) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyn.an(cuf):void");
    }

    public final void ao(cga.c cVar, a aVar, long j, cxa cxaVar, boolean z, boolean z2, float f2) {
        if (cVar == null) {
            B(aVar, j, cxaVar, z, z2);
        } else {
            aVar.d(cVar);
            ao(cyo.a(cVar, aVar.a()), aVar, j, cxaVar, z, z2, f2);
        }
    }

    public final void ap(arqr arqrVar, boolean z) {
        czb czbVar;
        if (arqrVar != null && this.N != null) {
            csg.b("layerBlock can't be provided when explicitLayer is provided");
        }
        cxn cxnVar = this.r;
        boolean z2 = true;
        if (!z && this.w == arqrVar && d.F(this.F, cxnVar.q) && this.G == cxnVar.r) {
            z2 = false;
        }
        this.F = cxnVar.q;
        this.G = cxnVar.r;
        if (cxnVar.am() && arqrVar != null) {
            this.w = arqrVar;
            if (this.C == null) {
                cyz a2 = cza.a(cxq.a(cxnVar), D(), this.M, null, cxnVar.i, 4);
                a2.g(this.c);
                a2.f(this.x);
                this.C = a2;
                az(true);
                cxnVar.ax();
                this.M.a();
                return;
            }
            if (z2 && az(true)) {
                ((dai) cxq.a(cxnVar)).O.c(cxnVar);
                return;
            }
            return;
        }
        this.w = null;
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            cyzVar.b();
            cxnVar.ax();
            this.M.a();
            if (r() && cxnVar.ew() && (czbVar = cxnVar.l) != null) {
                czbVar.t(cxnVar);
            }
        }
        this.C = null;
        this.B = false;
    }

    public final boolean aq() {
        if (this.C != null && this.H <= brg.a) {
            return true;
        }
        cyn cynVar = this.v;
        if (cynVar != null) {
            return cynVar.aq();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ar(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        cyz cyzVar = this.C;
        if (cyzVar != null && this.E && !cyzVar.l(j)) {
            return false;
        }
        return true;
    }

    public final long as(long j) {
        long j2 = this.x;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - dre.a(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - dre.b(j2);
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
        cyz cyzVar = this.C;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (floatToRawIntBits << 32);
        if (cyzVar != null) {
            return cyzVar.a(floatToRawIntBits2, true);
        }
        return floatToRawIntBits2;
    }

    public final long at(long j) {
        cyz cyzVar = this.C;
        if (cyzVar != null) {
            j = cyzVar.a(j, false);
        }
        return drf.b(j, this.x);
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.r.q.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.r.q.ed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cvc
    public void ee(long j, float f2, arqr arqrVar) {
        if (this.s) {
            cyc z = z();
            z.getClass();
            ak(z.h, f2, arqrVar, null);
            return;
        }
        ak(j, f2, arqrVar, null);
    }

    @Override // defpackage.cti
    public final long ek(cti ctiVar, long j) {
        if (ctiVar instanceof ctx) {
            ((ctx) ctiVar).a().af();
            return ctiVar.ek(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        cyn aB = aB(ctiVar);
        aB.af();
        cyn Y = Y(aB);
        while (aB != Y) {
            j = aB.at(j);
            aB = aB.v;
            aB.getClass();
        }
        return aA(Y, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.cvc, defpackage.ctc
    public final Object f() {
        if (!this.r.w.j(64)) {
            return null;
        }
        y();
        arsb arsbVar = new arsb();
        for (cga.c cVar = this.r.w.d; cVar != null; cVar = cVar.s) {
            if ((cVar.q & 64) != 0) {
                ?? r5 = 0;
                cwr cwrVar = cVar;
                while (cwrVar != 0) {
                    if (cwrVar instanceof czf) {
                        dqv dqvVar = this.r.q;
                        arsbVar.a = ((czf) cwrVar).ea(arsbVar.a);
                    } else if ((cwrVar.q & 64) != 0 && (cwrVar instanceof cwr)) {
                        cga.c cVar2 = cwrVar.B;
                        int i = 0;
                        cwrVar = cwrVar;
                        r5 = r5;
                        while (cVar2 != null) {
                            if ((cVar2.q & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    cwrVar = cVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new cbh(new cga.c[16]);
                                    }
                                    if (cwrVar != 0) {
                                        r5.n(cwrVar);
                                    }
                                    r5.n(cVar2);
                                    cwrVar = 0;
                                }
                            }
                            cVar2 = cVar2.t;
                            cwrVar = cwrVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    cwrVar = cwp.a(r5);
                }
            }
        }
        return arsbVar.a;
    }

    @Override // defpackage.cti
    public final long g() {
        return this.c;
    }

    @Override // defpackage.cti
    public final long h(cti ctiVar, long j) {
        return ek(ctiVar, j);
    }

    @Override // defpackage.cti
    public final long i(long j) {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        af();
        for (cyn cynVar = this; cynVar != null; cynVar = cynVar.v) {
            j = cynVar.at(j);
        }
        return j;
    }

    @Override // defpackage.cti
    public final long j(long j) {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return cxq.a(this.r).b(i(j));
    }

    @Override // defpackage.cti
    public final long k(long j) {
        cxn cxnVar = this.r;
        long i = i(j);
        dai daiVar = (dai) cxq.a(cxnVar);
        daiVar.H();
        return cll.a(daiVar.w, i);
    }

    @Override // defpackage.cti
    public final long l(long j) {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ek(ctj.f(this), cxq.a(this.r).c(j));
    }

    @Override // defpackage.cti
    public final long m(long j) {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cti f2 = ctj.f(this);
        dai daiVar = (dai) cxq.a(this.r);
        daiVar.H();
        return ek(f2, defpackage.a.Q(cll.a(daiVar.x, j), ctj.a(f2)));
    }

    @Override // defpackage.cti
    public final cjp n(cti ctiVar, boolean z) {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ctiVar.r()) {
            csg.c(defpackage.a.cc(ctiVar, "LayoutCoordinates ", " is not attached!"));
        }
        cyn aB = aB(ctiVar);
        aB.af();
        cyn Y = Y(aB);
        cjl W = W();
        W.a = brg.a;
        W.b = brg.a;
        W.c = (int) (ctiVar.g() >> 32);
        W.d = (int) (ctiVar.g() & 4294967295L);
        while (aB != Y) {
            aB.al(W, z, false);
            if (W.c()) {
                return cjp.a;
            }
            aB = aB.v;
            aB.getClass();
        }
        E(Y, W, z);
        return cjm.a(W);
    }

    @Override // defpackage.cti
    public final cti o() {
        if (!r()) {
            csg.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        af();
        return this.r.y().v;
    }

    @Override // defpackage.cti
    public final void p(cti ctiVar, float[] fArr) {
        cyn aB = aB(ctiVar);
        aB.af();
        cyn Y = Y(aB);
        cll.c(fArr);
        while (!d.F(aB, Y)) {
            cyz cyzVar = aB.C;
            if (cyzVar != null) {
                cyzVar.i(fArr);
            }
            if (!defpackage.a.bB(aB.x, 0L)) {
                float[] fArr2 = h;
                cll.c(fArr2);
                cll.f(fArr2, dre.a(r1), dre.b(r1));
                cll.d(fArr, fArr2);
            }
            aB = aB.v;
            aB.getClass();
        }
        ay(Y, fArr);
    }

    @Override // defpackage.ctd
    public final drk q() {
        return this.r.r;
    }

    @Override // defpackage.cti
    public final boolean r() {
        return y().z;
    }

    @Override // defpackage.cvc
    public void v(long j, float f2, cof cofVar) {
        if (this.s) {
            cyc z = z();
            z.getClass();
            ak(z.h, f2, null, cofVar);
            return;
        }
        ak(j, f2, null, cofVar);
    }

    public abstract cga.c y();

    public abstract cyc z();

    @Override // defpackage.cya
    public final cti G() {
        return this;
    }
}
