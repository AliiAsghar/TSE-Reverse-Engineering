package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbu {
    public final aerk a;
    public final afbv b;

    public afbu(aerk aerkVar, afbv afbvVar) {
        afbvVar.getClass();
        this.a = aerkVar;
        this.b = afbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbu)) {
            return false;
        }
        afbu afbuVar = (afbu) obj;
        if (d.F(this.a, afbuVar.a) && this.b == afbuVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AnimatedEmojiUiData(mddFile=" + this.a + ", position=" + this.b + ")";
    }
}
