package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhg extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhg(afhe afheVar, float f, arqg arqgVar, byn bynVar, int i) {
        super(2);
        this.e = i;
        this.b = afheVar;
        this.a = f;
        this.c = arqgVar;
        this.d = bynVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                Object obj3 = this.d;
                Object obj4 = this.c;
                bwjVar.y(737404067);
                boolean G = bwjVar.G(this.b);
                Object obj5 = this.b;
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new jxu((gqg) obj5);
                    bwjVar.B(h);
                }
                bwjVar.q();
                aov aovVar = (aov) obj3;
                hwr.I(aovVar, (jym) obj4, (jxu) h, this.a, bwjVar, 0);
            }
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            Object obj6 = this.b;
            float f = this.a;
            ?? r2 = this.c;
            bwjVar2.y(1795857811);
            Object obj7 = this.d;
            Object h2 = bwjVar2.h();
            if (h2 == bwj.a.a) {
                h2 = new aezb(obj7, 6);
                bwjVar2.B(h2);
            }
            bwjVar2.q();
            aeke.bH(((afhe) obj6).e, f, r2, (arqr) h2, bwjVar2, 3080);
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhg(aov aovVar, jym jymVar, gqg gqgVar, float f, int i) {
        super(2);
        this.e = i;
        this.d = aovVar;
        this.c = jymVar;
        this.b = gqgVar;
        this.a = f;
    }
}
