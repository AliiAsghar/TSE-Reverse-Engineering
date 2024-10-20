package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cop extends cor {
    public final int a;
    private final clg b;
    private final long c;
    private final long d;
    private final long e;
    private float f;
    private ckv g;

    public /* synthetic */ cop(clg clgVar) {
        int i;
        int i2;
        long c = clgVar.c();
        long b = clgVar.b();
        this.b = clgVar;
        this.c = 0L;
        long j = (c << 32) | (b & 4294967295L);
        this.d = j;
        this.a = 1;
        if (dre.a(0L) >= 0 && dre.b(0L) >= 0 && (i = (int) (j >> 32)) >= 0 && (i2 = (int) (j & 4294967295L)) >= 0 && i <= clgVar.c() && i2 <= clgVar.b()) {
            this.e = j;
            this.f = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.cor
    public final long a() {
        return drj.c(this.e);
    }

    @Override // defpackage.cor
    protected final void b(cny cnyVar) {
        cnw.h(cnyVar, this.b, this.d, (Math.round(Float.intBitsToFloat((int) (cnyVar.o() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (cnyVar.o() & 4294967295L))) & 4294967295L), this.f, this.g, 1, 328);
    }

    @Override // defpackage.cor
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.cor
    protected final void d(ckv ckvVar) {
        this.g = ckvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cop)) {
            return false;
        }
        cop copVar = (cop) obj;
        if (!d.F(this.b, copVar.b)) {
            return false;
        }
        long j = copVar.c;
        if (!a.bB(0L, 0L) || !a.bB(this.d, copVar.d)) {
            return false;
        }
        int i = copVar.a;
        if (a.bA(1, 1)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + a.A(0L)) * 31) + a.A(this.d)) * 31) + 1;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.b);
        sb.append(", srcOffset=");
        sb.append((Object) dre.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) dri.c(this.d));
        sb.append(", filterQuality=");
        if (a.bA(1, 0)) {
            str = "None";
        } else if (a.bA(1, 1)) {
            str = "Low";
        } else if (a.bA(1, 2)) {
            str = "Medium";
        } else if (a.bA(1, 3)) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
