package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aett extends arrp implements arqw {
    final /* synthetic */ String a;
    final /* synthetic */ arqg b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aett(String str, arqg arqgVar, boolean z) {
        super(3);
        this.a = str;
        this.b = arqgVar;
        this.c = z;
    }

    public static final int b(cas casVar) {
        return ((Number) casVar.a()).intValue();
    }

    private static final int c(byk bykVar) {
        return bykVar.b();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aap, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float f;
        int i;
        int i2;
        int b;
        float floatValue;
        float f2;
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        cgaVar.getClass();
        bwjVar.y(-1880995539);
        bwjVar.y(1732116046);
        boolean G = bwjVar.G(this.a);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new bys(0);
            bwjVar.B(h);
        }
        byk bykVar = (byk) h;
        bwjVar.q();
        bwjVar.y(1732118445);
        Object g = bwjVar.g(dch.d);
        boolean z = this.c;
        dqv dqvVar = (dqv) g;
        bwjVar.y(-348186465);
        Object h2 = bwjVar.h();
        Object obj4 = bwj.a.a;
        float f3 = brg.a;
        if (h2 == obj4) {
            if (true != z) {
                f2 = 0.0f;
            } else {
                f2 = 5.0f;
            }
            h2 = Integer.valueOf((int) dqvVar.em(f2 + 21.0f));
            bwjVar.B(h2);
        }
        int intValue = ((Number) h2).intValue();
        bwjVar.q();
        bwjVar.q();
        bwjVar.y(1732128232);
        if (c(bykVar) != 0) {
            bwjVar.y(1732143607);
            boolean G2 = bwjVar.G(this.a);
            Object h3 = bwjVar.h();
            if (G2 || h3 == bwj.a.a) {
                h3 = new abd(false);
                bwjVar.B(h3);
            }
            abd abdVar = (abd) h3;
            bwjVar.q();
            abdVar.d(true);
            abt c = aby.c(abdVar, "sending animation", bwjVar, 48, 0);
            jwz jwzVar = jwz.r;
            acg acgVar = aci.a;
            boolean booleanValue = ((Boolean) c.e()).booleanValue();
            bwjVar.y(1353508952);
            if (true != booleanValue) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            bwjVar.q();
            Float valueOf = Float.valueOf(f);
            boolean booleanValue2 = ((Boolean) c.f()).booleanValue();
            bwjVar.y(1353508952);
            if (true == booleanValue2) {
                f3 = 1.0f;
            }
            bwjVar.q();
            cas e = aby.e(c, valueOf, Float.valueOf(f3), jwzVar.a(c.d(), bwjVar, 0), acgVar, bwjVar, 196608);
            aeua aeuaVar = aeua.b;
            acg acgVar2 = aci.b;
            boolean booleanValue3 = ((Boolean) c.e()).booleanValue();
            bwjVar.y(1057092397);
            if (booleanValue3) {
                i = c(bykVar);
            } else {
                i = 0;
            }
            bwjVar.q();
            Integer valueOf2 = Integer.valueOf(i);
            boolean booleanValue4 = ((Boolean) c.f()).booleanValue();
            bwjVar.y(1057092397);
            if (booleanValue4) {
                i2 = c(bykVar);
            } else {
                i2 = 0;
            }
            bwjVar.q();
            cas e2 = aby.e(c, valueOf2, Integer.valueOf(i2), aeuaVar.a(c.d(), bwjVar, 0), acgVar2, bwjVar, 196608);
            if (b(e2) >= intValue) {
                b = 0;
            } else {
                b = intValue - b(e2);
            }
            if (((Boolean) abdVar.a()).booleanValue() == ((Boolean) abdVar.b()).booleanValue()) {
                this.b.a();
            }
            floatValue = ((Number) e.a()).floatValue();
            cga a = cha.a(cgaVar, floatValue);
            bwjVar.y(1732171037);
            boolean G3 = bwjVar.G(e2) | bwjVar.E(b);
            Object h4 = bwjVar.h();
            if (G3 || h4 == bwj.a.a) {
                h4 = new aets(b, e2, 1);
                bwjVar.B(h4);
            }
            bwjVar.q();
            cga a2 = cts.a(a, (arqw) h4);
            bwjVar.q();
            bwjVar.q();
            return a2;
        }
        bwjVar.q();
        bwjVar.y(1732188007);
        boolean G4 = bwjVar.G(bykVar) | bwjVar.E(intValue);
        Object h5 = bwjVar.h();
        if (G4 || h5 == bwj.a.a) {
            h5 = new aets(intValue, bykVar, 0);
            bwjVar.B(h5);
        }
        bwjVar.q();
        cga a3 = cts.a(cgaVar, (arqw) h5);
        bwjVar.q();
        return a3;
    }
}
