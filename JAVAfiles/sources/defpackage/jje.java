package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jje implements jjj {
    public final mis a;

    public jje(mis misVar) {
        this.a = misVar;
        if (misVar != mis.NONE) {
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jje) && this.a == ((jje) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledTransportCapabilityData(composeDisabledReason=" + this.a + ")";
    }
}
