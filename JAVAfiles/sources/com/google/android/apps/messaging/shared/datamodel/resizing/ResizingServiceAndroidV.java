package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.aiut;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.armf;
import defpackage.d;
import defpackage.qjb;
import defpackage.uib;
import defpackage.uig;
import defpackage.uih;
import defpackage.uii;
import defpackage.vhu;
import defpackage.via;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResizingServiceAndroidV extends uib implements Runnable {
    public armf b;
    public armf c;
    public armf d;
    private ThreadPoolExecutor f;
    private PowerManager.WakeLock g;
    private static final alvi e = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV");
    public static final AtomicInteger a = new AtomicInteger();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.uib, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new uii(0));
        this.g = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.f = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        akrc b = ((aksr) this.d.b()).b("ResizingServiceAndroidV#onStartCommand");
        try {
            if (!this.g.isHeld()) {
                this.g.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            alvi alviVar = e;
            alvw g = alviVar.g();
            g.X(alwp.a, "BugleResizing");
            alvg alvgVar = (alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 154, "ResizingServiceAndroidV.java");
            AtomicInteger atomicInteger = a;
            alvgVar.u("ResizingServiceAndroidV: op= %s , count= %s", intExtra, atomicInteger.get());
            if (intExtra != 0) {
                if (intExtra == 1) {
                    if (atomicInteger.get() == 0) {
                        alvw g2 = alviVar.g();
                        g2.X(alwp.a, "BugleResizing");
                        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 168, "ResizingServiceAndroidV.java")).q("ResizingServiceAndroidV.stopSelf()");
                        if (this.g.isHeld()) {
                            this.g.release();
                        }
                        stopSelfResult(i2);
                    }
                } else {
                    throw new IllegalStateException(String.format("ResizingServiceAndroidV.onStartCommand illegal opcode %s", Integer.valueOf(intExtra)));
                }
            } else {
                atomicInteger.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    qjb.a(this, threadPoolExecutor);
                } else {
                    alvw i3 = alviVar.i();
                    i3.X(alwp.a, "BugleResizing");
                    ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 161, "ResizingServiceAndroidV.java")).q("Cannot start resizing service, executor is null");
                }
            }
            b.close();
            return 2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        akrh e2 = aktp.e("ResizingServiceAndroidV#run");
        try {
            aiut.b();
            while (true) {
                try {
                    uig a2 = ((uih) this.c.b()).a();
                    if (a2 == null) {
                        break;
                    }
                    Notification c = ((via) this.b.b()).c();
                    if (c != null) {
                        if (Build.VERSION.SDK_INT >= 35) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d.s(z);
                        startForeground(vhu.MEDIA_RESIZING.F, c, 8192);
                    }
                    a2.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingServiceAndroidV.class);
                        intent.putExtra("op", 1);
                        startService(intent);
                    }
                }
            }
            e2.close();
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
