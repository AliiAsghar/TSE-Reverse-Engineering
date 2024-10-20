package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsa {
    public final alhr a;
    public final long b;

    public vsa() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final xwa a() {
        return xwa.b((ConversationIdType) this.a.get(), xhv.b(this.b));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsa) {
            vsa vsaVar = (vsa) obj;
            if (this.a.equals(vsaVar.a) && this.b == vsaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SupplierConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadId=" + this.b + "}";
    }

    public vsa(alhr alhrVar, long j) {
        if (alhrVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = alhrVar;
        this.b = j;
    }
}
