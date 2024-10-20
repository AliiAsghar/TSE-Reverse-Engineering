package com.google.android.apps.messaging.shared.experiments.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alwo;
import defpackage.anen;
import defpackage.armf;
import defpackage.rvz;
import defpackage.uul;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BuglePhenotypeBroadcastReceiver extends uul {
    public static final alwo a = alwo.o("BuglePhenotype");
    public armf b;
    public aksr c;
    public anen d;

    @Override // defpackage.wng
    public final akrc a() {
        return this.c.b("BuglePhenotypeBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.PhenotypeCommit.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 15;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.PhenotypeCommit.Latency";
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        akrh e = aktp.e("BuglePhenotypeBroadcastReceiver#doInBackgroundAsync");
        try {
            akul ah = aktp.ah(new rvz(this, intent, context, 20, (int[]) null), this.d);
            e.b(ah);
            e.close();
            return ah;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
