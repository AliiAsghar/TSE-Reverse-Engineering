package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zan {
    public final String a;
    public final boolean b;
    public final arqg c;

    public zan(String str, boolean z, arqg arqgVar) {
        this.a = str;
        this.b = z;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zan)) {
            return false;
        }
        zan zanVar = (zan) obj;
        if (d.F(this.a, zanVar.a) && this.b == zanVar.b && d.F(this.c, zanVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DestinationUiData(displayDestination=" + this.a + ", isSelected=" + this.b + ", onClick=" + this.c + ")";
    }
}
