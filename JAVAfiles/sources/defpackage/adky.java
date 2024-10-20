package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adky extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adky(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        this.a.U(adjj.MSG_GET_CONSENT_COMPLETE);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "GetGoogleToSConsentState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.GET_GOOGLE_TOS_CONSENT_STAGE);
        this.a.aD(27);
        akul.g(this.a.E.b()).h(new adhe(this, 7), this.a.B).e(Exception.class, new adhe(this, 8), andi.a);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
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
        this.a.J("GetGoogleToSConsentState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 8) {
            if (ordinal != 36) {
                if (ordinal != 37) {
                    return super.o(message, adjjVar);
                }
                this.a.aD(53);
                if (aczv.M()) {
                    adlw adlwVar = this.a;
                    adlwVar.ac(adlwVar.an);
                    return true;
                }
                q();
                return true;
            }
            this.a.aI(BasePaymentResult.ERROR_REQUEST_FAILED);
            adkb adkbVar = (adkb) message.obj;
            if (adkbVar.a == wfo.GOOGLE_TOS_CONSENTED) {
                this.a.aD(51);
                if (alhq.a(adkbVar.b)) {
                    this.a.aD(50);
                    this.a.D.e("Token from getConsent API is empty", new Object[0]);
                    if (aczv.M()) {
                        adlw adlwVar2 = this.a;
                        adlwVar2.ac(adlwVar2.an);
                        return true;
                    }
                    q();
                    return true;
                }
                adlw adlwVar3 = this.a;
                adlwVar3.z.p(adkbVar.b);
                q();
                return true;
            }
            this.a.aD(52);
            this.a.D.e("getConsent API returns no consent.", new Object[0]);
            this.a.aJ.k();
            if (this.a.ar()) {
                this.a.aF.b();
                this.a.D.e("Request for RCS Default On reprompt", new Object[0]);
                adjk.c(this.a.s, 25, null);
                adlw adlwVar4 = this.a;
                adlwVar4.ac(adlwVar4.aD);
                return true;
            }
            if (((Boolean) aczv.s().a.u.a()).booleanValue()) {
                this.a.D.e("Request for reprompt.", new Object[0]);
                adjk.c(this.a.s, 22, null);
            }
            adlw adlwVar5 = this.a;
            adlwVar5.ac(adlwVar5.aw);
            return true;
        }
        this.a.aD(49);
        if (aczv.M()) {
            adlw adlwVar6 = this.a;
            adlwVar6.ac(adlwVar6.an);
            return true;
        }
        q();
        return true;
    }

    @Override // defpackage.adll
    public final Duration l() {
        return adkc.i;
    }
}
