package com.google.android.apps.messaging.rcsmigration;

import android.content.Intent;
import android.os.IBinder;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.armf;
import defpackage.lsh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsMigrationService extends lsh {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/rcsmigration/RcsMigrationService");
    public armf a;
    public armf b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        akrc b = ((aksr) this.b.b()).b("RcsMigrationService::onBind");
        try {
            int intExtra = intent.getIntExtra("expected_version", -1);
            if (intExtra == 1) {
                alvw g = c.g();
                g.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 41, "RcsMigrationService.java")).q("RcsMigrationService: Returning RCS state provider.");
                iBinder = (IBinder) this.a.b();
            } else {
                alvw i = c.i();
                i.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 44, "RcsMigrationService.java")).u("RcsMigrationService: Version not supported returning null. Current Version:%d Expected Version:%d", 1, intExtra);
                iBinder = null;
            }
            b.close();
            return iBinder;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
