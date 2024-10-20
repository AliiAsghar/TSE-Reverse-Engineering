package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.gsy;
import defpackage.gvd;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = gsy.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gsy a2 = gsy.a();
        String str = a;
        Objects.toString(intent);
        a2.c(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            gvd m = gvd.m(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (gvd.b) {
                BroadcastReceiver.PendingResult pendingResult = m.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                m.i = goAsync;
                if (m.h) {
                    m.i.finish();
                    m.i = null;
                }
            }
        } catch (IllegalStateException e) {
            gsy.a();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
