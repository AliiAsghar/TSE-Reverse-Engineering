package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcq {
    public final long a;
    public final ConversationIdType b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final yiy f;

    public lcq() {
        throw null;
    }

    public static lcp a() {
        lcp lcpVar = new lcp();
        lcpVar.g(-1L);
        lcpVar.b(ruy.a);
        lcpVar.c(false);
        lcpVar.e(-1);
        aozy createBuilder = yiy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yiy.b((yiy) createBuilder.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        yiy.a((yiy) createBuilder.b);
        lcpVar.f((yiy) createBuilder.s());
        lcpVar.d(false);
        return lcpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lcq) {
            lcq lcqVar = (lcq) obj;
            if (this.a == lcqVar.a && this.b.equals(lcqVar.b) && this.c == lcqVar.c && this.d == lcqVar.d && this.e == lcqVar.e && this.f.equals(lcqVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i2 = 1237;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.d) {
            i2 = 1231;
        }
        return ((((i3 ^ i2) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        yiy yiyVar = this.f;
        return "QueryParams{sortTimestamp=" + this.a + ", conversationId=" + String.valueOf(this.b) + ", conversationIsPinned=" + this.c + ", isWear=" + this.d + ", limit=" + this.e + ", nudgeSettingsData=" + String.valueOf(yiyVar) + "}";
    }

    public lcq(long j, ConversationIdType conversationIdType, boolean z, boolean z2, int i, yiy yiyVar) {
        this.a = j;
        this.b = conversationIdType;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = yiyVar;
    }
}
