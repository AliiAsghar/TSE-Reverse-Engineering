package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dno {
    public static final dno a = new dno(false, 0, 1, 1, dpc.a);
    public final boolean b;
    public final int c;
    public final int e;
    public final int f;
    public final dpc g;
    public final boolean d = true;
    private final dod h = null;

    public /* synthetic */ dno(boolean z, int i, int i2, int i3, dpc dpcVar) {
        this.b = z;
        this.c = i;
        this.e = i2;
        this.f = i3;
        this.g = dpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dno)) {
            return false;
        }
        dno dnoVar = (dno) obj;
        if (this.b != dnoVar.b || !a.bA(this.c, dnoVar.c)) {
            return false;
        }
        boolean z = dnoVar.d;
        if (!a.bA(this.e, dnoVar.e) || !a.bA(this.f, dnoVar.f)) {
            return false;
        }
        dod dodVar = dnoVar.h;
        if (d.F(null, null) && d.F(this.g, dnoVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((a.v(this.b) * 31) + this.c) * 31) + a.v(true)) * 31) + this.e) * 31) + this.f) * 961) + this.g.hashCode();
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=" + ((Object) dnt.a(this.c)) + ", autoCorrect=true, keyboardType=" + ((Object) dnu.a(this.e)) + ", imeAction=" + ((Object) dnn.a(this.f)) + ", platformImeOptions=null, hintLocales=" + this.g + ')';
    }
}
