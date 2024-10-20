package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryt {
    public final alog a;
    public final alog b;

    public ryt(alog alogVar, alog alogVar2) {
        this.a = alogVar;
        this.b = alogVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryt)) {
            return false;
        }
        ryt rytVar = (ryt) obj;
        if (d.F(this.a, rytVar.a) && d.F(this.b, rytVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsByProximity(localConversationParticipants=" + this.a + ", nonLocalConversationParticipants=" + this.b + ")";
    }
}
