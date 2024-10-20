package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxr {
    public final Set a;
    public final Set b;

    public uxr(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxr)) {
            return false;
        }
        uxr uxrVar = (uxr) obj;
        if (d.F(this.a, uxrVar.a) && d.F(this.b, uxrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationWithAllowlistStatusChanged(toDisallowedConversation=" + this.a + ", toAllowedConversation=" + this.b + ")";
    }
}
