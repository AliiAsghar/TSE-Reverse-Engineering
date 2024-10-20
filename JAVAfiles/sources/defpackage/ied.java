package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ied implements Comparable {
    public final boolean a;
    public final boolean b;
    private final int c;
    private final boolean d;

    public ied(int i, boolean z, boolean z2, boolean z3) {
        this.c = i;
        this.d = z;
        this.a = z2;
        this.b = z3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ied iedVar = (ied) obj;
        iedVar.getClass();
        return arro.a(this.c, iedVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ied)) {
            return false;
        }
        ied iedVar = (ied) obj;
        if (this.c == iedVar.c && this.d == iedVar.d && this.a == iedVar.a && this.b == iedVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c * 31;
        boolean z = this.b;
        return ((((i + a.v(this.d)) * 31) + a.v(this.a)) * 31) + a.v(z);
    }

    public final String toString() {
        return "BannerPriority(weight=" + this.c + ", canBeShownAgain=" + this.d + ", canShowAfterAnotherBanner=" + this.a + ", anyOtherBannersCanShowAfterThis=" + this.b + ")";
    }

    public /* synthetic */ ied(int i, int i2) {
        this(i, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 8) != 0);
    }
}
