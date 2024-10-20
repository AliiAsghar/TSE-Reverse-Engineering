package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwd extends BroadcastReceiver {
    final /* synthetic */ ixd a;

    public iwd(ixd ixdVar) {
        this.a = ixdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        akrc b = this.a.aC.b("ConversationFragmentPeer#conversationSelfIdChangeReceiver#onReceive");
        try {
            ConversationIdType b2 = ruy.b(intent.getStringExtra("conversation_id"));
            SelfIdentityId W = lga.W(intent.getStringExtra("conversation_self_id"));
            if (this.a.ca.g() && W != null && ((rrl) this.a.ca.a()).c.equals(b2)) {
                this.a.cl.d();
                int c = ((rrl) this.a.ca.a()).c(W);
                alvw g = ixd.a.g();
                g.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.p, b2);
                alvgVar.X(ydl.t, Integer.valueOf(c));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$1", "onReceive", 1645, "ConversationFragmentPeer.java")).t("ConversationFragment: selfIdChange.onReceive selfId: %s", W);
                ((rsr) this.a.cl.a()).R(W, c);
            }
            this.a.Q(new ivn(14), new ivn(15));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
