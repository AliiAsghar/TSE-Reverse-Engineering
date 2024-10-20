package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcn implements vcy {
    private final aqrs a;
    private final aqut b;

    public vcn(aqrs aqrsVar, aqut aqutVar) {
        this.a = aqrsVar;
        this.b = aqutVar;
    }

    private final aqal g() {
        return (aqal) vdi.b(aqam.a(this.a), this.b, false);
    }

    @Override // defpackage.vcy
    public final akul a(aqdj aqdjVar) {
        return akul.g(g().b(aqdjVar));
    }

    @Override // defpackage.vcy
    public final akul b(aqdm aqdmVar) {
        return akul.g(g().c(aqdmVar));
    }

    @Override // defpackage.vcy
    public final akul c(aqea aqeaVar) {
        return akul.g(g().d(aqeaVar));
    }

    @Override // defpackage.vcy
    public final akul d(aqew aqewVar) {
        return akul.g(g().e(aqewVar));
    }

    @Override // defpackage.vcy
    public final akul e(aqdt aqdtVar) {
        return akul.g(g().f(aqdtVar));
    }

    @Override // defpackage.vcy
    public final void f(aqec aqecVar, arlq arlqVar) {
        albo.U(!aiut.g(), "Method must not be called on MainThread");
        ((arky) vdi.b(aqam.c(this.a), this.b, true)).b(aqecVar, arlqVar);
    }
}
