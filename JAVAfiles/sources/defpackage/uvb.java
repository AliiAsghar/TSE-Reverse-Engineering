package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uvb implements uup {
    public static final /* synthetic */ int c = 0;
    public final apwt b;
    private final mbl e;
    private final Optional f;
    private final uvf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final wpp k;
    private static final xze d = xze.g("BugleNetwork", "PhoneTachyonTickleHandler");
    static final uuf a = uuh.i(uuh.b, "open_bind_after_pull", true);

    public uvb(mbl mblVar, apwt apwtVar, Optional optional, uvf uvfVar, wpp wppVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.e = mblVar;
        this.b = apwtVar;
        this.f = optional;
        this.g = uvfVar;
        this.k = wppVar;
        this.h = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
    }

    private final boolean d() {
        return vht.d();
    }

    @Override // defpackage.uup
    public final akul a() {
        if (!d()) {
            d.l("Skipping tachyon registration refresh because phone registration is not enabled.");
            return aktp.ag(null);
        }
        Stream map = Collection.EL.stream((alpt) Collection.EL.stream(((adjc) this.i.b()).o()).map(new unt(17)).collect(alls.b)).map(new uuy(this, 2));
        int i = alog.d;
        return aktp.am((Iterable) map.collect(alls.a)).h(new kli(19), andi.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    @Override // defpackage.uup
    public final void b(aqfn aqfnVar, String str, int i, int i2) {
        akrh e = aktp.e("PhoneTachyonTickleHandler::onTickleReceived");
        try {
            if (this.f.isEmpty()) {
                d.o("Ignore received Firebase message because TachyonReceiverManager is not present.");
            } else if (!d()) {
                d.o("Ignore phone tickle when phone registration is not enabled.");
            } else {
                yyt yytVar = (yyt) this.h.b();
                rve a2 = rve.a(str);
                aozy createBuilder = asgx.a.createBuilder();
                atok ba = yyb.ba();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                asgx asgxVar = (asgx) apagVar;
                ba.getClass();
                asgxVar.c = ba;
                asgxVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((asgx) createBuilder.b).e = a.aq(5);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((asgx) createBuilder.b).g = arsd.at(47);
                aozy createBuilder2 = asgv.a.createBuilder();
                createBuilder2.bP(str);
                asgv asgvVar = (asgv) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asgx asgxVar2 = (asgx) createBuilder.b;
                asgvVar.getClass();
                asgxVar2.d = asgvVar;
                asgxVar2.b |= 2;
                yytVar.W(a2, createBuilder);
                this.e.c("Bugle.PhoneIdentity.FcmPush");
                uvf uvfVar = this.g;
                wpp wppVar = this.k;
                uvfVar.b(str, aqfnVar, new ult(wppVar, 13), new ult(wppVar, 14), "Phone", uvf.c(i, i2), ((Boolean) a.e()).booleanValue(), ((Boolean) xct.a.e()).booleanValue(), ((Boolean) xct.b.e()).booleanValue(), ((Boolean) xct.c.e()).booleanValue());
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.uup
    public final void c() {
        this.e.e("Bugle.Fcm.Tickle.Downgrade.Counts", uvl.f(3));
    }
}
