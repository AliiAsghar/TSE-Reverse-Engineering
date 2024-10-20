package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afja extends afje {
    private final int a;
    private final int b;
    private final Object c;

    public afja(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    @Override // defpackage.afje
    public final void a(no noVar) {
        noVar.v(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afja)) {
            return false;
        }
        afja afjaVar = (afja) obj;
        if (this.a == afjaVar.a && this.b == afjaVar.b && d.F(this.c, afjaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (((this.a * 31) + this.b) * 31) + hashCode;
    }

    public final String toString() {
        return "Changed(position=" + this.a + ", count=" + this.b + ", payload=" + this.c + ")";
    }
}
