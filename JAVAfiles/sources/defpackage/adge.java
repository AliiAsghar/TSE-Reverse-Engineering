package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adge extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adge(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.B();
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        return false;
                    }
                    advr.l(this.b.i, "StateConnecting: Timeout for registration, going to retry", new Object[0]);
                    adgp adgpVar = this.b;
                    adgpVar.w(adgpVar.s);
                    return true;
                }
                this.b.C(message.arg1);
                return true;
            }
            adgp adgpVar2 = this.b;
            adgpVar2.w(adgpVar2.q);
            return true;
        }
        this.b.D = (SipDelegateConnection) message.obj;
        adgp adgpVar3 = this.b;
        adgpVar3.w(adgpVar3.n);
        return true;
    }
}
