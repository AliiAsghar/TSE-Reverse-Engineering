package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibc implements ajye, ajyf {
    private final Optional a;
    private final ansy b;

    public ibc(Optional optional, ansy ansyVar) {
        ansyVar.getClass();
        this.a = optional;
        this.b = ansyVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ajye, defpackage.ajyd
    public final ListenableFuture a(ajyi ajyiVar) {
        this.a.isPresent();
        ?? r1 = ((iba) this.a.get()).a;
        if (r1 == 0) {
            arro.b("pseudonymousAccountIdFuture");
            return null;
        }
        return r1;
    }

    @Override // defpackage.ajye
    public final ListenableFuture b(ajwt ajwtVar) {
        ajwtVar.getClass();
        return this.b.A(ajwtVar);
    }

    @Override // defpackage.ajye
    public final /* synthetic */ ListenableFuture c(ajwt ajwtVar) {
        return ajki.u(this, ajwtVar);
    }
}
