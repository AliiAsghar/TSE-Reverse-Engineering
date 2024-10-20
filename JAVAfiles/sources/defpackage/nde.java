package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nde implements arqv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nde(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.arqv
    public final Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return Boolean.valueOf(((Set) obj).contains(this.a));
            }
            SelfIdentityId selfIdentityId = (SelfIdentityId) obj;
            Integer num = (Integer) obj2;
            Object obj3 = this.a;
            char[] cArr = null;
            iqp iqpVar = new iqp(obj3, selfIdentityId, num, 3, cArr);
            iqp iqpVar2 = new iqp(obj3, selfIdentityId, num, 4, cArr);
            ixd ixdVar = (ixd) obj3;
            if (ixdVar.aV()) {
                if (!ixdVar.M.aw()) {
                    alvw i2 = ixd.a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "switchSelectedSimInDraft", 7916, "ConversationFragmentPeer.java")).q("Not showing SIM picker dialog; fragment not initialized.");
                } else {
                    ila w = ixdVar.w();
                    w.getClass();
                    iqpVar.q(w);
                }
            } else {
                iqpVar2.q(ixdVar.bV);
            }
            return arnb.a;
        }
        return Boolean.valueOf(((Set) obj).contains(this.a));
    }
}
