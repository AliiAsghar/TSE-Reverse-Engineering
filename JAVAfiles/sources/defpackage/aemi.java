package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemi {
    public final String a;
    private final aerb b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemi)) {
            return false;
        }
        aemi aemiVar = (aemi) obj;
        if (!d.F(this.a, aemiVar.a)) {
            return false;
        }
        aerb aerbVar = aemiVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "CardstoneTitle(title=" + this.a + ", icon=null)";
    }
}
