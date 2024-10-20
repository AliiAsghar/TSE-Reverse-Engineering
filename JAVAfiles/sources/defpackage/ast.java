package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ast extends cga.c implements czk {
    public arqg a;
    public asr b;
    public ahp c;
    public boolean d;
    public boolean e;
    private dgw f;
    private final arqr g = new AnonymousClass2();
    private arqr h;

    /* compiled from: PG */
    /* renamed from: ast$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Float> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(ast.this.b.d() - ast.this.b.c());
        }
    }

    /* compiled from: PG */
    /* renamed from: ast$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Object, Integer> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ars arsVar = (ars) ast.this.a.a();
            int e = arsVar.e();
            int i = 0;
            while (true) {
                if (i < e) {
                    if (d.F(arsVar.g(i), obj)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ast$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<Float> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(ast.this.b.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ast$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<Float> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(ast.this.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ast$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<Integer, Boolean> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int intValue = ((Number) obj).intValue();
            ars arsVar = (ars) ast.this.a.a();
            if (intValue < 0 || intValue >= arsVar.e()) {
                aju.c("Can't scroll to index " + intValue + ", it is out of bounds [0, " + arsVar.e() + ')');
            }
            ast astVar = ast.this;
            arrn.J(astVar.B(), null, null, new asu(astVar, intValue, null), 3);
            return true;
        }
    }

    public ast(arqg arqgVar, asr asrVar, ahp ahpVar, boolean z, boolean z2) {
        this.a = arqgVar;
        this.b = asrVar;
        this.c = ahpVar;
        this.d = z;
        this.e = z2;
        a();
    }

    public final void a() {
        AnonymousClass5 anonymousClass5;
        this.f = new dgw(new AnonymousClass3(), new AnonymousClass4(), this.e);
        if (this.d) {
            anonymousClass5 = new AnonymousClass5();
        } else {
            anonymousClass5 = null;
        }
        this.h = anonymousClass5;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        dhl.F(dhoVar);
        dhn dhnVar = dhh.a;
        dhoVar.c(dhh.H, this.g);
        if (this.c == ahp.a) {
            dgw dgwVar = this.f;
            if (dgwVar == null) {
                arro.b("scrollAxisRange");
                dgwVar = null;
            }
            dhl.u(dhoVar, dgwVar);
        } else {
            dgw dgwVar2 = this.f;
            if (dgwVar2 == null) {
                arro.b("scrollAxisRange");
                dgwVar2 = null;
            }
            dhl.h(dhoVar, dgwVar2);
        }
        arqr arqrVar = this.h;
        if (arqrVar != null) {
            dhn dhnVar2 = dgx.a;
            dhoVar.c(dgx.f, new dgn(null, arqrVar));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        dhn dhnVar3 = dgx.a;
        dhoVar.c(dgx.A, new dgn(null, new dhk(anonymousClass1)));
        dgo e = this.b.e();
        dhn dhnVar4 = dhh.f;
        artm artmVar = dhl.a[20];
        dhnVar4.a(dhoVar, e);
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }
}
