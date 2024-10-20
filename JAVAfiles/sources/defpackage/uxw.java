package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxw {
    public final Set a;
    public final Set b;

    public uxw(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxw)) {
            return false;
        }
        uxw uxwVar = (uxw) obj;
        if (d.F(this.a, uxwVar.a) && d.F(this.b, uxwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AllowedAndDisallowedParticipants(allowedParticipants=" + this.a + ", disallowedParticipants=" + this.b + ")";
    }
}
