package com.google.android.apps.messaging.shared.satelliteapi.dunestar;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.alvi;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arrn;
import defpackage.arro;
import defpackage.arwe;
import defpackage.qjh;
import defpackage.uog;
import defpackage.wpe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SatelliteConnectionChangeReceiver extends wpe {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver");
    public armf b;
    public armf c;
    public armf d;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.b;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("SatelliteConnectionChangeReceiver receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SatelliteConnectionChange.Latency";
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SatelliteConnectionChange.Latency";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        armf armfVar = this.d;
        if (armfVar == null) {
            arro.b("lightweightExecutor");
            armfVar = null;
        }
        Object b = armfVar.b();
        b.getClass();
        return qjh.a(arrn.I((arwe) b, null, null, new uog(intent, this, (arpe) null, 12), 3));
    }

    public final armf m() {
        armf armfVar = this.c;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("tikTokWorkManager");
        return null;
    }
}
