package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqr {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final euf g = new euf(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(flv flvVar, boolean z) {
        a();
        this.g.F(27);
        if (eef.l(flvVar, this.g.a, 27, z) && this.g.r() == 1332176723) {
            if (this.g.j() != 0) {
                if (z) {
                    return false;
                }
                throw new erm("unsupported bit stream revision", null, false, 1);
            }
            this.a = this.g.j();
            this.b = this.g.o();
            this.g.p();
            this.g.p();
            this.g.p();
            int j = this.g.j();
            this.c = j;
            this.d = j + 27;
            this.g.F(j);
            if (eef.l(flvVar, this.g.a, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.j();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(flv flvVar) {
        return d(flvVar, -1L);
    }

    public final boolean d(flv flvVar, long j) {
        boolean z;
        int c;
        fln flnVar = (fln) flvVar;
        if (flnVar.c == flvVar.e()) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.g.F(4);
        while (true) {
            if ((j == -1 || flnVar.c + 4 < j) && eef.l(flvVar, this.g.a, 4, true)) {
                this.g.J(0);
                if (this.g.r() == 1332176723) {
                    flvVar.l();
                    return true;
                }
                flvVar.m(1);
            }
        }
        do {
            if (j != -1 && flnVar.c >= j) {
                break;
            }
            c = flnVar.c(1);
            if (c == 0) {
                c = flnVar.b(flnVar.a, 0, Math.min(1, 4096), 0, true);
            }
            flnVar.h(c);
        } while (c != -1);
        return false;
    }
}
