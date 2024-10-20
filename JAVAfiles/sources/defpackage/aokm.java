package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokm extends aqww {
    final /* synthetic */ abqq a;

    public aokm(abqq abqqVar) {
        this.a = abqqVar;
    }

    @Override // defpackage.aqww
    public final Status a(int i) {
        if (this.a.d(i)) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (1st-party only) security policy");
    }
}
