package com.google.android.apps.messaging.shared.simstatetracker;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akul;
import defpackage.alvi;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arro;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.mbl;
import defpackage.okc;
import defpackage.qjh;
import defpackage.vpi;
import defpackage.wfh;
import defpackage.wvk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AsyncTelephonySimStateReceiver extends wvk {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver");
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;

    @Override // defpackage.wng
    public final akrc a() {
        armf armfVar = this.b;
        if (armfVar == null) {
            arro.b("traceCreation");
            armfVar = null;
        }
        return ((aksr) armfVar.b()).b("AsyncTelephonySimStateReceiver receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        intent.getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        akul c;
        context.getClass();
        intent.getClass();
        armf armfVar = this.c;
        if (armfVar == null) {
            arro.b("blockingScope");
            armfVar = null;
        }
        Object b = armfVar.b();
        b.getClass();
        c = qjh.c((arwe) b, arpj.a, arwf.a, new vpi(this, intent, (arpe) null, 19));
        return c;
    }

    public final armf m() {
        armf armfVar = this.g;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("processDefaultSmsChangedIntentForDsdr");
        return null;
    }

    public final armf n() {
        armf armfVar = this.d;
        if (armfVar != null) {
            return armfVar;
        }
        arro.b("simStateScheduler");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final void o(int i) {
        armf armfVar = this.f;
        armf armfVar2 = null;
        if (armfVar == null) {
            arro.b("enableCountersPhoneSimsStateUpdate");
            armfVar = null;
        }
        if (((okc) armfVar.b()).a()) {
            armf armfVar3 = this.e;
            if (armfVar3 == null) {
                arro.b("countersUtil");
            } else {
                armfVar2 = armfVar3;
            }
            ((mbl) ((wfh) armfVar2.b()).a.b()).e("Bugle.Dsdr.AsyncTelephonySimStateReceiver", i - 1);
        }
    }
}
