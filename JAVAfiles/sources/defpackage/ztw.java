package defpackage;

import android.view.ViewGroup;
import defpackage.ztc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztw implements zsu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ztw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [zsq, java.lang.Object] */
    @Override // defpackage.zsu
    public final void a(aabr aabrVar) {
        switch (this.b) {
            case 0:
                ?? r7 = this.a;
                ((ztx) r7).h.a(r7, false);
                return;
            case 1:
                ((alwl) ((alwl) ztc.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer$2", "onFinish", 466, "BannersFragmentPeer.java")).t("Current banner dismissed: %s", ztc.c(((ztc) this.a).n));
                ((mbl) ((ztc) this.a).g.b()).c("Bugle.Banners2o.Dismissed.Count");
                zsq zsqVar = ((ztc) this.a).n;
                zsqVar.getClass();
                zsqVar.b();
                ztr ztrVar = (ztr) aabrVar;
                ViewGroup viewGroup = (ViewGroup) ztrVar.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ztrVar.f);
                }
                ztrVar.q = null;
                ztc ztcVar = (ztc) this.a;
                ztcVar.p = null;
                ztcVar.n = null;
                aktp.L(new ztc.a(), ztcVar.j);
                ztc ztcVar2 = (ztc) this.a;
                ztcVar2.m = false;
                ztcVar2.f();
                return;
            case 2:
                ?? r72 = this.a;
                ((zut) r72).d.a(r72, false);
                return;
            case 3:
                ?? r73 = this.a;
                ((zuz) r73).d.a(r73, false);
                return;
            case 4:
                ?? r74 = this.a;
                ((zvf) r74).a.a(r74, false);
                return;
            case 5:
                ((zvl) this.a).i();
                return;
            case 6:
                ((zvs) this.a).i(4);
                return;
            default:
                ?? r75 = this.a;
                ((zwu) r75).c.a(r75, false);
                return;
        }
    }
}
