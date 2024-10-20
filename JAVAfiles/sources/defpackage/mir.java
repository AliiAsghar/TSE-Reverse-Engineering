package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mir extends Exception {
    public final int a;

    public mir() {
        super("Compose constraint violated because: SELFIDENTITY_UNAVAILABLE.");
        this.a = 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mir) || ((mir) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return i;
    }

    public mir(int i, String str) {
        super(str);
        this.a = i;
    }
}
