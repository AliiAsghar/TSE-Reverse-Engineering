package defpackage;

import android.os.Build;
import android.view.View;
import defpackage.dep;
import java.lang.ref.Reference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cza {
    public static /* synthetic */ cyz a(czb czbVar, arqv arqvVar, arqg arqgVar, cof cofVar, boolean z, int i) {
        cof cofVar2;
        boolean z2;
        dcq deqVar;
        Object obj = null;
        if ((i & 4) != 0) {
            cofVar2 = null;
        } else {
            cofVar2 = cofVar;
        }
        if (cofVar2 != null) {
            return new dcv(cofVar2, null, (dai) czbVar, arqvVar, arqgVar);
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z2 & z)) {
            dai daiVar = (dai) czbVar;
            der derVar = daiVar.K;
            derVar.a();
            while (true) {
                cbh cbhVar = derVar.a;
                int i2 = cbhVar.b;
                if (i2 == 0) {
                    break;
                }
                Object obj2 = ((Reference) cbhVar.c(i2 - 1)).get();
                if (obj2 != null) {
                    obj = obj2;
                    break;
                }
            }
            cyz cyzVar = (cyz) obj;
            if (cyzVar != null) {
                cyzVar.h(arqvVar, arqgVar);
                return cyzVar;
            }
            if (daiVar.isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
                clc clcVar = daiVar.n;
                return new dcv(clcVar.a(), clcVar, daiVar, arqvVar, arqgVar);
            }
        }
        dai daiVar2 = (dai) czbVar;
        if (daiVar2.isHardwareAccelerated() && daiVar2.y) {
            try {
                return new dds((dai) czbVar, arqvVar, arqgVar);
            } catch (Throwable unused) {
                daiVar2.y = false;
            }
        }
        if (daiVar2.u == null) {
            if (!dep.c) {
                dep.a.a(new View(daiVar2.getContext()));
            }
            if (dep.d) {
                deqVar = new dcq(daiVar2.getContext());
            } else {
                deqVar = new deq(daiVar2.getContext());
            }
            daiVar2.u = deqVar;
            daiVar2.addView(daiVar2.u);
        }
        dcq dcqVar = daiVar2.u;
        dcqVar.getClass();
        return new dep(daiVar2, dcqVar, arqvVar, arqgVar);
    }

    public static /* synthetic */ void b(czb czbVar) {
        czbVar.q(true);
    }
}
