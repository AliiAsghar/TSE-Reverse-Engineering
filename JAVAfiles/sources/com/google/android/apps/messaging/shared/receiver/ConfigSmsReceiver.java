package com.google.android.apps.messaging.shared.receiver;

import android.content.Intent;
import defpackage.acpq;
import defpackage.aczv;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.vau;
import defpackage.wlj;
import defpackage.wwn;
import defpackage.wxb;
import defpackage.xyo;
import defpackage.xze;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConfigSmsReceiver extends wlj {
    private static final xze f = xze.g("Bugle", "ConfigSmsReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.b.b()).b("ConfigSmsReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.ConfigSmsReceiver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 2;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.ConfigSmsReceiver.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:18:0x0086->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: adwk -> 0x00d4, TryCatch #1 {adwk -> 0x00d4, blocks: (B:12:0x0071, B:14:0x007b, B:17:0x0082, B:18:0x0086, B:20:0x008c, B:29:0x00bc, B:41:0x00b8, B:49:0x00ae, B:52:0x00cc, B:22:0x0096, B:24:0x009a, B:26:0x009e, B:45:0x00a8, B:46:0x00ad), top: B:11:0x0071, inners: #4 }] */
    @Override // defpackage.wna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.ConfigSmsReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    final int m(Intent intent) {
        int intValue;
        if (aczv.x() && aczv.W()) {
            int intExtra = intent.getIntExtra("subscription", -1);
            if (intExtra < 0) {
                xyo e = f.e();
                e.H("Invalid/Missing subId in intent.");
                e.x("subId", intExtra);
                e.q();
            }
            int max = Math.max(intExtra, -1);
            try {
                intValue = ((vau) this.d.b()).c(((wxb) ((wwn) this.e.b()).i(max).orElseThrow()).c).k;
                xyo a = f.a();
                a.H("getSmsPort from mobileConfig");
                a.x("expectedPort", intValue);
                a.q();
            } catch (NoSuchElementException unused) {
                xyo e2 = f.e();
                e2.H("no SimSubscriptionInfo found for subId in the intent.");
                e2.x("subId", max);
                e2.q();
                return 0;
            }
        } else {
            intValue = ((Integer) acpq.E().C().a()).intValue();
            xyo a2 = f.a();
            a2.H("getSmsPort from RcsFlags");
            a2.x("expectedPort", intValue);
            a2.q();
        }
        return Math.max(0, intValue);
    }
}
