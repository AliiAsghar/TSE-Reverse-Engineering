package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class arbv extends aquc {
    public final aquc a;

    public arbv(aquc aqucVar) {
        this.a = aqucVar;
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        return this.a.a(aquxVar, aqrrVar);
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.aquc
    public aquc d() {
        throw null;
    }

    @Override // defpackage.aquc
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.aquc
    public final aqsd f() {
        return this.a.f();
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", this.a);
        return aj.toString();
    }
}
