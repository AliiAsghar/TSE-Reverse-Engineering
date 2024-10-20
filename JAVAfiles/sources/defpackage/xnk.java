package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnk implements akcq {
    public static final uuf a = uuh.r(160232109, "enable_work_item");
    private final xng b;

    public xnk(xng xngVar) {
        this.b = xngVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        if (((Boolean) a.e()).booleanValue()) {
            xng xngVar = this.b;
            return aktp.ah(new wuo(xngVar, 9), xngVar.c).h(new xgu(15), andi.a);
        }
        return aktp.ag(new gsw());
    }
}
