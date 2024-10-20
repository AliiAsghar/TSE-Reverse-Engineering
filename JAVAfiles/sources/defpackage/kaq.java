package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaq implements jho {
    public boolean a;
    public final ascv b;
    private final arwe c;
    private final ascd d;
    private arxm e;

    public kaq(arwe arweVar) {
        arweVar.getClass();
        this.c = arweVar;
        ascd a = ascy.a(false);
        this.d = a;
        this.b = a;
    }

    @Override // defpackage.jho
    public final void a(jhc jhcVar) {
        if (jhcVar.g != null) {
            return;
        }
        c();
    }

    public final void b() {
        this.a = false;
        this.d.f(false);
        arxm arxmVar = this.e;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.e = null;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.d.f(true);
        arxm arxmVar = this.e;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.e = qjh.l(this.c, null, new kbl(this, (arpe) null, 1), 3);
    }
}
