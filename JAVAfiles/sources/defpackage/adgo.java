package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgo extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgo(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    private final void f(SipDelegateConnection sipDelegateConnection) {
        if (sipDelegateConnection != null) {
            this.b.y.destroySipDelegate(sipDelegateConnection, 2);
        }
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "TerminatedState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        f(this.b.D);
        this.b.x.c();
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        if (message.what != 1) {
            return false;
        }
        advr.r(this.b.i, "Race condition detected: connection created after transitioning to terminated.", new Object[0]);
        f((SipDelegateConnection) message.obj);
        return true;
    }
}
