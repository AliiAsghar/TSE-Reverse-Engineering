package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahgy {
    public static final ahgy a = new ahgy();

    private ahgy() {
    }

    public final void a(ajr ajrVar, cga cgaVar, bpt bptVar, boolean z, long j, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        long j2;
        cga cgaVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        ajrVar.getClass();
        int i7 = i & 14;
        bwj c = bwjVar.c(1538905591);
        if (i7 == 0) {
            if (true != c.G(ajrVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.G(bptVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i8 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(z)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i8 |= i4;
        }
        int i9 = i8 | 24576;
        if ((458752 & i) == 0) {
            if (true != c.G(this)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i9 |= i3;
        }
        if ((374491 & i9) == 74898 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            j2 = j;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                j2 = j;
            } else {
                cgaVar2 = cga.e;
                j2 = ahhb.a;
            }
            c.n();
            int i10 = i9 & 896;
            int i11 = i9 & 7168;
            int i12 = (i9 & 14) | 196608 | (i9 & 112) | i10 | i11;
            bpv.a.c(ajrVar, cgaVar2, bptVar, z, j2, c, i12 | (i9 & 57344));
            cgaVar3 = cgaVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgw(this, ajrVar, cgaVar3, bptVar, z, j2, i);
        }
    }

    public final void b(bqb bqbVar, cga cgaVar, boolean z, bpt bptVar, arqv arqvVar, float f, float f2, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        float f3;
        float f4;
        cga cgaVar2;
        arqv arqvVar2;
        float f5;
        float f6;
        cga cgaVar3;
        arqv arqvVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 14;
        bwj c = bwjVar.c(-376000574);
        if (i7 == 0) {
            if (true != c.G(bqbVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i8 |= i5;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(bptVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i8 |= i4;
        }
        if ((57344 & i) == 0) {
            i8 |= 8192;
        }
        int i9 = i8 | 1769472;
        if ((i & 29360128) == 0) {
            if (true != c.G(this)) {
                i3 = 4194304;
            } else {
                i3 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i9 |= i3;
        }
        if ((23967451 & i9) == 4793490 && c.L()) {
            c.v();
            cgaVar3 = cgaVar;
            arqvVar3 = arqvVar;
            f5 = f;
            f6 = f2;
        } else {
            int i10 = (-57345) & i9;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                arqvVar2 = arqvVar;
                f3 = f;
                f4 = f2;
            } else {
                cga.a aVar = cga.e;
                c.y(1770095907);
                if ((((i9 & 7168) ^ 3072) > 2048 && c.G(bptVar)) || (i9 & 3072) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (z2 || T == bwj.a.a) {
                    T = new ahhd(bptVar, 1);
                    bwkVar.ad(T);
                }
                bwkVar.Y();
                f3 = ahhb.b;
                f4 = ahhb.c;
                cgaVar2 = aVar;
                arqvVar2 = (arqv) T;
            }
            c.n();
            int i11 = i10 << 3;
            f5 = f3;
            f6 = f4;
            bpv.a.d(bqbVar, cgaVar2, z, bptVar, arqvVar2, null, f5, f6, c, (i9 & 7168) | (i9 & 14) | 100663304 | (i9 & 112) | (i9 & 896) | (3670016 & i11) | (29360128 & i11));
            cgaVar3 = cgaVar2;
            arqvVar3 = arqvVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new ahgx(this, bqbVar, cgaVar3, z, bptVar, arqvVar3, f5, f6, i);
        }
    }
}
