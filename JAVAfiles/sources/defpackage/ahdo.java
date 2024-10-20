package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdo extends ahct {
    public final agxw a;
    private final ahcg b;

    public ahdo(ahcg ahcgVar, agxw agxwVar) {
        this.b = ahcgVar;
        this.a = agxwVar;
    }

    @Override // defpackage.ahct
    public final void a(final ahcs ahcsVar, final ahcq ahcqVar) {
        this.b.b(new ahcf() { // from class: ahdn
            /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set, java.lang.Object] */
            @Override // defpackage.ahcf
            public final List a() {
                boolean z;
                ahcq ahcqVar2 = ahcqVar;
                anat a = ahca.a();
                boolean z2 = false;
                if (ahcqVar2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.U(z, "View is not instrumented.");
                adwq adwqVar = ahcqVar2.g;
                if (!adwqVar.a.isEmpty()) {
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", "Interaction: ".concat(String.valueOf(String.valueOf(ahcqVar2))));
                    }
                    for (ahjj ahjjVar : adwqVar.a) {
                        aiut.c();
                        Runnable runnable = ((ahdj) ahjjVar.a).e;
                        if (runnable != null) {
                            aiut.f(runnable);
                            Object obj = ahjjVar.a;
                            ((ahdj) obj).b.a(new agqd(obj, 14)).run();
                        }
                    }
                }
                albo.Z(ahcqVar2.c(), "VE is not impressed: %s {attached=%s}", ahcqVar2, Boolean.valueOf(ahcqVar2.e.c));
                if (ahcqVar2.d() == 1) {
                    z2 = true;
                }
                albo.X(z2, "VE is not visible: %s", ahcqVar2);
                ahcs ahcsVar2 = ahcsVar;
                ahdo ahdoVar = ahdo.this;
                ArrayList arrayList = new ArrayList();
                ahji.aH(ahcqVar2, arrayList);
                return alog.r(new ahdx(a, arrayList, ahcsVar2, ahdoVar.a.c(), false));
            }
        });
    }
}
