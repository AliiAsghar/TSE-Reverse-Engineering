package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbj extends nbk {
    private final MessageId a;
    private final nbg b;
    private final atok c;
    private final int f = 7;
    private final nba e = null;
    private final nbh d = nbh.b;

    public nbj(MessageId messageId, nbg nbgVar, atok atokVar) {
        this.a = messageId;
        this.b = nbgVar;
        this.c = atokVar;
    }

    @Override // defpackage.nbk
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.nbk
    public final nbg b() {
        return this.b;
    }

    @Override // defpackage.nbk
    public final nbh c() {
        return this.d;
    }

    @Override // defpackage.nbk
    public final atok d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbj)) {
            return false;
        }
        nbj nbjVar = (nbj) obj;
        if (!d.F(this.a, nbjVar.a) || !d.F(this.b, nbjVar.b)) {
            return false;
        }
        int i = nbjVar.f;
        if (!d.F(this.c, nbjVar.c)) {
            return false;
        }
        nba nbaVar = nbjVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        a.bm(7);
        return ((((hashCode * 31) + 7) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "ReactionRemoveInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", surface=" + ((Object) wch.l()) + ", traceId=" + this.c + ", removedReactionMetadata=null)";
    }
}
