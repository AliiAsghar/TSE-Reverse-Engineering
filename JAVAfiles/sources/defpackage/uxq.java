package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxq {
    public final Map a;
    public final Set b;
    public final Set c;

    public uxq(Map map, Set set, Set set2) {
        this.a = map;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxq)) {
            return false;
        }
        uxq uxqVar = (uxq) obj;
        if (d.F(this.a, uxqVar.a) && d.F(this.b, uxqVar.b) && d.F(this.c, uxqVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsData(conversationsToParticipants=" + this.a + ", currentDisallowedConversations=" + this.b + ", participants=" + this.c + ")";
    }
}
