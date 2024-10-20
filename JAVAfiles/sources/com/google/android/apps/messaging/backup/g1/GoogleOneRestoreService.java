package com.google.android.apps.messaging.backup.g1;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.alvi;
import defpackage.armf;
import defpackage.idq;
import defpackage.idr;
import defpackage.mbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleOneRestoreService extends idr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService");
    public IG1Restore.Stub b;
    public mbl c;
    public armf d;
    private final IG1Restore.Stub e = new idq(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null && "com.android.Bugle.intent.action.RESTORE_ACTION".equals(intent.getAction())) {
            return this.e;
        }
        return null;
    }
}
