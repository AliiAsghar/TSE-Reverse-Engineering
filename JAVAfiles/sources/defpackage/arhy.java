package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhy extends apsd {
    final /* synthetic */ arzj a;
    final /* synthetic */ asmb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arhy(arzj arzjVar, asmb asmbVar) {
        super(null);
        this.a = arzjVar;
        this.b = asmbVar;
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        StatusException statusException;
        status.getClass();
        aqutVar.getClass();
        if (status.f()) {
            statusException = null;
        } else {
            statusException = new StatusException(status, aqutVar);
        }
        this.a.e(statusException);
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        Object c = this.a.c(obj);
        if (c instanceof arzm) {
            Throwable b = arzn.b(c);
            if (b == null) {
                throw new AssertionError("onMessage should never be called until responses is ready");
            }
            throw b;
        }
    }

    @Override // defpackage.apsd
    public final void e() {
        this.b.l();
    }
}
