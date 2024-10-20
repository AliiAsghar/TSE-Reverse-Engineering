package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngp implements ncq {
    private final rzz a;
    private final ngo b;

    public ngp(rzz rzzVar, ngo ngoVar) {
        this.a = rzzVar;
        this.b = ngoVar;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.a.f(new nem(ncpVar, 7), "QueryObservableSupplier::register", "QueryObservableSupplier::callback", "QueryObservableSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.b.c();
    }

    @Override // defpackage.ncq
    public final Object c() {
        return ((mnh) this.b).d();
    }
}
