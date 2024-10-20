package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vgc implements vfx {
    public static final xze a = xze.g("BugleTachygram", "TachygramClientCapabilitiesDecorator");
    private static final alog d = alog.t("#=0.92", "#=1", "#=1.2");
    public final armf b;
    final armf c;
    private final anen e;
    private final Set f;
    private final armf g;
    private final xti h;

    public vgc(anen anenVar, xti xtiVar, Set set, armf armfVar, armf armfVar2, armf armfVar3) {
        this.e = anenVar;
        this.h = xtiVar;
        this.f = set;
        this.g = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    private static aqfh c(String str) {
        aozy createBuilder = aqfh.a.createBuilder();
        aozy createBuilder2 = aqfi.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aqfi aqfiVar = (aqfi) createBuilder2.b;
        aqfiVar.b = 1;
        aqfiVar.c = "+g.3gpp.iari-ref";
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqfh aqfhVar = (aqfh) createBuilder.b;
        aqfi aqfiVar2 = (aqfi) createBuilder2.s();
        aqfiVar2.getClass();
        aqfhVar.c = aqfiVar2;
        aqfhVar.b |= 1;
        aozy createBuilder3 = aqfi.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        aqfi aqfiVar3 = (aqfi) createBuilder3.b;
        aqfiVar3.b = 1;
        aqfiVar3.c = str;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqfh aqfhVar2 = (aqfh) createBuilder.b;
        aqfi aqfiVar4 = (aqfi) createBuilder3.s();
        aqfiVar4.getClass();
        aqfhVar2.d = aqfiVar4;
        aqfhVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqfh) createBuilder.b).e = a.an(3);
        return (aqfh) createBuilder.s();
    }

    @Override // defpackage.vfx
    public final akul a(aozy aozyVar, msh mshVar) {
        if (((pop) this.c.b()).a()) {
            if (!alog.s(1, 3).contains(xtk.a.e())) {
                return b(aozyVar, mshVar);
            }
            return aktp.ag(aozyVar);
        }
        return this.h.c(mshVar).i(new ukk(this, aozyVar, mshVar, 15), this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final akul b(aozy aozyVar, msh mshVar) {
        alog alogVar = d;
        int i = ((alsx) alogVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) alogVar.get(i2);
            aozy createBuilder = aqfh.a.createBuilder();
            aozy createBuilder2 = aqfi.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            aqfi aqfiVar = (aqfi) createBuilder2.b;
            aqfiVar.b = 1;
            aqfiVar.c = "+g.gsma.rcs.botversion";
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqfh aqfhVar = (aqfh) createBuilder.b;
            aqfi aqfiVar2 = (aqfi) createBuilder2.s();
            aqfiVar2.getClass();
            aqfhVar.c = aqfiVar2;
            aqfhVar.b |= 1;
            aozy createBuilder3 = aqfi.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            aqfi aqfiVar3 = (aqfi) createBuilder3.b;
            str.getClass();
            aqfiVar3.b = 1;
            aqfiVar3.c = str;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqfh aqfhVar2 = (aqfh) createBuilder.b;
            aqfi aqfiVar4 = (aqfi) createBuilder3.s();
            aqfiVar4.getClass();
            aqfhVar2.d = aqfiVar4;
            aqfhVar2.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqfh) createBuilder.b).e = a.an(3);
            aozyVar.bM((aqfh) createBuilder.s());
        }
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot"));
        aozy createBuilder4 = aqfh.a.createBuilder();
        aozy createBuilder5 = aqfi.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        aqfi aqfiVar5 = (aqfi) createBuilder5.b;
        aqfiVar5.b = 1;
        aqfiVar5.c = "+g.3gpp.icsi-ref";
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        aqfh aqfhVar3 = (aqfh) createBuilder4.b;
        aqfi aqfiVar6 = (aqfi) createBuilder5.s();
        aqfiVar6.getClass();
        aqfhVar3.c = aqfiVar6;
        aqfhVar3.b |= 1;
        aozy createBuilder6 = aqfi.a.createBuilder();
        String a2 = adsg.a();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        aqfi aqfiVar7 = (aqfi) createBuilder6.b;
        aqfiVar7.b = 1;
        aqfiVar7.c = a2;
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        aqfh aqfhVar4 = (aqfh) createBuilder4.b;
        aqfi aqfiVar8 = (aqfi) createBuilder6.s();
        aqfiVar8.getClass();
        aqfhVar4.d = aqfiVar8;
        aqfhVar4.b |= 2;
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((aqfh) createBuilder4.b).e = a.an(3);
        aozyVar.bM((aqfh) createBuilder4.s());
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im"));
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp"));
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb"));
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg"));
        aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush"));
        if (adab.o()) {
            aozyVar.bM(c("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms"));
        }
        if (adab.p()) {
            aozyVar.bM(c("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms"));
        }
        akul ag = aktp.ag(aozyVar);
        if (((osm) this.g.b()).a()) {
            aluq listIterator = ((altg) this.f).listIterator();
            while (listIterator.hasNext()) {
                ag = ag.i(new ukk(this, mshVar, (vgb) listIterator.next(), 14, (char[]) null), this.e);
            }
        }
        return ag;
    }
}
