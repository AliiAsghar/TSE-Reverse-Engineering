package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjd extends afje {
    public final int a;
    public final int b;

    public afjd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afje
    public final void a(no noVar) {
        noVar.x(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afjd)) {
            return false;
        }
        afjd afjdVar = (afjd) obj;
        if (this.a == afjdVar.a && this.b == afjdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Removed(position=" + this.a + ", count=" + this.b + ")";
    }
}
