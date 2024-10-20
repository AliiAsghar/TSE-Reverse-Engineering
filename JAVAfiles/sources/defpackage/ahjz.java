package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjz implements Executor, ahlo {
    public final aneo a;
    private final ahlp b;
    private final armf e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public ahjz(aneo aneoVar, ahlp ahlpVar, armf armfVar) {
        this.a = aneoVar;
        this.b = ahlpVar;
        this.e = armfVar;
        Object obj = ((ahlp) ahlpVar.a).a;
        int i = ahlq.c;
        if (((ahlq) obj).b.get() > 0) {
            k();
        } else {
            ahlpVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                this.a.execute(runnable);
            } else {
                return;
            }
        }
    }

    private final void k() {
        this.a.schedule(new aaze(this, 20), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ahlo
    public final void d(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else if (!this.f.getAndSet(true)) {
            if (((Boolean) ((algw) ((apxx) this.e).a).d(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new akjs(this, 1));
            } else {
                this.a.schedule(new aaze(this, 19), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
