package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbh {
    private final boolean a;

    public kbh(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbh)) {
            return false;
        }
        boolean z = ((kbh) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=false)";
    }

    public kbh() {
        this(null);
    }
}
