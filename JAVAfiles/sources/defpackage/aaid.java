package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaid extends zgr {
    private boolean n = false;

    public aaid() {
        u(new zji(this, 9));
    }

    @Override // defpackage.zgw
    public final void y() {
        if (!this.n) {
            this.n = true;
            ShareIntentActivity shareIntentActivity = (ShareIntentActivity) this;
            kqj kqjVar = (kqj) aS();
            shareIntentActivity.t = (xnv) kqjVar.b.bV.b();
            shareIntentActivity.w = (zas) kqjVar.d.b();
            shareIntentActivity.u = kqjVar.f;
            shareIntentActivity.v = (rrj) kqjVar.b.dp.b();
        }
    }
}
