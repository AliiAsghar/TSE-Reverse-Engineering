package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpe {
    public static final List a = arnv.a;

    static {
        long j = cku.a;
    }

    public static final boolean a(ckv ckvVar) {
        if (ckvVar instanceof ckl) {
            int i = ((ckl) ckvVar).a;
            if (!a.bA(i, 5) && !a.bA(i, 3)) {
                return false;
            }
            return true;
        }
        if (ckvVar != null) {
            return false;
        }
        return true;
    }
}
