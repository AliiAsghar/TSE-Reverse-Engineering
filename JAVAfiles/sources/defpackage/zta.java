package defpackage;

import defpackage.ztc;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zta implements zsu {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ztb b;

    public zta(ztb ztbVar, Map.Entry entry) {
        this.a = entry;
        this.b = ztbVar;
    }

    @Override // defpackage.zsu
    public final void a(aabr aabrVar) {
        ((alwl) ((alwl) ztc.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer$1$1", "onFinish", 441, "BannersFragmentPeer.java")).t("Banner shown: %s", ztc.c(((ztc) this.b.b).n));
        ((mbl) ((ztc) this.b.b).g.b()).c("Bugle.Banners2o.Shown.Count");
        ((zsq) this.a.getKey()).c();
        aktp.L(new ztc.c(), ((ztc) this.b.b).j);
        ztc ztcVar = (ztc) this.b.b;
        ztcVar.m = false;
        if (ztcVar.g()) {
            Iterator it = ztcVar.b.keySet().iterator();
            while (it.hasNext()) {
                if (ztcVar.h((zsq) it.next())) {
                    ztcVar.d();
                    return;
                }
            }
        }
    }
}
