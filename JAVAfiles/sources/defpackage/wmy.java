package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wmy implements akcq {
    public static final alwo a = alwo.o("BugleNotifications");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker");
    public static final int[] c = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
    public final Context d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    private final arwe r;

    public wmy(arwe arweVar, Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        arweVar.getClass();
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar13.getClass();
        this.r = arweVar;
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = armfVar11;
        this.p = armfVar12;
        this.q = armfVar13;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul c2;
        workerParameters.getClass();
        c2 = qjh.c(this.r, arpj.a, arwf.a, new wmx(workerParameters, this, null));
        return c2;
    }
}
