package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_p3_to_cached {
    static int[] d2 = {-21827239, -5839606, -30745221, 13898782, 229458, 15978800, -12551817, -6495438, 29715968, 9444199};

    public static void ge_p3_to_cached(ge_cached ge_cachedVar, ge_p3 ge_p3Var) {
        fe_add.fe_add(ge_cachedVar.YplusX, ge_p3Var.Y, ge_p3Var.X);
        fe_sub.fe_sub(ge_cachedVar.YminusX, ge_p3Var.Y, ge_p3Var.X);
        fe_copy.fe_copy(ge_cachedVar.Z, ge_p3Var.Z);
        fe_mul.fe_mul(ge_cachedVar.T2d, ge_p3Var.T, d2);
    }
}
