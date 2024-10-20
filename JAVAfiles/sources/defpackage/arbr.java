package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbr implements aram {
    final Status a;
    private final arak b;

    public arbr(Status status, arak arakVar) {
        d.t(!status.f(), "error must not be OK");
        this.a = status;
        this.b = arakVar;
    }

    @Override // defpackage.aram
    public final araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        return new arbq(this.a, this.b, aqrxVarArr);
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
