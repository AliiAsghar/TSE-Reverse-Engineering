package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekh {
    public final boolean a;

    public aekh() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekh)) {
            return false;
        }
        boolean z = ((aekh) obj).a;
        return true;
    }

    public final int hashCode() {
        return a.v(false);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=false)";
    }

    public aekh(byte[] bArr) {
        this.a = false;
    }

    public /* synthetic */ aekh(char[] cArr) {
        this((byte[]) null);
    }
}
