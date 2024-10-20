package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bls extends cwr implements cwm, cyu {
    public final ajq a;
    public final boolean b;
    public final float c;
    public final ckx d;
    public cwo e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bls$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (((bol) cwn.a(bls.this, bon.a)) == null) {
                bls blsVar = bls.this;
                cwo cwoVar = blsVar.e;
                if (cwoVar != null) {
                    blsVar.J(cwoVar);
                }
                blsVar.e = null;
            } else {
                bls blsVar2 = bls.this;
                if (blsVar2.e == null) {
                    blq blqVar = new blq(blsVar2);
                    blr blrVar = new blr(blsVar2);
                    ajq ajqVar = blsVar2.a;
                    boolean z = blsVar2.b;
                    float f = blsVar2.c;
                    acf acfVar = biy.a;
                    cwo c = bjc.c(ajqVar, z, f, blqVar, blrVar);
                    blsVar2.K(c);
                    blsVar2.e = c;
                }
            }
            return arnb.a;
        }
    }

    public bls(ajq ajqVar, boolean z, float f, ckx ckxVar) {
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
