package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvs {
    public static final String a = gsy.b("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, gsx gsxVar, arpe arpeVar) {
        try {
            if (listenableFuture.isDone()) {
                return b(listenableFuture);
            }
            arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
            arvpVar.A();
            listenableFuture.c(new gul(listenableFuture, arvpVar, 0), gsn.a);
            arvpVar.d(new geg(gsxVar, listenableFuture, 3, null));
            return arvpVar.l();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
