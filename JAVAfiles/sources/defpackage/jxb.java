package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxb {
    public final int a;
    public final ahhm b;
    public final int c;

    public jxb(int i, ahhm ahhmVar, int i2) {
        ahhmVar.getClass();
        this.a = i;
        this.b = ahhmVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxb)) {
            return false;
        }
        jxb jxbVar = (jxb) obj;
        if (this.a == jxbVar.a && d.F(this.b, jxbVar.b) && this.c == jxbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ExampleTheme(id=" + this.a + ", tonalPalette=" + this.b + ", nameResId=" + this.c + ")";
    }
}
