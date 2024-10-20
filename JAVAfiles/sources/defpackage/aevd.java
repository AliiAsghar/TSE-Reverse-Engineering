package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevd {
    private final boolean a;

    public aevd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevd)) {
            return false;
        }
        boolean z = ((aevd) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "Flags(useRedesignedProgressBars=true)";
    }

    public /* synthetic */ aevd(byte[] bArr) {
        this.a = true;
    }
}
