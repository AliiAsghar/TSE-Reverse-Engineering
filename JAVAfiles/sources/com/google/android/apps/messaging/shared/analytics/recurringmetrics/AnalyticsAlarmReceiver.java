package com.google.android.apps.messaging.shared.analytics.recurringmetrics;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.mff;
import defpackage.mfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AnalyticsAlarmReceiver extends mff {
    public armf a;
    public armf b;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.b.b()).b("AnalyticsAlarmReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        ((mfo) this.a.b()).e(this);
    }
}
