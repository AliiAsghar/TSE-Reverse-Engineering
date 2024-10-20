package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ndw {
    public final Set a;

    public ndw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ndw) && d.F(this.a, ((ndw) obj).a)) {
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

    public /* synthetic */ ndw(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}
