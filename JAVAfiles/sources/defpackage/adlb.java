package defpackage;

import android.os.Message;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlb extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlb(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q(boolean z) {
        adlw adlwVar = this.a;
        adnt adntVar = adlwVar.A;
        Optional p = adlwVar.p();
        if (adntVar.i(adntVar.e(p))) {
            return;
        }
        adntVar.r(new adnq(z, 1), adntVar.e(p));
    }

    private final void r() {
        adlw adlwVar = this.a;
        adlwVar.u.b(adlwVar.s, adlwVar.n);
        q(true);
        n(this.a.as, apkn.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        wgl wglVar;
        super.b();
        this.a.D(apjx.READY_STAGE);
        if (this.a.k().k()) {
            r();
            return;
        }
        adlw adlwVar = this.a;
        if (!((Boolean) adlw.g.a()).booleanValue() && (!((Boolean) adlw.f.a()).booleanValue() || !adlwVar.am())) {
            try {
                wglVar = (wgl) adlwVar.z.b.o(aduw.h("provisioning_success_data_for_imsi_", adlwVar.p), wgl.a);
            } catch (adux e) {
                advr.j(e, adnk.a, "Error while retrieving provisioningSuccessData from Bugle storage.", new Object[0]);
                wglVar = wgl.a;
            }
            if (!wglVar.equals(wgl.a) && wglVar.e.equals(adlwVar.p) && !wglVar.f.equals(adlwVar.n)) {
                String str = wglVar.f;
                if (adlwVar.z.f(str).k()) {
                    adlwVar.ad = true;
                    adlwVar.n = str;
                    r();
                    return;
                }
            }
        }
        adlw adlwVar2 = this.a;
        int T = a.T(adlwVar2.ae.c(adlwVar2.n).F);
        if (T == 0) {
            T = 1;
        }
        if ((((Boolean) aczv.s().a.av.a()).booleanValue() && T == 6) || (!aczv.x() || !aczv.W() ? ((Boolean) aczv.s().a.y.a()).booleanValue() : !(T != 4 && T != 5))) {
            if (this.a.at()) {
                this.a.D.a("UPI GC enabled, always try provisioning with UPI", new Object[0]);
            } else {
                adlw adlwVar3 = this.a;
                int a = adlwVar3.z.a(adlwVar3.n);
                this.a.D.a("UPI enabled, upiAttemptsCount = %d", Integer.valueOf(a));
                if (a >= 0 && a < aczv.d()) {
                    adlw adlwVar4 = this.a;
                    adlwVar4.z.x(adlwVar4.n, a + 1);
                } else {
                    adlw adlwVar5 = this.a;
                    adlwVar5.z.x(adlwVar5.n, 0);
                }
            }
            adlw adlwVar6 = this.a;
            adlwVar6.u.b(adlwVar6.s, adlwVar6.n);
            q(false);
            n(this.a.ak, apkn.RCS_PROVISIONING_VERIFY_MSISDN_STATE);
            return;
        }
        q(false);
        adlw adlwVar7 = this.a;
        wgk c = adlwVar7.z.c(adlwVar7.n);
        if ((c.b & 1) != 0 && !c.c.isEmpty() && (c.b & 8) != 0) {
            apct apctVar = c.f;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            if (TimeUnit.SECONDS.toMillis(apctVar.b) + TimeUnit.MINUTES.toMillis(((Long) aczf.o().a.u.a()).longValue()) > agkx.W().longValue()) {
                n(this.a.aq, apkn.RCS_PROVISIONING_VERIFY_OTP_STATE);
                return;
            }
        }
        adlw adlwVar8 = this.a;
        adlwVar8.u.b(adlwVar8.s, adlwVar8.n);
        adll l = this.a.l();
        n(l, l.g());
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_READY;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_READY_STATE;
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
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        return super.o(message, adjjVar);
    }
}
