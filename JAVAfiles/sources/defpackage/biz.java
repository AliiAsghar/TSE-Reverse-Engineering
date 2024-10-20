package defpackage;

import defpackage.ajt;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class biz extends cga.c implements cwm, cwx, cxg {
    private final float a;
    public final ajq b;
    public final boolean c;
    public final arqg d;
    public bjd e;
    public float f;
    public boolean h;
    private final ckx j;
    public long g = 0;
    public final ux i = new ux((byte[]) null);

    /* compiled from: PG */
    /* renamed from: biz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        private /* synthetic */ Object c;

        public AnonymousClass1(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                final arwe arweVar = (arwe) this.c;
                final biz bizVar = biz.this;
                asai a = bizVar.b.a();
                asaj asajVar = new asaj() { // from class: biz.1.1
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        ajp ajpVar = (ajp) obj2;
                        if (ajpVar instanceof ajt) {
                            biz bizVar2 = biz.this;
                            if (bizVar2.h) {
                                bizVar2.i((ajt) ajpVar);
                            } else {
                                bizVar2.i.d(ajpVar);
                            }
                        } else {
                            biz bizVar3 = biz.this;
                            arwe arweVar2 = arweVar;
                            bjd bjdVar = bizVar3.e;
                            if (bjdVar == null) {
                                bjd bjdVar2 = new bjd(bizVar3.c, bizVar3.d);
                                cwy.a(bizVar3);
                                bizVar3.e = bjdVar2;
                                bjdVar = bjdVar2;
                            }
                            bjdVar.b(ajpVar, arweVar2);
                        }
                        return arnb.a;
                    }
                };
                this.a = 1;
                if (ascj.g((ascj) a, asajVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arpeVar);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }
    }

    public biz(ajq ajqVar, boolean z, float f, ckx ckxVar, arqg arqgVar) {
        this.b = ajqVar;
        this.c = z;
        this.a = f;
        this.j = ckxVar;
        this.d = arqgVar;
    }

    public abstract void a(ajt.b bVar, long j, float f);

    public abstract void d(cny cnyVar);

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // cga.c
    public final void dQ() {
        arrn.J(B(), null, null, new AnonymousClass1(null), 3);
    }

    @Override // defpackage.cxg
    public final void dX(long j) {
        float em;
        this.h = true;
        dqv h = cwp.h(this);
        this.g = drj.c(j);
        if (Float.isNaN(this.a)) {
            em = bir.a(h, this.c, this.g);
        } else {
            em = h.em(this.a);
        }
        this.f = em;
        ux uxVar = this.i;
        Object[] objArr = uxVar.a;
        int i = uxVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            i((ajt) objArr[i2]);
        }
        this.i.c();
    }

    public abstract void e(ajt.b bVar);

    public final long h() {
        return this.j.a();
    }

    public final void i(ajt ajtVar) {
        if (ajtVar instanceof ajt.b) {
            a((ajt.b) ajtVar, this.g, this.f);
        } else if (ajtVar instanceof ajt.c) {
            e(((ajt.c) ajtVar).a);
        } else if (ajtVar instanceof ajt.a) {
            e(((ajt.a) ajtVar).a);
        }
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        cntVar.p();
        bjd bjdVar = this.e;
        if (bjdVar != null) {
            bjdVar.a(cntVar, this.f, h());
        }
        d(cntVar);
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.cxg
    public final /* synthetic */ void dW(cti ctiVar) {
    }
}
