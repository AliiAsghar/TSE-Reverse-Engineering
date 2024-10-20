package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbb implements afbd {
    public final boolean a;
    public final float b;
    public final afay c;

    public afbb(boolean z, float f, afay afayVar) {
        this.a = z;
        this.b = f;
        this.c = afayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbb)) {
            return false;
        }
        afbb afbbVar = (afbb) obj;
        if (this.a == afbbVar.a && Float.compare(this.b, afbbVar.b) == 0 && d.F(this.c, afbbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1237;
    }

    public final String toString() {
        return "LoadingInProgress(visible=" + this.a + ", loadingProgress=" + this.b + ", flags=" + this.c + ")";
    }

    public afbb() {
        this(true, brg.a, new afay(null));
    }

    @Override // defpackage.afbd
    public final void b() {
    }
}
