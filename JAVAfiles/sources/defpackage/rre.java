package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rre extends rrc {
    private final rrc a;

    public rre(rrc rrcVar) {
        while (rrcVar instanceof rre) {
            rrcVar = ((rre) rrcVar).a;
        }
        xyl.k(rrcVar instanceof rrb);
        this.a = rrcVar;
    }

    @Override // defpackage.rrc
    public final rqz a() {
        return this.a.a();
    }

    @Override // defpackage.rrc
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.rrc
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.rrc
    public final void e(rqz rqzVar) {
        this.a.e(rqzVar);
    }

    @Override // defpackage.rrc
    public final boolean g() {
        return this.a.g();
    }
}
