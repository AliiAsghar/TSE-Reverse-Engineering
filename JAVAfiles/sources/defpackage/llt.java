package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llt {
    public final ConversationId a;
    public final boolean b;
    public final boolean c;
    public final MessageCoreData d;
    public final IncomingDraft e;
    public final boolean f;
    public final boolean g;
    public final int h;
    private final MessageId i = null;
    private final String j;
    private final ComposeRowState k;
    private final lrf l;

    public /* synthetic */ llt(ConversationId conversationId, boolean z, boolean z2, int i, MessageCoreData messageCoreData, IncomingDraft incomingDraft, boolean z3, boolean z4, int i2) {
        boolean z5;
        boolean z6;
        this.a = conversationId;
        if ((i2 & 4) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.b = z & z5;
        this.c = z2;
        this.h = i;
        this.d = (i2 & 32) != 0 ? null : messageCoreData;
        this.e = (i2 & 64) != 0 ? null : incomingDraft;
        this.l = null;
        this.j = null;
        if ((i2 & 512) != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.f = z6 & z3;
        this.g = ((i2 & 1024) == 0) & z4;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llt)) {
            return false;
        }
        llt lltVar = (llt) obj;
        if (!d.F(this.a, lltVar.a)) {
            return false;
        }
        MessageId messageId = lltVar.i;
        if (!d.F(null, null) || this.b != lltVar.b || this.c != lltVar.c || this.h != lltVar.h || !d.F(this.d, lltVar.d) || !d.F(this.e, lltVar.e)) {
            return false;
        }
        lrf lrfVar = lltVar.l;
        if (!d.F(null, null)) {
            return false;
        }
        String str = lltVar.j;
        if (!d.F(null, null) || this.f != lltVar.f || this.g != lltVar.g) {
            return false;
        }
        ComposeRowState composeRowState = lltVar.k;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 961;
        int i = this.h;
        a.bm(i);
        MessageCoreData messageCoreData = this.d;
        int i2 = 0;
        if (messageCoreData == null) {
            hashCode = 0;
        } else {
            hashCode = messageCoreData.hashCode();
        }
        int v = ((((hashCode2 + a.v(this.b)) * 31) + a.v(this.c)) * 31) + i;
        IncomingDraft incomingDraft = this.e;
        if (incomingDraft != null) {
            i2 = incomingDraft.hashCode();
        }
        return ((((((((v * 31) + hashCode) * 31) + i2) * 29791) + a.v(this.f)) * 31) + a.v(this.g)) * 31;
    }

    public final String toString() {
        return "ConversationArguments(conversationId=" + this.a + ", messageId=null, withAddPeople=" + this.b + ", deleteConversationIfEmpty=" + this.c + ", eventSource=" + ((Object) lgb.f(this.h)) + ", draft=" + this.d + ", incomingDraft=" + this.e + ", renderData=null, searchQuery=null, hasRbmRecipient=" + this.f + ", finishCurrentActivity=" + this.g + ", composeRowState=null)";
    }
}
