package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.wlu;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SmsDeliverReceiver extends wlu {
    private static final xze g = xze.g("Bugle", "SmsDeliverReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.e.b()).b("SmsDeliverReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SmsDeliver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 8;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsDeliver.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9 A[Catch: all -> 0x00f3, LOOP:0: B:26:0x00d7->B:27:0x00d9, LOOP_END, TryCatch #1 {all -> 0x00f3, blocks: (B:25:0x00d0, B:27:0x00d9, B:29:0x00e9), top: B:24:0x00d0, outer: #5 }] */
    @Override // defpackage.wna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.SmsDeliverReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}
