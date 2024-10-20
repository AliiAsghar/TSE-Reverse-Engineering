package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.setupcompat.ISetupCompatService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajul {
    private static ajul a;
    private final Context c;
    private final ExecutorService d = ajug.a.b;
    private final long e = b;
    private static final agxw f = new agxw("SetupCompatServiceInvoker");
    private static final long b = TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private ajul(Context context) {
        this.c = context;
    }

    public static synchronized ajul a(Context context) {
        ajul ajulVar;
        synchronized (ajul.class) {
            if (a == null) {
                a = new ajul(context.getApplicationContext());
            }
            ajulVar = a;
        }
        return ajulVar;
    }

    public final void b(int i, Bundle bundle) {
        try {
            ISetupCompatService a2 = ajun.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a2 != null) {
                a2.logMetric(i, bundle, Bundle.EMPTY);
            } else {
                f.u("logMetric failed since service reference is null. Are the permissions valid?");
            }
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException e) {
            f.t(String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    public final void c(String str, Bundle bundle) {
        try {
            ISetupCompatService a2 = ajun.a(this.c, this.e, TimeUnit.MILLISECONDS);
            if (a2 != null) {
                a2.onFocusStatusChanged(bundle);
            } else {
                f.u("Report focusChange failed since service reference is null. Are the permission valid?");
            }
        } catch (RemoteException | InterruptedException | UnsupportedOperationException | TimeoutException e) {
            f.t(String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", str), e);
        }
    }

    public final void d(int i, Bundle bundle) {
        try {
            this.d.execute(new wob(this, i, bundle, 13, (byte[]) null));
        } catch (RejectedExecutionException e) {
            f.t(String.format("Metric of type %d dropped since queue is full.", Integer.valueOf(i)), e);
        }
    }

    public final void e(String str, Bundle bundle) {
        try {
            this.d.execute(new adub(this, str, bundle, 8, (char[]) null));
        } catch (RejectedExecutionException e) {
            f.t(String.format("Screen %s report focus changed failed.", str), e);
        }
    }
}
