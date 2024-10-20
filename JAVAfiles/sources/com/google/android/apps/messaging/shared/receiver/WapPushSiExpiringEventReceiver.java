package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.riu;
import defpackage.wmb;
import defpackage.yhx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WapPushSiExpiringEventReceiver extends wmb {
    public aksr a;
    public riu b;

    @Override // defpackage.wng
    public final akrc a() {
        return this.a.b("WapPushSiExpiringEventReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.WapPushSiExpiring.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        if (yhx.h(context)) {
            this.b.a().r(this);
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
