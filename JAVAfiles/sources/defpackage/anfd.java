package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfd extends ands implements RunnableFuture {
    private volatile anej a;

    public anfd(ancr ancrVar) {
        this.a = new anfb(this, ancrVar);
    }

    public static anfd d(Runnable runnable, Object obj) {
        return new anfd(Executors.callable(runnable, obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        anej anejVar = this.a;
        if (anejVar != null) {
            return a.bX(anejVar, "task=[", "]");
        }
        return super.gs();
    }

    @Override // defpackage.ance
    protected final void gt() {
        anej anejVar;
        if (n() && (anejVar = this.a) != null) {
            anejVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        anej anejVar = this.a;
        if (anejVar != null) {
            anejVar.run();
        }
        this.a = null;
    }

    public anfd(Callable callable) {
        this.a = new anfc(this, callable);
    }
}
