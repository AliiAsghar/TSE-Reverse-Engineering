package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glb extends gln {
    boolean a = false;
    final ViewGroup b;

    public glb(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.gln, defpackage.glj
    public final void a(glm glmVar) {
        glx.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.gln, defpackage.glj
    public final void b(glm glmVar) {
        if (!this.a) {
            glx.a(this.b, false);
        }
        glmVar.C(this);
    }

    @Override // defpackage.gln, defpackage.glj
    public final void c() {
        glx.a(this.b, false);
    }

    @Override // defpackage.gln, defpackage.glj
    public final void d() {
        glx.a(this.b, true);
    }
}
