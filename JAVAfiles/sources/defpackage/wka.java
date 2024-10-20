package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wka implements akcq {
    public static final Duration a;
    public static final xze b;
    public final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final aneo g;
    private final anen h;
    private final armf i;
    private final anen j;
    private final armf k;

    static {
        Duration ofDays = Duration.ofDays(7L);
        a = ofDays;
        uuh.f(uuh.b, "revoke_consent_worker_initial_delay_minutes", ofDays.toMinutes());
        b = xze.g("BugleRcsProvisioning", "RevokeGoogleToSConsentWorker");
    }

    public wka(armf armfVar, armf armfVar2, armf armfVar3, aneo aneoVar, anen anenVar, armf armfVar4, armf armfVar5, anen anenVar2, armf armfVar6) {
        this.e = armfVar;
        this.f = armfVar2;
        this.d = armfVar3;
        this.g = aneoVar;
        this.h = anenVar;
        this.c = armfVar4;
        this.i = armfVar5;
        this.j = anenVar2;
        this.k = armfVar6;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul ag;
        boolean h = workerParameters.b.h("is_disabled_by_user");
        amwt x = ((vrn) ((xyt) this.d.b()).a()).x();
        boolean z = true;
        boolean z2 = false;
        if (aczv.J()) {
            if (h) {
                ag = aktp.ai(new vib(this, 20), this.j);
            } else {
                if (!((nxn) this.k.b()).a() && !aczv.J() && x == amwt.DISABLED_VIA_FLAGS) {
                    ag = aktp.ag(Boolean.valueOf(aczv.J()));
                } else {
                    if (((adih) this.f.b()).j() != wfo.GOOGLE_TOS_DECLINED) {
                        z = false;
                    }
                    ag = aktp.ag(Boolean.valueOf(z));
                }
                z = false;
            }
            return ag.i(new prn(this, z, x, 7), this.j);
        }
        if (h) {
            if (aczv.J() && !((yyt) this.i.b()).T()) {
                z2 = true;
            }
        } else {
            if (!((nxn) this.k.b()).a() && !aczv.J() && x == amwt.DISABLED_VIA_FLAGS) {
                z = aczv.J();
            } else if (((adih) this.f.b()).j() != wfo.GOOGLE_TOS_DECLINED) {
                z = false;
            }
            z2 = z;
            z = false;
        }
        return c(z, z2, x);
    }

    public final akul c(boolean z, boolean z2, amwt amwtVar) {
        if (!z2) {
            if (!((nxn) this.k.b()).a()) {
                b.l("Skip RevokeGoogleConsentWorker, availability = " + String.valueOf(amwtVar) + ", isDisabledByUser =" + z);
            } else {
                b.l("Skip RevokeGoogleConsentWorker, isDisabledByUser =" + z);
            }
            return aktp.ag(new gsw());
        }
        return akul.g(((adkc) this.e.b()).c(apkl.REVOKE_CONSENT_FROM_SETTINGS, z)).h(new whf(15), this.h).e(Exception.class, new whf(16), this.g);
    }
}
