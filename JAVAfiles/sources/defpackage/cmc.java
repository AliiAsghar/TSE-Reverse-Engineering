package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmc extends cga.c implements cxi {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public cmb j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public final arqr o = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: cmc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cle, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cle cleVar = (cle) obj;
            cleVar.x(cmc.this.a);
            cleVar.y(cmc.this.b);
            cleVar.o(cmc.this.c);
            cleVar.D(cmc.this.d);
            cleVar.E(cmc.this.e);
            cleVar.z(cmc.this.f);
            cleVar.u(brg.a);
            cleVar.v(brg.a);
            cleVar.w(cmc.this.g);
            cleVar.q(cmc.this.h);
            cleVar.C(cmc.this.i);
            cleVar.A(cmc.this.j);
            cleVar.r(cmc.this.k);
            cleVar.t(null);
            cleVar.p(cmc.this.l);
            cleVar.B(cmc.this.m);
            cleVar.s(cmc.this.n);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cmc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ cmc b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar, cmc cmcVar) {
            super(1);
            this.a = cvcVar;
            this.b = cmcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.q((cvc.a) obj, this.a, 0, 0, this.b.o, 4);
            return arnb.a;
        }
    }

    public cmc(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, cmb cmbVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = j;
        this.j = cmbVar;
        this.k = z;
        this.l = j2;
        this.m = j3;
        this.n = i;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(j);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass2(e, this));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.d(this, ctdVar, ctcVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=" + this.f + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.g + ", cameraDistance=" + this.h + ", transformOrigin=" + ((Object) cmg.c(this.i)) + ", shape=" + this.j + ", clip=" + this.k + ", renderEffect=null, ambientShadowColor=" + ((Object) cku.g(this.l)) + ", spotShadowColor=" + ((Object) cku.g(this.m)) + ", compositingStrategy=" + ((Object) cla.a(this.n)) + ')';
    }
}
