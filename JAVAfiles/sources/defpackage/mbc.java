package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mbc {
    private final armf a;
    public final aozy b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public mbc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        aozy createBuilder;
        int i;
        amfk amfkVar;
        this.e = armfVar5;
        armfVar4.b();
        this.a = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = armfVar6;
        this.g = armfVar7;
        if (!((yjv) armfVar5.b()).e()) {
            createBuilder = amfk.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amfk amfkVar2 = (amfk) apagVar;
            amfkVar2.b |= 1;
            amfkVar2.c = "UNKNOWN_SIM_OPERATOR";
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            amfk amfkVar3 = (amfk) apagVar2;
            amfkVar3.e = 0;
            amfkVar3.b |= 4;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            amfk amfkVar4 = (amfk) apagVar3;
            amfkVar4.b |= 2;
            amfkVar4.d = "UNKNOWN_NETWORK_OPERATOR";
            int i2 = xyp.a;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            amfkVar = (amfk) createBuilder.b;
            i = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
        } else {
            createBuilder = amfk.a.createBuilder();
            String e = e();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfk amfkVar5 = (amfk) createBuilder.b;
            e.getClass();
            amfkVar5.b |= 1;
            amfkVar5.c = e;
            int f = f();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfk amfkVar6 = (amfk) createBuilder.b;
            amfkVar6.e = f - 1;
            amfkVar6.b |= 4;
            String d = d();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfk amfkVar7 = (amfk) createBuilder.b;
            d.getClass();
            amfkVar7.b |= 2;
            amfkVar7.d = d;
            amwt a = a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            amfk amfkVar8 = (amfk) apagVar4;
            amfkVar8.o = a.E;
            amfkVar8.b |= 4096;
            int i3 = xyp.a;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            amfk amfkVar9 = (amfk) createBuilder.b;
            i = i3 - 1;
            if (i3 != 0) {
                amfkVar = amfkVar9;
            } else {
                throw null;
            }
        }
        amfkVar.u = i;
        amfkVar.b |= 262144;
        this.b = createBuilder;
    }

    private final amwt a() {
        if (((acxc) this.g.b()).a()) {
            try {
                return ((vru) this.a.b()).b(((wxb) ((wwn) this.f.b()).f().orElseThrow()).c);
            } catch (NoSuchElementException | wvl unused) {
                return amwt.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
            }
        }
        return ((vru) this.a.b()).a();
    }

    private final String d() {
        return ytd.b(((yjy) this.c.b()).j().s(), "UNKNOWN_NETWORK_OPERATOR");
    }

    private final String e() {
        return ytd.b(((yjy) this.c.b()).j().w(), "UNKNOWN_SIM_OPERATOR");
    }

    private final int f() {
        if (((acxc) this.g.b()).a()) {
            if (!((wxb) ((wwn) this.f.b()).f().orElseThrow()).o) {
                return 1;
            }
            return 2;
        }
        if (!((adtn) this.d.b()).u()) {
            return 1;
        }
        return 2;
    }

    public final amfk b() {
        return (amfk) this.b.s();
    }

    public final void c(int i) {
        ykb h = ((yjy) this.c.b()).h(i);
        int[] H = h.H();
        aozy createBuilder = amjd.a.createBuilder();
        int i2 = H[0];
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amjd amjdVar = (amjd) apagVar;
        amjdVar.b |= 1;
        amjdVar.c = i2;
        int i3 = H[1];
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amjd amjdVar2 = (amjd) createBuilder.b;
        amjdVar2.b |= 2;
        amjdVar2.d = i3;
        amjd amjdVar3 = (amjd) createBuilder.s();
        aozy aozyVar = this.b;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amfk amfkVar = (amfk) aozyVar.b;
        amfk amfkVar2 = amfk.a;
        amjdVar3.getClass();
        amfkVar.q = amjdVar3;
        amfkVar.b |= 16384;
        String b = ytd.b(h.w(), e());
        aozy aozyVar2 = this.b;
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        amfk amfkVar3 = (amfk) aozyVar2.b;
        b.getClass();
        amfkVar3.b |= 1;
        amfkVar3.c = b;
        String b2 = ytd.b(h.s(), d());
        aozy aozyVar3 = this.b;
        if (!aozyVar3.b.isMutable()) {
            aozyVar3.u();
        }
        amfk amfkVar4 = (amfk) aozyVar3.b;
        b2.getClass();
        amfkVar4.b |= 2;
        amfkVar4.d = b2;
    }
}
