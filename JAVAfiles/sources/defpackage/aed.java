package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aed {
    public static final cga a = chk.a(cga.e, new cmb() { // from class: aed.1
        @Override // defpackage.cmb
        public final cln a(long j, drk drkVar, dqv dqvVar) {
            cga cgaVar = aed.a;
            float eo = dqvVar.eo(30.0f);
            return new cln.b(new cjp(brg.a, -eo, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)) + eo));
        }
    });
    public static final cga b = chk.a(cga.e, new cmb() { // from class: aed.2
        @Override // defpackage.cmb
        public final cln a(long j, drk drkVar, dqv dqvVar) {
            cga cgaVar = aed.a;
            float eo = dqvVar.eo(30.0f);
            return new cln.b(new cjp(-eo, brg.a, Float.intBitsToFloat((int) (j >> 32)) + eo, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    });
}
