package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjg extends ahjh {
    public adec a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ahiu.b("%s: ForegroundDownloadService.onStartCommand.");
        if (intent.getBooleanExtra("stop-service", false)) {
            ahiu.b("%s: Stopping ForegroundDownloadService.");
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra("key");
        if (albo.ah(stringExtra)) {
            if (Log.isLoggable("MDD", 6)) {
                Log.e("MDD", ahiu.a("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service"));
            }
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            ahiu.c("%s: Cancel notification for: %s", "MDD Foreground Download Service", stringExtra);
            this.a.e(stringExtra);
            return 2;
        }
        ahiu.c("%s: before calling startForeground for Key %s", "MDD Foreground Download Service", stringExtra);
        dyu dyuVar = new dyu(this, "download-notification-channel-id");
        dyuVar.A = "service";
        dyuVar.p(true);
        dyuVar.i(getResources().getString(R.string.mdd_foreground_service_notification_title));
        dyuVar.q(android.R.drawable.stat_notify_sync_noanim);
        startForeground(1, dyuVar.a());
        return 2;
    }
}
