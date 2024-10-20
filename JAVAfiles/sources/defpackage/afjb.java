package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjb extends afje {
    private final int a;
    private final int b;

    public afjb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afje
    public final void a(no noVar) {
        noVar.w(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afjb)) {
            return false;
        }
        afjb afjbVar = (afjb) obj;
        if (this.a == afjbVar.a && this.b == afjbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Inserted(position=" + this.a + ", count=" + this.b + ")";
    }
}
