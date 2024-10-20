package defpackage;

import defpackage.ajt;
import defpackage.cga;
import defpackage.cvc;
import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bry extends cga.c implements cxi {
    public ajq a;
    public boolean b;
    public aap c;
    public boolean d;
    public zj e;
    public zj f;
    public float g = Float.NaN;
    public float h = Float.NaN;

    /* compiled from: PG */
    /* renamed from: bry$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, arpe arpeVar) {
            super(2, arpeVar);
            this.c = f;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            zr zrVar;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                zj zjVar = bry.this.f;
                if (zjVar != null) {
                    Float f = new Float(this.c);
                    bry bryVar = bry.this;
                    if (bryVar.d) {
                        zrVar = brf.f;
                    } else {
                        zrVar = bryVar.c;
                    }
                    this.a = 1;
                    obj = zj.j(zjVar, f, zrVar, this, 12);
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: bry$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, arpe arpeVar) {
            super(2, arpeVar);
            this.c = f;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            zr zrVar;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                zj zjVar = bry.this.e;
                if (zjVar != null) {
                    Float f = new Float(this.c);
                    bry bryVar = bry.this;
                    if (bryVar.d) {
                        zrVar = brf.f;
                    } else {
                        zrVar = bryVar.c;
                    }
                    this.a = 1;
                    obj = zj.j(zjVar, f, zrVar, this, 12);
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: bry$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ bry b;
        final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cvc cvcVar, bry bryVar, float f) {
            super(1);
            this.a = cvcVar;
            this.b = bryVar;
            this.c = f;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            cvc.a aVar = (cvc.a) obj;
            zj zjVar = this.b.e;
            if (zjVar != null) {
                f = ((Number) zjVar.d()).floatValue();
            } else {
                f = this.c;
            }
            cvc.a.m(aVar, this.a, (int) f, 0);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bry$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;

        public AnonymousClass4(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                final arrz arrzVar = new arrz();
                asai a = bry.this.a.a();
                final bry bryVar = bry.this;
                asaj asajVar = new asaj() { // from class: bry.4.1
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        ajp ajpVar = (ajp) obj2;
                        boolean z = true;
                        if (ajpVar instanceof ajt.b) {
                            arrz.this.a++;
                        } else if ((ajpVar instanceof ajt.c) || (ajpVar instanceof ajt.a)) {
                            arrz arrzVar2 = arrz.this;
                            arrzVar2.a--;
                        }
                        if (arrz.this.a <= 0) {
                            z = false;
                        }
                        bry bryVar2 = bryVar;
                        if (bryVar2.d != z) {
                            bryVar2.d = z;
                            cxl.b(bryVar2);
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
            return new AnonymousClass4(arpeVar);
        }
    }

    public bry(ajq ajqVar, boolean z, aap aapVar) {
        this.a = ajqVar;
        this.b = z;
        this.c = aapVar;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        float f;
        float f2;
        Float f3;
        Float f4;
        cuf et;
        boolean z = false;
        if (cucVar.a(dqs.b(j)) != 0 && cucVar.b(dqs.a(j)) != 0) {
            z = true;
        }
        if (this.d) {
            bvg bvgVar = bvn.a;
            f = bvn.b;
        } else if (!z && !this.b) {
            f = brf.b;
        } else {
            f = brf.a;
        }
        float em = cuhVar.em(f);
        zj zjVar = this.f;
        if (zjVar != null) {
            f2 = ((Number) zjVar.d()).floatValue();
        } else {
            f2 = em;
        }
        int i = (int) f2;
        cvc e = cucVar.e(dqs.a.c(i, i));
        float em2 = cuhVar.em((brf.d - cuhVar.eg(em)) / 2.0f);
        float em3 = cuhVar.em((brf.c - brf.a) - brf.e);
        if (this.d) {
            if (this.b) {
                bvg bvgVar2 = bvn.a;
                em2 = em3 - cuhVar.em(bvn.f);
            } else {
                bvg bvgVar3 = bvn.a;
                em2 = cuhVar.em(bvn.f);
            }
        } else if (this.b) {
            em2 = em3;
        }
        zj zjVar2 = this.f;
        if (zjVar2 != null) {
            f3 = (Float) zjVar2.c();
        } else {
            f3 = null;
        }
        if (!arro.c(f3, em)) {
            arrn.J(B(), null, null, new AnonymousClass1(em, null), 3);
        }
        zj zjVar3 = this.e;
        if (zjVar3 != null) {
            f4 = (Float) zjVar3.c();
        } else {
            f4 = null;
        }
        if (!arro.c(f4, em2)) {
            arrn.J(B(), null, null, new AnonymousClass2(em2, null), 3);
        }
        if (Float.isNaN(this.h) && Float.isNaN(this.g)) {
            this.h = em;
            this.g = em2;
        }
        et = cuhVar.et(i, i, arnw.a, new AnonymousClass3(e, this, em2));
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

    @Override // cga.c
    public final void dQ() {
        arrn.J(B(), null, null, new AnonymousClass4(null), 3);
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
}
