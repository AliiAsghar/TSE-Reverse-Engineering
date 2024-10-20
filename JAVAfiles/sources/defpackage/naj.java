package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class naj implements nak {
    public final akul a;
    public final int b;

    public naj(akul akulVar, int i) {
        this.a = akulVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naj)) {
            return false;
        }
        naj najVar = (naj) obj;
        if (d.F(this.a, najVar.a) && this.b == najVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Loading(future=" + this.a + ", limit=" + this.b + ")";
    }
}
