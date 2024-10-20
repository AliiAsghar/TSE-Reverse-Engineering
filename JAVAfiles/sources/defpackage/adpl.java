package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpl {
    public final adoz a;
    public final adew b;
    public final armf c;
    public final adwe d;
    public int e;
    public long f;

    public adpl(adoz adozVar, adew adewVar, armf armfVar, adwe adweVar) {
        this.a = adozVar;
        this.b = adewVar;
        this.c = armfVar;
        this.d = adweVar;
    }

    private static final aimw d() {
        aimw aimwVar = new aimw();
        aimwVar.e(1800);
        aimwVar.f("uas");
        return aimwVar;
    }

    public final void a(aijw aijwVar, aion aionVar) {
        advr.k("Handling session refresh request", new Object[0]);
        try {
            aikb aikbVar = ((aikc) this.c).a;
            if ("INVITE".equals(aionVar.z())) {
                aioo g = this.d.g(aikbVar, aijwVar, aionVar);
                adwf.u(g, this.a.x(), this.a.an());
                c(aijwVar, aionVar, g);
                aikh e = aikbVar.e(g);
                e.h(30);
                if (e.f()) {
                    advr.k("ACK request received", new Object[0]);
                    return;
                } else {
                    advr.g("No ACK received for INVITE", new Object[0]);
                    this.a.o(new aduf(408, "Timeout"), 1, 1);
                    return;
                }
            }
            if ("UPDATE".equals(aionVar.z())) {
                aioo h = this.d.h(aionVar, aijwVar.d, BasePaymentResult.ERROR_REQUEST_FAILED);
                c(aijwVar, aionVar, h);
                aikbVar.e(h);
            }
        } catch (Exception e2) {
            advr.i(e2, "Sending response failed: %s", e2.getMessage());
            this.a.o(new aduf(408, "Timeout"), 1, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aijw aijwVar, aioo aiooVar) {
        aimw aimwVar = (aimw) aiooVar.a.d("Session-Expires");
        if (aimwVar == null) {
            return;
        }
        this.e = aimwVar.a;
        this.f = System.currentTimeMillis();
        String b = aimwVar.b();
        if (!TextUtils.isEmpty(b)) {
            aijwVar.w = b;
        }
        advr.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), b);
        adoz adozVar = this.a;
        adozVar.i.c(adozVar);
        if ("uac".equals(b)) {
            adoz adozVar2 = this.a;
            adozVar2.i.h(adozVar2, this.e, true);
        } else {
            adoz adozVar3 = this.a;
            adozVar3.i.h(adozVar3, this.e, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aijw aijwVar, aion aionVar, aioo aiooVar) {
        aimw d;
        String j = aionVar.j("Supported");
        if (j != null && j.contains("timer")) {
            aimw aimwVar = (aimw) aionVar.a.d("Session-Expires");
            if (aimwVar == null) {
                d = d();
            } else {
                aimw aimwVar2 = new aimw();
                aimwVar2.e(aimwVar.a);
                String b = aimwVar.b();
                if (b != null && !"uas".equals(b)) {
                    aimwVar2.f("uac");
                } else {
                    aimwVar2.f("uas");
                }
                d = aimwVar2;
            }
        } else {
            d = d();
        }
        String b2 = d.b();
        if (!TextUtils.isEmpty(b2)) {
            aijwVar.w = b2;
        }
        adoz adozVar = this.a;
        adozVar.i.c(adozVar);
        this.e = d.a;
        this.f = System.currentTimeMillis();
        advr.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), d.b());
        if ("uas".equals(d.b())) {
            adoz adozVar2 = this.a;
            adozVar2.i.h(adozVar2, d.a, true);
        } else {
            adoz adozVar3 = this.a;
            adozVar3.i.h(adozVar3, d.a, false);
        }
        aiooVar.a.k(d);
    }
}
