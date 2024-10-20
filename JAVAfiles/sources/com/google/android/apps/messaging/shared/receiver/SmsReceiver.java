package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.vco;
import defpackage.wlv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yhx;
import defpackage.yjr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SmsReceiver extends wlv {
    private static final xze d = xze.g("Bugle", "SmsReceiver");
    public armf a;
    public aksr b;
    public armf c;

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("SmsReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SmsReceiver.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        xze xzeVar = d;
        xyo d2 = xzeVar.d();
        d2.H("onReceive");
        d2.H(intent);
        d2.q();
        if (((yjr) this.a.b()).B()) {
            String action = intent.getAction();
            if (yhx.g(context)) {
                if ("android.provider.Telephony.SMS_RECEIVED".equals(action) || "android.provider.Telephony.MMS_DOWNLOADED".equals(action)) {
                    xzeVar.o("Received sms");
                    ((vco) this.c.b()).s();
                }
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 1;
    }
}
