package defpackage;

import defpackage.cnr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjd {
    private final boolean b;
    private final arqg c;
    private ajp e;
    public final zj a = zk.a(brg.a);
    private final List d = new ArrayList();

    /* compiled from: PG */
    /* renamed from: bjd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ float c;
        final /* synthetic */ zr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, zr zrVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = f;
            this.d = zrVar;
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
                bjd bjdVar = bjd.this;
                Float f = new Float(this.c);
                zr zrVar = this.d;
                this.a = 1;
                if (zj.j(bjdVar.a, f, zrVar, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, this.d, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: bjd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ zr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(zr zrVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = zrVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bjd bjdVar = bjd.this;
                Float f = new Float(brg.a);
                zr zrVar = this.c;
                this.a = 1;
                if (zj.j(bjdVar.a, f, zrVar, this, 12) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.c, arpeVar);
        }
    }

    public bjd(boolean z, arqg arqgVar) {
        this.b = z;
        this.c = arqgVar;
    }

    public final void a(cny cnyVar, float f, long j) {
        long f2;
        float floatValue = ((Number) this.a.d()).floatValue();
        if (floatValue > brg.a) {
            f2 = ckw.f(cku.d(j), cku.c(j), cku.b(j), floatValue, cku.f(j));
            if (this.b) {
                float c = cjt.c(cnyVar.o());
                float a = cjt.a(cnyVar.o());
                cnu q = cnyVar.q();
                long a2 = q.a();
                q.b().l();
                try {
                    ((cnr.AnonymousClass1) q).a.b(brg.a, brg.a, c, a, 1);
                    cnw.g(cnyVar, f2, f, 0L, null, 124);
                    return;
                } finally {
                    q.b().j();
                    q.h(a2);
                }
            }
            cnw.g(cnyVar, f2, f, 0L, null, 124);
        }
    }

    public final void b(ajp ajpVar, arwe arweVar) {
        acf acfVar;
        float f;
        acf acfVar2;
        boolean z = ajpVar instanceof ajn;
        if (z) {
            this.d.add(ajpVar);
        } else if (ajpVar instanceof ajo) {
            this.d.remove(((ajo) ajpVar).a);
        } else if (ajpVar instanceof ajk) {
            this.d.add(ajpVar);
        } else if (ajpVar instanceof ajl) {
            this.d.remove(((ajl) ajpVar).a);
        } else if (ajpVar instanceof aji) {
            this.d.add(ajpVar);
        } else if (ajpVar instanceof ajj) {
            this.d.remove(((ajj) ajpVar).a);
        } else if (ajpVar instanceof ajh) {
            this.d.remove(((ajh) ajpVar).a);
        } else {
            return;
        }
        ajp ajpVar2 = (ajp) aqjn.ad(this.d);
        if (!d.F(this.e, ajpVar2)) {
            if (ajpVar2 != null) {
                bin binVar = (bin) this.c.a();
                if (z) {
                    f = binVar.c;
                } else if (ajpVar instanceof ajk) {
                    f = binVar.b;
                } else if (ajpVar instanceof aji) {
                    f = binVar.a;
                } else {
                    f = brg.a;
                }
                if (!(ajpVar2 instanceof ajn)) {
                    if (ajpVar2 instanceof ajk) {
                        acfVar2 = new acf(45, aao.d, 2);
                    } else if (ajpVar2 instanceof aji) {
                        acfVar2 = new acf(45, aao.d, 2);
                    }
                    arrn.J(arweVar, null, null, new AnonymousClass1(f, acfVar2, null), 3);
                }
                acfVar2 = biy.a;
                arrn.J(arweVar, null, null, new AnonymousClass1(f, acfVar2, null), 3);
            } else {
                ajp ajpVar3 = this.e;
                if ((ajpVar3 instanceof ajn) || (ajpVar3 instanceof ajk) || !(ajpVar3 instanceof aji)) {
                    acfVar = biy.a;
                } else {
                    acfVar = new acf(150, aao.d, 2);
                }
                arrn.J(arweVar, null, null, new AnonymousClass2(acfVar, null), 3);
            }
            this.e = ajpVar2;
        }
    }
}
