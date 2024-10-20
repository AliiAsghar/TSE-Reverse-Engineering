package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adr {
    public final float a;
    public final cko b;

    public adr(float f, cko ckoVar) {
        this.a = f;
        this.b = ckoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adr)) {
            return false;
        }
        adr adrVar = (adr) obj;
        if (dqy.b(this.a, adrVar.a) && d.F(this.b, adrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) dqy.a(this.a)) + ", brush=" + this.b + ')';
    }
}
