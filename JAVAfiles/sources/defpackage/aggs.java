package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggs {
    public final int a;

    public final boolean equals(Object obj) {
        if ((obj instanceof aggs) && this.a == ((aggs) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AudioLevel(value=" + this.a + ")";
    }
}
