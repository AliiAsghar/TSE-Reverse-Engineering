package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adou {
    public final adew a;
    public final CopyOnWriteArrayList b;
    public final adpf c;
    public final adpm d;
    public adwe e;
    public final adqg f;
    private int g = 1;

    /* JADX INFO: Access modifiers changed from: protected */
    public adou(adew adewVar, adqg adqgVar, adwe adweVar) {
        new ArrayList();
        this.b = new CopyOnWriteArrayList();
        this.a = adewVar;
        this.f = adqgVar;
        this.c = new adpf(((adet) adewVar).k);
        this.d = new adpm();
        this.e = adweVar;
    }

    private final boolean p() {
        if (this.g == 2) {
            return true;
        }
        return false;
    }

    public final String a() {
        return this.a.e();
    }

    public final void b() {
        if (l()) {
        } else {
            throw new IllegalStateException("Service not started!");
        }
    }

    public final void c(adoz adozVar) {
        TimerTask timerTask = (TimerTask) ((ConcurrentHashMap) this.f.a).remove(adozVar);
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public final void d(acok acokVar) {
        for (adoz adozVar : this.f.c(this)) {
            o(adozVar, acokVar);
            advr.c("Stopped session: %s", adozVar.k);
        }
    }

    public final void h(adoz adozVar, int i, boolean z) {
        advr.c("Starting task for session refresh: %s interval: %s", advq.URI.c(adozVar.y()), Integer.valueOf(i));
        adqg adqgVar = this.f;
        adpa adpaVar = new adpa(adqgVar, adozVar, z);
        ((ConcurrentHashMap) adqgVar.a).put(adozVar, adpaVar);
        int i2 = i * 1000;
        if (z) {
            i2 -= i2 / 10;
        }
        ((Timer) adqgVar.b).schedule(adpaVar, i2);
    }

    public final void i(adoz adozVar) {
        adqg adqgVar = this.f;
        synchronized (adqgVar.c) {
            advr.c("Remove session %s", adozVar.k);
            adoz adozVar2 = (adoz) ((ConcurrentHashMap) adqgVar.c).remove(adozVar.k);
            if (adozVar2 != adozVar) {
                advr.q("Removed session is not the expected session. Removed: %s \n ---- \n Expected: %s", adozVar2, adozVar);
                if (adozVar2 != null) {
                    adqgVar.d(adozVar2);
                }
            }
            adqgVar.d(adozVar);
        }
    }

    public final synchronized void j() {
        if (l()) {
            advr.k("Service already started", new Object[0]);
            return;
        }
        if (p()) {
            advr.q("Service starting", new Object[0]);
            return;
        }
        this.g = 2;
        advr.c("Starting service: %s", getClass().getName());
        try {
            f();
            if (this.g != 2) {
                return;
            }
            this.g = 3;
            try {
                e();
            } catch (Exception e) {
                advr.i(e, "Error while starting service: %s", e.getMessage());
            }
        } catch (Exception e2) {
            advr.i(e2, "Error while starting service: %s", e2.getMessage());
            this.g = 1;
        }
    }

    public final synchronized void k(acok acokVar) {
        if (!l() && !p()) {
            advr.q("Service not started or starting", new Object[0]);
            return;
        }
        this.g = 4;
        advr.c("Stopping service: %s", getClass().getName());
        try {
            g(acokVar);
        } catch (Exception e) {
            advr.g("Error while stopping service: %s", e.getMessage());
        }
        d(acokVar);
        this.g = 1;
    }

    public final boolean l() {
        if (this.g == 3) {
            return true;
        }
        return false;
    }

    public abstract void m();

    public abstract void n();

    protected void o(adoz adozVar, acok acokVar) {
        try {
            advr.c("Stopping session: %s", adozVar.k);
            adozVar.n(2, adon.a(acokVar));
        } catch (Exception e) {
            advr.i(e, "Error while stopping session: %s", e.getMessage());
        }
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g(acok acokVar) {
    }
}
