package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzr extends xzq {
    private final WeakReference a;

    public xzr(xzs xzsVar) {
        super("SafeAsyncTask.doInBackground");
        this.a = new WeakReference(xzsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        xzs xzsVar = (xzs) this.a.get();
        if (xzsVar != null && xzsVar.getStatus() == AsyncTask.Status.RUNNING) {
            alvw i = xzs.d.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask$TimeoutTracker", "run", 180, "SafeAsyncTask.java")).t("%s timed out and is canceled", xzsVar);
            xzsVar.cancel(true);
        }
    }
}
