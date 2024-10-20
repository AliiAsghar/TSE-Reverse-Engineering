package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ill implements rsn {
    final /* synthetic */ ilw a;

    public ill(ilw ilwVar) {
        this.a = ilwVar;
    }

    @Override // defpackage.rsn
    public final int a() {
        ilw ilwVar = this.a;
        return ilwVar.q(ilwVar.G.s());
    }

    @Override // defpackage.rsn
    public final boolean b() {
        ily ilyVar = this.a.M;
        ikl iklVar = ilyVar.d;
        if (iklVar == null) {
            return false;
        }
        if (iklVar.d() || ilyVar.b()) {
            return true;
        }
        amjj a = nct.a(ilyVar.d.m);
        if (!nct.g(a) || !ilyVar.h || !ilyVar.f) {
            return false;
        }
        return true;
    }
}
