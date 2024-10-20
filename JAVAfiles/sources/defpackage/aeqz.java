package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqz {
    private final boolean a;

    public aeqz(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqz)) {
            return false;
        }
        boolean z = ((aeqz) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=false)";
    }

    public aeqz() {
        this(null);
    }
}
