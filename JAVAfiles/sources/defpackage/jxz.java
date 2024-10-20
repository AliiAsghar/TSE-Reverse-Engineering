package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxz {
    public final kga a;
    public final khd b;
    public final ujn c;
    public final kjk d;
    public final jxr e;
    public final int f;
    public final MessageId g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Instant k;

    public jxz(kga kgaVar, khd khdVar, ujn ujnVar, kjk kjkVar, jxr jxrVar, int i, MessageId messageId, boolean z, boolean z2, boolean z3, Instant instant) {
        this.a = kgaVar;
        this.b = khdVar;
        this.c = ujnVar;
        this.d = kjkVar;
        this.e = jxrVar;
        this.f = i;
        this.g = messageId;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxz)) {
            return false;
        }
        jxz jxzVar = (jxz) obj;
        if (d.F(this.a, jxzVar.a) && d.F(this.b, jxzVar.b) && d.F(this.c, jxzVar.c) && d.F(this.d, jxzVar.d) && d.F(this.e, jxzVar.e) && this.f == jxzVar.f && d.F(this.g, jxzVar.g) && this.h == jxzVar.h && this.i == jxzVar.i && this.j == jxzVar.j && d.F(this.k, jxzVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        if (this.c == null) {
            int i = hashCode3 * 961;
            kjk kjkVar = this.d;
            int i2 = 0;
            if (kjkVar == null) {
                hashCode = 0;
            } else {
                hashCode = kjkVar.hashCode();
            }
            int hashCode4 = (((((i + hashCode) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
            MessageId messageId = this.g;
            if (messageId == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = messageId.hashCode();
            }
            int v = (((((((hashCode4 + hashCode2) * 31) + a.v(this.h)) * 31) + a.v(this.i)) * 31) + a.v(this.j)) * 31;
            Instant instant = this.k;
            if (instant != null) {
                i2 = instant.hashCode();
            }
            return v + i2;
        }
        throw null;
    }

    public final String toString() {
        return "MessagesFlowRequirements(messageListPagingData=" + this.a + ", selectionData=" + this.b + ", currentHit=" + this.c + ", searchResults=" + this.d + ", conversationProperties=" + this.e + ", selfIdentitiesCount=" + this.f + ", messageIdWithLastReadMarker=" + this.g + ", lastReadMarkerVisibility=" + this.h + ", isCurrentlyPinching=" + this.i + ", isPenpalConversation=" + this.j + ", latestReadMessageTimestamp=" + this.k + ")";
    }
}
