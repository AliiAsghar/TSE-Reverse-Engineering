package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknk implements aolh {
    private ListenableFuture a;

    static {
        new aquj("Authorization", aqut.c);
        new aquj("X-Auth-Time", aqut.c);
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq a() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq b() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final aolq f(atii atiiVar) {
        try {
            throw null;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNKNOWN;
            List list = Status.a;
            return aolq.b(code.a().d(e.getCause()).withDescription("Could not obtain auth token"), new aqut());
        }
    }

    @Override // defpackage.aolh
    public final aolq g(atii atiiVar) {
        ListenableFuture listenableFuture = (ListenableFuture) ((aqrr) atiiVar.d).f(akni.a);
        if (listenableFuture == null) {
            return aolq.a;
        }
        this.a = listenableFuture;
        return aolq.c(listenableFuture);
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void e(aojh aojhVar) {
    }
}
