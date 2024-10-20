package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsd implements adri {
    public final acnb a;
    public final acno b;
    private final acqy c;
    private final anen d;

    public adsd(acqy acqyVar, acnb acnbVar, anen anenVar, acno acnoVar) {
        this.c = acqyVar;
        this.a = acnbVar;
        this.d = anenVar;
        this.b = acnoVar;
    }

    private final void a(String str) {
        this.c.l(str);
    }

    @Override // defpackage.adri
    public final void b(adrc adrcVar) {
        a(adrcVar.z());
        this.b.v((adrv) adrcVar);
    }

    @Override // defpackage.adri
    public final void c(adrc adrcVar) {
        a(adrcVar.z());
        this.b.t((adrt) adrcVar);
    }

    @Override // defpackage.adri
    public final void d(adrc adrcVar) {
        a(adrcVar.z());
        albo.bR(this.d.submit(new aakf(this, adrcVar, 14)), new adsc(this, adrcVar, 2), this.d);
    }

    @Override // defpackage.adri
    public final void e(adrc adrcVar) {
        a(adrcVar.z());
        albo.bR(this.d.submit(new aakf(this, adrcVar, 15)), new adsc(this, adrcVar, 0), this.d);
    }

    @Override // defpackage.adri
    public final void f(adqu adquVar) {
        String str = adquVar.c;
        acno acnoVar = this.b;
        String k = adwf.k(str, acnoVar.n);
        k.getClass();
        if (!adwf.w(k)) {
            k = adwf.n(adquVar.c, acnoVar.n);
            k.getClass();
        }
        acnoVar.m.l(k);
        try {
            acnoVar.q.a(adquVar, 0L, k);
        } catch (Exception e) {
            advr.i(e, "Unable to process message %s", adquVar);
        }
    }
}
