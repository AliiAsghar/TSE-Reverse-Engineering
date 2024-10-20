package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoix {
    private static final long e = TimeUnit.HOURS.toSeconds(8);
    public final aoim a;
    public final FirebaseMessaging b;
    public final asma d;
    private final Context f;
    private final aoip g;
    private final ScheduledExecutorService h;
    public final Map c = new tm();
    private boolean i = false;

    public aoix(FirebaseMessaging firebaseMessaging, aoip aoipVar, asma asmaVar, aoim aoimVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.g = aoipVar;
        this.d = asmaVar;
        this.a = aoimVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    public static void a(acir acirVar) {
        try {
            actx.v(acirVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e3);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(boolean z) {
        this.i = z;
    }

    public final void d(long j) {
        b(new aoiz(this, this.f, this.g, Math.min(Math.max(30L, j + j), e)), j);
        c(true);
    }

    public final synchronized boolean f() {
        return this.i;
    }
}
