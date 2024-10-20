package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glo extends gln {
    final /* synthetic */ tm a;
    final /* synthetic */ glp b;

    public glo(glp glpVar, tm tmVar) {
        this.b = glpVar;
        this.a = tmVar;
    }

    @Override // defpackage.gln, defpackage.glj
    public final void b(glm glmVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(glmVar);
        glmVar.C(this);
    }
}
