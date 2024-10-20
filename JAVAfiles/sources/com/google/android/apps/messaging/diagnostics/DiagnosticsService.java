package com.google.android.apps.messaging.diagnostics;

import android.content.Intent;
import android.os.IBinder;
import defpackage.kmx;
import defpackage.kna;
import defpackage.via;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsService extends kna {
    private static final xze b = xze.f("BugleDiagnostics", DiagnosticsService.class);
    public via a;
    private boolean c = false;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new kmx();
    }

    @Override // defpackage.kna, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (!this.c) {
            this.a.o();
            b.p("Diagnostics service created");
            this.c = true;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.f();
        b.p("Diagnostics service destroyed");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
