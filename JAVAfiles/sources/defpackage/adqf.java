package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqf extends adpw {
    private static final long p = TimeUnit.MINUTES.toMillis(1);
    public final adrx i;
    public final Map j;
    public final yjr k;
    public final adpu l;
    public final adqg m;
    public final adta n;
    public final adqg o;
    private final actw q;
    private volatile int r;
    private final Runnable s;
    private final ahjj t;

    public adqf(adew adewVar, adqg adqgVar, adqa adqaVar, adqg adqgVar2, adrx adrxVar, Context context, yjr yjrVar, adpu adpuVar, adwe adweVar, adqg adqgVar3, adta adtaVar) {
        super(adewVar, adqgVar, adqaVar, adweVar);
        this.j = new ConcurrentHashMap();
        this.r = 0;
        this.s = new adqe(this);
        ahjj ahjjVar = new ahjj(this, (byte[]) null);
        this.t = ahjjVar;
        this.i = adrxVar;
        adrxVar.g.add(ahjjVar);
        this.o = adqgVar2;
        this.q = actw.a(context, "capability_publishing");
        this.k = yjrVar;
        this.l = adpuVar;
        this.m = adqgVar3;
        this.n = adtaVar;
    }

    @Override // defpackage.adou
    public final void e() {
        w(0L);
    }

    @Override // defpackage.adou
    public final void g(acok acokVar) {
        try {
            this.q.b();
            v();
            advr.c("Unpublishing presence capabilities for %s", advq.USER_ID.c(this.a.c().mUserName));
            adrx adrxVar = this.i;
            adrxVar.b();
            adop adopVar = adrxVar.j;
            if (adopVar != null) {
                try {
                    if (adopVar.i != 1) {
                        adopVar.i = 1;
                        adopVar.e = 0;
                        adopVar.d.a();
                        try {
                            aikb aikbVar = ((aikc) adopVar.a).a;
                            aikbVar.d(adopVar.b.d(aikbVar, adopVar.d, adopVar.c, adopVar.e, adopVar.g, null, new byte[0]), adopVar.h);
                        } catch (aild e) {
                            advr.i(e, "Error while creating sip request: %s", e.getMessage());
                            adopVar.i = 3;
                        }
                    } else {
                        throw new IllegalStateException("unpublish() cannot be called in the PENDING state!");
                    }
                } catch (Exception e2) {
                    throw new adry("Error while unpublishing presence: ".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
        } catch (adry e3) {
            advr.g("Can't send un-Publish for Presence: %s", e3.getMessage());
        }
        this.j.clear();
    }

    @Override // defpackage.adpw
    public final void s(String str, long j, String str2) {
        if (str2 != null) {
            advr.c("Adding pending request for presence capability for %s", advq.PHONE_NUMBER.c(str2));
            this.j.put(str2, new adta(Long.valueOf(j)));
            try {
                adrx adrxVar = this.i;
                try {
                    adrz adrzVar = adrxVar.i;
                    if (adrzVar != null) {
                        adrzVar.j(adrxVar.p);
                    }
                    adrxVar.i = new adrz(adrxVar, adrxVar.h, adwf.l(str2, adrxVar.a.c(), adrxVar.l), adrxVar.e);
                    adrz adrzVar2 = adrxVar.i;
                    adrzVar2.e = "application/pidf+xml, application/rlmi+xml, multipart/related";
                    adrzVar2.j = 0;
                    adrzVar2.k = agkx.W().longValue();
                    adrxVar.i.d(adrxVar.p);
                    adrxVar.i.o();
                    return;
                } catch (Exception e) {
                    throw new adry("Error while sending presence subscription ", e);
                }
            } catch (adry unused) {
                throw new aild("Error requesting presence capability for ".concat(String.valueOf(advq.PHONE_NUMBER.c(str2))));
            }
        }
        throw new IllegalArgumentException("MSISDN must not be null.");
    }

    @Override // defpackage.adpw
    public final void t(String str) {
        if (this.j.containsKey(str)) {
            advr.c("Presence Capabilities request for %s already pending", advq.PHONE_NUMBER.c(str));
        } else {
            s(null, 0L, str);
        }
    }

    public final synchronized long u() {
        int i;
        i = this.r;
        this.r = i + 1;
        return acoj.a[Math.min(i, 15)] / 1000;
    }

    public final void v() {
        advr.c("Resetting retry counter for publishing capabilities", new Object[0]);
        this.r = 0;
    }

    public final void w(long j) {
        advr.c("Scheduling publishing of capabilities with delay %d", Long.valueOf(j));
        Thread b = adwy.a().b("capability_publishing", this.s, p);
        if (this.q.e()) {
            advr.c("Cancelling alarm timer before starting a new schedule", new Object[0]);
            this.q.b();
        }
        advr.c("Scheduling the capability publishing thread", new Object[0]);
        this.q.d(b, j);
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
