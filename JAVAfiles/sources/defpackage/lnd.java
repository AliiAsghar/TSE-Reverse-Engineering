package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnd implements lkf {
    public final ConversationId a;
    public final String b;
    public final Recipient c;
    public final tqc d;

    public lnd(ConversationId conversationId, String str, Recipient recipient, tqc tqcVar) {
        this.a = conversationId;
        this.b = str;
        this.c = recipient;
        this.d = tqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd)) {
            return false;
        }
        lnd lndVar = (lnd) obj;
        if (d.F(this.a, lndVar.a) && d.F(this.b, lndVar.b) && d.F(this.c, lndVar.c) && this.d == lndVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Recipient recipient = this.c;
        int i = 0;
        if (recipient == null) {
            hashCode = 0;
        } else {
            hashCode = recipient.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        tqc tqcVar = this.d;
        if (tqcVar != null) {
            i = tqcVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return yyb.bh(super.toString()).toString();
    }
}
