package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaic extends zgr {
    private boolean n = false;

    public aaic() {
        u(new zji(this, 8));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            ForwardMessageActivity forwardMessageActivity = (ForwardMessageActivity) this;
            kqj kqjVar = (kqj) aS();
            forwardMessageActivity.t = (xnv) kqjVar.b.bV.b();
            forwardMessageActivity.w = (zas) kqjVar.d.b();
            forwardMessageActivity.u = kqjVar.f;
            forwardMessageActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
