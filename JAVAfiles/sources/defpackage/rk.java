package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class rk implements ra {
    final /* synthetic */ rm a;
    private final rg b;

    public rk(rm rmVar, rg rgVar) {
        this.a = rmVar;
        this.b = rgVar;
    }

    @Override // defpackage.ra
    public final void a() {
        this.a.a.remove(this.b);
        if (d.F(this.a.b, this.b)) {
            this.b.a();
            this.a.b = null;
        }
        this.b.g(this);
        arqg arqgVar = this.b.c;
        if (arqgVar != null) {
            arqgVar.a();
        }
        this.b.c = null;
    }
}
