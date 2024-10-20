package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iha {
    public final ResolvedRecipient a;
    public final ConversationId b;
    public final int c;
    public final int d = 1;
    public final int e = 3;
    public final int f;

    public iha(ResolvedRecipient resolvedRecipient, ConversationId conversationId, int i, int i2) {
        this.a = resolvedRecipient;
        this.b = conversationId;
        this.c = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iha)) {
            return false;
        }
        iha ihaVar = (iha) obj;
        if (!d.F(this.a, ihaVar.a) || !d.F(this.b, ihaVar.b) || this.c != ihaVar.c) {
            return false;
        }
        int i = ihaVar.d;
        int i2 = ihaVar.e;
        if (this.f == ihaVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ResolvedRecipient resolvedRecipient = this.a;
        if (resolvedRecipient == null) {
            hashCode = 0;
        } else {
            hashCode = resolvedRecipient.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.b.hashCode()) * 31;
        int i = this.c;
        a.bm(i);
        a.bm(1);
        a.bm(3);
        int i2 = (((((hashCode2 + i) * 31) + 1) * 31) + 3) * 31;
        int i3 = this.f;
        a.bm(i3);
        return i2 + i3;
    }

    public final String toString() {
        return "Dialog2Request(recipient=" + this.a + ", conversationId=" + this.b + ", dialogType=" + ((Object) hld.f(this.c)) + ", dialogDoneBehavior=SHOW_UNDO_UX, scope=" + ((Object) aktp.au(3)) + ", entryPoint=" + ((Object) aktp.av(this.f)) + ")";
    }
}
