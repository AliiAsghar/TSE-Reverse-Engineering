package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsy extends rqz implements rin {
    private static final xze c = xze.g("Bugle", "LaunchConversationData");
    public rhj a;
    public final rio b;
    private abdj d;

    public rsy(rio rioVar, abdj abdjVar) {
        this.d = abdjVar;
        this.b = rioVar;
    }

    @Override // defpackage.rin
    public final void a(rhj rhjVar, Object obj) {
        boolean z;
        abdj abdjVar;
        if (rhjVar == this.a) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        String str = (String) obj;
        if (str != null && i(str) && (abdjVar = this.d) != null) {
            ((abbu) abdjVar.f.f).k(R.string.conversation_creation_failure);
        }
        c.m("onGetOrCreateConversationFailed");
        this.a = null;
    }

    @Override // defpackage.rin
    public final void b(rhj rhjVar, Object obj, ConversationIdType conversationIdType) {
        boolean z;
        abdj abdjVar;
        abdj abdjVar2;
        if (rhjVar == this.a) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        xyl.l(conversationIdType);
        if (qrl.a() && (obj instanceof rsx)) {
            rsx rsxVar = (rsx) obj;
            if (i(rsxVar.a) && (abdjVar2 = this.d) != null) {
                boolean z2 = rsxVar.b;
                abdjVar2.a(conversationIdType);
            }
        } else {
            String str = (String) obj;
            if (str != null && i(str) && (abdjVar = this.d) != null) {
                abdjVar.a(conversationIdType);
            }
        }
        this.a = null;
    }

    @Override // defpackage.rqz
    protected final void g() {
        this.d = null;
        rhj rhjVar = this.a;
        if (rhjVar != null) {
            synchronized (rhjVar.b) {
                rhjVar.d = null;
            }
        }
        this.a = null;
    }
}
