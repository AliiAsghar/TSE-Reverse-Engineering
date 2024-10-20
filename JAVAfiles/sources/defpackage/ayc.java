package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayc {
    public static final ayc a;
    public final int b;
    public final int c;
    private final Boolean d;
    private final int e;
    private final dod f;
    private final Boolean g;
    private final dpc h;

    static {
        int i = 0;
        a = new ayc(i, i, i, 127);
    }

    public /* synthetic */ ayc(int i, int i2, int i3, int i4) {
        this.b = 1 == (i4 & 1) ? -1 : i;
        this.d = null;
        this.c = (i4 & 4) != 0 ? 0 : i2;
        this.e = (i4 & 8) != 0 ? -1 : i3;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final dno a(boolean z) {
        int i;
        int i2;
        dnt dntVar = new dnt(this.b);
        dnn dnnVar = null;
        int i3 = 1;
        if (true == a.bA(dntVar.a, -1)) {
            dntVar = null;
        }
        if (dntVar != null) {
            i = dntVar.a;
        } else {
            i = 0;
        }
        dnu dnuVar = new dnu(this.c);
        if (true == a.bA(dnuVar.a, 0)) {
            dnuVar = null;
        }
        if (dnuVar != null) {
            i2 = dnuVar.a;
        } else {
            i2 = 1;
        }
        dnn dnnVar2 = new dnn(this.e);
        if (true != a.bA(dnnVar2.a, -1)) {
            dnnVar = dnnVar2;
        }
        if (dnnVar != null) {
            i3 = dnnVar.a;
        }
        return new dno(z, i, i2, i3, dpc.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayc)) {
            return false;
        }
        ayc aycVar = (ayc) obj;
        if (!a.bA(this.b, aycVar.b)) {
            return false;
        }
        Boolean bool = aycVar.d;
        if (!d.F(null, null) || !a.bA(this.c, aycVar.c) || !a.bA(this.e, aycVar.e)) {
            return false;
        }
        dod dodVar = aycVar.f;
        if (!d.F(null, null)) {
            return false;
        }
        Boolean bool2 = aycVar.g;
        if (!d.F(null, null)) {
            return false;
        }
        dpc dpcVar = aycVar.h;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b * 961) + this.c) * 31) + this.e) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) dnt.a(this.b)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) dnu.a(this.c)) + ", imeAction=" + ((Object) dnn.a(this.e)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
