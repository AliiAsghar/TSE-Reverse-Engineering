package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeio {
    public final boolean a;

    public aeio() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aeio) && this.a == ((aeio) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(fixAnnotationCrash=" + this.a + ")";
    }

    public aeio(boolean z) {
        this.a = z;
    }

    public /* synthetic */ aeio(byte[] bArr) {
        this(true);
    }
}
