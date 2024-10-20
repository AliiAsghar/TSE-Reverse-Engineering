package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andh extends ancm {
    private andg b;

    public andh(alnu alnuVar, boolean z, Executor executor, ancr ancrVar) {
        super(alnuVar, z, false);
        this.b = new ande(this, ancrVar, executor);
        o();
    }

    @Override // defpackage.ancm
    public final void g() {
        andg andgVar = this.b;
        if (andgVar != null) {
            andgVar.f();
        }
    }

    @Override // defpackage.ance
    protected final void k() {
        andg andgVar = this.b;
        if (andgVar != null) {
            andgVar.h();
        }
    }

    @Override // defpackage.ancm
    public final void q(int i) {
        super.q(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public andh(alnu alnuVar, boolean z, Executor executor, Callable callable) {
        super(alnuVar, z, false);
        this.b = new andf(this, callable, executor);
        o();
    }

    @Override // defpackage.ancm
    public final void e(int i, Object obj) {
    }
}
