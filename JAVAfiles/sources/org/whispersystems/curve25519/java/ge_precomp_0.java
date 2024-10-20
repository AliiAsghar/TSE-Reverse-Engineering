package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ge_precomp_0 {
    public static void ge_precomp_0(ge_precomp ge_precompVar) {
        fe_1.fe_1(ge_precompVar.yplusx);
        fe_1.fe_1(ge_precompVar.yminusx);
        fe_0.fe_0(ge_precompVar.xy2d);
    }
}
