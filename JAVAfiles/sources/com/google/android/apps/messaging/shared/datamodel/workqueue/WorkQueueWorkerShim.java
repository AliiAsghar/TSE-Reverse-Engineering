package com.google.android.apps.messaging.shared.datamodel.workqueue;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvi;
import defpackage.andi;
import defpackage.apwt;
import defpackage.gsi;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.raw;
import defpackage.uos;
import defpackage.uot;
import defpackage.upo;
import defpackage.upp;
import defpackage.uro;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WorkQueueWorkerShim extends gsx {
    public static final alvi e = alvi.m("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim");
    public final apwt f;
    private final apwt g;
    private final aksr h;
    private final uot i;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        uot ec();

        apwt ia();

        apwt ib();
    }

    public WorkQueueWorkerShim(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.g = aVar.ib();
        this.h = aVar.a();
        this.f = aVar.ia();
        this.i = aVar.ec();
    }

    private static String c(gsi gsiVar) {
        String d = gsiVar.d("worker_type");
        if (d == null) {
            return "__UNKNOWN_TYPE";
        }
        return d;
    }

    @Override // defpackage.gsx
    public final /* synthetic */ ListenableFuture b() {
        AutoCloseable e2;
        gsi f = f();
        uot uotVar = this.i;
        synchronized (uotVar.d) {
            uotVar.e.add(new uos(uotVar.b.f().toEpochMilli(), 2, f));
        }
        gsi f2 = f();
        if (f2 != null) {
            try {
                e2 = this.h.b("WorkQueueWorkerShim#startWork");
            } catch (IllegalStateException unused) {
                aktp.d();
                e2 = aktp.e("WorkQueueWorkerShim#startWork");
            }
            try {
                String c = c(f2);
                ((upp) this.f.b()).d(c, upo.NOT_SCHEDULED, g());
                akul h = ((uro) this.g.b()).a("WorkManager", c(f2)).h(new raw(this, c, 19), andi.a);
                e2.close();
                return h;
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return aktp.ag(new gsw());
    }
}
