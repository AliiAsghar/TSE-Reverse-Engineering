package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpc extends cpb {
    public final cou a;
    public String b;
    public boolean c;
    public arqg d;
    public final byn e;
    public final byn f;
    public float g;
    public float h;
    private final cos i;
    private ckv j;
    private long k;
    private final arqr l;

    /* compiled from: PG */
    /* renamed from: cpc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cpb, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cpc cpcVar = cpc.this;
            cpcVar.c = true;
            cpcVar.d.a();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cpc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cny, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cpc cpcVar = cpc.this;
            cny cnyVar = (cny) obj;
            float f = cpcVar.g;
            float f2 = cpcVar.h;
            cnu q = cnyVar.q();
            long a = q.a();
            q.b().l();
            cou couVar = cpcVar.a;
            try {
                ((cnr.AnonymousClass1) q).a.d(f, f2, 0L);
                couVar.b(cnyVar);
                q.b().j();
                q.h(a);
                return arnb.a;
            } catch (Throwable th) {
                q.b().j();
                q.h(a);
                throw th;
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: cpc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return arnb.a;
        }
    }

    public cpc(cou couVar) {
        this.a = couVar;
        couVar.e = new AnonymousClass1();
        this.b = "";
        this.c = true;
        this.i = new cos();
        this.d = AnonymousClass3.a;
        this.e = new byu(null, cav.a);
        this.f = new byu(new cjt(0L), cav.a);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new AnonymousClass2();
    }

    @Override // defpackage.cpb
    public final void b(cny cnyVar) {
        g(cnyVar, 1.0f, null);
    }

    public final long c() {
        return ((cjt) this.f.a()).a;
    }

    public final ckv d() {
        return (ckv) this.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (defpackage.a.bA(r1, r2) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.cny r27, float r28, defpackage.ckv r29) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpc.g(cny, float, ckv):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (c() & 4294967295L)) + "\n";
    }
}
