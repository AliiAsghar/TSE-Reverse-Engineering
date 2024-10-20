package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aazq extends zgu {
    private boolean C = false;

    public aazq() {
        u(new aazn(this, 2));
    }

    @Override // defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.C) {
            this.C = true;
            PhoneNumberInputV2Activity phoneNumberInputV2Activity = (PhoneNumberInputV2Activity) this;
            kqj kqjVar = (kqj) aS();
            phoneNumberInputV2Activity.t = (xnv) kqjVar.b.bV.b();
            phoneNumberInputV2Activity.w = (zas) kqjVar.d.b();
            phoneNumberInputV2Activity.u = kqjVar.f;
            phoneNumberInputV2Activity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            phoneNumberInputV2Activity.s = krvVar.vt;
            phoneNumberInputV2Activity.x = krvVar.hA;
            phoneNumberInputV2Activity.y = krvVar.bU;
            phoneNumberInputV2Activity.z = kqjVar.h;
            phoneNumberInputV2Activity.A = (aksr) krvVar.at.b();
            phoneNumberInputV2Activity.B = kqjVar.d;
        }
    }
}
