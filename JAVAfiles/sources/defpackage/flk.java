package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flk {
    public final fle a;
    protected final flj b;
    protected flg c;
    private final int d;

    public flk(flh flhVar, flj fljVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fljVar;
        this.d = i;
        this.a = new fle(flhVar, j, j2, j3, j4, j5);
    }

    protected static final boolean d(flv flvVar, long j) {
        long j2 = j - ((fln) flvVar).c;
        if (j2 >= 0 && j2 <= 262144) {
            flvVar.m((int) j2);
            return true;
        }
        return false;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    protected static final int g(flv flvVar, long j, vtk vtkVar) {
        if (j == ((fln) flvVar).c) {
            return 0;
        }
        vtkVar.a = j;
        return 1;
    }

    public final void a(long j) {
        flg flgVar = this.c;
        if (flgVar != null && flgVar.a == j) {
            return;
        }
        fle fleVar = this.a;
        this.c = new flg(j, fleVar.a.a(j), fleVar.b, fleVar.c, fleVar.d, fleVar.e);
    }

    public final boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    protected final void c() {
        this.c = null;
        this.b.b();
    }

    public final int f(flv flvVar, vtk vtkVar) {
        while (true) {
            flg flgVar = this.c;
            dzg.h(flgVar);
            long j = flgVar.e;
            long j2 = flgVar.f - j;
            int i = this.d;
            long j3 = flgVar.g;
            if (j2 <= i) {
                c();
                return g(flvVar, j, vtkVar);
            }
            if (!d(flvVar, j3)) {
                return g(flvVar, j3, vtkVar);
            }
            flvVar.l();
            fli a = this.b.a(flvVar, flgVar.b);
            int i2 = a.b;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        d(flvVar, a.d);
                        c();
                        return g(flvVar, a.d, vtkVar);
                    }
                    long j4 = a.c;
                    long j5 = a.d;
                    flgVar.d = j4;
                    flgVar.f = j5;
                    flgVar.b();
                } else {
                    long j6 = a.c;
                    long j7 = a.d;
                    flgVar.c = j6;
                    flgVar.e = j7;
                    flgVar.b();
                }
            } else {
                c();
                return g(flvVar, j3, vtkVar);
            }
        }
    }
}
