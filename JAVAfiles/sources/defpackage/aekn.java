package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekn {
    public final int a;

    public /* synthetic */ aekn(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i >= 0 && i < 101) {
        } else {
            throw new IllegalArgumentException(a.cq(i, " is an invalid Amplitude. Should be between 0 and 100."));
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aekn) && this.a == ((aekn) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Amplitude(value=" + this.a + ")";
    }
}
