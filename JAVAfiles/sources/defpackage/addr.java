package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addr extends adqp {
    public final SettableFuture a = SettableFuture.create();
    private final adrc b;

    public addr(adrc adrcVar) {
        this.b = adrcVar;
        if (adrcVar.a == adpk.RUNNING) {
            h();
        } else if (aczf.G() && adrcVar.q()) {
            g(500, "Session already stopped");
        } else {
            adrcVar.aG(this);
        }
    }

    private final void p(adug adugVar) {
        this.b.aP(this);
        if (aczx.s()) {
            SettableFuture settableFuture = this.a;
            adds a = addt.a();
            a.b(adqv.c);
            settableFuture.set(a.a());
            return;
        }
        SettableFuture settableFuture2 = this.a;
        adds a2 = addt.a();
        a2.d(500);
        a2.c("Error");
        a2.a = Optional.ofNullable(adugVar);
        settableFuture2.set(a2.a());
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void d() {
        p(null);
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void e() {
        p(null);
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void f(adug adugVar) {
        p(adugVar);
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void g(int i, String str) {
        this.b.aP(this);
        if (aczx.s()) {
            SettableFuture settableFuture = this.a;
            adrc adrcVar = this.b;
            adds a = addt.a();
            a.b(adrcVar.S);
            settableFuture.set(a.a());
            return;
        }
        SettableFuture settableFuture2 = this.a;
        adds a2 = addt.a();
        a2.d(i);
        a2.c(str);
        settableFuture2.set(a2.a());
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void h() {
        this.b.aP(this);
        adds a = addt.a();
        a.e(this.b);
        this.a.set(a.a());
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void j() {
        p(null);
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void k(adug adugVar) {
        p(adugVar);
    }
}
