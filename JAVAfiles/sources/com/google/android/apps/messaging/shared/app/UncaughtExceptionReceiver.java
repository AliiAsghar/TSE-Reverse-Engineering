package com.google.android.apps.messaging.shared.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.andi;
import defpackage.apzj;
import defpackage.armf;
import defpackage.ikd;
import defpackage.nan;
import defpackage.ndd;
import defpackage.ngs;
import defpackage.ngt;
import defpackage.plr;
import defpackage.uvi;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UncaughtExceptionReceiver extends ngs {
    public static final alvi c = alvi.m("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver");
    public armf d;
    public uvi e;
    public aksr f;

    private final void a(Throwable th) {
        BroadcastReceiver.PendingResult goAsync = goAsync();
        try {
            this.e.b(th).f(RuntimeException.class, new ikd(this, th, 18), andi.a).e(RuntimeException.class, new ndd(th, 11), andi.a).c(new nan(th, goAsync, 3, null), andi.a);
        } catch (RuntimeException e) {
            alvw h = c.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 168, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception scheduling uncaught exception processing work for %s", th);
            if (((plr) this.d.b()).a()) {
                goAsync.finish();
            }
        }
    }

    @Override // defpackage.ngs, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((ngt) apzj.i(context)).MU(this);
                    this.a = true;
                }
            }
        }
        akrc b = this.f.b("UncaughtExceptionReceiver Receive broadcast");
        try {
            if (!((plr) this.d.b()).a()) {
                Serializable serializableExtra = intent.getSerializableExtra("throwable");
                if (serializableExtra == null) {
                    alvw i = c.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "onReceive", 74, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Can't process uncaught exception: throwable is missing");
                } else if (!(serializableExtra instanceof Throwable)) {
                    alvw i2 = c.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "onReceive", 77, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Can't process uncaught exception: param wasn't throwable %s", serializableExtra);
                } else {
                    Throwable th = (Throwable) serializableExtra;
                    alvw g = c.g();
                    g.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) g).g(th)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "onReceive", 'S', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: processing uncaught exception");
                    a(th);
                }
            } else {
                String str2 = null;
                try {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            e = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: extras are missing");
                        } else {
                            Object obj = extras.get("throwable");
                            if (obj == null) {
                                e = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: throwable is missing");
                            } else {
                                String name = obj.getClass().getName();
                                try {
                                    str2 = obj.toString();
                                    e = (Throwable) obj;
                                    alvw g2 = c.g();
                                    g2.X(alwp.a, "Bugle");
                                    ((alvg) ((alvg) ((alvg) g2).g(e)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 'l', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: reporting uncaught exception");
                                } catch (ClassCastException e) {
                                    e = e;
                                    str = str2;
                                    str2 = name;
                                    alvw i3 = c.i();
                                    i3.X(alwp.a, "Bugle");
                                    ((alvg) ((alvg) ((alvg) i3).g(e)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 112, "UncaughtExceptionReceiver.java")).D("UncaughtExceptionReceiver: Can't report uncaught exception: %s \"%s\" is not a Throwable. Reporting deserialization exception instead.", str2, str);
                                    a(e);
                                    b.close();
                                }
                            }
                        }
                    } catch (ClassCastException e2) {
                        e = e2;
                        str = str2;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    alvw i4 = c.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i4).g(e)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 'v', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Can't report uncaught exception: Exception thrown during deserialization. Reporting deserialization exception instead.");
                }
                a(e);
            }
            b.close();
        } catch (Throwable th2) {
            try {
                b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
