package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ndu {
    public final Set a;

    public ndu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ndu) && d.F(this.a, ((ndu) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ")";
    }

    public /* synthetic */ ndu(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}
