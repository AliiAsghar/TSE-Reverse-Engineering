package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqi implements adpv {
    public final acqq c;
    public final acrd d;
    public final aduu e;
    public final adpu f;
    public adew g;
    public adpw h;
    public volatile boolean i;
    public CapabilityConfiguration j;
    public Thread k;
    public int p;
    public final actw r;
    private Timer w;
    public static final acyz a = acyy.b("disable_ims_contacts_discovery_in_single_reg");
    private static final acyz t = acyy.b("query_registration_state_to_ims_registration_controller");
    public static final acyz b = acyy.b("disable_address_book_scan");
    private static final int u = a() + 1;
    private int x = 1;
    private final Object v = new Object();
    public final Object l = new Object();
    public final Object m = new Object();
    public final HashMap n = new HashMap(u, 1.0f);
    public final AtomicInteger o = new AtomicInteger();
    public final AtomicLong q = new AtomicLong();
    public final ahjj s = new ahjj(this, (byte[]) null);

    public acqi(Context context, acqq acqqVar, acrd acrdVar, aduu aduuVar, adpu adpuVar) {
        this.r = actw.a(context, "RCS.imscontacts_discovery");
        this.c = acqqVar;
        this.d = acrdVar;
        this.e = aduuVar;
        this.f = adpuVar;
    }

    public static int a() {
        if (Runtime.getRuntime().availableProcessors() > 1) {
            return 5;
        }
        return 2;
    }

    private final void m() {
        this.r.b();
        synchronized (this.m) {
            this.m.notifyAll();
        }
        synchronized (this.l) {
            Thread thread = this.k;
            if (thread != null) {
                thread.interrupt();
                this.k = null;
            }
        }
    }

    private final void n(String str, int i, adpo adpoVar) {
        this.c.e(str, i, adpoVar);
    }

    private final boolean o(String str) {
        int i;
        if (this.k != null) {
            synchronized (this.v) {
                i = this.x;
            }
            if (i == 3) {
                synchronized (this.m) {
                    if (!this.n.containsKey(str)) {
                        return false;
                    }
                    Long l = (Long) this.n.get(str);
                    long longValue = l.longValue();
                    this.n.remove(str);
                    if (this.q.get() > longValue && !this.n.containsValue(l)) {
                        this.o.incrementAndGet();
                        advr.c("Discovery progress %d/%d contacts", Integer.valueOf(this.o.get()), Integer.valueOf(this.p));
                    }
                    if (a() > this.n.size()) {
                        this.m.notify();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        g();
        m();
    }

    public final void c() {
        advr.o("Scheduling immediate discovery", new Object[0]);
        synchronized (this.l) {
            if (this.k != null) {
                m();
            }
            Thread thread = new Thread(new acqc(this), "ImsContactsDiscovery");
            this.k = thread;
            thread.start();
        }
    }

    public final void d() {
        advr.o("Scheduling discovery according to polling period", new Object[0]);
        if (this.g == null) {
            advr.o("IMS module not initialized.", new Object[0]);
            return;
        }
        if (!i()) {
            advr.o("No polling period defined - will wait for the next explicit update", new Object[0]);
            return;
        }
        CapabilityConfiguration capabilityConfiguration = this.j;
        capabilityConfiguration.getClass();
        long j = capabilityConfiguration.mPollingPeriod;
        if (this.k != null) {
            m();
        }
        Thread thread = new Thread(new acqg(this), "ImsContactsDiscovery");
        this.k = thread;
        this.r.d(thread, j);
    }

    public final void e(acqd acqdVar) {
        if (this.w == null) {
            this.w = new Timer("DiscoveryCallbackTimer");
        }
        this.w.schedule(acqdVar, 50L);
    }

    public final void f() {
        advr.o("IMS discovery shut down request.", new Object[0]);
        if (this.i) {
            advr.o("IMS discovery already shut down or shutting down, request ignored.", new Object[0]);
            return;
        }
        synchronized (this.l) {
            this.i = true;
            acrd acrdVar = this.d;
            acrdVar.d.remove(this.s);
            this.r.b();
            b();
        }
    }

    public final void g() {
        Timer timer = this.w;
        if (timer != null) {
            timer.cancel();
            this.w = null;
        }
    }

    @Deprecated
    public final boolean h() {
        adew adewVar = this.g;
        if (adewVar == null) {
            return false;
        }
        if (((Boolean) t.a()).booleanValue()) {
            adfa adfaVar = ((adet) adewVar).b;
            if (adfaVar == null || !adfaVar.l()) {
                return false;
            }
            return true;
        }
        Optional r = adcx.r(adewVar);
        if (!r.isPresent() || !((adex) r.get()).c) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        CapabilityConfiguration capabilityConfiguration = this.j;
        if (capabilityConfiguration != null && capabilityConfiguration.mPollingPeriod > 0) {
            return true;
        }
        return false;
    }

    public final void j(int i) {
        synchronized (this.v) {
            this.x = i;
        }
    }

    @Override // defpackage.adpv
    public final void k(long j, String str, adpo adpoVar) {
        if (adpoVar.y()) {
            if (o(str)) {
                n(str, 2, adpoVar);
            }
        } else if (o(str)) {
            n(str, 1, null);
        }
    }

    @Override // defpackage.adpv
    public final void l(long j, String str) {
        advr.c("onCapabilitiesUpdateError %s", advq.PHONE_NUMBER.c(str));
        o(str);
    }
}
