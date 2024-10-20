package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cty {
    public static final cyc a(cyc cycVar) {
        cxn cxnVar;
        cxn I = cycVar.I();
        while (true) {
            cxn t = I.t();
            cxn cxnVar2 = null;
            if (t != null) {
                cxnVar = t.k;
            } else {
                cxnVar = null;
            }
            if (cxnVar != null) {
                cxn t2 = I.t();
                if (t2 != null) {
                    cxnVar2 = t2.k;
                }
                cxnVar2.getClass();
                if (cxnVar2.j) {
                    I = I.t();
                    I.getClass();
                } else {
                    cxn t3 = I.t();
                    t3.getClass();
                    I = t3.k;
                    I.getClass();
                }
            } else {
                cyc z = I.y().z();
                z.getClass();
                return z;
            }
        }
    }
}
