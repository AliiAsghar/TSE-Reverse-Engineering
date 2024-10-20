package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adtd<ResultT> extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c(Context context, Intent intent);

    protected Executor d() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    protected boolean e(Context context, Intent intent) {
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor d;
        if (e(context, intent)) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            if (xyl.n()) {
                d = andi.a;
            } else {
                d = d();
            }
            new adtc(this, context, intent, goAsync).executeOnExecutor(d, new Void[0]);
        }
    }
}
