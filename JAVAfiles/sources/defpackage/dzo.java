package defpackage;

import android.app.Notification;
import android.util.SparseArray;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzo {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder authenticationRequired;
        authenticationRequired = builder.setAuthenticationRequired(z);
        return authenticationRequired;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static final boolean c(int i, eql eqlVar) {
        return eqlVar.c(i);
    }

    public static final fbk d(int i, SparseArray sparseArray) {
        fbk fbkVar = (fbk) sparseArray.get(i);
        dzg.g(fbkVar);
        return fbkVar;
    }

    public static final int e(eql eqlVar) {
        return eqlVar.b();
    }
}
