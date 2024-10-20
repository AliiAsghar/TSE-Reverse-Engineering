package com.google.android.ims.messaging;

import android.content.Intent;
import android.os.IBinder;
import defpackage.adat;
import defpackage.alhr;
import defpackage.alpt;
import defpackage.aode;
import defpackage.aoko;
import defpackage.aqam;
import defpackage.aqrn;
import defpackage.aqsv;
import defpackage.aqvw;
import defpackage.aqwn;
import defpackage.aqwr;
import defpackage.arhb;
import defpackage.armf;
import defpackage.asmb;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MessagingEngineEndpointService extends adat {
    public armf a;
    private alhr b;

    @Override // defpackage.enq, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return ((aoko) this.b).get();
    }

    @Override // defpackage.adat, defpackage.enq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        aqwn b = aqwn.b(getApplicationContext());
        aqwr aqwrVar = new aqwr();
        aqsv aqsvVar = new aqsv(b, aqwrVar);
        aqrn aqrnVar = (aqrn) this.a.b();
        arhb arhbVar = aqsvVar.d;
        aqrnVar.getClass();
        Object obj = arhbVar.u.a;
        asmb n = aqrnVar.n();
        ((HashMap) obj).put(((aqvw) n.a).a, n);
        HashMap hashMap = new HashMap();
        aqam.m("bugle.smapi.rcs.MessagingEngineNotificationService", aode.V(getApplicationContext(), alpt.r("com.google.android.ims", "com.google.android.apps.messaging")), hashMap);
        aqsvVar.n(aqam.o(hashMap));
        this.b = new aoko(aqsvVar.m(), aqwrVar, this);
    }
}
