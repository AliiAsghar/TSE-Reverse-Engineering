package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dow {
    public final dhv a;
    public final dob b;

    public dow(dhv dhvVar, dob dobVar) {
        this.a = dhvVar;
        this.b = dobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dow)) {
            return false;
        }
        dow dowVar = (dow) obj;
        if (d.F(this.a, dowVar.a) && d.F(this.b, dowVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
