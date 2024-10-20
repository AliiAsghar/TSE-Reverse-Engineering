package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_p3_to_p2 {
    public static void ge_p3_to_p2(ge_p2 ge_p2Var, ge_p3 ge_p3Var) {
        fe_copy.fe_copy(ge_p2Var.X, ge_p3Var.X);
        fe_copy.fe_copy(ge_p2Var.Y, ge_p3Var.Y);
        fe_copy.fe_copy(ge_p2Var.Z, ge_p3Var.Z);
    }
}
