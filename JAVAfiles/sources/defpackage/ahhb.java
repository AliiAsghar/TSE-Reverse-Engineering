package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahhb {
    public static final long a = a.z(4.0f, 44.0f);
    public static final float b = 6.0f;
    public static final float c = 2.0f;
    public static final float d = 4.0f;

    public static final void a(float f, arqr arqrVar, cga cgaVar, boolean z, arqg arqgVar, bpt bptVar, ajr ajrVar, arqw arqwVar, arqw arqwVar2, arsy arsyVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c2 = bwjVar.c(1432189287);
        if (i5 == 0) {
            i3 = (true != c2.D(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= true != c2.I(arqrVar) ? 16 : 32;
        }
        if ((i & 896) == 0) {
            i3 |= true != c2.G(cgaVar) ? 128 : 256;
        }
        if ((i & 7168) == 0) {
            i3 |= true != c2.H(z) ? 1024 : 2048;
        }
        if ((i & 57344) == 0) {
            i3 |= true != c2.E(0) ? 8192 : 16384;
        }
        if ((i & 458752) == 0) {
            i3 |= true != c2.I(arqgVar) ? 65536 : 131072;
        }
        if ((i & 3670016) == 0) {
            i3 |= true != c2.G(bptVar) ? 524288 : 1048576;
        }
        if ((i & 29360128) == 0) {
            i3 |= true != c2.G(ajrVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 234881024) == 0) {
            i3 |= true != c2.I(arqwVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i & 1879048192) == 0) {
            i3 |= true != c2.I(arqwVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (true != c2.G(arsyVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((1533916891 & i3) == 306783378 && (i4 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            int i6 = i3 >> 3;
            int i7 = i3 & 234881024;
            int i8 = i3 & 1879048192;
            bpw.e(f, arqrVar, cgaVar, z, arqgVar, bptVar, ajrVar, arqwVar, arqwVar2, arsyVar, c2, (i3 & 8190) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | ((i3 << 9) & 29360128) | i7 | i8, i4 & 14);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new ahha(f, arqrVar, cgaVar, z, arqgVar, bptVar, ajrVar, arqwVar, arqwVar2, arsyVar, i, i2);
        }
    }

    public static final void b(float f, arqr arqrVar, cga cgaVar, boolean z, arsy arsyVar, arqg arqgVar, bpt bptVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        ajr ajrVar2;
        boolean z2;
        ajr ajrVar3;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 14;
        bwj c2 = bwjVar.c(1784046225);
        if (i9 == 0) {
            if (true != c2.D(f)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c2.I(arqrVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c2.G(cgaVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        int i10 = i2 | 3072;
        if ((i & 57344) == 0) {
            if (true != c2.G(arsyVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i10 |= i5;
        }
        int i11 = i10 | 196608;
        if ((i & 3670016) == 0) {
            if (true != c2.I(arqgVar)) {
                i4 = 524288;
            } else {
                i4 = 1048576;
            }
            i11 |= i4;
        }
        if ((i & 29360128) == 0) {
            if (true != c2.G(bptVar)) {
                i3 = 4194304;
            } else {
                i3 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i11 |= i3;
        }
        int i12 = i11 | 100663296;
        if ((191739611 & i12) == 38347922 && c2.L()) {
            c2.v();
            z3 = z;
            ajrVar3 = ajrVar;
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
                z2 = z;
                ajrVar2 = ajrVar;
            } else {
                c2.y(-1440047665);
                bwk bwkVar = (bwk) c2;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                ajrVar2 = (ajr) T;
                bwkVar.Y();
                z2 = true;
            }
            c2.n();
            int i13 = i12 & 7168;
            int i14 = i12 >> 3;
            int i15 = (i12 >> 12) & 14;
            a(f, arqrVar, cgaVar, z2, arqgVar, bptVar, ajrVar2, cdk.e(-289559339, new agib(ajrVar2, bptVar, z2, 3), c2), cdk.e(-723523020, new aeps(z2, bptVar, 3), c2), arsyVar, c2, (i12 & 14) | 905969664 | (i12 & 112) | (i12 & 896) | i13 | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128), i15);
            ajrVar3 = ajrVar2;
            z3 = z2;
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new ahgz(f, arqrVar, cgaVar, z3, arsyVar, arqgVar, bptVar, ajrVar3, i);
        }
    }
}
