package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Intent;
import android.os.IBinder;
import defpackage.aolz;
import defpackage.aome;
import defpackage.aqam;
import defpackage.aqwt;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MainProcessEndpointService extends aome {
    public aolz a;
    public aqwt b;

    @Override // defpackage.enq, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override // defpackage.aome, defpackage.enq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a.c(aqam.o(new HashMap()), this.b);
    }
}
