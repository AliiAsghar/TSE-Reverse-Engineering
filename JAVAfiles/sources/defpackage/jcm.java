package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcm {
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final IncomingDraft d;
    public final MessageCoreData e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ComposeRowState i;
    public final OpenConversation2Arguments j;

    public jcm(ConversationId conversationId, MessageId messageId, String str, IncomingDraft incomingDraft, MessageCoreData messageCoreData, boolean z, boolean z2, boolean z3, ComposeRowState composeRowState) {
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.d = incomingDraft;
        this.e = messageCoreData;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = composeRowState;
        this.j = new OpenConversation2Arguments(conversationId, messageId, str, Boolean.valueOf(z), z2, z3, null, 64, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcm)) {
            return false;
        }
        jcm jcmVar = (jcm) obj;
        if (d.F(this.a, jcmVar.a) && d.F(this.b, jcmVar.b) && d.F(this.c, jcmVar.c) && d.F(this.d, jcmVar.d) && d.F(this.e, jcmVar.e) && this.f == jcmVar.f && this.g == jcmVar.g && this.h == jcmVar.h && d.F(this.i, jcmVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int i = 0;
        if (messageId == null) {
            hashCode = 0;
        } else {
            hashCode = messageId.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        IncomingDraft incomingDraft = this.d;
        if (incomingDraft == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = incomingDraft.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        MessageCoreData messageCoreData = this.e;
        if (messageCoreData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = messageCoreData.hashCode();
        }
        int v = (((((((i4 + hashCode4) * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31;
        ComposeRowState composeRowState = this.i;
        if (composeRowState != null) {
            i = composeRowState.hashCode();
        }
        return v + i;
    }

    public final String toString() {
        CharSequence charSequence;
        String str = this.c;
        if (str != null) {
            charSequence = yyb.be(str);
        } else {
            charSequence = null;
        }
        MessageId messageId = this.b;
        return "Arguments(conversationId=" + this.a + ", messageId=" + messageId + ", searchQuery=" + ((Object) charSequence) + ", incomingDraft=" + this.d + ", legacyIncomingDraft=" + this.e + ", canNavigateBack=" + this.f + ", renderAddPeople=" + this.g + ", isBubbleActivity=" + this.h + ", composeRowState=" + this.i + ")";
    }
}
