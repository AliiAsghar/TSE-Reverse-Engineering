package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwu extends aqww {
    @Override // defpackage.aqww
    public final Status a(int i) {
        if (i == aqwv.a) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (internal-only) security policy");
    }
}
