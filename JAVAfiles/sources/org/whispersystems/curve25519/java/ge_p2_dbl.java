package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_p2_dbl {
    public static void ge_p2_dbl(ge_p1p1 ge_p1p1Var, ge_p2 ge_p2Var) {
        int[] iArr = new int[10];
        fe_sq.fe_sq(ge_p1p1Var.X, ge_p2Var.X);
        fe_sq.fe_sq(ge_p1p1Var.Z, ge_p2Var.Y);
        fe_sq2.fe_sq2(ge_p1p1Var.T, ge_p2Var.Z);
        fe_add.fe_add(ge_p1p1Var.Y, ge_p2Var.X, ge_p2Var.Y);
        fe_sq.fe_sq(iArr, ge_p1p1Var.Y);
        fe_add.fe_add(ge_p1p1Var.Y, ge_p1p1Var.Z, ge_p1p1Var.X);
        int[] iArr2 = ge_p1p1Var.Z;
        fe_sub.fe_sub(iArr2, iArr2, ge_p1p1Var.X);
        fe_sub.fe_sub(ge_p1p1Var.X, iArr, ge_p1p1Var.Y);
        int[] iArr3 = ge_p1p1Var.T;
        fe_sub.fe_sub(iArr3, iArr3, ge_p1p1Var.Z);
    }
}
