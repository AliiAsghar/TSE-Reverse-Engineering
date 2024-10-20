package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lla implements lkg {
    public final String a;
    public final se b;
    public final Object c;
    public final efu d;

    public lla(String str, se seVar, Object obj, efu efuVar) {
        str.getClass();
        seVar.getClass();
        this.a = str;
        this.b = seVar;
        this.c = obj;
        this.d = efuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lla)) {
            return false;
        }
        lla llaVar = (lla) obj;
        if (d.F(this.a, llaVar.a) && d.F(this.b, llaVar.b) && d.F(this.c, llaVar.c) && d.F(this.d, llaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Object obj = this.c;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        efu efuVar = this.d;
        if (efuVar != null) {
            i = efuVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ActivityResult(key=" + this.a + ", contract=" + this.b + ", input=" + this.c + ", options=" + this.d + ")";
    }
}
