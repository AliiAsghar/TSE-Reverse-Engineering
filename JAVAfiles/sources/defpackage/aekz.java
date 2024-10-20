package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekz implements aelb {
    public final String a;
    public final aeli b;
    private final int c;

    public aekz() {
        aeli aeliVar = new aeli(null);
        this.c = 0;
        this.a = null;
        this.b = aeliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekz)) {
            return false;
        }
        aekz aekzVar = (aekz) obj;
        int i = aekzVar.c;
        String str = aekzVar.a;
        if (d.F(null, null) && d.F(this.b, aekzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        this.b.hashCode();
        return 32;
    }

    public final String toString() {
        return "Star(count=0, contentDescription=null, style=" + this.b + ")";
    }
}
