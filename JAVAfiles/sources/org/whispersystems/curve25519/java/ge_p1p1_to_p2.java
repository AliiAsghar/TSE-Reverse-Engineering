package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_p1p1_to_p2 {
    public static void ge_p1p1_to_p2(ge_p2 ge_p2Var, ge_p1p1 ge_p1p1Var) {
        fe_mul.fe_mul(ge_p2Var.X, ge_p1p1Var.X, ge_p1p1Var.T);
        fe_mul.fe_mul(ge_p2Var.Y, ge_p1p1Var.Y, ge_p1p1Var.Z);
        fe_mul.fe_mul(ge_p2Var.Z, ge_p1p1Var.Z, ge_p1p1Var.T);
    }
}
