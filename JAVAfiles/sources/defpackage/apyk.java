package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apyk implements apyi {
    public final ListenableFuture a;
    final /* synthetic */ apym b;

    public apyk(apym apymVar) {
        this.b = apymVar;
        apyl apylVar = apymVar.a;
        if (!apylVar.isDone()) {
            Runnable apyjVar = new apyj(apylVar);
            apylVar.c(apyjVar, andi.a);
            apylVar = apyjVar;
        }
        this.a = apylVar;
    }

    @Override // defpackage.apyi
    public final ListenableFuture d() {
        this.b.d();
        return this.a;
    }
}
