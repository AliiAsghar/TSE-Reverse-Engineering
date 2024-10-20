package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.enq;
import defpackage.gsy;
import defpackage.gwb;
import defpackage.gwd;
import defpackage.haa;
import defpackage.hab;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends enq implements gwb {
    private static final String a = gsy.b("SystemAlarmService");
    private gwd b;
    private boolean c;

    private final void b() {
        gwd gwdVar = new gwd(this);
        this.b = gwdVar;
        if (gwdVar.i != null) {
            gsy.a();
            Log.e(gwd.a, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            gwdVar.i = this;
        }
    }

    @Override // defpackage.gwb
    public final void a() {
        this.c = true;
        gsy.a().c(a, "All commands completed in dispatcher");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (hab.a) {
            linkedHashMap.putAll(hab.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                gsy.a();
                Log.w(haa.a, "WakeLock held for ".concat(String.valueOf(str)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.enq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.c = false;
    }

    @Override // defpackage.enq, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            gsy.a();
            Log.i(a, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.b();
            b();
            this.c = false;
        }
        if (intent != null) {
            this.b.d(intent, i2);
            return 3;
        }
        return 3;
    }
}
