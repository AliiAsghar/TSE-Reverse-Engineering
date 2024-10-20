package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adif implements aijv {
    public static final /* synthetic */ int h = 0;
    private static final long i = TimeUnit.MINUTES.toMillis(1);
    public final actw a;
    public final advp b;
    public long f;
    private final aegu j;
    private final aneo k;
    private final armf m;
    private final AtomicReference l = new AtomicReference();
    private final adhp o = new adhp(this, 6, null);
    private final adhp p = new adhp(this, 5, null);
    public armf c = new msl(14);
    public int d = 180;
    public int e = 180;
    private final AtomicBoolean n = new AtomicBoolean(false);
    public final Collection g = new CopyOnWriteArrayList();

    public adif(aegu aeguVar, Context context, armf armfVar, advp advpVar, aneo aneoVar) {
        this.j = aeguVar;
        this.b = advpVar;
        this.m = armfVar;
        this.k = aneoVar;
        this.a = actw.a(context, advpVar.a.concat(".keep_alive_manager"));
    }

    private final String l() {
        adey a = a();
        if (a == null) {
            return "Unknown Network Interface";
        }
        return String.valueOf(a.h);
    }

    private final void m() {
        this.n.set(true);
        if (yhx.d) {
            DesugarAtomicReference.updateAndGet(this.l, new adie(0));
        } else {
            this.a.b();
        }
    }

    private final void n() {
        i(this.d);
    }

    private final void o(Runnable runnable, long j) {
        this.l.set(this.k.schedule(runnable, j, TimeUnit.SECONDS));
    }

    private final synchronized void p() {
        aikb aikbVar = ((aikc) this.m).a;
        try {
            advr.d(this.b, "Sending keep-alive response on i/f = %s", l());
            try {
                advr.d(aikbVar.c(), "Sending keepAlive response message", new Object[0]);
                aikbVar.f().d(new ainf());
                advr.d(aikbVar.c(), "KeepAliveResponse sent", new Object[0]);
            } catch (aild e) {
                advr.j(e, aikbVar.c(), "Can't send keep alive response", new Object[0]);
                throw e;
            }
        } catch (aild e2) {
            advr.t(e2, this.b, "Sending keep-alive response has failed. Restarting IMS connection.", new Object[0]);
        }
    }

    public final adey a() {
        return (adey) ((Optional) this.c.b()).orElse(null);
    }

    public final void b(adig adigVar) {
        this.g.add(adigVar);
    }

    public final synchronized void c() {
        m();
    }

    public final synchronized void d(int i2) {
        this.d = i2;
        advr.l(this.b, "Enabling keep-alives. Period = %ds", Integer.valueOf(i2));
        n();
    }

    @Override // defpackage.aijv
    public final synchronized void e() {
        advr.d(this.b, "Received keep-alive request on i/f = %s", l());
        p();
        h();
    }

    @Override // defpackage.aijv
    public final synchronized void f() {
        advr.d(this.b, "Received keep-alive response on i/f = %s", l());
        m();
        n();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((adig) it.next()).a();
        }
    }

    public final void g(adig adigVar) {
        this.g.remove(adigVar);
    }

    public final synchronized void h() {
        if (k()) {
            advr.l(this.b, "Resetting keep-alive timer. Next ping in %ds on i/f = %s", Integer.valueOf((int) (this.d * 0.9d)), l());
            this.f = this.j.f().toEpochMilli();
            m();
            n();
        }
    }

    public final void i(int i2) {
        this.n.set(false);
        Thread b = adwy.a().b("keep_alive_sender", this.p, i);
        if (i2 <= 0) {
            advr.r(this.b, "Starting keep-alive immediately. %d", Integer.valueOf(i2));
            b.start();
            return;
        }
        long j = (long) (i2 * 0.9d);
        if (yhx.d) {
            o(this.p, j);
        } else {
            this.a.d(b, j);
        }
    }

    public final synchronized void j() {
        aikb aikbVar = ((aikc) this.m).a;
        if (!aikbVar.u()) {
            if (this.n.get()) {
                advr.d(this.b, "Canceled", new Object[0]);
                return;
            }
            try {
                advr.d(this.b, "Sending keep-alive request on i/f = %s", l());
                if (yhx.d) {
                    o(this.o, adaa.d());
                } else {
                    this.a.d(adwy.a().b("keep_alive_timeout", this.o, i), adaa.d());
                }
                try {
                    advr.d(aikbVar.c(), "Sending keepAlive request message", new Object[0]);
                    aikbVar.f().d(new aine());
                    advr.d(aikbVar.c(), "KeepAliveRequest sent", new Object[0]);
                    this.f = this.j.f().toEpochMilli();
                } catch (aild e) {
                    advr.j(e, aikbVar.c(), "Can't send keep alive", new Object[0]);
                    throw e;
                }
            } catch (Exception e2) {
                advr.t(e2, this.b, "Sending keep-alive request has failed. Restarting IMS connection.", new Object[0]);
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((adig) it.next()).c();
                }
            }
        }
    }

    public final boolean k() {
        if (yhx.d) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) this.l.get();
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                return true;
            }
            return false;
        }
        return this.a.e();
    }
}
