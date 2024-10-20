package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arro;
import defpackage.arwe;
import defpackage.d;
import defpackage.qjh;
import defpackage.vpi;
import defpackage.wly;
import defpackage.ymd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpatulaSettingsBroadcastReceiver extends wly {
    public armf a;
    public armf b;
    public armf c;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.a;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("SpatulaSettingsBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SpatulaSettingsBroadcastReceiver.Latency";
    }

    @Override // defpackage.wna
    public final String f() {
        return null;
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        String stringExtra;
        context.getClass();
        intent.getClass();
        if (d.F(intent.getAction(), "com.google.android.gms.spatula.settings.core.SPATULA_SETTING_UPDATED") && (stringExtra = intent.getStringExtra("ACCOUNT_NAME")) != null) {
            armf armfVar = this.c;
            if (armfVar == null) {
                arro.b("blockingScope");
                armfVar = null;
            }
            Object b = armfVar.b();
            b.getClass();
            qjh.l((arwe) b, null, new vpi(this, stringExtra, (arpe) null, 15), 3);
        }
    }

    @Override // defpackage.wna
    protected final boolean h(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        return ymd.b();
    }
}
