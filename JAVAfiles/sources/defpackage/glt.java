package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glt extends gln {
    final glu a;

    public glt(glu gluVar) {
        this.a = gluVar;
    }

    @Override // defpackage.gln, defpackage.glj
    public final void b(glm glmVar) {
        glu gluVar = this.a;
        int i = gluVar.w - 1;
        gluVar.w = i;
        if (i == 0) {
            gluVar.x = false;
            gluVar.q();
        }
        glmVar.C(this);
    }

    @Override // defpackage.gln, defpackage.glj
    public final void e(glm glmVar) {
        glu gluVar = this.a;
        if (!gluVar.x) {
            gluVar.x();
            this.a.x = true;
        }
    }
}
