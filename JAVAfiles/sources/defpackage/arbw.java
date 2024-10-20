package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class arbw extends aqvd {
    public final aqvd a;

    public arbw(aqvd aqvdVar) {
        this.a = aqvdVar;
    }

    @Override // defpackage.aqvd
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.aqvd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.aqvd
    public void c() {
        throw null;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", this.a);
        return aj.toString();
    }
}
