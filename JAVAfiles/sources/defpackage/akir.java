package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akir {
    public final String a;
    public final String b;

    public akir(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akir)) {
            return false;
        }
        akir akirVar = (akir) obj;
        if (d.F(this.a, akirVar.a) && d.F(this.b, akirVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PackageAndFlagName(packageName=" + this.a + ", flagName=" + this.b + ")";
    }
}
