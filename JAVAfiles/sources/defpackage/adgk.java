package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgk extends adgm {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgk(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    @Override // defpackage.adgm, defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ReceiveFeatureTagsState";
    }

    @Override // defpackage.adgm, defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        if (message.what != 5) {
            return super.e(message);
        }
        this.b.L((DelegateRegistrationState) message.obj);
        this.b.D();
        return true;
    }
}
