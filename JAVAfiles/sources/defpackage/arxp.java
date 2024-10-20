package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arxp extends asfe implements arwu, arxi {
    public arxw d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final arxw e() {
        arxw arxwVar = this.d;
        if (arxwVar != null) {
            return arxwVar;
        }
        arro.b("job");
        return null;
    }

    @Override // defpackage.arxi
    public final aryb hc() {
        return null;
    }

    @Override // defpackage.arwu
    public final void hd() {
        Object G;
        Object f;
        asfe asfeVar;
        asfi asfiVar;
        arxw e = e();
        do {
            G = e.G();
            if (G instanceof arxp) {
                if (G != this) {
                    return;
                }
            } else {
                if (!(G instanceof arxi) || ((arxi) G).hc() == null) {
                    return;
                }
                do {
                    f = f();
                    if (f instanceof asfi) {
                        asfe asfeVar2 = ((asfi) f).a;
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    asfeVar = (asfe) f;
                    asfiVar = (asfi) asfeVar.g.a;
                    if (asfiVar == null) {
                        asfiVar = new asfi(asfeVar);
                        asfeVar.g.b(asfiVar);
                    }
                } while (!this.e.d(f, asfiVar));
                asfeVar.g();
                return;
            }
        } while (!e.d.d(G, arxx.g));
    }

    @Override // defpackage.arxi
    public final boolean he() {
        return true;
    }

    @Override // defpackage.asfe
    public final String toString() {
        return arwi.a(this) + "@" + arwi.b(this) + "[job@" + arwi.b(e()) + "]";
    }
}
