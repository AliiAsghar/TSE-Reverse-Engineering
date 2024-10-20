package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbc implements jbf {
    public final SelfIdentityId a;
    public final int b;

    public jbc(SelfIdentityId selfIdentityId, int i) {
        this.a = selfIdentityId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbc)) {
            return false;
        }
        jbc jbcVar = (jbc) obj;
        if (d.F(this.a, jbcVar.a) && this.b == jbcVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "AutomaticallySwitch(selfParticipantId=" + this.a + ", subscriptionId=" + this.b + ")";
    }
}
