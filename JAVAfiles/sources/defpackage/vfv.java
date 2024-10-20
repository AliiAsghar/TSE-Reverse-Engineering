package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfv implements vfp {
    public static final utz a = uuh.c(uuh.b, "ditto_bind_retry_timeout_exponent", 2.0d);
    static final utz b = uuh.e(uuh.b, "max_foreground_bind_retry_exponent", 3);
    public static final alvi c = alvi.m("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl");
    public final int A;
    public final boolean B;
    public final boolean C;
    public final vgt D;
    public final int E;
    public final wpp F;
    private final anen G;
    private final int H;
    private final int I;
    public final vcy d;
    public final armf e;
    public final armf f;
    public final xnv g;
    public final aksr h;
    public final armf i;
    public vfu l;
    public ScheduledFuture n;
    public ScheduledFuture o;
    public ScheduledFuture p;
    public ScheduledFuture s;
    public final armf t;
    public final mbl u;
    public final armf v;
    public final aneo w;
    public final vba x;
    public final Optional y;
    public final Optional z;
    public final AtomicInteger j = new AtomicInteger();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final Object m = new Object();
    public Instant q = Instant.MAX;
    public Set r = new HashSet();

    public vfv(wpp wppVar, armf armfVar, armf armfVar2, mbl mblVar, armf armfVar3, aneo aneoVar, anen anenVar, armf armfVar4, xnv xnvVar, aksr aksrVar, armf armfVar5, vgt vgtVar, vcy vcyVar, vba vbaVar, int i, Optional optional, Optional optional2, int i2, int i3, int i4, boolean z, boolean z2) {
        this.e = armfVar;
        this.d = vcyVar;
        this.F = wppVar;
        this.t = armfVar2;
        this.u = mblVar;
        this.v = armfVar3;
        this.w = aneoVar;
        this.G = anenVar;
        this.f = armfVar4;
        this.g = xnvVar;
        this.h = aksrVar;
        this.i = armfVar5;
        this.D = vgtVar;
        this.x = vbaVar;
        this.E = i;
        this.y = optional;
        this.z = optional2;
        this.H = i2;
        this.I = i3;
        this.A = i4;
        this.B = z;
        this.C = z2;
    }

    private final void l() {
        synchronized (this.m) {
            ScheduledFuture scheduledFuture = this.p;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.p.cancel(false);
                this.p = null;
            }
        }
    }

    private final void m() {
        synchronized (this.m) {
            this.q = Instant.MAX;
            ScheduledFuture scheduledFuture = this.o;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.o.cancel(false);
                this.o = null;
            }
        }
    }

    @Override // defpackage.vfp
    public final akul a() {
        alvw g = c.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startIfNotStarted", 227, "BindHandlerImpl.java")).t("%s BindHandler: Start a new bind session and stream immediately, if it is not currently started.", akec.aD(this.E));
        this.j.set(0);
        return e(true);
    }

    @Override // defpackage.vfp
    public final void b() {
        aktp.ai(new vib(this, 1), this.G);
    }

    @Override // defpackage.vfp
    public final void c() {
        synchronized (this.m) {
            alvw g = c.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "stop", 445, "BindHandlerImpl.java")).t("%s BindHandler: Stopping the bind session because stop() is explicitly called.", akec.aD(this.E));
            vfu vfuVar = this.l;
            if (vfuVar != null) {
                vfuVar.d();
            }
            j();
        }
    }

    @Override // defpackage.vfp
    public final akul d(String str) {
        if (this.z.isPresent() && !TextUtils.isEmpty(str)) {
            return a().h(new uvz(this, str, 12), this.w);
        }
        return a();
    }

    public final akul e(boolean z) {
        akul k;
        int i = 0;
        if (this.k.getAndSet(false)) {
            alvw g = c.g();
            g.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 379, "BindHandlerImpl.java")).t("%s BindHandler: Forcing a RegisterRefresh due to a previous Unauthenticated error", akec.aD(this.E));
            k = this.x.l(vaz.FORCE_REFRESH);
        } else {
            k = this.x.k();
        }
        return k.h(new vfq(this, z, i), this.G);
    }

    public final void f() {
        synchronized (this.m) {
            if (this.s == null) {
                alvw i = c.i();
                i.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 341, "BindHandlerImpl.java")).q("Future is null in completeOrRescheduleMessageIdCheckCallback");
            }
            if (this.r.isEmpty()) {
                alvw d = c.d();
                d.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 344, "BindHandlerImpl.java")).q("Will not reschedule pull because there is no more ID to check");
                this.s = null;
            } else {
                alvw g = c.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 347, "BindHandlerImpl.java")).t("%s BindHandler: rescheduling a pull", akec.aD(this.E));
                this.s = this.w.schedule(new uql(this, 6), ((Integer) vbh.l.e()).intValue(), TimeUnit.SECONDS);
            }
        }
    }

    public final void g() {
        synchronized (this.m) {
            l();
            this.p = this.w.schedule(new uql(this, 8), this.H, TimeUnit.SECONDS);
        }
    }

    public final void h() {
        synchronized (this.m) {
            m();
            this.q = this.g.f().plus(Duration.ofSeconds(this.I));
            this.o = this.w.schedule(new uql(this, 5), this.I, TimeUnit.SECONDS);
        }
    }

    public final void i() {
        synchronized (this.m) {
            if (this.l != null) {
                alvw g = c.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStream", 458, "BindHandlerImpl.java")).t("%s BindHandler: Shutting down response observer", akec.aD(this.E));
                this.l = null;
                l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [vcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [vcu, java.lang.Object] */
    public final void j() {
        synchronized (this.m) {
            i();
            m();
            if (this.y.isPresent()) {
                alvw g = c.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStreamAndSession", 472, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has ended.", akec.aD(this.E));
                Object obj = this.y.get();
                ((vjs) obj).a.b();
                ((vjs) obj).a.a();
            }
            ScheduledFuture scheduledFuture = this.s;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.s.cancel(false);
            }
            this.s = null;
        }
    }

    public final void k() {
        synchronized (this.m) {
            alvi alviVar = c;
            alvw d = alviVar.d();
            d.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 544, "BindHandlerImpl.java")).t("%s BindHandler: IdleWatchdog triggered.", akec.aD(this.E));
            if (((xym) this.f.b()).a) {
                alvw g = alviVar.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 547, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered but app is still in the foreground. Extend the time.", akec.aD(this.E));
                h();
                return;
            }
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 555, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered and app is in background. Close the stream and session.", akec.aD(this.E));
            vfu vfuVar = this.l;
            if (vfuVar != null) {
                vfuVar.d();
            }
            j();
        }
    }
}
