package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdb implements akda {
    private final gtm a;

    public akdb(gtm gtmVar) {
        this.a = gtmVar;
    }

    @Override // defpackage.akda
    public final ListenableFuture a(String str) {
        return akec.b(((gte) this.a.a(str)).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture b(String str) {
        return akec.b(((gte) this.a.b(str)).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture c(UUID uuid) {
        return akec.b(((gte) this.a.c(uuid)).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture d(String str, gso gsoVar, List list) {
        return akec.b(((gte) this.a.e(str, gsoVar, list)).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture e() {
        return akec.b(((gte) this.a.f()).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture f(ico icoVar) {
        return this.a.h(icoVar);
    }

    @Override // defpackage.akda
    public final ListenableFuture g(kkc kkcVar) {
        return akec.b(((gte) this.a.i(kkcVar)).c);
    }

    @Override // defpackage.akda
    public final ListenableFuture h(String str, int i, kkc kkcVar) {
        return akec.b(((gte) this.a.j(str, i, kkcVar)).c);
    }

    @Override // defpackage.akda
    public final /* synthetic */ ListenableFuture i(String str, gso gsoVar, kkc kkcVar) {
        return akec.aW(this, str, gsoVar, kkcVar);
    }
}
