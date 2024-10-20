package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zya extends zgv {
    private boolean G = false;

    public zya() {
        u(new zji(this, 5));
    }

    @Override // defpackage.zgy, defpackage.zgx, defpackage.zgw
    public final void y() {
        if (!this.G) {
            this.G = true;
            ConversationDetailsActivity conversationDetailsActivity = (ConversationDetailsActivity) this;
            kqj kqjVar = (kqj) aS();
            conversationDetailsActivity.t = (xnv) kqjVar.b.bV.b();
            conversationDetailsActivity.w = (zas) kqjVar.d.b();
            conversationDetailsActivity.u = kqjVar.f;
            conversationDetailsActivity.v = (rrj) kqjVar.b.dp.b();
            krv krvVar = kqjVar.b;
            conversationDetailsActivity.s = krvVar.vt;
            conversationDetailsActivity.x = krvVar.hA;
            conversationDetailsActivity.y = krvVar.bU;
            conversationDetailsActivity.z = kqjVar.h;
            conversationDetailsActivity.A = (aksr) krvVar.at.b();
            conversationDetailsActivity.B = kqjVar.d;
            krv krvVar2 = kqjVar.b;
            ((zgv) conversationDetailsActivity).D = krvVar2.zb;
            ((zgv) conversationDetailsActivity).E = krvVar2.zh;
            conversationDetailsActivity.F = (cj) kqjVar.e.b();
        }
    }
}
