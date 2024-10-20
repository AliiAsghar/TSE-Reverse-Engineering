package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gcq extends no {
    public final fzi c;
    private boolean d;

    public gcq(hd hdVar, arpi arpiVar, arpi arpiVar2) {
        arpiVar.getClass();
        arpiVar2.getClass();
        fzi fziVar = new fzi(hdVar, new gz(this), arpiVar, arpiVar2);
        this.c = fziVar;
        super.C(3);
        D(new gco(this));
        F(new gcp(this));
        asai asaiVar = fziVar.i;
        asai asaiVar2 = fziVar.j;
    }

    public static final void m(gcq gcqVar) {
        if (gcqVar.b == 3 && !gcqVar.d) {
            gcqVar.d = true;
            super.C(1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ascd] */
    public final void F(arqr arqrVar) {
        fzi fziVar = this.c;
        if (fziVar.k.get() == null) {
            arqr arqrVar2 = fziVar.m;
            arqrVar2.getClass();
            fziVar.k.set(arqrVar2);
            kkc kkcVar = fziVar.g.k;
            ((CopyOnWriteArrayList) kkcVar.c).add(arqrVar2);
            fzu fzuVar = (fzu) kkcVar.b.c();
            if (fzuVar != null) {
                arqrVar2.a(fzuVar);
            }
        }
        fziVar.l.add(arqrVar);
    }

    public final void G() {
        if (dyi.e(3)) {
            dyi.f(3, "Refresh signal received");
        }
        qdq qdqVar = this.c.g.l;
        if (qdqVar != null) {
            ((gbl) qdqVar.a).c();
        }
    }

    @Override // defpackage.no
    public final int b() {
        fzi fziVar = this.c;
        gdm gdmVar = (gdm) fziVar.f.get();
        if (gdmVar != null) {
            return gdmVar.f();
        }
        return fziVar.g.c.f();
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return -1L;
    }
}
