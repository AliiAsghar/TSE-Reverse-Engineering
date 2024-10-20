package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arzk extends arvg implements arzj {
    public final arzj b;

    public arzk(arpi arpiVar, arzj arzjVar) {
        super(arpiVar, true);
        this.b = arzjVar;
    }

    @Override // defpackage.arzw
    public final aryz B() {
        return this.b.B();
    }

    @Override // defpackage.arzw
    public final asqe D() {
        return this.b.D();
    }

    @Override // defpackage.arxw
    public final void M(Throwable th) {
        arzj arzjVar = this.b;
        CancellationException I = I(th, null);
        arzjVar.v(I);
        Q(I);
    }

    @Override // defpackage.arzx
    public final Object a(Object obj, arpe arpeVar) {
        return this.b.a(obj, arpeVar);
    }

    @Override // defpackage.arzx
    public final Object c(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.arzx
    public final void d(arqr arqrVar) {
        throw null;
    }

    @Override // defpackage.arzx
    public final boolean e(Throwable th) {
        return this.b.e(th);
    }

    @Override // defpackage.arzx
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.arzw
    public final Object i(arpe arpeVar) {
        throw null;
    }

    @Override // defpackage.arzw
    public final Object j(arpe arpeVar) {
        throw null;
    }

    @Override // defpackage.arzw
    public final Object m() {
        return this.b.m();
    }

    @Override // defpackage.arxw, defpackage.arxm
    public final void v(CancellationException cancellationException) {
        if (y()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new arxn(g(), null, this);
        }
        M(cancellationException);
    }
}
