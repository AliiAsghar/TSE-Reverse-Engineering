package defpackage;

import android.content.Context;
import android.os.Message;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlj extends adll {
    actw a;
    public final /* synthetic */ adlw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlj(adlw adlwVar) {
        super(adlwVar);
        this.b = adlwVar;
    }

    private final void q(long j) {
        this.b.D(apjx.RETRY_STAGE);
        adlw adlwVar = this.b;
        adnt adntVar = adlwVar.A;
        Optional p = adlwVar.p();
        if (!adntVar.i(adntVar.e(p))) {
            adntVar.r(new adnp((int) j, 0), adntVar.e(p));
        }
        this.b.aB(5);
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, adjm] */
    private final void r(long j) {
        adlw adlwVar = this.b;
        long h = adlwVar.h(adlwVar.s, adlwVar.n);
        this.b.D.d("scheduleRetry, currentRetry = %s, retryMillis = %s", Long.valueOf(h), Long.valueOf(j));
        long currentTimeMillis = System.currentTimeMillis() + j;
        adlw adlwVar2 = this.b;
        adlwVar2.O(adlwVar2.s, adlwVar2.n, currentTimeMillis);
        if (this.b.K.isPresent()) {
            s(this.b.n);
            q(-1L);
            this.b.K.get().o(4, this.b.n);
        } else {
            actw a = actw.a(this.b.s, "PROVISIONING_RETRY_TIMER");
            this.a = a;
            a.d(new Thread(new adhp(this, 8)), j / 1000);
            q(h);
        }
    }

    private final void s(String str) {
        if (((acxv) this.b.N.b()).a()) {
            aday adayVar = (aday) this.b.O.b();
            adayVar.j(str).edit().putInt("provisioning_engine_retry_count_key", adayVar.h(str) + 1).commit();
        } else {
            adlw adlwVar = this.b;
            adnu.a();
            Context context = adlwVar.s;
            adnu.e(context, str).edit().putInt("provisioning_engine_retry_count_key", adnu.n(context, str) + 1).commit();
        }
        adlw adlwVar2 = this.b;
        adlwVar2.O(adlwVar2.s, str, 0L);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RetryState";
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        long j;
        Optional of;
        super.b();
        if (((acxv) this.b.N.b()).a()) {
            ((aday) this.b.O.b()).q(this.b.n);
        } else {
            adlw adlwVar = this.b;
            adnu.a();
            adnu.f(adlwVar.s, adlwVar.n);
        }
        if (((Boolean) adlw.h.a()).booleanValue()) {
            if (((acxv) this.b.N.b()).a()) {
                long j2 = ((aday) this.b.O.b()).j(this.b.n).getLong("retry_time", -1L);
                if (j2 == -1) {
                    of = Optional.empty();
                } else {
                    of = Optional.of(Instant.ofEpochSecond(j2));
                }
                ((aday) this.b.O.b()).j(this.b.n).edit().putLong("retry_time", -1L).commit();
            } else {
                adnu.a();
                adlw adlwVar2 = this.b;
                long j3 = adnu.e(adlwVar2.s, adlwVar2.n).getLong("retry_time", -1L);
                if (j3 == -1) {
                    of = Optional.empty();
                } else {
                    of = Optional.of(Instant.ofEpochSecond(j3));
                }
                adnu.a();
                adlw adlwVar3 = this.b;
                adnu.e(adlwVar3.s, adlwVar3.n).edit().putLong("retry_time", -1L).commit();
            }
            if (of.isPresent() && this.b.K.isPresent()) {
                Duration between = Duration.between(this.b.M.f(), of.get());
                if (between.compareTo(adlw.l) > 0) {
                    between = adlw.l;
                }
                if (between.isNegative()) {
                    between = Duration.ZERO;
                }
                Object obj = this.b.K.get();
                String str = this.b.n;
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) obj;
                rcsProvisioningListenableWorker.m("Provisioning Engine entered RetryState, provisioning task will be rescheduled in %s", between);
                rcsProvisioningListenableWorker.t = 7;
                rcsProvisioningListenableWorker.g.l(str, between, 3, amww.STATE_MACHINE_RETRY);
                rcsProvisioningListenableWorker.v = new gsw();
                rcsProvisioningListenableWorker.l();
                q(-1L);
                return;
            }
        }
        adlw adlwVar4 = this.b;
        long h = adlwVar4.h(adlwVar4.s, adlwVar4.n);
        this.b.D.d("nextRetry = %s", Long.valueOf(h));
        if (h == 0) {
            adlw adlwVar5 = this.b;
            long g = adlwVar5.g();
            long f = adlwVar5.f();
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(g) - Long.numberOfLeadingZeros(f);
            adlw adlwVar6 = this.b;
            int d = adlwVar6.d(adlwVar6.s, adlwVar6.n);
            if (numberOfLeadingZeros > d) {
                j = g << d;
            } else {
                j = f;
            }
            this.b.D.a("getRetryDelayFromRetryCount, minDelayMs = %s, maxDelayMs = %s, maxShiftCount = %s, retryCount = %s, backoffDelay = %s", Long.valueOf(g), Long.valueOf(f), Integer.valueOf(numberOfLeadingZeros), Integer.valueOf(d), Long.valueOf(j));
            r(j);
            return;
        }
        r(h - System.currentTimeMillis());
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void c() {
        super.c();
        actw actwVar = this.a;
        if (actwVar != null) {
            actwVar.b();
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_RETRY;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_RETRY_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return false;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.b.J("RetryState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 10) {
            if (ordinal != 13 && ordinal != 23) {
                if (ordinal != 25) {
                    return super.o(message, adjjVar);
                }
                this.b.aD(45);
                this.b.Y();
                this.b.aA();
                adlw adlwVar = this.b;
                adlwVar.ac(adlwVar.af);
                return true;
            }
            s(this.b.n);
            this.b.aA();
            adlw adlwVar2 = this.b;
            adlwVar2.ac(adlwVar2.af);
            return true;
        }
        r(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
