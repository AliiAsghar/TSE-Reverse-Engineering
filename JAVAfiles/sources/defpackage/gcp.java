package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcp implements arqr {
    final /* synthetic */ gcq a;
    private boolean b = true;

    public gcp(gcq gcqVar) {
        this.a = gcqVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        arqr arqrVar;
        fzu fzuVar = (fzu) obj;
        fzuVar.getClass();
        if (this.b) {
            this.b = false;
        } else if (fzuVar.d.b instanceof gay) {
            gcq.m(this.a);
            fzi fziVar = this.a.c;
            fziVar.l.remove(this);
            if (fziVar.l.isEmpty() && (arqrVar = (arqr) fziVar.k.get()) != null) {
                ((CopyOnWriteArrayList) fziVar.g.k.c).remove(arqrVar);
            }
        }
        return arnb.a;
    }
}
