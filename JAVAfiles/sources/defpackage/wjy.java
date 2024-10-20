package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjy implements wjr {
    public static final advp a = new advp("provisioning");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler");
    public static final utz c = uuh.e(uuh.b, "expeditedApiRetryLimit", 0);
    public final armf d;
    private final Context e;
    private final armf f;
    private final xyt g;
    private final anen h;
    private final armf i;
    private final xnv j;
    private final armf k;
    private final adwu l;
    private gsi m;
    private final wwn n;
    private final anen o;
    private final armf p;
    private final vyv q;

    public wjy(Context context, armf armfVar, armf armfVar2, vyv vyvVar, xyt xytVar, anen anenVar, armf armfVar3, xnv xnvVar, armf armfVar4, adwu adwuVar, wwn wwnVar, anen anenVar2, armf armfVar5) {
        this.e = context;
        this.f = armfVar;
        this.d = armfVar2;
        this.q = vyvVar;
        this.g = xytVar;
        this.h = anenVar;
        this.i = armfVar3;
        this.j = xnvVar;
        this.k = armfVar4;
        this.l = adwuVar;
        this.n = wwnVar;
        this.o = anenVar2;
        this.p = armfVar5;
    }

    private final void n(final String str, final long j, final boolean z, final gso gsoVar, final amww amwwVar) {
        qiu.h(aktp.ah(new Runnable() { // from class: wjx
            @Override // java.lang.Runnable
            public final void run() {
                wjy.this.m(str, j, z, gsoVar, amwwVar);
            }
        }, this.h));
    }

    private final void o(String str, long j, gso gsoVar, boolean z, amww amwwVar) {
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        gsf a2 = gsdVar.a();
        gsz gszVar = new gsz(RcsProvisioningListenableWorker.class);
        gszVar.f(a2);
        gszVar.h(Duration.ofSeconds(j));
        gszVar.e(gry.EXPONENTIAL, ((Integer) wjo.b.e()).intValue(), TimeUnit.SECONDS);
        gszVar.c("provisioning");
        String uuid = UUID.randomUUID().toString();
        armf armfVar = this.p;
        wwz a3 = this.n.a();
        if (!((okr) armfVar.b()).a() && !str.equals(a3.c)) {
            try {
                throw new IllegalArgumentException("Submitting provisioning task for non-default system SIM.");
            } catch (IllegalArgumentException e) {
                ((alvg) ((alvg) ((alvg) b.i()).g(e)).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "submitProvisioningTask", (char) 500, "RcsProvisioningWorkManagerScheduler.java")).q("RcsProvisioningWorkManagerScheduler: Submitting provisioning task for non-default system SIM.");
            }
        }
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.q("scheduled_time_sec", Duration.ofMillis(this.j.f().toEpochMilli()).plusSeconds(j).getSeconds());
        hgiVar.o("is_config_refresh", z);
        hgiVar.p("trigger_event", amwwVar.aa);
        hgiVar.n("worker_id", uuid);
        hgiVar.n("rcs_provisioning_id", str);
        hgiVar.o("use_sim_subscription_info", true);
        gsi j2 = hgiVar.j();
        this.m = j2;
        gszVar.i(j2);
        if (((wjz) this.k.b()).a(str) < ((Integer) c.e()).intValue()) {
            gszVar.b(gtf.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        }
        String valueOf = String.valueOf(str);
        advr.l(a, "Scheduled provisioning task with %s seconds delay, %s policy, trigger is %s, workerId is %s, simId is %s", Long.valueOf(j), gsoVar, amwwVar.name(), uuid, advq.SIM_ID.c(str));
        gvf.ar(this.e).k("provisioning_".concat(valueOf), gsoVar, gszVar.j()).a();
    }

    @Override // defpackage.wjr
    public final akul a(amww amwwVar) {
        advr.k("RcsAvailabilityLogWorkerScheduler is cancelled", new Object[0]);
        qiu.h(akul.g(((gte) gvf.ar((Context) this.q.a).b("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker")).c));
        return akul.g(((gte) gvf.ar(this.e).a("provisioning")).c).h(new whg(amwwVar, 12), this.h);
    }

    @Override // defpackage.wjr
    public final akul b() {
        return akul.g(((aogy) this.i.b()).p("revoke_google_tos_consent_user_disabled")).h(new whf(14), this.o);
    }

    @Override // defpackage.wjr
    public final akul c(amww amwwVar) {
        return a(amwwVar).h(new whh(this, amwwVar, 6, null), this.h);
    }

    @Override // defpackage.wjr
    public final akul d(adiw adiwVar, amww amwwVar) {
        advr.l(a, "Restart provisioning: %s", amwwVar);
        return a(amwwVar).h(new way(this, adiwVar, amwwVar, 4, (char[]) null), this.h);
    }

    @Override // defpackage.wjr
    public final void e(String str, Duration duration, amww amwwVar) {
        f(str, duration, false, amwwVar);
    }

    @Override // defpackage.wjr
    public final void f(String str, Duration duration, boolean z, amww amwwVar) {
        gso gsoVar;
        advr.k("Scheduled config refresh with %s seconds delay, %s appendIfExists", Long.valueOf(duration.getSeconds()), Boolean.valueOf(z));
        long seconds = duration.getSeconds();
        if (z) {
            gsoVar = gso.APPEND;
        } else {
            gsoVar = gso.KEEP;
        }
        n(str, seconds, true, gsoVar, amwwVar);
    }

    @Override // defpackage.wjr
    public final void g(String str, amww amwwVar, boolean z) {
        if (aczf.C()) {
            advr.l(a, "Schedule DisableRcsTask due to trigger = %s, forceDisableThenReprovision = %s", amwwVar.name(), Boolean.valueOf(z));
            aogy aogyVar = (aogy) this.i.b();
            gsd gsdVar = new gsd();
            gsdVar.c(2);
            gsf a2 = gsdVar.a();
            hgi hgiVar = new hgi((char[]) null);
            hgiVar.o("force_disable_then_reprovision", z);
            hgiVar.n("sim_id", str);
            gsi j = hgiVar.j();
            akct a3 = akcx.a(wjp.class);
            a3.b(a2);
            a3.d = new akcv(0L, TimeUnit.SECONDS);
            a3.e(new akcw("disable_rcs".concat(String.valueOf(str)), 2));
            a3.f = j;
            akul.g(aogyVar.r(a3.a())).k(qiu.b(), this.h);
        }
    }

    @Override // defpackage.wjr
    public final void h(String str, String str2, amww amwwVar) {
        aogy aogyVar = (aogy) this.i.b();
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        gsf a2 = gsdVar.a();
        akct a3 = akcx.a(wjq.class);
        a3.b(a2);
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.n("sim_id", str);
        a3.f = hgiVar.j();
        a3.d = new akcv(0L, TimeUnit.SECONDS);
        a3.e(new akcw("notify_rcs_unavailable".concat(String.valueOf(str)), 2));
        akul.g(aogyVar.r(a3.a())).k(qiu.b(), this.h);
        ((alvg) ((alvg) b.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "scheduleNotifyRcsUnavailableTask", 160, "RcsProvisioningWorkManagerScheduler.java")).D("Scheduling NotifyRcsUnavailable task due to %s, the trigger is %s", str2, amwwVar.name());
    }

    @Override // defpackage.wjr
    public final void i(amww amwwVar) {
        j(((adtn) this.d.b()).l(), amwwVar);
    }

    @Override // defpackage.wjr
    public final void j(String str, amww amwwVar) {
        if (!amwwVar.equals(amww.REPROVISIONING_CAMPAIGN) && !amwwVar.equals(amww.FI_ACTIVATION_COMPLETE)) {
            l(str, Duration.ZERO, 1, amwwVar);
        } else {
            l(str, Duration.ZERO, 2, amwwVar);
        }
    }

    @Override // defpackage.wjr
    public final void k(boolean z, amww amwwVar) {
        akcx a2;
        advr.c("RevokeGoogleConsentTask scheduled, isDisabled = %s, trigger = %s", Boolean.valueOf(z), amwwVar.name());
        aogy aogyVar = (aogy) this.i.b();
        hgi hgiVar = new hgi((char[]) null);
        hgiVar.o("is_disabled_by_user", z);
        gsi j = hgiVar.j();
        if (z && aczv.J()) {
            akct a3 = akcx.a(wka.class);
            gsd gsdVar = new gsd();
            gsdVar.c(2);
            a3.b(gsdVar.a());
            a3.d = new akcv(((Long) aczv.s().a.as.a()).longValue(), TimeUnit.MINUTES);
            a3.e(new akcw("revoke_google_tos_consent_user_disabled", 2));
            a3.f = j;
            a2 = a3.a();
        } else {
            akct a4 = akcx.a(wka.class);
            gsd gsdVar2 = new gsd();
            gsdVar2.c(2);
            a4.b(gsdVar2.a());
            a4.d = new akcv(0L, TimeUnit.SECONDS);
            a4.e(new akcw("revoke_google_tos_consent", 2));
            a4.f = j;
            a2 = a4.a();
        }
        akul.g(aogyVar.r(a2)).k(qiu.b(), this.h);
    }

    @Override // defpackage.wjr
    public final void l(String str, Duration duration, int i, amww amwwVar) {
        gso gsoVar;
        long seconds = duration.getSeconds();
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                gsoVar = gso.KEEP;
            } else {
                gsoVar = gso.APPEND;
            }
        } else {
            gsoVar = gso.REPLACE;
        }
        n(str, seconds, false, gsoVar, amwwVar);
    }

    public final void m(String str, long j, boolean z, gso gsoVar, amww amwwVar) {
        adiw adiwVar = new adiw(str);
        Integer num = (Integer) this.n.j(new adiw(adiwVar.a)).map(new wga(14)).orElse(-1);
        int intValue = num.intValue();
        adwl a2 = this.l.a(intValue);
        if (Objects.equals(a2, adwl.DUAL_REG)) {
            if (TextUtils.isEmpty(adiwVar.a)) {
                adiwVar = new adiw(((adtn) this.d.b()).l());
            }
            if (aczf.C()) {
                this.q.n();
            }
            if (!aczf.C()) {
                advr.l(a, "Provisioning task in Bugle is disabled by P/H flag", new Object[0]);
                return;
            }
            if (!z && ((adnk) this.f.b()).f(adiwVar.a).p()) {
                if (amwwVar.equals(amww.FI_ACTIVATION_COMPLETE) && yhx.h) {
                    wke.b(this.e, 4, intValue);
                }
                advr.l(a, "Skipping full provisioning scheduling since we already have valid and updated RCS configuration", new Object[0]);
                return;
            }
            if (new adjl(((vrn) this.g.a()).w(adiwVar)).d()) {
                if (amwwVar.equals(amww.FI_ACTIVATION_COMPLETE) && yhx.h) {
                    wke.b(this.e, 3, intValue);
                }
                advr.l(a, "Skipping provisioning scheduling since RCS is disabled", new Object[0]);
                return;
            }
            if (amwwVar.equals(amww.FI_ACTIVATION_COMPLETE) && yhx.h) {
                wke.b(this.e, 2, intValue);
            }
            if (TextUtils.isEmpty(str)) {
                o(((adtn) this.d.b()).l(), j, gsoVar, z, amwwVar);
                return;
            } else {
                o(str, j, gsoVar, z, amwwVar);
                return;
            }
        }
        advr.l(a, "Skipping DR provisioning scheduling, sipConnectionType:%s subId: %d", a2.name(), num);
    }
}
