package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uus implements uup {
    public static final xze a = xze.g("BugleNetwork", "DittoTachyonTickleHandler");
    public final apwt b;
    public final Optional c;
    private final mbl d;
    private final armf e;
    private final Optional f;
    private final armf g;
    private final apwt h;
    private final anen i;

    public uus(mbl mblVar, armf armfVar, armf armfVar2, apwt apwtVar, Optional optional, apwt apwtVar2, Optional optional2, anen anenVar) {
        this.d = mblVar;
        this.g = armfVar;
        this.e = armfVar2;
        this.b = apwtVar;
        this.f = optional;
        this.h = apwtVar2;
        this.c = optional2;
        this.i = anenVar;
    }

    @Override // defpackage.uup
    public final akul a() {
        if (!((Boolean) utw.i.e()).booleanValue()) {
            a.l("Skipping tachyon registration refresh because ditto is not enabled.");
            return aktp.ag(null);
        }
        return ((vax) this.h.b()).u();
    }

    @Override // defpackage.uup
    public final void b(aqfn aqfnVar, String str, int i, int i2) {
        if (this.c.isEmpty()) {
            a.o("Ignore received Firebase message because TachyonReceiverManager is not present.");
            return;
        }
        vct vctVar = (vct) this.g.b();
        ((trh) this.e.b()).c(str, i2, i);
        alvi alviVar = uvf.a;
        if (this.f.isEmpty()) {
            a.q("Ditto tickle does not support in this device");
            return;
        }
        ((vcu) this.f.get()).c();
        xyo c = a.c();
        c.H("Handling firebase tickle for Ditto, ID:");
        c.H(str);
        c.q();
        this.d.c("Bugle.Ditto.FcmPush");
        akul i3 = aktp.aj(new ikm(this, 19), this.i).i(new twe(this, str, 10), andi.a);
        aktp.aa(i3, new ydv(new uoa(str, 2), new uoa(str, 3), 0), andi.a);
        aktp.aa(i3, vctVar, andi.a);
    }

    @Override // defpackage.uup
    public final void c() {
        this.d.e("Bugle.Fcm.Tickle.Downgrade.Counts", uvl.f(2));
    }
}
