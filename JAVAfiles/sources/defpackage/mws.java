package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mws implements wnv, ncq {
    private final armf a;
    private final yyt b;

    public mws(armf armfVar, wfh wfhVar) {
        armfVar.getClass();
        wfhVar.getClass();
        this.a = armfVar;
        this.b = wfhVar.Y(new mwr(0));
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.b.w(new kzq(ncpVar, 13), "DefaultSmsAppObservableSupplier::register", "DefaultSmsAppObservableSupplier::callback", "DefaultSmsAppObservableSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul ag = aktp.ag(c());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wnv
    public final akul d(boolean z) {
        this.b.y(new mqr(7), "DefaultSmsAppObservableSupplier::notify");
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.ncq
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Boolean c() {
        return Boolean.valueOf(((yjv) this.a.b()).d());
    }
}
