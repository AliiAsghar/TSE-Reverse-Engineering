package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqzq extends aqtx {
    private final Status a;

    public aqzq(Status status) {
        this.a = status;
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        return aqtt.a(this.a);
    }
}
