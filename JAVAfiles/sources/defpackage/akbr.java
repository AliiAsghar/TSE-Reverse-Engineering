package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbr extends akbo implements emx {
    public static final alvi a = alvi.m("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private final boolean b;
    private akbs c;
    private final armf d;
    private final eoz e;
    private final enh f;
    private final akbq g = new akbq();
    private boolean h = false;
    private boolean i = false;
    private final Set j = new HashSet();

    public akbr(armf armfVar, eoz eozVar, enh enhVar) {
        this.d = armfVar;
        this.e = eozVar;
        enhVar.c(this);
        this.f = enhVar;
        this.b = true;
    }

    private final void l() {
        if (!this.b) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                this.c.c((akbp) it.next());
            }
            this.j.clear();
        }
        this.i = true;
        aiut.f(this.g);
        this.g.a.clear();
        this.g.b = null;
        this.h = true;
        akbs akbsVar = this.c;
        akbsVar.e = true;
        akbsVar.b.g();
        for (akbu akbuVar : akbsVar.c) {
            if (!akbuVar.b) {
                akbs.a((akbp) akbsVar.b.b(akbuVar.a), akbuVar);
            } else {
                try {
                    akbsVar.b.b(akbuVar.a);
                } catch (NullPointerException e) {
                    throw new IllegalStateException("future=".concat(String.valueOf(String.valueOf(akbuVar))), e);
                }
            }
            akbuVar.c(akbsVar);
        }
    }

    @Override // defpackage.akbo
    protected final void a(ListenableFuture listenableFuture, Object obj, akbp akbpVar) {
        aiut.c();
        albo.U(!((da) this.d.b()).ab(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        akrl akrlVar = akrt.a;
        akry c = akqj.c();
        if (c != null) {
            akri j = c.j(akrt.b);
            if (j.b() && ((Boolean) j.a()).booleanValue()) {
                StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.c.b(listenableFuture, obj, akbpVar);
        if (!this.h) {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            ((alvg) ((alvg) ((alvg) a.i()).g(th)).h("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 227, "FuturesMixinImpl.java")).q("listen() called outside listening window");
            this.g.a.add(akbpVar);
            this.g.b = akto.j(new zth(19));
            akbq akbqVar = this.g;
            aiut.f(akbqVar);
            aiut.e(akbqVar);
        }
    }

    @Override // defpackage.akbo
    public final void b(akbp akbpVar) {
        aiut.c();
        albo.U(!this.i, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        albo.U(!this.f.a().a(eng.STARTED), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        albo.U(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        if (this.b) {
            akbs akbsVar = this.c;
            if (akbsVar != null) {
                akbsVar.c(akbpVar);
                return;
            } else {
                this.j.add(akbpVar);
                return;
            }
        }
        this.j.add(akbpVar);
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        this.c = (akbs) new eoy(this.e).a(akbs.class);
        if (this.b) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                this.c.c((akbp) it.next());
            }
            this.j.clear();
        }
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        akbs akbsVar = this.c;
        albo.U(!akbsVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        akbsVar.b.c();
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        if (!this.h) {
            l();
        }
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        albo.U(!this.h, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        l();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        if (this.h) {
            akbs akbsVar = this.c;
            akbsVar.e = false;
            Iterator it = akbsVar.c.iterator();
            while (it.hasNext()) {
                ((akbu) it.next()).c(null);
            }
            this.h = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.akbo
    public final void k(ahlp ahlpVar, ahlp ahlpVar2, akbp akbpVar) {
        aiut.c();
        albo.U(!((da) this.d.b()).ab(), "Listen called outside safe window. State loss is possible.");
        this.c.b(ahlpVar.a, ahlpVar2.a, akbpVar);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }
}
