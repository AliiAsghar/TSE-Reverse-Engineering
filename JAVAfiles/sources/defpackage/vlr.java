package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlr {
    public final Optional a;
    private final Optional b;

    public vlr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlr) {
            vlr vlrVar = (vlr) obj;
            if (this.a.equals(vlrVar.a) && this.b.equals(vlrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "WearableSpecificNotificationInfo{wearableActions=" + String.valueOf(this.a) + ", bridgeTag=" + String.valueOf(optional) + "}";
    }

    public vlr(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
