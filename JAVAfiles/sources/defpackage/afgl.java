package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgl extends aeke {
    public final afri a = new afri(0.75f);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afgl) && d.F(this.a, ((afgl) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Full(aspectRatio=" + this.a + ")";
    }
}
