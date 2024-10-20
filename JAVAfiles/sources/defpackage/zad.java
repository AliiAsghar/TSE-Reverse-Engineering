package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zad {
    public final int a;
    public final mkh b;

    public zad(mkh mkhVar, int i) {
        this.b = mkhVar;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        zad zadVar = (zad) obj;
        if (d.F(this.b, zadVar.b) && this.a == zadVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "PagedContactEntry(entry=" + this.b + ", position=" + this.a + ")";
    }
}
