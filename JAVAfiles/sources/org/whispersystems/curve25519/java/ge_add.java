package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_add {
    public static void ge_add(ge_p1p1 ge_p1p1Var, ge_p3 ge_p3Var, ge_cached ge_cachedVar) {
        int[] iArr = new int[10];
        fe_add.fe_add(ge_p1p1Var.X, ge_p3Var.Y, ge_p3Var.X);
        fe_sub.fe_sub(ge_p1p1Var.Y, ge_p3Var.Y, ge_p3Var.X);
        fe_mul.fe_mul(ge_p1p1Var.Z, ge_p1p1Var.X, ge_cachedVar.YplusX);
        int[] iArr2 = ge_p1p1Var.Y;
        fe_mul.fe_mul(iArr2, iArr2, ge_cachedVar.YminusX);
        fe_mul.fe_mul(ge_p1p1Var.T, ge_cachedVar.T2d, ge_p3Var.T);
        fe_mul.fe_mul(ge_p1p1Var.X, ge_p3Var.Z, ge_cachedVar.Z);
        int[] iArr3 = ge_p1p1Var.X;
        fe_add.fe_add(iArr, iArr3, iArr3);
        fe_sub.fe_sub(ge_p1p1Var.X, ge_p1p1Var.Z, ge_p1p1Var.Y);
        int[] iArr4 = ge_p1p1Var.Y;
        fe_add.fe_add(iArr4, ge_p1p1Var.Z, iArr4);
        fe_add.fe_add(ge_p1p1Var.Z, iArr, ge_p1p1Var.T);
        int[] iArr5 = ge_p1p1Var.T;
        fe_sub.fe_sub(iArr5, iArr, iArr5);
    }
}
