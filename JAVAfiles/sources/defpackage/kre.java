package defpackage;

import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kre implements apya {
    private final krv a;
    private final int b;
    private final kqo c;

    public kre(krv krvVar, kqo kqoVar, int i) {
        this.a = krvVar;
        this.c = kqoVar;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                kqo kqoVar = this.c;
                return new aolz(kqoVar.a, (ScheduledExecutorService) this.a.m.b(), (aqsx) this.a.a.hh.b(), algw.i((List) this.a.a.hi.b()));
            case 1:
                kqo kqoVar2 = this.c;
                return new uux(alor.n(13, kqoVar2.d, 16, kqoVar2.f, 1, kqoVar2.g), (uum) this.a.wi.b(), (xnv) this.a.bV.b(), this.a.sN);
            case 2:
                mbl mblVar = (mbl) this.a.bB.b();
                krv krvVar = this.a;
                apya apyaVar = krvVar.a.ax;
                apya apyaVar2 = krvVar.oa;
                apwt a = apxv.a(krvVar.oe);
                krv krvVar2 = this.a;
                return new uus(mblVar, apyaVar, apyaVar2, a, (Optional) ((apxx) krvVar2.od).a, apxv.a(krvVar2.oc), (Optional) this.a.ob.b(), (anen) this.a.z.b());
            case 3:
                Map map = (Map) ((apxx) apxz.a).a;
                krv krvVar3 = this.a;
                uvf aA = krvVar3.a.aA();
                mbl mblVar2 = (mbl) krvVar3.bB.b();
                apwt a2 = apxv.a(this.c.e);
                krv krvVar4 = this.a;
                Optional empty = Optional.empty();
                lpg lpgVar = (lpg) krvVar4.cr.b();
                return new uuv(map, aA, mblVar2, a2, empty, lpgVar);
            case 4:
                mbl mblVar3 = (mbl) this.a.bB.b();
                krv krvVar5 = this.a;
                apya apyaVar3 = krvVar5.a.ax;
                apya apyaVar4 = krvVar5.oa;
                apwt a3 = apxv.a(krvVar5.oe);
                krv krvVar6 = this.a;
                return new uut(mblVar3, apyaVar3, apyaVar4, a3, (Optional) ((apxx) krvVar6.od).a, krvVar6.nW, (anen) krvVar6.z.b());
            case 5:
                mbl mblVar4 = (mbl) this.a.bB.b();
                apwt a4 = apxv.a(this.a.ij);
                Optional optional = (Optional) this.a.ob.b();
                krv krvVar7 = this.a;
                krx krxVar = krvVar7.a;
                return new uvb(mblVar4, a4, optional, krxVar.aA(), krxVar.jb(), krvVar7.ww, krvVar7.dF, krvVar7.sN);
            case 6:
                return new uve(this.c.k);
            case 7:
                kqo kqoVar3 = this.c;
                return alor.m("Bugle", kqoVar3.i, "RCS", kqoVar3.j);
            case 8:
                return new uuq(apxv.a(this.a.oc));
            case 9:
                vbs vbsVar = (vbs) this.a.ij.b();
                anen anenVar = (anen) this.a.z.b();
                krv krvVar8 = this.a;
                return new uuz(vbsVar, anenVar, krvVar8.dF, krvVar8.sN);
            case 10:
                return new abei(this.c.m, (arpi) this.a.dN.b(), (arpi) this.a.bP.b(), (arwe) this.a.dO.b());
            case 11:
                krv krvVar9 = this.a;
                return new abej(krvVar9.yh, krvVar9.kQ, krvVar9.kO, (arpi) krvVar9.bP.b(), this.a.n);
            default:
                return new abek((arwe) this.a.dO.b());
        }
    }
}
