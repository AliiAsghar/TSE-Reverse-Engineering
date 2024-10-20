package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezc {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public boolean c;
    private final boolean d;
    private final ExecutorService e;
    private final Future f;
    private final eza g;

    public ezc(ExecutorService executorService, boolean z, eza ezaVar) {
        this.e = executorService;
        this.f = executorService.submit(new kli(1));
        this.d = z;
        this.g = ezaVar;
    }

    private final boolean i() {
        try {
            if (Thread.currentThread() != ((Thread) this.f.get(500L, TimeUnit.MILLISECONDS))) {
                return false;
            }
            return true;
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.g.a(esh.a(exc));
        }
    }

    public final void b(ezb ezbVar) {
        if (i()) {
            try {
                ezbVar.a();
                return;
            } catch (Exception e) {
                a(e);
                return;
            }
        }
        try {
            this.e.submit(new ewq(this, ezbVar, 10, null)).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            a(e2);
        }
    }

    public final void c(ezb ezbVar) {
        dzg.d(!i());
        synchronized (this.a) {
            this.c = true;
            this.b.clear();
        }
        h(ezbVar, false);
        if (this.d) {
            this.e.shutdown();
            if (!this.e.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                this.g.a(new esh("Release timed out. OpenGL resources may not be cleaned up properly."));
            }
        }
    }

    public final void d(ezb ezbVar) {
        e(ezbVar, true);
    }

    public final void e(ezb ezbVar, boolean z) {
        synchronized (this.a) {
            if (this.c && z) {
                return;
            }
            try {
                h(ezbVar, z);
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                a(e);
            }
        }
    }

    public final void f(ezb ezbVar) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.b.add(ezbVar);
            d(new ezb() { // from class: eyz
                @Override // defpackage.ezb
                public final void a() {
                }
            });
        }
    }

    public final void g() {
        try {
            dzg.d(i());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a(e);
        }
    }

    public final void h(ezb ezbVar, boolean z) {
        this.e.submit(new ldv(this, z, ezbVar, 1));
    }
}
