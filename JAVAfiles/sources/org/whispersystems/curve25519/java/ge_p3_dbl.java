package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_p3_dbl {
    public static void ge_p3_dbl(ge_p1p1 ge_p1p1Var, ge_p3 ge_p3Var) {
        ge_p2 ge_p2Var = new ge_p2();
        ge_p3_to_p2.ge_p3_to_p2(ge_p2Var, ge_p3Var);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1Var, ge_p2Var);
    }
}
