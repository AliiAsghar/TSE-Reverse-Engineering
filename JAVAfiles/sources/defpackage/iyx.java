package defpackage;

import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iyx extends iyk {
    private boolean G = false;

    public iyx() {
        u(new ew((ex) this, 6));
    }

    @Override // defpackage.iyu, defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            InfoAndOptionsActivity infoAndOptionsActivity = (InfoAndOptionsActivity) this;
            kqj kqjVar = (kqj) aS();
            infoAndOptionsActivity.t = (xnv) kqjVar.b.bV.b();
            infoAndOptionsActivity.w = (zas) kqjVar.d.b();
            infoAndOptionsActivity.u = kqjVar.f;
            infoAndOptionsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            infoAndOptionsActivity.s = krvVar.vt;
            infoAndOptionsActivity.x = krvVar.hA;
            infoAndOptionsActivity.y = krvVar.bU;
            infoAndOptionsActivity.z = kqjVar.h;
            infoAndOptionsActivity.A = (aksr) krvVar.at.b();
            infoAndOptionsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) infoAndOptionsActivity).D = krvVar2.zb;
            ((zgv) infoAndOptionsActivity).E = krvVar2.zh;
            infoAndOptionsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
