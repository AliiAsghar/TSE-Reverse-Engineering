package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdo {
    private final axp a;
    private final long b;
    private final bdn c;
    private final boolean d;

    public bdo(axp axpVar, long j, bdn bdnVar, boolean z) {
        this.a = axpVar;
        this.b = j;
        this.c = bdnVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdo)) {
            return false;
        }
        bdo bdoVar = (bdo) obj;
        if (this.a == bdoVar.a && a.bB(this.b, bdoVar.b) && this.c == bdoVar.c && this.d == bdoVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.A(this.b)) * 31) + this.c.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) cjn.f(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
