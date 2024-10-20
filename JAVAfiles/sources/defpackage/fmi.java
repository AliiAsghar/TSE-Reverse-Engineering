package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmi {
    public final fml a;
    public final fml b;

    public fmi(fml fmlVar, fml fmlVar2) {
        this.a = fmlVar;
        this.b = fmlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fmi fmiVar = (fmi) obj;
            if (this.a.equals(fmiVar.a) && this.b.equals(fmiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String concat;
        fml fmlVar = this.a;
        fml fmlVar2 = this.b;
        String obj = fmlVar.toString();
        if (fmlVar.equals(fmlVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.b.toString());
        }
        return "[" + obj + concat + "]";
    }
}
