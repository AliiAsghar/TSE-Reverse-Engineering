package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gav extends env {
    public final arwe g;
    public final arqg h;
    public final arwb i;
    public final arwb j;
    public gcj k;
    public final arqg l;
    public final akrq m;
    private arxm n;

    public gav(arwe arweVar, Object obj, akrq akrqVar, arqg arqgVar, arwb arwbVar, arwb arwbVar2) {
        super(new gal(arweVar, arwbVar, arwbVar2, akrqVar, obj));
        this.g = arweVar;
        this.m = akrqVar;
        this.h = arqgVar;
        this.i = arwbVar;
        this.j = arwbVar2;
        this.l = new rd(this, 12);
        Object a = a();
        a.getClass();
        this.k = (gcj) a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.env
    public final void f() {
        l(false);
    }

    public final void l(boolean z) {
        arxm arxmVar = this.n;
        if (arxmVar != null && !z) {
            return;
        }
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.n = arrn.J(this.g, this.j, null, new ikp(this, (arpe) null, 1), 2);
    }
}
