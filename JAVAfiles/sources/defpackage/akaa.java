package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akaa implements ajye, ajyf {
    private final ahiy a;
    private final ansy b;

    public akaa(ahiy ahiyVar, ansy ansyVar) {
        this.a = ahiyVar;
        this.b = ansyVar;
    }

    @Override // defpackage.ajye, defpackage.ajyd
    public final ListenableFuture a(ajyi ajyiVar) {
        return this.a.x();
    }

    @Override // defpackage.ajye
    public final ListenableFuture b(ajwt ajwtVar) {
        return this.b.A(ajwtVar);
    }

    @Override // defpackage.ajye
    public final /* synthetic */ ListenableFuture c(ajwt ajwtVar) {
        return ajki.u(this, ajwtVar);
    }
}
