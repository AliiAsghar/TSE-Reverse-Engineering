package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgk {
    private static final ico a = ico.J("k", "x", "y");

    public static hex a(hhr hhrVar, hbb hbbVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (hhrVar.p() == 1) {
            hhrVar.g();
            while (hhrVar.n()) {
                if (hhrVar.p() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new hde(hbbVar, hgz.a(hhrVar, hbbVar, hid.a(), hgs.d, z, false)));
            }
            hhrVar.i();
            hha.b(arrayList);
        } else {
            arrayList.add(new hie(hgy.c(hhrVar, hid.a())));
        }
        return new hex(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hfe b(hhr hhrVar, hbb hbbVar) {
        hhrVar.h();
        boolean z = false;
        hex hexVar = null;
        heu heuVar = null;
        heu heuVar2 = null;
        while (hhrVar.p() != 4) {
            int q = hhrVar.q(a);
            if (q != 0) {
                if (q != 1) {
                    if (q != 2) {
                        hhrVar.l();
                        hhrVar.m();
                    } else if (hhrVar.p() == 6) {
                        hhrVar.m();
                        z = true;
                    } else {
                        heuVar2 = gvf.U(hhrVar, hbbVar);
                    }
                } else if (hhrVar.p() == 6) {
                    hhrVar.m();
                    z = true;
                } else {
                    heuVar = gvf.U(hhrVar, hbbVar);
                }
            } else {
                hexVar = a(hhrVar, hbbVar);
            }
        }
        hhrVar.j();
        if (z) {
            hbbVar.d("Lottie doesn't support expressions.");
        }
        if (hexVar != null) {
            return hexVar;
        }
        return new hfb(heuVar, heuVar2);
    }
}
