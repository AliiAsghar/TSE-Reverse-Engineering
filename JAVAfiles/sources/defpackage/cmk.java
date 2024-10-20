package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cmk {
    public final String a;
    public final long b;
    public final int c;

    public cmk(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
        } else {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, cmk cmkVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cmk cmkVar = (cmk) obj;
        if (this.c != cmkVar.c || !d.F(this.a, cmkVar.a)) {
            return false;
        }
        return a.bB(this.b, cmkVar.b);
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) cmj.a(this.b)) + ')';
    }
}
