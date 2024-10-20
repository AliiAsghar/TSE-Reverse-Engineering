package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gls extends gln {
    final /* synthetic */ glu a;

    public gls(glu gluVar) {
        this.a = gluVar;
    }

    @Override // defpackage.gln, defpackage.glj
    public final void a(glm glmVar) {
        this.a.v.remove(glmVar);
        if (!this.a.y()) {
            glm glmVar2 = this.a;
            glmVar2.r(glmVar2, gll.c, false);
            glu gluVar = this.a;
            gluVar.l = true;
            gluVar.r(gluVar, gll.b, false);
        }
    }
}
