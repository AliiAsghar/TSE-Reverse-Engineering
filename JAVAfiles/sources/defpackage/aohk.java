package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aohk implements aoho {
    private final aohp a;
    private final acit b;

    public aohk(aohp aohpVar, acit acitVar) {
        this.a = aohpVar;
        this.b = acitVar;
    }

    @Override // defpackage.aoho
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.aoho
    public final boolean b(aohu aohuVar) {
        if (aohuVar.d() && !this.a.c(aohuVar)) {
            acit acitVar = this.b;
            String str = aohuVar.b;
            if (str != null) {
                acitVar.b(new aohm(str, aohuVar.d, aohuVar.e));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
