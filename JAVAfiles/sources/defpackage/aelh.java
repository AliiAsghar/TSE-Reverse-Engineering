package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelh implements cmb {
    @Override // defpackage.cmb
    public final /* bridge */ /* synthetic */ cln a(long j, drk drkVar, dqv dqvVar) {
        float intBitsToFloat;
        float bb;
        float intBitsToFloat2;
        drkVar.getClass();
        dqvVar.getClass();
        int i = (int) (4294967295L & j);
        float intBitsToFloat3 = Float.intBitsToFloat(i) / 2.0f;
        float intBitsToFloat4 = Float.intBitsToFloat(i) / 4.0f;
        if (drkVar == drk.a) {
            intBitsToFloat = intBitsToFloat3;
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - intBitsToFloat3;
        }
        if (drkVar == drk.a) {
            bb = (Float.intBitsToFloat((int) (j >> 32)) - adom.bb(8)) - intBitsToFloat3;
        } else {
            bb = adom.bb(8) + intBitsToFloat3;
        }
        if (drkVar == drk.b) {
            intBitsToFloat2 = intBitsToFloat4;
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32)) - intBitsToFloat4;
        }
        cke ckeVar = new cke((byte[]) null);
        ckeVar.k();
        float f = intBitsToFloat3 + intBitsToFloat3;
        clq.a(ckeVar, new cjp(intBitsToFloat - intBitsToFloat3, brg.a, intBitsToFloat + intBitsToFloat3, f));
        clq.a(ckeVar, new cjp(bb - intBitsToFloat3, brg.a, intBitsToFloat3 + bb, f));
        clq.b(ckeVar, new cjp(Math.min(intBitsToFloat, bb), brg.a, Math.max(intBitsToFloat, bb), Float.intBitsToFloat(i)));
        clq.a(ckeVar, new cjp(intBitsToFloat2 - intBitsToFloat4, brg.a, intBitsToFloat2 + intBitsToFloat4, intBitsToFloat4 + intBitsToFloat4));
        ckeVar.c();
        return new cln.a(ckeVar);
    }
}
