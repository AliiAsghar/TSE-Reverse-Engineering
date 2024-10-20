package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypm {
    public final MessageIdType a;
    public final ConversationIdType b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final long h;

    public ypm(MessageIdType messageIdType, ConversationIdType conversationIdType, int i, boolean z, boolean z2, String str, boolean z3, long j) {
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypm)) {
            return false;
        }
        ypm ypmVar = (ypm) obj;
        if (d.F(this.a, ypmVar.a) && d.F(this.b, ypmVar.b) && this.c == ypmVar.c && this.d == ypmVar.d && this.e == ypmVar.e && d.F(this.f, ypmVar.f) && this.g == ypmVar.g && this.h == ypmVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        boolean z = this.e;
        return (((((((((((hashCode2 * 31) + this.c) * 31) + a.v(this.d)) * 31) + a.v(z)) * 31) + hashCode) * 31) + a.v(this.g)) * 31) + a.A(this.h);
    }

    public final String toString() {
        return "MessageMetadataWrapper(messageId=" + this.a + ", conversationId=" + this.b + ", protocol=" + this.c + ", isIncoming=" + this.d + ", isOutgoing=" + this.e + ", senderParticipantId=" + this.f + ", isEncrypted=" + this.g + ", receivedTimestamp=" + this.h + ")";
    }
}
