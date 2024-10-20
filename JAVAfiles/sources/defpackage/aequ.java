package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aequ {
    private final boolean a;

    public aequ(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aequ)) {
            return false;
        }
        boolean z = ((aequ) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=false)";
    }

    public aequ() {
        this(null);
    }
}
