package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azu {
    public static final cjp a(dqv dqvVar, int i, dow dowVar, diy diyVar, boolean z, int i2) {
        cjp cjpVar;
        float f;
        float f2;
        if (diyVar != null) {
            cjpVar = diyVar.m(dowVar.b.a(i));
        } else {
            cjpVar = cjp.a;
        }
        int eo = dqvVar.eo(2.0f);
        if (z) {
            f = (i2 - cjpVar.b) - eo;
        } else {
            f = cjpVar.b;
        }
        if (z) {
            f2 = i2 - cjpVar.b;
        } else {
            f2 = eo + cjpVar.b;
        }
        return cjp.i(cjpVar, f, f2, brg.a, 10);
    }
}
