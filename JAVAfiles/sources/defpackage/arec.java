package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arec extends aqtd {
    final ared b;

    public arec(ared aredVar) {
        this.b = aredVar;
    }

    @Override // defpackage.aqtd
    public final asmb a() {
        albo.U(true, "config is not set");
        return new asmb(Status.b, (Object) this.b);
    }
}
