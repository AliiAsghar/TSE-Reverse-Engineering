package com.google.android.apps.messaging.shared.notification.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alor;
import defpackage.amhc;
import defpackage.armf;
import defpackage.mho;
import defpackage.utz;
import defpackage.uuh;
import defpackage.vhu;
import defpackage.via;
import defpackage.vjj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissNotificationReceiver extends vjj {
    static final utz a = uuh.i(uuh.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    private static final alor e = alor.l(vhu.AUTOMOVED_SPAM, amhc.AUTOMOVED_SPAM_NOTIFICATION);
    public via b;
    public aksr c;
    public armf d;

    @Override // defpackage.wng
    public final akrc a() {
        return this.c.b("DismissReceiver Receive Broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.DismissNotificationReceiver.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        vhu vhuVar;
        int intExtra = intent.getIntExtra("NOTIFICATION_ID", -1);
        if (intExtra != -1) {
            vhu[] values = vhu.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    vhuVar = values[i];
                    if (vhuVar.F == intExtra) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    vhuVar = null;
                    break;
                }
            }
            if (vhuVar != null) {
                this.b.g(vhuVar);
                if (!((Boolean) a.e()).booleanValue()) {
                    ((mho) this.d.b()).ba((amhc) e.getOrDefault(vhuVar, amhc.UNKNOWN_NOTIFICATION));
                }
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
