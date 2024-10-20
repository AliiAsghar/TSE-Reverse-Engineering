package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcz implements akda {
    private final hau a;
    private final gtm b;

    public akcz(hau hauVar, gtm gtmVar) {
        this.a = hauVar;
        this.b = gtmVar;
    }

    @Override // defpackage.akda
    public final ListenableFuture a(String str) {
        return this.a.a();
    }

    @Override // defpackage.akda
    public final ListenableFuture b(String str) {
        return this.a.b();
    }

    @Override // defpackage.akda
    public final ListenableFuture c(UUID uuid) {
        return this.a.c();
    }

    @Override // defpackage.akda
    public final ListenableFuture d(String str, gso gsoVar, List list) {
        return this.a.f();
    }

    @Override // defpackage.akda
    public final ListenableFuture e() {
        return akec.b(((gte) this.b.f()).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture f(ico icoVar) {
        return this.a.g();
    }

    @Override // defpackage.akda
    public final ListenableFuture g(kkc kkcVar) {
        return this.a.d();
    }

    @Override // defpackage.akda
    public final ListenableFuture h(String str, int i, kkc kkcVar) {
        return this.a.e();
    }

    @Override // defpackage.akda
    public final /* synthetic */ ListenableFuture i(String str, gso gsoVar, kkc kkcVar) {
        return akec.aW(this, str, gsoVar, kkcVar);
    }
}
