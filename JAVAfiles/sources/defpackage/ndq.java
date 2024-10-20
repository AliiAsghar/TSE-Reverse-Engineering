package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndq {
    public final String a;

    public ndq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ndq)) {
            return false;
        }
        return this.a.equals(((ndq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
