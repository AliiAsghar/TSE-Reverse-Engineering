package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahhf {
    public static final ahhf a = new ahhf();

    private ahhf() {
    }

    public final void a(cga cgaVar, float f, long j, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga a2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1305604946);
        if (i4 == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= 16;
        }
        if ((i & 896) == 0) {
            i2 |= 128;
        }
        if ((i2 & 731) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            } else {
                int i5 = ahhs.a;
                j = ahji.ab(26, c2);
                f = 3.0f;
            }
            c2.n();
            c = amv.c(cgaVar, 1.0f);
            a2 = adf.a(amv.d(c, f), j, clw.a);
            akc.b(a2, c2, 0);
        }
        float f2 = f;
        long j2 = j;
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new ahhe(this, cgaVar, f2, j2, i);
        }
    }
}
