package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqk {
    private final afqo a;

    public afqk(afqo afqoVar) {
        this.a = afqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afqk) && d.F(this.a, ((afqk) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Identifier(gifStickerMediaIdentifier=" + this.a + ")";
    }
}
