package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.albo;
import defpackage.rft;
import defpackage.wlm;
import defpackage.wnr;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DefaultSmsSubscriptionChangeReceiver extends wlm implements wnr {
    public static final xze a = xze.g("Bugle", "DefaultSmsSubscriptionChangeReceiver");
    public aksr b;
    public rft c;

    public static boolean f() {
        if (!albo.ar("HUAWEI", Build.MANUFACTURER) && !albo.ar("HONOR", Build.MANUFACTURER)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("DefaultSmsSubscriptionChangeReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.DefaultSubscriptionChanged.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        this.c.b().r(this);
    }

    @Override // defpackage.wng
    protected final int e() {
        return 12;
    }
}
