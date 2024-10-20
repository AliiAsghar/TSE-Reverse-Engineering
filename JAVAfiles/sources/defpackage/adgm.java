package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class adgm extends adgd {
    final /* synthetic */ adgp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgm(adgp adgpVar) {
        super(adgpVar);
        this.c = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i != 16) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 8) {
                                return super.e(message);
                            }
                            this.c.C(message.arg1);
                            return true;
                        }
                        this.c.E();
                        return true;
                    }
                    this.c.L((DelegateRegistrationState) message.obj);
                    adgp adgpVar = this.c;
                    adgpVar.w(adgpVar.m);
                    return true;
                }
                adgp adgpVar2 = this.c;
                adgpVar2.w(adgpVar2.q);
                return true;
            }
            advr.l(this.c.i, "StateRegistering: Timeout for registration, going to retry", new Object[0]);
            adgp adgpVar3 = this.c;
            adgpVar3.w(adgpVar3.s);
            return true;
        }
        SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
        advr.l(this.c.i, "applying configuration in state:%s with version %d", "RegisteringState", Long.valueOf(sipDelegateConfiguration.getVersion()));
        this.c.M(sipDelegateConfiguration);
        this.c.K(sipDelegateConfiguration);
        adgp adgpVar4 = this.c;
        adgpVar4.w(adgpVar4.l);
        return true;
    }
}
