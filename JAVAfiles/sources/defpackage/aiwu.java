package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwu {
    public final String a;
    public final akbj b;
    public final akqr d;
    public final aiws f;
    private final ListenableFuture g;
    private final akbj i = new akbj(new aiwt(this), andi.a);
    public final Object c = new Object();
    public List e = new ArrayList();
    private final andr h = new andr();

    public aiwu(aiws aiwsVar, ListenableFuture listenableFuture, boolean z) {
        this.f = aiwsVar;
        this.g = listenableFuture;
        this.a = aiwsVar.a;
        this.b = new akbj(new aarj(aiwsVar, 12), andi.a);
        if (z) {
            this.d = new akqq();
        } else {
            this.d = new akqp();
        }
        d(new ahce(this, 16));
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFuture;
        this.d.a();
        alhp.b(alfb.a);
        if (this.i.e()) {
            listenableFuture = this.f.a();
        } else {
            akrh b = this.d.b("Get ".concat(String.valueOf(this.a)));
            try {
                ListenableFuture g = ancj.g(this.i.c(), akto.d(new ahce(this, 17)), andi.a);
                b.b(g);
                b.close();
                listenableFuture = g;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        albo.bJ(this.g);
        return albo.bJ(listenableFuture);
    }

    public final ListenableFuture b(algk algkVar, Executor executor) {
        return c(akto.d(new ahce(algkVar, 15)), executor);
    }

    public final ListenableFuture c(ancs ancsVar, Executor executor) {
        alhp.b(alfb.a);
        akrh b = this.d.b("Update ".concat(String.valueOf(this.a)));
        try {
            ListenableFuture c = this.i.c();
            this.h.b(new aarj(c, 14), andi.a);
            ListenableFuture b2 = this.h.b(akto.c(new mtz((Object) this, c, ancsVar, executor, 9)), andi.a);
            albo.bT(b2, c);
            albo.bJ(this.g);
            ListenableFuture ad = ahmc.ad(b2);
            b.b(ad);
            b.close();
            return ad;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(ancs ancsVar) {
        synchronized (this.c) {
            this.e.add(ancsVar);
        }
    }
}
