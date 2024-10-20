package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgd extends cwr implements cwm, cyu {
    public final ajq a;
    public final boolean b;
    public final float c;
    public final ckx d;
    public cwo e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bgd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (((bgw) cwn.a(bgd.this, bgx.a)) == null) {
                bgd bgdVar = bgd.this;
                cwo cwoVar = bgdVar.e;
                if (cwoVar != null) {
                    bgdVar.J(cwoVar);
                }
                bgdVar.e = null;
            } else {
                bgd bgdVar2 = bgd.this;
                if (bgdVar2.e == null) {
                    bgb bgbVar = new bgb(bgdVar2);
                    bgc bgcVar = new bgc(bgdVar2);
                    ajq ajqVar = bgdVar2.a;
                    boolean z = bgdVar2.b;
                    float f = bgdVar2.c;
                    acf acfVar = biy.a;
                    cwo c = bjc.c(ajqVar, z, f, bgbVar, bgcVar);
                    bgdVar2.K(c);
                    bgdVar2.e = c;
                }
            }
            return arnb.a;
        }
    }

    public bgd(ajq ajqVar, boolean z, float f, ckx ckxVar) {
        this.a = ajqVar;
        this.b = z;
        this.c = f;
        this.d = ckxVar;
    }

    private final void b() {
        cyv.a(this, new AnonymousClass1());
    }

    @Override // defpackage.cyu
    public final void a() {
        b();
    }

    @Override // cga.c
    public final void dQ() {
        b();
    }
}
