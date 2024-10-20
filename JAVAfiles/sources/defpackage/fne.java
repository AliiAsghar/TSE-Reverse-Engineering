package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fne implements flj {
    private final flz a;
    private final int b;
    private final vtk c = new vtk((byte[]) null);

    public fne(flz flzVar, int i) {
        this.a = flzVar;
        this.b = i;
    }

    private final long c(flv flvVar) {
        fln flnVar;
        while (true) {
            flnVar = (fln) flvVar;
            if (flvVar.e() >= flnVar.b - 6) {
                break;
            }
            flz flzVar = this.a;
            int i = this.b;
            vtk vtkVar = this.c;
            long e = flvVar.e();
            byte[] bArr = new byte[2];
            flvVar.j(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                flvVar.l();
                flvVar.g((int) (e - flnVar.c));
            } else {
                euf eufVar = new euf(16);
                System.arraycopy(bArr, 0, eufVar.a, 0, 2);
                eufVar.I(eef.h(flvVar, eufVar.a, 2, 14));
                flvVar.l();
                flvVar.g((int) (e - flnVar.c));
                if (eef.n(eufVar, flzVar, i, vtkVar)) {
                    break;
                }
            }
            flvVar.g(1);
        }
        long e2 = flvVar.e();
        long j = flnVar.b;
        if (e2 >= (-6) + j) {
            flvVar.g((int) (j - flvVar.e()));
            return this.a.j;
        }
        return this.c.a;
    }

    @Override // defpackage.flj
    public final fli a(flv flvVar, long j) {
        long j2 = ((fln) flvVar).c;
        int i = this.a.c;
        long c = c(flvVar);
        long e = flvVar.e();
        flvVar.g(Math.max(6, i));
        long c2 = c(flvVar);
        long e2 = flvVar.e();
        if (c <= j && c2 > j) {
            return new fli(0, -9223372036854775807L, e);
        }
        if (c2 <= j) {
            return new fli(-2, c2, e2);
        }
        return new fli(-1, c, j2);
    }

    @Override // defpackage.flj
    public final /* synthetic */ void b() {
    }
}
