package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjc extends afje {
    private final int a;
    private final int b;

    public afjc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afje
    public final void a(no noVar) {
        noVar.t(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afjc)) {
            return false;
        }
        afjc afjcVar = (afjc) obj;
        if (this.a == afjcVar.a && this.b == afjcVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Moved(from=" + this.a + ", to=" + this.b + ")";
    }
}
