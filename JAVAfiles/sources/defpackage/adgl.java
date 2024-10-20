package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.ImsException;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgl extends adgd {
    final /* synthetic */ adgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgl(adgp adgpVar) {
        super(adgpVar);
        this.b = adgpVar;
    }

    private final void f() {
        adgp adgpVar = this.b;
        RcsUceAdapter.OnPublishStateChangedListener onPublishStateChangedListener = adgpVar.H;
        if (onPublishStateChangedListener != null) {
            try {
                adgpVar.A.removeOnPublishStateChangedListener(onPublishStateChangedListener);
                advr.l(this.b.i, "Removed OnPublishCallback from AOSP.", new Object[0]);
            } catch (ImsException e) {
                advr.j(e, this.b.i, "Failed to remove publishCallback from AOSP.", new Object[0]);
            }
            this.b.H = null;
        }
    }

    @Override // defpackage.acyi, defpackage.acyh
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void b() {
        super.b();
        this.b.H();
        if (this.b.v != null && !adgp.P()) {
            this.b.v.g();
        }
        adgp adgpVar = this.b;
        String str = adgpVar.G;
        if (str == null) {
            str = "";
        }
        SipDelegateConfiguration sipDelegateConfiguration = adgpVar.E;
        sipDelegateConfiguration.getClass();
        adgpVar.w.e(adgpVar.K.a(sipDelegateConfiguration), str);
        if (adgp.P()) {
            try {
                adgp adgpVar2 = this.b;
                adgpVar2.H = new adga(adgpVar2);
                adgpVar2.A.addOnPublishStateChangedListener(adgpVar2.z, adgpVar2.H);
                advr.l(this.b.i, "Registered OnPublishCallback in AOSP.", new Object[0]);
            } catch (ImsException e) {
                advr.j(e, this.b.i, "Failed to register Publish callback. Retrying.", new Object[0]);
                adgp adgpVar3 = this.b;
                adgpVar3.w(adgpVar3.s);
            }
        }
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final void c() {
        f();
        if (!adgp.P()) {
            this.b.G(acok.CONNECTIVITY_CHANGE);
        }
        super.c();
    }

    @Override // defpackage.adgd, defpackage.acyi, defpackage.acyh
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 2) {
            if (i != 17) {
                if (i != 18) {
                    switch (i) {
                        case 4:
                            adgp adgpVar = this.b;
                            adgpVar.w(adgpVar.q);
                            return true;
                        case 5:
                            this.b.L((DelegateRegistrationState) message.obj);
                            return true;
                        case 6:
                            adgp adgpVar2 = this.b;
                            adgpVar2.w(adgpVar2.r);
                            return true;
                        case 7:
                            this.b.E();
                            return true;
                        case 8:
                            int i2 = message.arg1;
                            adfk adfkVar = this.b.v;
                            if (adfkVar != null) {
                                adfkVar.h(acok.DISABLED);
                            }
                            this.b.C(i2);
                            return true;
                        case 9:
                            adgp adgpVar3 = this.b;
                            adgpVar3.w(adgpVar3.p);
                            return true;
                        case 10:
                            break;
                        default:
                            return false;
                    }
                } else {
                    this.b.J(message.arg1);
                    return true;
                }
            }
            advr.r(this.b.i, "[%s] Publish failed.", "RegisteredState");
            return true;
        }
        this.b.M((SipDelegateConfiguration) message.obj);
        this.b.K((SipDelegateConfiguration) message.obj);
        return true;
    }
}
