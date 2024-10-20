package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejb implements aejf {
    public final String a;
    private final String b;

    public aejb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejb)) {
            return false;
        }
        aejb aejbVar = (aejb) obj;
        if (d.F(this.a, aejbVar.a) && d.F(this.b, aejbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(fileSizeString=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
