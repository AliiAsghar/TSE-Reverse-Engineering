package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ius extends iut {
    private final SelfIdentityId a;
    private final wks b;
    private final ipq c;

    public ius(ipq ipqVar, SelfIdentityId selfIdentityId, wks wksVar) {
        if (ipqVar != null) {
            this.c = ipqVar;
            this.a = selfIdentityId;
            this.b = wksVar;
            return;
        }
        throw new NullPointerException("Null reactionSelectionData");
    }

    @Override // defpackage.iut
    public final SelfIdentityId a() {
        return this.a;
    }

    @Override // defpackage.iut
    public final wks b() {
        return this.b;
    }

    @Override // defpackage.iut
    public final ipq c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        SelfIdentityId selfIdentityId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iut) {
            iut iutVar = (iut) obj;
            if (this.c.equals(iutVar.c()) && ((selfIdentityId = this.a) != null ? selfIdentityId.equals(iutVar.a()) : iutVar.a() == null) && this.b.equals(iutVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() ^ 1000003;
        SelfIdentityId selfIdentityId = this.a;
        if (selfIdentityId == null) {
            hashCode = 0;
        } else {
            hashCode = selfIdentityId.hashCode();
        }
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        wks wksVar = this.b;
        SelfIdentityId selfIdentityId = this.a;
        return "ReactionBadgeClickEvent{reactionSelectionData=" + this.c.toString() + ", selfParticipantId=" + String.valueOf(selfIdentityId) + ", messageReactionsData=" + wksVar.toString() + "}";
    }
}
