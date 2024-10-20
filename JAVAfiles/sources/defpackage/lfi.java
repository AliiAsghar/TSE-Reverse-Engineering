package defpackage;

import com.google.android.apps.messaging.messagedetails.MessageDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lfi extends zgv {
    private boolean G = false;

    public lfi() {
        u(new ew((ex) this, 13));
    }

    @Override // defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this;
            kqj kqjVar = (kqj) aS();
            messageDetailsActivity.t = (xnv) kqjVar.b.bV.b();
            messageDetailsActivity.w = (zas) kqjVar.d.b();
            messageDetailsActivity.u = kqjVar.f;
            messageDetailsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            messageDetailsActivity.s = krvVar.vt;
            messageDetailsActivity.x = krvVar.hA;
            messageDetailsActivity.y = krvVar.bU;
            messageDetailsActivity.z = kqjVar.h;
            messageDetailsActivity.A = (aksr) krvVar.at.b();
            messageDetailsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) messageDetailsActivity).D = krvVar2.zb;
            ((zgv) messageDetailsActivity).E = krvVar2.zh;
            messageDetailsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
