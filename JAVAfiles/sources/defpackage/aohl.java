package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aohl implements aoho {
    final acit a;

    public aohl(acit acitVar) {
        this.a = acitVar;
    }

    @Override // defpackage.aoho
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.aoho
    public final boolean b(aohu aohuVar) {
        if (!aohuVar.e() && !aohuVar.d() && !aohuVar.b()) {
            return false;
        }
        this.a.d(aohuVar.a);
        return true;
    }
}
