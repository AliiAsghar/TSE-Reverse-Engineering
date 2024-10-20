package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjq {
    private final boolean a;

    public kjq(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjq)) {
            return false;
        }
        boolean z = ((kjq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(handleRbmAppBar=false)";
    }

    public kjq() {
        this(null);
    }
}
