package defpackage;

import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class clz extends cko {
    private Shader a;
    private long b = 9205357640488583168L;

    @Override // defpackage.cko
    public final void a(long j, clp clpVar, float f) {
        Shader shader = this.a;
        if (shader == null || !a.bB(this.b, j)) {
            if (cjt.f(j)) {
                shader = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shader = b(j);
                this.a = shader;
                this.b = j;
            }
        }
        long g = clpVar.g();
        long j2 = cku.a;
        if (!a.bB(g, j2)) {
            clpVar.k(j2);
        }
        if (!d.F(((ckc) clpVar).c, shader)) {
            clpVar.n(shader);
        }
        if (clpVar.a() == f) {
            return;
        }
        clpVar.i(f);
    }

    public abstract Shader b(long j);
}
