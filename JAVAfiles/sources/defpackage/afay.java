package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afay {
    private final boolean a;

    public afay() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afay)) {
            return false;
        }
        boolean z = ((afay) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(useRevisedLayout=false)";
    }

    public /* synthetic */ afay(byte[] bArr) {
        this.a = false;
    }
}
