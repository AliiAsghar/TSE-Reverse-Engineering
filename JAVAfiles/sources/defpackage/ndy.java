package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndy {
    public final Set a;
    public final AtomicBoolean b;

    public ndy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndy)) {
            return false;
        }
        ndy ndyVar = (ndy) obj;
        if (d.F(this.a, ndyVar.a) && d.F(this.b, ndyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ", withSelfParticipants=" + this.b + ")";
    }

    public /* synthetic */ ndy(byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = linkedHashSet;
        this.b = atomicBoolean;
    }
}
