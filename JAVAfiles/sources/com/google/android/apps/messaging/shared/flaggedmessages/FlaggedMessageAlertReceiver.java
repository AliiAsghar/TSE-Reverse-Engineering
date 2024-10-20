package com.google.android.apps.messaging.shared.flaggedmessages;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.uvy;
import defpackage.uwc;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FlaggedMessageAlertReceiver extends uvy {
    private static final xze c = xze.g("Bugle", "FlaggedMessageAlertReceiver");
    public uwc a;
    public aksr b;

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("FlaggedMessageAlertReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.MessageFlaggerAlert.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.hashCode() == 1527016992 && action.equals("com.google.android.apps.messaging.shared.flaggedmessages.ALERT_EXPIRED_FLAGGED_MESSAGES")) {
            q("FlaggedMessageAlertReceiver", this.a.a());
            return;
        }
        xyo e = c.e();
        e.H("Unexpected Intent action sent to FlaggedMessageAlertReceiver:");
        e.H(action);
        e.q();
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
