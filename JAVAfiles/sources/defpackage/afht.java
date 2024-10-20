package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afht extends aeke {
    public final afhq a;

    public afht(afhq afhqVar) {
        this.a = afhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afht) && d.F(this.a, ((afht) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Spanned(gridSizeLookup=" + this.a + ")";
    }
}
