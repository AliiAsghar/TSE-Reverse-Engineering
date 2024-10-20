package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqd implements akcq {
    public final armf b;
    private final usk d;
    private final usb e;
    private final arwe f;
    private final aogy g;
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker");
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueTikTokWorker");

    public uqd(xnv xnvVar, usk uskVar, usb usbVar, armf armfVar, aogy aogyVar, arwe arweVar) {
        xnvVar.getClass();
        uskVar.getClass();
        usbVar.getClass();
        aogyVar.getClass();
        arweVar.getClass();
        this.d = uskVar;
        this.e = usbVar;
        this.b = armfVar;
        this.g = aogyVar;
        this.f = arweVar;
    }

    private final Object d(WorkerParameters workerParameters, arpe arpeVar) {
        uqy uqyVar = new uqy();
        uqyVar.f("deleteAssociationsForQueues");
        uqyVar.e();
        uqyVar.b(new uol(workerParameters, 3));
        if (uqyVar.d() != 0) {
            alvw h = c.h();
            h.X(alwp.a, "BugleWorkQueue");
            ((alvg) h.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker", "completePeriodicJob", 109, "WorkQueueTikTokWorker.kt")).t("WorkQueueWorkManagerId row deleted by WorkQueueTikTokWorker. It should already have been deleted. WorkManager ID: %s", workerParameters.a);
        }
        Object F = arro.F(this.g.q(workerParameters.a), arpeVar);
        if (F == arpl.a) {
            return F;
        }
        return arnb.a;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul c2;
        c2 = qjh.c(this.f, arpj.a, arwf.a, new tyi(this, workerParameters, (arpe) null, 15));
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[Catch: urs -> 0x00d9, TRY_LEAVE, TryCatch #0 {urs -> 0x00d9, blocks: (B:14:0x0033, B:20:0x0046, B:21:0x00bb, B:23:0x00c8, B:29:0x009f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.work.WorkerParameters r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqd.c(androidx.work.WorkerParameters, arpe):java.lang.Object");
    }
}
