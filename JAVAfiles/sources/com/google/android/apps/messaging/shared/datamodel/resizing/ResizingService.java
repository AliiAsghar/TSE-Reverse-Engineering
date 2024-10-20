package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.a;
import defpackage.aiut;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.qjb;
import defpackage.uia;
import defpackage.uig;
import defpackage.uih;
import defpackage.uii;
import defpackage.vhu;
import defpackage.via;
import defpackage.xyl;
import defpackage.xzb;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResizingService extends uia implements Runnable {
    public static final AtomicInteger a = new AtomicInteger();
    public via b;
    public uih c;
    public aksr d;
    private ThreadPoolExecutor e;
    private PowerManager.WakeLock f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.uia, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new uii(1));
        this.f = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        akrc b = this.d.b("ResizingService#onStartCommand");
        try {
            if (!this.f.isHeld()) {
                this.f.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            if (xzb.q("Bugle", 3)) {
                xzb.c("Bugle", "ResizingService: op=" + intExtra + ", count=" + a.get());
            }
            if (intExtra != 0) {
                if (intExtra != 1) {
                    xyl.c(a.bV(intExtra, "ResizingService.onStartCommand illegal opcode"));
                } else if (a.get() == 0) {
                    if (xzb.q("Bugle", 3)) {
                        xzb.c("Bugle", "ResizingService.stopSelf()");
                    }
                    if (this.f.isHeld()) {
                        this.f.release();
                    }
                    stopSelfResult(i2);
                }
            } else {
                a.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor != null) {
                    qjb.a(this, threadPoolExecutor);
                } else if (xzb.q("Bugle", 5)) {
                    xzb.n("Bugle", "Cannot start resizing service, executor is null");
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
        akrh e = aktp.e("ResizingService#run");
        try {
            aiut.b();
            while (true) {
                try {
                    uig a2 = this.c.a();
                    if (a2 == null) {
                        break;
                    }
                    Notification c = this.b.c();
                    if (c != null) {
                        startForeground(vhu.MEDIA_RESIZING.F, c);
                    }
                    a2.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingService.class);
                        intent.putExtra("op", 1);
                        startService(intent);
                    }
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
