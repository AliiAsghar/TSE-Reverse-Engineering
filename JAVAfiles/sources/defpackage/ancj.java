package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ancj extends ands implements Runnable {
    ListenableFuture a;
    Object b;

    public ancj(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        obj.getClass();
        this.b = obj;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, algk algkVar, Executor executor) {
        anci anciVar = new anci(listenableFuture, algkVar);
        listenableFuture.c(anciVar, albo.bD(executor, anciVar));
        return anciVar;
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, ancs ancsVar, Executor executor) {
        executor.getClass();
        anch anchVar = new anch(listenableFuture, ancsVar);
        listenableFuture.c(anchVar, albo.bD(executor, anchVar));
        return anchVar;
    }

    public abstract Object d(Object obj, Object obj2);

    public abstract void e(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        String str;
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        String gs = super.gs();
        if (listenableFuture != null) {
            str = a.bX(listenableFuture, "inputFuture=[", "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        }
        if (gs != null) {
            return str.concat(gs);
        }
        return null;
    }

    @Override // defpackage.ance
    protected final void gt() {
        l(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.a = null;
        if (listenableFuture.isCancelled()) {
            m(listenableFuture);
            return;
        }
        try {
            try {
                Object d = d(obj, albo.bQ(listenableFuture));
                this.b = null;
                e(d);
            } catch (Throwable th) {
                try {
                    albo.bA(th);
                    setException(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}
