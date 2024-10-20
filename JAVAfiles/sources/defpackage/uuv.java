package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uuv implements uup {
    public final Map a;
    private final mbl b;
    private final uvf c;
    private final apwt d;
    private final Optional e;
    private final lpg f;

    public uuv(Map map, uvf uvfVar, mbl mblVar, apwt apwtVar, Optional optional, lpg lpgVar) {
        this.a = map;
        this.c = uvfVar;
        this.b = mblVar;
        this.d = apwtVar;
        this.e = optional;
        this.f = lpgVar;
    }

    @Override // defpackage.uup
    public final akul a() {
        return aktp.ag(null);
    }

    @Override // defpackage.uup
    public final void b(aqfn aqfnVar, String str, int i, int i2) {
        boolean isPresent;
        this.e.isPresent();
        if (this.f.z() && aqfnVar.d.equals("GDitto")) {
            uut uutVar = (uut) this.d.b();
            jgl jglVar = new jgl(this, 5);
            vct vctVar = (vct) uutVar.f.b();
            ((trh) uutVar.c.b()).c(str, i2, i);
            if (uutVar.d.isEmpty()) {
                uut.a.q("Ditto tickle is not supported on this device");
                return;
            }
            if (((Boolean) uwg.a.e()).booleanValue()) {
                Optional of = Optional.of(aqfnVar.c);
                aiut.b();
                soq soqVar = new soq();
                soqVar.d(tqm.GAIA);
                if (of.isEmpty()) {
                    soo a = sor.a();
                    a.w("areAnyDesktopPairedOverGaia");
                    a.k(new agpw(soqVar));
                    isPresent = a.b().K();
                } else {
                    soo a2 = sor.a();
                    a2.w("DittoDesktops#areAnyDesktopPairedOverGaia");
                    a2.k(new agpw(soqVar));
                    isPresent = Collection.EL.stream(a2.b().t()).filter(new qxp(of, 17)).findFirst().isPresent();
                }
                if (isPresent) {
                    ((vcu) uutVar.d.get()).c();
                }
            } else {
                ((vcu) uutVar.d.get()).c();
            }
            xyo c = uut.a.c();
            c.H("Handling firebase tickle for Ditto, ID:");
            c.H(str);
            c.q();
            uutVar.b.c("Bugle.Ditto.FcmPush");
            akul i3 = aktp.aj(new ikm(uutVar, 20), uutVar.h).i(new ukk(jglVar, aqfnVar, str, 3, (char[]) null), andi.a);
            aktp.aa(i3, new ydv(new uoa(str, 4), new uoa(str, 5), 0), andi.a);
            aktp.aa(i3, vctVar, andi.a);
            return;
        }
        this.c.b(str, aqfnVar, new ult(this, 8), new ult(this, 9), "GAIA", uvf.c(i, i2), false, false, false, false);
    }

    @Override // defpackage.uup
    public final void c() {
        this.b.e("Bugle.Fcm.Tickle.Downgrade.Counts", uvl.f(4));
    }

    public final akul d(aqfn aqfnVar) {
        vfw vfwVar = (vfw) this.a.get(aqfnVar.d);
        if (vfwVar == null) {
            return aktp.af(new uuu(aqfnVar.d));
        }
        return vfwVar.b();
    }
}
