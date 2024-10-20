package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgg extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgg(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "InactiveState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        advr.d(this.b.i, "Delegate is deregistered.", new Object[0]);
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i != 8) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    this.b.L((DelegateRegistrationState) message.obj);
                    adgp adgpVar = this.b;
                    adgpVar.w(adgpVar.o);
                    return true;
                }
                adgp adgpVar2 = this.b;
                adgpVar2.w(adgpVar2.q);
                return true;
            }
            this.b.C(message.arg1);
            return true;
        }
        this.b.M((SipDelegateConfiguration) message.obj);
        this.b.K((SipDelegateConfiguration) message.obj);
        return true;
    }
}
