package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anio {
    public final aqfl a;
    public final String b = "RCS";

    public anio(aqfl aqflVar, String str) {
        this.a = aqflVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anio)) {
            return false;
        }
        anio anioVar = (anio) obj;
        if (d.F(this.a, anioVar.a) && d.F(this.b, anioVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Configuration(clientInfo=" + this.a + ", appName=" + this.b + ")";
    }
}
