package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgj extends adgm {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgj(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.adgm, defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ReceiveConfigurationState";
    }

    @Override // defpackage.adgm, defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        if (message.what != 2) {
            return super.e(message);
        }
        SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
        advr.l(this.b.i, "applying configuration in state:%s with version %d", "ReceiveConfigurationState", Long.valueOf(sipDelegateConfiguration.getVersion()));
        this.b.M(sipDelegateConfiguration);
        this.b.K(sipDelegateConfiguration);
        this.b.D();
        return true;
    }
}
