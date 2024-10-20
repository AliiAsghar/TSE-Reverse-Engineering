package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenq {
    private final boolean a;

    public aenq(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenq)) {
            return false;
        }
        boolean z = ((aenq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(increaseMaxComposeRowHeight=false)";
    }

    public aenq() {
        this(null);
    }
}
