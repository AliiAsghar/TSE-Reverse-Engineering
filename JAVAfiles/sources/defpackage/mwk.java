package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwk {
    public final int a;

    public mwk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mwk) && this.a == ((mwk) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "SatelliteConfigImpl(maxMessageSize=" + this.a + ")";
    }
}
