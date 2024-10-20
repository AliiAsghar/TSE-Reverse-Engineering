package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlk extends adll {
    public final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adlk(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        this.a.U(adjj.MSG_SET_CONSENT_COMPLETE);
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "SetGoogleToSConsentState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        apkl apklVar;
        super.b();
        this.a.D(apjx.SET_GOOGLE_TOS_CONSENT_STAGE);
        this.a.aD(27);
        adlw adlwVar = this.a;
        wfo j = adlwVar.aJ.j();
        if (adlwVar.ar() && adlwVar.au() && adlwVar.aF.a().equals(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
            apklVar = apkl.RCS_DEFAULT_ON_OOB_CONSENT;
        } else if (this.a.au()) {
            apklVar = apkl.LEGAL_FYI_SEEN;
        } else {
            apklVar = apkl.GOOGLE_TOS_UI;
        }
        byte[] bArr = null;
        akul.g(adlwVar.E.f(apklVar)).h(new abdo(this, j, 4, bArr), this.a.B).e(Exception.class, new abdo(this, j, 5, bArr), andi.a);
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
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
        this.a.J("SetGoogleToSConsentState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 8) {
            if (ordinal != 34) {
                if (ordinal != 35) {
                    return super.o(message, adjjVar);
                }
                this.a.aD(53);
                if (this.a.as() && this.a.ar() && (!((acxu) this.a.Q.b()).a() || (message.obj instanceof abra))) {
                    abra abraVar = (abra) message.obj;
                    if (abraVar != null && abraVar.a.f == 34506) {
                        this.a.P();
                        this.a.K.ifPresent(new adgr(this, 16));
                    }
                } else if (aczv.M()) {
                    adlw adlwVar = this.a;
                    adlwVar.ac(adlwVar.an);
                } else {
                    q();
                }
            } else {
                this.a.aI(BasePaymentResult.ERROR_REQUEST_FAILED);
                if (alhq.a(((adkb) message.obj).b)) {
                    this.a.D.e("Token from setConsent API is empty", new Object[0]);
                    if (aczv.M()) {
                        adlw adlwVar2 = this.a;
                        adlwVar2.ac(adlwVar2.an);
                        return true;
                    }
                }
                q();
                return true;
            }
        } else {
            this.a.aD(49);
            if (aczv.M()) {
                adlw adlwVar3 = this.a;
                adlwVar3.ac(adlwVar3.an);
            } else {
                q();
            }
        }
        return true;
    }

    @Override // defpackage.adll
    public final Duration l() {
        return adkc.i;
    }
}
