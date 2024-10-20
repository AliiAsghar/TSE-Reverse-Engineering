package defpackage;

import defpackage.ajt;
import defpackage.bwj;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public abstract class bim implements aev {
    private final boolean a;
    private final float b;
    private final cas c;

    /* compiled from: PG */
    /* renamed from: bim$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajq b;
        final /* synthetic */ bix c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ajq ajqVar, bix bixVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ajqVar;
            this.c = bixVar;
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
                final arwe arweVar = (arwe) this.d;
                ajq ajqVar = this.b;
                final bix bixVar = this.c;
                asai a = ajqVar.a();
                asaj asajVar = new asaj() { // from class: bim.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v8, types: [bix, bit] */
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        ajp ajpVar = (ajp) obj2;
                        if (ajpVar instanceof ajt.b) {
                            ?? r12 = bix.this;
                            ajt.b bVar = (ajt.b) ajpVar;
                            bih bihVar = (bih) r12;
                            bis bisVar = bihVar.e;
                            bis bisVar2 = bisVar;
                            if (bisVar == null) {
                                bihVar.e = bjc.b(bihVar.d);
                                bis bisVar3 = bihVar.e;
                                bisVar3.getClass();
                                bisVar2 = bisVar3;
                            }
                            biw a2 = bisVar2.a(r12);
                            a2.a(bVar, bihVar.a, bihVar.g, bihVar.h, ((cku) bihVar.b.a()).i, ((bin) bihVar.c.a()).d, bihVar.i);
                            bihVar.c(a2);
                        } else if (ajpVar instanceof ajt.c) {
                            bix bixVar2 = bix.this;
                            ajt.b bVar2 = ((ajt.c) ajpVar).a;
                            bixVar2.e();
                        } else if (ajpVar instanceof ajt.a) {
                            bix bixVar3 = bix.this;
                            ajt.b bVar3 = ((ajt.a) ajpVar).a;
                            bixVar3.e();
                        } else {
                            bix bixVar4 = bix.this;
                            bixVar4.k.b(ajpVar, arweVar);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, arpeVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }
    }

    public bim(boolean z, float f, cas casVar) {
        this.a = z;
        this.b = f;
        this.c = casVar;
    }

    public abstract bix a(ajq ajqVar, boolean z, float f, cas casVar, cas casVar2, bwj bwjVar);

    @Override // defpackage.aev
    @armg
    public final aew b(ajq ajqVar, bwj bwjVar) {
        long a;
        bwjVar.y(988743187);
        bja bjaVar = (bja) bwjVar.g(bjb.a);
        bwjVar.y(-9792978);
        if (((cku) this.c.a()).i != 16) {
            a = ((cku) this.c.a()).i;
        } else {
            a = bjaVar.a(bwjVar);
        }
        bwjVar.q();
        bix a2 = a(ajqVar, this.a, this.b, cap.a(new cku(a), bwjVar), cap.a(bjaVar.b(bwjVar), bwjVar), bwjVar);
        boolean G = bwjVar.G(ajqVar) | bwjVar.I(a2);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new AnonymousClass1(ajqVar, a2, null);
            bwjVar.B(h);
        }
        bxl.f(a2, ajqVar, (arqv) h, bwjVar);
        bwjVar.q();
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bim)) {
            return false;
        }
        bim bimVar = (bim) obj;
        if (this.a == bimVar.a && dqy.b(this.b, bimVar.b) && d.F(this.c, bimVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }
}
