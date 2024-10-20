package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvs extends arxp {
    public final arvp a;

    public arvs(arvp arvpVar) {
        this.a = arvpVar;
    }

    @Override // defpackage.arxp
    public final void a(Throwable th) {
        Throwable q = this.a.q(e());
        arvp arvpVar = this.a;
        if (arvpVar.E()) {
            aset asetVar = (aset) arvpVar.a;
            arve arveVar = asetVar.f;
            while (true) {
                Object obj = arveVar.a;
                if (d.F(obj, aseu.b)) {
                    if (asetVar.f.d(aseu.b, q)) {
                        return;
                    }
                } else if (!(obj instanceof Throwable)) {
                    if (asetVar.f.d(obj, null)) {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
        arvpVar.h(q);
        arvpVar.z();
    }

    @Override // defpackage.arxp
    public final boolean b() {
        return true;
    }
}
