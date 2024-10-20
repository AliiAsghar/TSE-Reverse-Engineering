package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolq {
    public static final aolq a = new aolq(1, null, null, null);
    public final aqrr b;
    public final int c;
    public final asmb d;
    private final ListenableFuture e;

    public aolq(int i, asmb asmbVar, ListenableFuture listenableFuture, aqrr aqrrVar) {
        this.c = i;
        this.d = asmbVar;
        this.e = listenableFuture;
        this.b = aqrrVar;
    }

    public static aolq b(Status status, aqut aqutVar) {
        status.getClass();
        albo.U(!status.f(), "Error status must not be ok");
        return new aolq(2, new asmb(status, aqutVar), null, null);
    }

    public static aolq c(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return new aolq(4, null, listenableFuture, null);
    }

    public final ListenableFuture a() {
        boolean z;
        if (this.c == 4) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        return this.e;
    }
}
