package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknp implements aolh {
    final /* synthetic */ ajwt a;
    final /* synthetic */ akmy b;
    private ListenableFuture c;

    public aknp(akmy akmyVar, ajwt ajwtVar) {
        this.b = akmyVar;
        this.a = ajwtVar;
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
            return new aolq(1, null, null, ((aqrr) atiiVar.d).e(aokd.a, (aokd) albo.bQ(this.c)));
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return aolq.b(code.a().d(e).withDescription("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.a)))), new aqut());
        }
    }

    @Override // defpackage.aolh
    public final aolq g(atii atiiVar) {
        boolean z;
        if (((aqrr) atiiVar.d).f(aokd.a) == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "xrpc AuthContext should not be set on a TikTok RPC stub");
        ListenableFuture c = ((akbj) this.b.a).c();
        this.c = c;
        return aolq.c(c);
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
