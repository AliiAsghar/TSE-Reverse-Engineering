package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdb implements vcy {
    private final aqal a;
    private final vcv b;
    private final Optional c;
    private final arky d;

    public vdb(arky arkyVar, aqal aqalVar, Optional optional, vcv vcvVar) {
        this.d = arkyVar;
        this.a = aqalVar;
        this.c = optional;
        this.b = vcvVar;
    }

    private final String h() {
        Optional map = this.c.map(new vbi(12));
        vcv vcvVar = this.b;
        vcvVar.getClass();
        String str = (String) map.orElseGet(new uea(vcvVar, 9));
        if (!albo.ah(str)) {
            return str;
        }
        return (String) vcq.a.e();
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
        aiut.b();
        ((arky) ((arky) ((arky) vdi.a(this.d, true)).j(aojz.a, h())).i(new arll(this.b.d(), 0))).b(aqecVar, arlqVar);
    }

    final aqal g() {
        return (aqal) ((aqal) ((aqal) vdi.a(this.a, false)).j(aojz.a, h())).i(new arll(this.b.d(), 0));
    }
}
