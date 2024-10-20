package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmi implements dlh {
    public final int a;
    public final dlw b;
    private final dlx c;
    private final int d = 0;
    private final int e = 0;

    public dmi(int i, dlx dlxVar, dlw dlwVar) {
        this.a = i;
        this.c = dlxVar;
        this.b = dlwVar;
    }

    @Override // defpackage.dlh
    public final int a() {
        return 0;
    }

    @Override // defpackage.dlh
    public final dlx b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmi)) {
            return false;
        }
        dmi dmiVar = (dmi) obj;
        if (this.a == dmiVar.a && d.F(this.c, dmiVar.c)) {
            int i = dmiVar.d;
            if (a.bA(0, 0) && d.F(this.b, dmiVar.b)) {
                int i2 = dmiVar.e;
                if (a.bA(0, 0)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.h) * 29791) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.c + ", style=" + ((Object) dls.a(0)) + ", loadingStrategy=" + ((Object) dlr.a(0)) + ')';
    }

    @Override // defpackage.dlh
    public final void c() {
    }
}
