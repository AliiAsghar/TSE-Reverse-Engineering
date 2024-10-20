package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyo {
    public static final cga.c a(cwo cwoVar, int i) {
        cga.c cVar = cwoVar.A().t;
        if (cVar != null && (cVar.r & i) != 0) {
            while (cVar != null) {
                int i2 = cVar.q;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) == 0) {
                    cVar = cVar.t;
                } else {
                    return cVar;
                }
            }
        }
        return null;
    }
}
