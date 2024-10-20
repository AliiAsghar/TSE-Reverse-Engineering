package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpm implements akcq {
    public static final alhr c;
    public final armf d;
    public final lpp e;
    public final aogy g;
    private final arwe h;
    public static final lgc f = new lgc();
    public static final alwo a = alwo.o("BugleNudge");
    public static final alhr b = albo.D(new ezq(15));

    static {
        albo.D(new ezq(16));
        c = uuh.w("birthday_nudge_sync_worker_enabled");
    }

    public lpm(arwe arweVar, armf armfVar, lpp lppVar, aogy aogyVar) {
        arweVar.getClass();
        armfVar.getClass();
        aogyVar.getClass();
        this.h = arweVar;
        this.d = armfVar;
        this.e = lppVar;
        this.g = aogyVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        akul c2;
        workerParameters.getClass();
        c2 = qjh.c(this.h, arpj.a, arwf.a, new lgp(this, (arpe) null, 6));
        return c2;
    }
}
