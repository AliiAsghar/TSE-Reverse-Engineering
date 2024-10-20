package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kap {
    public final boolean a;
    public final String b;
    private final boolean c = true;

    public kap(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kap)) {
            return false;
        }
        kap kapVar = (kap) obj;
        if (this.a != kapVar.a) {
            return false;
        }
        boolean z = kapVar.c;
        if (d.F(this.b, kapVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + a.v(true)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SearchData(isCurrent=" + this.a + ", isMatched=true, query=" + this.b + ")";
    }
}
