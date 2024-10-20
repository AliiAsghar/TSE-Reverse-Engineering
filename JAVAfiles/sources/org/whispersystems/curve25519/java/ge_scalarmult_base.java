package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_scalarmult_base {
    static void cmov(ge_precomp ge_precompVar, ge_precomp ge_precompVar2, int i) {
        fe_cmov.fe_cmov(ge_precompVar.yplusx, ge_precompVar2.yplusx, i);
        fe_cmov.fe_cmov(ge_precompVar.yminusx, ge_precompVar2.yminusx, i);
        fe_cmov.fe_cmov(ge_precompVar.xy2d, ge_precompVar2.xy2d, i);
    }

    static int equal(byte b, byte b2) {
        return ((b ^ b2) - 1) >>> 31;
    }

    public static void ge_scalarmult_base(ge_p3 ge_p3Var, byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        ge_p1p1 ge_p1p1Var = new ge_p1p1();
        ge_p2 ge_p2Var = new ge_p2();
        ge_precomp ge_precompVar = new ge_precomp();
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] >>> 4) & 15);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = ((byte) (b + 8)) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        ge_p3_0.ge_p3_0(ge_p3Var);
        for (i = 1; i < 64; i += 2) {
            select(ge_precompVar, i / 2, bArr2[i]);
            ge_madd.ge_madd(ge_p1p1Var, ge_p3Var, ge_precompVar);
            ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3Var, ge_p1p1Var);
        }
        ge_p3_dbl.ge_p3_dbl(ge_p1p1Var, ge_p3Var);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2Var, ge_p1p1Var);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1Var, ge_p2Var);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2Var, ge_p1p1Var);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1Var, ge_p2Var);
        ge_p1p1_to_p2.ge_p1p1_to_p2(ge_p2Var, ge_p1p1Var);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1Var, ge_p2Var);
        ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3Var, ge_p1p1Var);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            select(ge_precompVar, i7 / 2, bArr2[i7]);
            ge_madd.ge_madd(ge_p1p1Var, ge_p3Var, ge_precompVar);
            ge_p1p1_to_p3.ge_p1p1_to_p3(ge_p3Var, ge_p1p1Var);
        }
    }

    static int negative(byte b) {
        return (int) (b >>> 63);
    }

    static void select(ge_precomp ge_precompVar, int i, byte b) {
        ge_precomp[][] ge_precompVarArr;
        if (i <= 7) {
            ge_precompVarArr = ge_precomp_base_0_7.base;
        } else if (i <= 15) {
            ge_precompVarArr = ge_precomp_base_8_15.base;
        } else if (i <= 23) {
            ge_precompVarArr = ge_precomp_base_16_23.base;
        } else {
            ge_precompVarArr = ge_precomp_base_24_31.base;
        }
        ge_precomp ge_precompVar2 = new ge_precomp();
        int negative = negative(b);
        int i2 = (-negative) & b;
        ge_precomp_0.ge_precomp_0(ge_precompVar);
        byte b2 = (byte) (b - (i2 + i2));
        cmov(ge_precompVar, ge_precompVarArr[i][0], equal(b2, (byte) 1));
        cmov(ge_precompVar, ge_precompVarArr[i][1], equal(b2, (byte) 2));
        cmov(ge_precompVar, ge_precompVarArr[i][2], equal(b2, (byte) 3));
        cmov(ge_precompVar, ge_precompVarArr[i][3], equal(b2, (byte) 4));
        cmov(ge_precompVar, ge_precompVarArr[i][4], equal(b2, (byte) 5));
        cmov(ge_precompVar, ge_precompVarArr[i][5], equal(b2, (byte) 6));
        cmov(ge_precompVar, ge_precompVarArr[i][6], equal(b2, (byte) 7));
        cmov(ge_precompVar, ge_precompVarArr[i][7], equal(b2, (byte) 8));
        fe_copy.fe_copy(ge_precompVar2.yplusx, ge_precompVar.yminusx);
        fe_copy.fe_copy(ge_precompVar2.yminusx, ge_precompVar.yplusx);
        fe_neg.fe_neg(ge_precompVar2.xy2d, ge_precompVar.xy2d);
        cmov(ge_precompVar, ge_precompVar2, negative);
    }
}
