package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vls {
    public final ConversationIdType a;
    public final long b;
    public final rru c;
    public final alog d;
    public final vmr e;
    public final int f;

    public vls() {
        throw null;
    }

    public static /* synthetic */ String a(msh mshVar) {
        return mshVar.o(((Boolean) new msn(17).get()).booleanValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vls) {
            vls vlsVar = (vls) obj;
            if (this.a.equals(vlsVar.a) && this.b == vlsVar.b && this.c.equals(vlsVar.c) && alzz.at(this.d, vlsVar.d) && this.e.equals(vlsVar.e) && this.f == vlsVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    public final String toString() {
        vmr vmrVar = this.e;
        alog alogVar = this.d;
        rru rruVar = this.c;
        return "ConversationAndMessagesData{conversationId=" + this.a.toString() + ", earliestTimestamp=" + this.b + ", conversationData=" + rruVar.toString() + ", messagesDataAsc=" + alogVar.toString() + ", latestIncomingMessageLineInfo=" + String.valueOf(vmrVar) + ", totalMessagesCount=" + this.f + "}";
    }

    public vls(ConversationIdType conversationIdType, long j, rru rruVar, alog alogVar, vmr vmrVar, int i) {
        this.a = conversationIdType;
        this.b = j;
        this.c = rruVar;
        if (alogVar == null) {
            throw new NullPointerException("Null messagesDataAsc");
        }
        this.d = alogVar;
        this.e = vmrVar;
        this.f = i;
    }
}
