package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class andg extends anej {
    private final Executor a;
    final /* synthetic */ andh b;

    public andg(andh andhVar, Executor executor) {
        this.b = andhVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.anej
    public final void d(Throwable th) {
        this.b.b = null;
        if (th instanceof ExecutionException) {
            this.b.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.setException(th);
        }
    }

    @Override // defpackage.anej
    public final void e(Object obj) {
        this.b.b = null;
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }

    @Override // defpackage.anej
    public final boolean g() {
        return this.b.isDone();
    }
}
