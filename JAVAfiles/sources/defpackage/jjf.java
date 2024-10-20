package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjf {
    public final int a;

    public jjf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jjf) && this.a == ((jjf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DirectSendIconData(legacyLocationSendIconType=" + this.a + ")";
    }
}
