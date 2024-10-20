package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cde {
    public int a;

    public cde() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cde) && this.a == ((cde) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ cde(byte[] bArr) {
        this.a = 0;
    }
}
