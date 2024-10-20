package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abpe extends BroadcastReceiver {
    public static SoftReference a;
    private static SoftReference b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int a(Context context, CloudMessage cloudMessage);

    protected void b(Bundle bundle) {
        throw null;
    }

    public final int c(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (intent == null) {
            return;
        }
        boolean isOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (abpe.class) {
            SoftReference softReference = b;
            if (softReference != null) {
                executorService = (ExecutorService) softReference.get();
            } else {
                executorService = null;
            }
            if (executorService == null) {
                abgj abgjVar = accz.a;
                executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new aglj("firebase-iid-executor", 1)));
                b = new SoftReference(executorService);
            }
            executorService2 = executorService;
        }
        executorService2.execute(new abpd(this, intent, context, isOrderedBroadcast, goAsync, 0));
    }
}
