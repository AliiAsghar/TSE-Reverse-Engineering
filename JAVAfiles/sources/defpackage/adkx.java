package defpackage;

import android.content.Context;
import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkx extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkx(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "EnabledState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        String r;
        boolean z;
        super.b();
        adlw adlwVar = this.a;
        String str = adlwVar.n;
        if (((acxv) adlwVar.N.b()).a()) {
            r = ((aday) adlwVar.O.b()).o(str);
        } else {
            Context context = adlwVar.s;
            adnu.a();
            r = adnu.r(context, str);
        }
        adlwVar.r = r;
        adlw adlwVar2 = this.a;
        adlwVar2.D.b = adlwVar2.r;
        adlw adlwVar3 = this.a;
        if (adlwVar3.r == null) {
            adlwVar3.aA();
        }
        this.a.K.ifPresent(new adgr(this, 15));
        adlw adlwVar4 = this.a;
        adjl j = adlwVar4.j();
        String str2 = adlwVar4.r;
        Optional p = adlwVar4.p();
        int i = 1;
        advr.c("updateProvisioningAttemptMetadata, provisioningSessionId=%s", str2);
        adnt adntVar = adlwVar4.A;
        if (!adntVar.i(adntVar.e(p))) {
            adntVar.s(new yxu((Object) adntVar, str2, (Object) p, 6), p);
        }
        this.a.D(apjx.ENABLED_STAGE);
        adlw adlwVar5 = this.a;
        adlwVar5.A.l(j, adlwVar5.p());
        adlw adlwVar6 = this.a;
        int d = adlwVar6.d(adlwVar6.s, adlwVar6.n);
        adlw adlwVar7 = this.a;
        adnt adntVar2 = adlwVar6.A;
        Optional p2 = adlwVar7.p();
        if (!adntVar2.i(adntVar2.e(p2))) {
            adntVar2.r(new adnp(d, i), adntVar2.e(p2));
        }
        if (((Boolean) adlw.j.a()).booleanValue()) {
            adlw adlwVar8 = this.a;
            adnt adntVar3 = adlwVar8.A;
            amww amwwVar = adlwVar8.ab;
            Optional p3 = adlwVar8.p();
            if (!adntVar3.i(adntVar3.e(p3))) {
                adntVar3.r(new adnn(amwwVar, i), adntVar3.e(p3));
            }
        }
        boolean e = j.e();
        if (((acwt) this.a.S.b()).a()) {
            adlw adlwVar9 = this.a;
            if (!adlwVar9.R) {
                String str3 = adlwVar9.J.a().c;
                boolean equals = str3.equals(this.a.n);
                if (e && equals) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    adlw adlwVar10 = this.a;
                    adlwVar10.D.e("Can't proceed with provisioning. Trying to provision simId: %s. Current default call simId: %s. Is RCS enabled: %s", advq.SIM_ID.c(adlwVar10.n), advq.SIM_ID.c(str3), Boolean.valueOf(e));
                }
                e = z;
            }
        }
        if (e) {
            if (aczv.R()) {
                Configuration k = this.a.k();
                int max = Math.max(k.mVersion, 0);
                if (max != k.rcsState) {
                    this.a.D.a("set rcs state %d", Integer.valueOf(max));
                    k.rcsState = max;
                    adlw adlwVar11 = this.a;
                    adlwVar11.z.u(adlwVar11.n, k);
                }
            }
            n(this.a.ah, apkn.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        } else {
            n(this.a.ag, apkn.RCS_PROVISIONING_DISABLED_STATE);
        }
        adom.b();
        adom.a(this.a.s, 3);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_ENABLED;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_ENABLED_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("EnabledState", message);
        if (adlw.av(message).ordinal() != 1) {
            return super.o(message, adjjVar);
        }
        this.a.F();
        return true;
    }
}
