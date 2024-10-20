package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbs {
    public final ConversationIdType a;
    public final xhv b;
    public final String c;
    public final tqh d;
    public final boolean e;
    public final String f;
    public final String g;
    public final Optional h;
    public final vtm i;
    public final qei j;
    public final SelfIdentityId k;
    public final int l;
    public final qpd m;
    public final qwm n;

    public qbs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbs) {
            qbs qbsVar = (qbs) obj;
            if (this.a.equals(qbsVar.a) && this.b.equals(qbsVar.b) && this.c.equals(qbsVar.c) && this.d.equals(qbsVar.d) && this.e == qbsVar.e && this.f.equals(qbsVar.f) && this.g.equals(qbsVar.g) && this.h.equals(qbsVar.h) && this.i.equals(qbsVar.i) && this.j.equals(qbsVar.j) && this.k.equals(qbsVar.k) && this.l == qbsVar.l && this.m.equals(qbsVar.m) && this.n.equals(qbsVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((((((((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        qwm qwmVar = this.n;
        qpd qpdVar = this.m;
        SelfIdentityId selfIdentityId = this.k;
        qei qeiVar = this.j;
        vtm vtmVar = this.i;
        Optional optional = this.h;
        tqh tqhVar = this.d;
        xhv xhvVar = this.b;
        return "GroupConversationMetadata{conversationId=" + String.valueOf(this.a) + ", smsThreadId=" + String.valueOf(xhvVar) + ", name=" + this.c + ", groupNameSource=" + String.valueOf(tqhVar) + ", isUpgradeFromMmsGroup=" + this.e + ", rcsGroupId=" + this.f + ", rcsConferenceUri=" + this.g + ", rcsGroupSelfMsisdn=" + String.valueOf(optional) + ", rcsGroupCapabilities=" + String.valueOf(vtmVar) + ", currentActiveRcsMsisdn=" + String.valueOf(qeiVar) + ", selfParticipantId=" + String.valueOf(selfIdentityId) + ", joinState=" + this.l + ", errorState=" + String.valueOf(qpdVar) + ", selfSubscription=" + String.valueOf(qwmVar) + "}";
    }

    public qbs(ConversationIdType conversationIdType, xhv xhvVar, String str, tqh tqhVar, boolean z, String str2, String str3, Optional optional, vtm vtmVar, qei qeiVar, SelfIdentityId selfIdentityId, int i, qpd qpdVar, qwm qwmVar) {
        this.a = conversationIdType;
        this.b = xhvVar;
        this.c = str;
        this.d = tqhVar;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = optional;
        this.i = vtmVar;
        this.j = qeiVar;
        this.k = selfIdentityId;
        this.l = i;
        this.m = qpdVar;
        this.n = qwmVar;
    }
}
