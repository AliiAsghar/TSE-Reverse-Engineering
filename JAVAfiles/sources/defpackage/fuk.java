package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuk implements flj {
    private final euj a;
    private final euf b = new euf();
    private final int c;

    public fuk(int i, euj eujVar) {
        this.c = i;
        this.a = eujVar;
    }

    @Override // defpackage.flj
    public final fli a(flv flvVar, long j) {
        int l;
        int l2;
        fln flnVar = (fln) flvVar;
        long j2 = flnVar.b;
        long j3 = flnVar.c;
        int min = (int) Math.min(112800L, j2 - j3);
        this.b.F(min);
        flvVar.j(this.b.a, 0, min);
        euf eufVar = this.b;
        int i = eufVar.c;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (eufVar.b() >= 188 && (l2 = (l = dye.l(eufVar.a, eufVar.b, i)) + 188) <= i) {
            long m = dye.m(eufVar, l, this.c);
            if (m != -9223372036854775807L) {
                long b = this.a.b(m);
                if (b > j) {
                    if (j5 == -9223372036854775807L) {
                        return new fli(-1, b, j3);
                    }
                    return new fli(0, -9223372036854775807L, j3 + j6);
                }
                long j7 = l;
                if (100000 + b > j) {
                    return new fli(0, -9223372036854775807L, j3 + j7);
                }
                j6 = j7;
                j5 = b;
            }
            eufVar.J(l2);
            j4 = l2;
        }
        if (j5 != -9223372036854775807L) {
            return new fli(-2, j5, j3 + j4);
        }
        return fli.a;
    }

    @Override // defpackage.flj
    public final void b() {
        this.b.G(eul.f);
    }
}
