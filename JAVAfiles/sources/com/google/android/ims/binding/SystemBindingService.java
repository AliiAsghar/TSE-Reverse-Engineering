package com.google.android.ims.binding;

import android.content.Context;
import android.net.ConnectivityManager;
import android.service.carrier.CarrierMessagingClientService;
import defpackage.acbq;
import defpackage.acms;
import defpackage.acmt;
import defpackage.acrj;
import defpackage.advr;
import defpackage.akto;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.anen;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemBindingService extends CarrierMessagingClientService {
    public static final alvi a = alvi.m("com/google/android/ims/binding/SystemBindingService");
    private anen b;

    private final synchronized anen a() {
        Context applicationContext;
        if (this.b == null) {
            applicationContext = getApplicationContext();
            this.b = acrj.b(applicationContext).u();
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        alvw g = a.g();
        g.X(alwp.a, "CarrierServices");
        ((alvg) ((alvg) g).h("com/google/android/ims/binding/SystemBindingService", "onCreate", 70, "SystemBindingService.java")).q("SystemBindingService onCreate");
        super.onCreate();
        a().execute(akto.j(new acbq(this, 7)));
        a().execute(akto.j(new acbq(this, 8)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Context applicationContext;
        acms acmsVar;
        alvw g = a.g();
        g.X(alwp.a, "CarrierServices");
        ((alvg) ((alvg) g).h("com/google/android/ims/binding/SystemBindingService", "onDestroy", 85, "SystemBindingService.java")).q("SystemBindingService onDestroy");
        super.onDestroy();
        applicationContext = getApplicationContext();
        acmt h = acrj.b(applicationContext).h();
        synchronized (h) {
            acmsVar = h.i;
        }
        if (acmsVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) h.c.getSystemService("connectivity");
            if (connectivityManager == null) {
                advr.h(acmt.b, "SystemBindingMonitor received a null reference for the ConnectivityManager", new Object[0]);
            } else {
                connectivityManager.unregisterNetworkCallback(acmsVar);
            }
        }
    }
}
