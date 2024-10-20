package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvx extends afvt {
    static final /* synthetic */ artm[] a;
    public static final /* synthetic */ int al = 0;
    private static final alvi am;
    public Optional ag;
    public Optional ah;
    public afxz ai;
    public adta aj;
    public aday ak;
    private final agek an;
    private final arsn ao;
    private final arml ap;
    private aday aq;
    public afvz b;
    public afwt c;
    public afwf d;
    public ascd e;

    static {
        arrr arrrVar = new arrr(afvx.class, "scrollableInterface", "getScrollableInterface()Lcom/google/android/libraries/compose/ui/rendering/container/ScrollableInterface;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        am = alvi.m("com/google/android/libraries/compose/proxy/ui/ProxyScreen");
    }

    public afvx() {
        super(Integer.valueOf(R.layout.proxy_screen_layout), new afwa(false, false, false, false, brg.a, 1023));
        this.an = agek.d;
        this.ao = new afvw(this);
        this.ap = armd.a(new afpw(this, 9));
    }

    private static final void aW(View view) {
        RippleDrawable rippleDrawable;
        Drawable foreground = view.getForeground();
        if (foreground instanceof RippleDrawable) {
            rippleDrawable = (RippleDrawable) foreground;
        } else {
            rippleDrawable = null;
        }
        if (rippleDrawable != null) {
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                rippleDrawable.setHotspotBounds(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(new afvv(view, rippleDrawable, view, 1));
        }
    }

    @Override // defpackage.agai, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View K = super.K(layoutInflater, viewGroup, bundle);
        afvz afvzVar = new afvz(K);
        this.b = afvzVar;
        View view = (View) afvzVar.c;
        int paddingLeft = view.getPaddingLeft();
        Integer num = ((afwa) bj()).b;
        view.setPadding(paddingLeft, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Integer num2 = ((afwa) bj()).c;
            view.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            afvz afvzVar2 = this.b;
            afvz afvzVar3 = null;
            if (afvzVar2 == null) {
                arro.b("views");
                afvzVar2 = null;
            }
            afvz afvzVar4 = this.b;
            if (afvzVar4 == null) {
                arro.b("views");
                afvzVar4 = null;
            }
            afvz afvzVar5 = this.b;
            if (afvzVar5 == null) {
                arro.b("views");
                afvzVar5 = null;
            }
            Object obj = afvzVar4.c;
            Object obj2 = afvzVar2.l;
            ViewGroup.LayoutParams layoutParams2 = ((View) obj).getLayoutParams();
            layoutParams2.getClass();
            View view2 = (View) afvzVar5.f;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new afvv(view2, (View) obj2, (ViewGroup.MarginLayoutParams) layoutParams2, 0));
            afvz afvzVar6 = this.b;
            if (afvzVar6 == null) {
                arro.b("views");
                afvzVar6 = null;
            }
            aW((View) afvzVar6.d);
            afvz afvzVar7 = this.b;
            if (afvzVar7 == null) {
                arro.b("views");
            } else {
                afvzVar3 = afvzVar7;
            }
            aW((View) afvzVar3.e);
            return K;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.an;
    }

    public final void aP(agea ageaVar) {
        this.ao.d(a[0], ageaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agem
    public final void aT(afzr afzrVar) {
        ((alvg) am.d().h("com/google/android/libraries/compose/proxy/ui/ProxyScreen", "applyHugoColors", 128, "ProxyScreen.kt")).t("Applying HugoColors: %s", afzrVar);
        afwf afwfVar = this.d;
        afvz afvzVar = null;
        if (afwfVar == null) {
            arro.b("screensController");
            afwfVar = null;
        }
        agem b = afwfVar.b();
        if (b != null) {
            b.bv(afzrVar);
        }
        long j = afzrVar.a.s;
        int b2 = ckw.b(j);
        ColorStateList valueOf = ColorStateList.valueOf(ckw.b(j));
        valueOf.getClass();
        afvz afvzVar2 = this.b;
        if (afvzVar2 == null) {
            arro.b("views");
        } else {
            afvzVar = afvzVar2;
        }
        ((ConstraintLayout) afvzVar.c).setBackgroundColor(afzrVar.d);
        ((AppCompatImageView) afvzVar.d).setImageTintList(valueOf);
        ((AppCompatImageView) afvzVar.e).setImageTintList(valueOf);
        ((EditText) afvzVar.g).getBackground().setColorFilter(new PorterDuffColorFilter(afzrVar.g, PorterDuff.Mode.SRC_ATOP));
        ((EditText) afvzVar.g).setTextColor(b2);
        ((EditText) afvzVar.g).setHintTextColor(b2);
        ((TabLayout) afvzVar.i).r(afzrVar.f);
        ((TabLayout) afvzVar.i).p(afzrVar.e);
        ((View) afvzVar.j).setVisibility(0);
        ((View) afvzVar.j).setBackgroundColor(ckw.b(afzrVar.a.r));
    }

    @Override // defpackage.agem
    public final void aX() {
        agem b;
        afwf afwfVar = this.d;
        if (afwfVar != null && (b = afwfVar.b()) != null) {
            b.aX();
        }
    }

    @Override // defpackage.agem
    public final void aY() {
        agem b;
        afwf afwfVar = this.d;
        if (afwfVar != null && (b = afwfVar.b()) != null) {
            b.aY();
        }
        afyh e = e();
        if (e != null) {
            e.a();
        }
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        afwt afwtVar = this.c;
        if (afwtVar != null) {
            ((FrameLayout) afwtVar.e.k).setOnHierarchyChangeListener(null);
            afwtVar.l();
            afwtVar.h = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        aday adayVar;
        afvz afvzVar;
        afvy afvyVar;
        aday adayVar2;
        agek agekVar;
        view.getClass();
        aday adayVar3 = this.ak;
        afwf afwfVar = null;
        if (adayVar3 == null) {
            arro.b("headerControllerFactory");
            adayVar3 = null;
        }
        afwa afwaVar = (afwa) bj();
        afvz afvzVar2 = this.b;
        if (afvzVar2 == null) {
            arro.b("views");
            afvzVar2 = null;
        }
        afpw afpwVar = new afpw(this, 10);
        adta adtaVar = (adta) adayVar3.b.b();
        adta adtaVar2 = (adta) adayVar3.a.b();
        afwaVar.getClass();
        afvzVar2.getClass();
        this.aq = new aday(adtaVar, adtaVar2, afvzVar2, afpwVar);
        afxz afxzVar = this.ai;
        if (afxzVar == null) {
            arro.b("searchControllerFactory");
            afxzVar = null;
        }
        aday adayVar4 = this.aq;
        if (adayVar4 == null) {
            arro.b("headerController");
            adayVar = null;
        } else {
            adayVar = adayVar4;
        }
        arrq arrqVar = new arrq(this) { // from class: afvu
            @Override // defpackage.arrq
            public final Object b() {
                afvx afvxVar = (afvx) this.e;
                int i = afvx.al;
                return afvxVar.bz();
            }
        };
        afvz afvzVar3 = this.b;
        if (afvzVar3 == null) {
            arro.b("views");
            afvzVar = null;
        } else {
            afvzVar = afvzVar3;
        }
        boolean z = ((afwa) bj()).f;
        boolean z2 = ((afwa) bj()).g;
        Activity activity = (Activity) afxzVar.a.b();
        activity.getClass();
        ((arwe) afxzVar.f.b()).getClass();
        ((arwe) afxzVar.d.b()).getClass();
        ((arwe) afxzVar.c.b()).getClass();
        agak agakVar = (agak) afxzVar.b.b();
        agakVar.getClass();
        aday adayVar5 = (aday) afxzVar.e.b();
        adayVar.getClass();
        afvzVar.getClass();
        afwt afwtVar = new afwt(activity, agakVar, adayVar5, adayVar, arrqVar, afvzVar, z, z2);
        this.c = afwtVar;
        afwtVar.g(afwtVar.b());
        ((FrameLayout) afwtVar.e.k).setOnHierarchyChangeListener(afwtVar.g);
        afwtVar.h = true;
        if (!((afwa) bj()).f) {
            afwt afwtVar2 = this.c;
            if (afwtVar2 == null) {
                arro.b("searchController");
                afwtVar2 = null;
            }
            afwtVar2.c();
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("categories");
            if (stringArrayList != null) {
                agek[] values = agek.values();
                ArrayList arrayList = new ArrayList(aqjn.J(stringArrayList, 10));
                Iterator<T> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(agek.a((String) it.next()));
                }
                Integer valueOf = Integer.valueOf(bundle2.getInt("initial_screen", -1));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    agekVar = values[valueOf.intValue()];
                } else {
                    agekVar = null;
                }
                afvyVar = new afvy(arrayList, agekVar, bundle2.getString("initial_search_term"));
            } else {
                afvyVar = null;
            }
            if (afvyVar != null) {
                Optional optional = this.ah;
                if (optional == null) {
                    arro.b("emotifyController");
                    optional = null;
                }
                List list = afvyVar.a;
                optional.ifPresent(new adoj(new afho(this, list, 9), 15));
                adta adtaVar3 = this.aj;
                if (adtaVar3 == null) {
                    arro.b("screensControllerFactory");
                    adtaVar3 = null;
                }
                afvz afvzVar4 = this.b;
                if (afvzVar4 == null) {
                    arro.b("views");
                    afvzVar4 = null;
                }
                afvz afvzVar5 = this.b;
                if (afvzVar5 == null) {
                    arro.b("views");
                    afvzVar5 = null;
                }
                aday adayVar6 = this.aq;
                if (adayVar6 == null) {
                    arro.b("headerController");
                    adayVar2 = null;
                } else {
                    adayVar2 = adayVar6;
                }
                afwt afwtVar3 = this.c;
                if (afwtVar3 == null) {
                    arro.b("searchController");
                    afwtVar3 = null;
                }
                Object obj = afvzVar5.g;
                Object obj2 = afvzVar4.c;
                ncd ncdVar = new ncd(this, 18, (float[][][]) null);
                Map map = ((afwa) bj()).a;
                Map map2 = (Map) adtaVar3.a.b();
                adayVar2.getClass();
                afwtVar3.getClass();
                this.d = new afwf(map2, (ViewGroup) obj2, (EditText) obj, adayVar2, list, this, ncdVar);
                by();
                agek agekVar2 = afvyVar.b;
                if (agekVar2 != null) {
                    q(agekVar2);
                }
                String str = afvyVar.c;
                if (str != null) {
                    afwt afwtVar4 = this.c;
                    if (afwtVar4 == null) {
                        arro.b("searchController");
                        afwtVar4 = null;
                    }
                    afwtVar4.j(str);
                }
                afwf afwfVar2 = this.d;
                if (afwfVar2 == null) {
                    arro.b("screensController");
                    afwfVar2 = null;
                }
                afwfVar2.d(bn());
                afwf afwfVar3 = this.d;
                if (afwfVar3 == null) {
                    arro.b("screensController");
                } else {
                    afwfVar = afwfVar3;
                }
                afwfVar.h(bt(), bz());
                bs();
                return;
            }
        }
        throw new IllegalStateException("ProxyScreen must be created with category arguments.");
    }

    public final afyh e() {
        return (afyh) this.ap.a();
    }

    @Override // defpackage.agem
    public final void gA(agdq agdqVar, ahjj ahjjVar) {
        agdqVar.getClass();
        ahjjVar.getClass();
        super.gA(agdqVar, ahjjVar);
        afwf afwfVar = this.d;
        if (afwfVar != null) {
            afwfVar.h(agdqVar, ahjjVar);
        }
    }

    @Override // defpackage.agai
    public final void gB(arqg arqgVar) {
        this.aO = arqgVar;
        afwf afwfVar = this.d;
        if (afwfVar != null) {
            afwfVar.d(arqgVar);
        }
    }

    @Override // defpackage.agai
    public final boolean gE() {
        agem b;
        afwf afwfVar = this.d;
        if (afwfVar != null && (b = afwfVar.b()) != null && b.gE()) {
            return true;
        }
        afwt afwtVar = this.c;
        if (afwtVar == null || afwtVar.a() != afwo.b) {
            return false;
        }
        afwtVar.e();
        return true;
    }

    @Override // defpackage.agem
    public final agea gx() {
        afwf afwfVar = this.d;
        if (afwfVar != null) {
            aP((agea) afwfVar.h.c());
            return (agea) this.ao.c(a[0]);
        }
        return null;
    }

    @Override // defpackage.agem
    public final void gy(agdp agdpVar) {
        agem b;
        agdpVar.getClass();
        afwf afwfVar = this.d;
        if (afwfVar != null && (b = afwfVar.b()) != null) {
            b.gy(agdpVar);
        }
    }

    @Override // defpackage.agem
    public final void gz() {
        agem b;
        afwt afwtVar = this.c;
        if (afwtVar != null) {
            afwtVar.d(true);
        }
        afwf afwfVar = this.d;
        if (afwfVar != null && (b = afwfVar.b()) != null) {
            b.gz();
        }
        aP(null);
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        afwf afwfVar = this.d;
        if (afwfVar == null) {
            arro.b("screensController");
            afwfVar = null;
        }
        agem b = afwfVar.b();
        if (b != null) {
            bundle.putSerializable("ACTIVE_SCREEN_CATEGORY", b.aM());
        }
    }

    @Override // defpackage.cg
    public final void m(Bundle bundle) {
        Serializable serializable;
        super.m(bundle);
        if (bundle != null && (serializable = bundle.getSerializable("ACTIVE_SCREEN_CATEGORY")) != null) {
            aday adayVar = this.aq;
            aday adayVar2 = null;
            if (adayVar == null) {
                arro.b("headerController");
                adayVar = null;
            }
            if (((afwi) adayVar.a).b()) {
                afwf afwfVar = this.d;
                if (afwfVar == null) {
                    arro.b("screensController");
                    afwfVar = null;
                }
                for (agae agaeVar : afwfVar.b.values()) {
                    da G = afwfVar.d.G();
                    G.getClass();
                    agdq agdqVar = afwfVar.f;
                    if (agdqVar == null) {
                        arro.b("renderingStrategy");
                        agdqVar = null;
                    }
                    agdqVar.getClass();
                    agem b = agaeVar.b(G);
                    if (b != null) {
                        afzv.r(agdqVar, G, true, new afyq(b, 19));
                    }
                }
                afwfVar.f(null);
                aday adayVar3 = this.aq;
                if (adayVar3 == null) {
                    arro.b("headerController");
                } else {
                    adayVar2 = adayVar3;
                }
                ((afwi) adayVar2.a).a((agek) serializable);
            }
        }
    }

    public final void q(agek agekVar) {
        aday adayVar = this.aq;
        Object obj = null;
        if (adayVar == null) {
            arro.b("headerController");
            adayVar = null;
        }
        Object obj2 = adayVar.a;
        if (true == ((afwi) obj2).b()) {
            obj = obj2;
        }
        if (obj != null) {
            ((afwi) obj).a(agekVar);
        }
    }

    @Override // defpackage.ageb
    public final agea r() {
        return null;
    }
}
