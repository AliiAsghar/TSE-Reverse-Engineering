package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxz implements bzt {
    private final arqv a;
    private final arwe b;
    private arxm c;

    public bxz(arpi arpiVar, arqv arqvVar) {
        this.a = arqvVar;
        this.b = arwi.e(arpiVar);
    }

    @Override // defpackage.bzt
    public final void g() {
        arxm arxmVar = this.c;
        if (arxmVar != null) {
            arxmVar.v(new byb());
        }
        this.c = null;
    }

    @Override // defpackage.bzt
    public final void h() {
        arxm arxmVar = this.c;
        if (arxmVar != null) {
            arxmVar.v(new byb());
        }
        this.c = null;
    }

    @Override // defpackage.bzt
    public final void i() {
        arxm arxmVar = this.c;
        if (arxmVar != null) {
            arwi.x(arxmVar, "Old job was still running!", null);
        }
        this.c = arrn.J(this.b, null, null, this.a, 3);
    }
}
