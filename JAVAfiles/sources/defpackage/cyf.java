package defpackage;

import defpackage.cxn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyf {
    public static final List a(ctd ctdVar) {
        List C;
        ctdVar.getClass();
        cxn I = ((cye) ctdVar).I();
        boolean b = b(I);
        List E = I.E();
        ArrayList arrayList = new ArrayList(E.size());
        int size = E.size();
        for (int i = 0; i < size; i++) {
            cxn cxnVar = (cxn) E.get(i);
            if (b) {
                C = cxnVar.B();
            } else {
                C = cxnVar.C();
            }
            arrayList.add(C);
        }
        return arrayList;
    }

    private static final boolean b(cxn cxnVar) {
        cxn.a q = cxnVar.q();
        cxn.a aVar = cxn.a.a;
        int ordinal = q.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return true;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return true;
                }
                if (ordinal == 4) {
                    cxn t = cxnVar.t();
                    if (t != null) {
                        return b(t);
                    }
                    throw new IllegalArgumentException("no parent for idle node");
                }
                throw new armm();
            }
            return false;
        }
        return false;
    }
}
