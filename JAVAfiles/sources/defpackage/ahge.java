package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahge {
    public static final bin a = new bin(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(blh blhVar, bpk bpkVar, bse bseVar, arqv arqvVar, bwj bwjVar, int i, int i2) {
        blh blhVar2;
        int i3;
        bpk bpkVar2;
        bse bseVar2;
        int i4;
        arqvVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(648134875);
        if (i5 == 0) {
            int i6 = 2;
            if ((i2 & 1) == 0) {
                blhVar2 = blhVar;
                if (c.G(blhVar2)) {
                    i6 = 4;
                }
            } else {
                blhVar2 = blhVar;
            }
            i3 = i6 | i;
        } else {
            blhVar2 = blhVar;
            i3 = i;
        }
        if ((i & 112) == 0) {
            int i7 = 16;
            if ((i2 & 2) == 0) {
                bpkVar2 = bpkVar;
                if (c.G(bpkVar2)) {
                    i7 = 32;
                }
            } else {
                bpkVar2 = bpkVar;
            }
            i3 |= i7;
        } else {
            bpkVar2 = bpkVar;
        }
        if ((i & 896) == 0) {
            int i8 = 128;
            if ((i2 & 4) == 0) {
                bseVar2 = bseVar;
                if (c.G(bseVar2)) {
                    i8 = 256;
                }
            } else {
                bseVar2 = bseVar;
            }
            i3 |= i8;
        } else {
            bseVar2 = bseVar;
        }
        if ((i & 7168) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170 && c.L()) {
            c.v();
        } else {
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            int i11 = i2 & 1;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                if (i11 != 0) {
                    i3 &= -15;
                }
                if (i10 != 0) {
                    i3 &= -113;
                }
                if (i9 != 0) {
                    i3 &= -897;
                }
            } else {
                if (i11 != 0) {
                    i3 &= -15;
                    blhVar2 = ahji.aa(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
                }
                if (i10 != 0) {
                    i3 &= -113;
                    bpkVar2 = ahgv.a;
                }
                if (i9 != 0) {
                    i3 &= -897;
                    bseVar2 = ahji.R();
                }
            }
            c.n();
            int i12 = i3 & 14;
            int i13 = i3 << 3;
            int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
            b(blhVar2, new ahgl(), bpkVar2, bseVar2, arqvVar, c, i14);
        }
        blh blhVar3 = blhVar2;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeme(blhVar3, bpkVar2, bseVar2, arqvVar, i, i2, 5);
        }
    }

    public static final void b(blh blhVar, bnt bntVar, bpk bpkVar, bse bseVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 14;
        bwj c = bwjVar.c(2124579738);
        if (i8 == 0) {
            if (true != c.G(blhVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(bntVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (true != c.G(bpkVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(bseVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            c.y(-816036754);
            c.y(-1957191093);
            long j = blhVar.a;
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                f = ckw.f(cku.d(j), cku.c(j), cku.b(j), 0.4f, cku.f(j));
                T = new bfo(j, f);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            bwkVar.Y();
            int i9 = i2 & 896;
            bmq.a(blhVar, bntVar, bpkVar, bseVar, cdk.e(1798917965, new aezg((bfo) T, arqvVar, 19), c), c, (i2 & 14) | 24576 | (i2 & 112) | i9 | (i2 & 7168));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aahs(blhVar, bntVar, bpkVar, bseVar, arqvVar, i, 6);
        }
    }
}
