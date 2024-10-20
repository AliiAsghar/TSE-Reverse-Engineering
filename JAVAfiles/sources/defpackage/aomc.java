package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomc extends aqvi {
    final /* synthetic */ aomd a;
    final /* synthetic */ aqsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aomc(aqvr aqvrVar, aomd aomdVar, aqsm aqsmVar) {
        super(aqvrVar);
        this.a = aomdVar;
        this.b = aqsmVar;
    }

    @Override // defpackage.aqvi, defpackage.aqvr
    public final void a(Status status, aqut aqutVar) {
        status.getClass();
        aqutVar.getClass();
        if (((AtomicReference) this.a.a[0].c.a(this.b)).get() == null) {
            this.a.b(aqutVar, this.b, false);
            super.a(status, aqutVar);
            return;
        }
        throw new IllegalStateException("Response headers can be populated only before the first response message.");
    }

    @Override // defpackage.aqvi, defpackage.aqvr
    public final void b(aqut aqutVar) {
        this.a.b(aqutVar, this.b, true);
        super.b(aqutVar);
    }
}
