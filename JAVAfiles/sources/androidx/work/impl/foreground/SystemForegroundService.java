package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.enq;
import defpackage.fhh;
import defpackage.gsy;
import defpackage.gvf;
import defpackage.gxo;
import defpackage.gxp;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends enq implements gxo {
    public static final String a = gsy.b("SystemFgService");
    gxp b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        gxp gxpVar = new gxp(getApplicationContext());
        this.b = gxpVar;
        if (gxpVar.h != null) {
            gsy.a();
            Log.e(gxp.a, "A callback already exists.");
        } else {
            gxpVar.h = this;
        }
    }

    @Override // defpackage.gxo
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.gxo
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.gxo
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            gvf.o(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT < 29) {
            startForeground(i, notification);
        } else {
            startForeground(i, notification, i2);
        }
    }

    @Override // defpackage.gxo
    public final void d() {
        this.d = true;
        gsy.a().c(a, "Shutting down.");
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.enq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.enq, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            gsy.a();
            Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent != null) {
            gxp gxpVar = this.b;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                gsy.a();
                String str = gxp.a;
                Objects.toString(intent);
                Log.i(str, "Started foreground service ".concat(intent.toString()));
                gxpVar.i.b(new fhh(gxpVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 14, (char[]) null));
                gxpVar.b(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                gxpVar.b(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                gsy.a();
                String str2 = gxp.a;
                Objects.toString(intent);
                Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    gvf.t(UUID.fromString(stringExtra), gxpVar.b);
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                gsy.a();
                Log.i(gxp.a, "Stopping foreground service");
                gxo gxoVar = gxpVar.h;
                if (gxoVar != null) {
                    gxoVar.d();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i2);
    }
}
