package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekx implements aelb {
    public final String a;
    public final float b;
    public final int c;
    public final String d;
    public final aeli e;
    private final String f;

    public aekx(String str, String str2, float f, int i, String str3, aeli aeliVar) {
        this.f = str;
        this.a = str2;
        this.b = f;
        this.c = i;
        this.d = str3;
        this.e = aeliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekx)) {
            return false;
        }
        aekx aekxVar = (aekx) obj;
        if (d.F(this.f, aekxVar.f) && d.F(this.a, aekxVar.a) && Float.compare(this.b, aekxVar.b) == 0 && this.c == aekxVar.c && d.F(this.d, aekxVar.d) && d.F(this.e, aekxVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d.hashCode();
        this.e.hashCode();
        return (hashCode * 31) + 32;
    }

    public final String toString() {
        return "Emotify(id=" + this.f + ", uri=" + this.a + ", scale=" + this.b + ", count=" + this.c + ", contentDescription=" + this.d + ", style=" + this.e + ")";
    }
}
