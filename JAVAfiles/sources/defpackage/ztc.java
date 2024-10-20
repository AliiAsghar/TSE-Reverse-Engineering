package defpackage;

import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztc extends ztd implements zsl, zte {
    public static final alwo a = alwo.o("BugleBanners");
    public final zsw e;
    public final Map f;
    public final armf g;
    public final zsx h;
    public ConversationIdType i;
    public ViewGroup j;
    public zsq n;
    public final xjo o;
    public aabr p;
    private final Map r;
    public final HashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public int k = 0;
    public boolean l = false;
    public boolean m = false;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akvv {
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class b implements akvv {
        public abstract int a();

        public abstract int b();
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class c implements akvv {
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class d implements akvv {
    }

    public ztc(zsw zswVar, Map map, xjo xjoVar, Map map2, armf armfVar, zsy zsyVar) {
        this.i = ruy.a;
        this.e = zswVar;
        this.r = map2;
        zsx b2 = zsx.b(zsyVar.d);
        this.h = b2 == null ? zsx.UNKNOWN : b2;
        this.f = map;
        this.o = xjoVar;
        this.g = armfVar;
        this.i = ruy.b(zsyVar.c);
    }

    public static String c(zsq zsqVar) {
        if (zsqVar != null) {
            return zsqVar.a().a;
        }
        return "UnknownBannerKey";
    }

    private final boolean i(zsq zsqVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getKey() != zsqVar) {
                zsn zsnVar = ((zsp) entry.getValue()).a;
                if (((zsp) entry.getValue()).b && !zsnVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zsl
    public final void a(zsq zsqVar, boolean z) {
        int i;
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.g();
        alwlVar.X(zst.a, c(zsqVar));
        alvz alvzVar = zst.b;
        Boolean valueOf = Boolean.valueOf(z);
        alwlVar.X(alvzVar, valueOf);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "setEligibility", 304, "BannersFragmentPeer.java")).q("Banner eligibility set");
        if (!this.b.containsKey(zsqVar)) {
            this.c.put(zsqVar, valueOf);
            return;
        }
        zsp zspVar = (zsp) this.b.get(zsqVar);
        zspVar.getClass();
        zso zsoVar = new zso(zspVar);
        if (true != z) {
            i = 3;
        } else {
            i = 2;
        }
        zsoVar.c = i;
        this.b.put(zsqVar, zsoVar.a());
        if (this.m) {
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "setEligibility", 320, "BannersFragmentPeer.java")).q("Banner animation in progress, won't attempt banner show/dismiss");
        } else if (h(zsqVar)) {
            d();
        } else {
            f();
        }
    }

    public final zss b() {
        zss zssVar = (zss) this.r.get(this.h);
        zssVar.getClass();
        return zssVar;
    }

    public final void d() {
        this.m = true;
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "dismissCurrentBanner", 460, "BannersFragmentPeer.java")).t("Dismissing current banner: %s", c(this.n));
        aabr aabrVar = this.p;
        aabrVar.getClass();
        ztw ztwVar = new ztw(this, 1);
        boolean z = b().a;
        ztr ztrVar = (ztr) aabrVar;
        if (ztrVar.E == 2) {
            ztrVar.s(ztwVar, z);
            return;
        }
        if (ztrVar.w) {
            ztq ztqVar = ztrVar.g;
            int i = ztq.j;
            ztqVar.f();
            if (!z) {
                ztrVar.t++;
                ztrVar.v = true;
                ztrVar.c(false);
                ztrVar.t--;
                if (ztrVar.s == 0) {
                    ztwVar.a(aabrVar);
                    return;
                }
                return;
            }
            Slide a2 = ztrVar.a(8388613, 500);
            a2.addListener(new akuh(ztrVar.G, new ztk(ztrVar, ztwVar), "FullBannerUiController: Slide out side transition"));
            ViewGroup viewGroup = ztrVar.q;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, a2);
            ztrVar.c(false);
            return;
        }
        ztrVar.s(ztwVar, z);
    }

    @Override // defpackage.zte
    public final void e(int i) {
        this.k = i;
        if (this.j != null) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "onSetTopPadding", 169, "BannersFragmentPeer.java")).r("Setting banners padding: %d", this.k);
            ViewGroup viewGroup = this.j;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.k, this.j.getPaddingRight(), this.j.getPaddingBottom());
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        if (g()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 395, "BannersFragmentPeer.java")).t("Banner %s is currently showing, can't show another banner", c(this.n));
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            zsp zspVar = (zsp) entry.getValue();
            int i = zspVar.c;
            zsn zsnVar = zspVar.a;
            String c2 = c((zsq) entry.getKey());
            if (i != 1) {
                if (i((zsq) entry.getKey()) && !zsnVar.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (zspVar.b && !zsnVar.b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i != 3 && !z && !z2) {
                    zsq zsqVar = (zsq) entry.getKey();
                    this.n = zsqVar;
                    zsp zspVar2 = (zsp) this.b.get(zsqVar);
                    zspVar2.getClass();
                    zso zsoVar = new zso(zspVar2);
                    zsoVar.b(true);
                    zsp a2 = zsoVar.a();
                    HashMap hashMap = this.b;
                    zsq zsqVar2 = this.n;
                    zsqVar2.getClass();
                    hashMap.put(zsqVar2, a2);
                    aabr h = ((zsq) entry.getKey()).h();
                    this.p = h;
                    ViewGroup viewGroup = this.j;
                    ztr ztrVar = (ztr) h;
                    ztrVar.q = viewGroup;
                    viewGroup.addView(ztrVar.f, -1);
                    ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 428, "BannersFragmentPeer.java")).t("Showing banner: %s", c(this.n));
                    this.j.getViewTreeObserver().addOnGlobalLayoutListener(new ztb(this, entry, 0));
                    return;
                }
                if (i == 2) {
                    ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "selectBannerToShow", 414, "BannersFragmentPeer.java")).J("Banner %s is eligible, but wont show (dontShowAfterAnotherBanner=%b, dontShowAgain=%b)", c2, Boolean.valueOf(z), Boolean.valueOf(z2));
                }
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        if (this.n != null && this.p != null) {
            return true;
        }
        return false;
    }

    public final boolean h(zsq zsqVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.n != null && this.b.containsKey(zsqVar)) {
            String c2 = c(zsqVar);
            zsp zspVar = (zsp) this.b.get(zsqVar);
            if (zspVar == null) {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 339, "BannersFragmentPeer.java")).t("ShouldDismissBanner: No selection params found for banner %s", c2);
                return false;
            }
            zsq zsqVar2 = this.n;
            if (zsqVar2 == zsqVar && g()) {
                if (zspVar.c != 3) {
                    return false;
                }
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 347, "BannersFragmentPeer.java")).t("ShouldDismissBanner: banner %s going from eligible to ineligible", c2);
                return true;
            }
            if (zspVar.c == 2) {
                zsn zsnVar = zspVar.a;
                zsp zspVar2 = (zsp) this.b.get(zsqVar2);
                zspVar2.getClass();
                if (zsnVar.a < zspVar2.a.a) {
                    z = true;
                } else {
                    z = false;
                }
                if (!zsnVar.c && i(zsqVar)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!zsnVar.b && zspVar.b) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer", "shouldDismissBanner", 372, "BannersFragmentPeer.java")).K("ShouldDismissBanner: banner %s, higherPriorityThanCurrent=%b, canShowAfterCurrentBanner=%b, canShowAgain=%b", c2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
                if (z && z2 && z3) {
                    return true;
                }
            }
        }
        return false;
    }
}
