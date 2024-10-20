package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.afof;
import defpackage.ol;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afof extends afoh {
    private static final alvi aq = alvi.m("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen");
    public arwe a;
    public algw ag;
    public afjn ah;
    public arwl ai;
    public GridLayoutManager aj;
    public int ak;
    public final arqr al;
    public afmd am;
    public afmq an;
    public adef ao;
    public adef ap;
    private final agek ar;
    private final arml as;
    private final arml at;
    private final afnz au;
    private final aaam av;
    public afpp b;
    public afox c;
    public afoy d;
    public afoq e;

    public afof() {
        super(new afnx(null, null, false, 511));
        this.ar = agek.b;
        this.as = armd.a(new afjm(this, 17));
        this.at = armd.a(new afjm(this, 16));
        this.al = new afmo(this, 4);
        this.av = new aaam(this, 2);
        this.au = new afnz(this);
    }

    static /* synthetic */ boolean aV(afof afofVar) {
        return afofVar.be(new afoo(afofVar, 1));
    }

    private final void bb(TabLayout tabLayout, String str, Drawable drawable) {
        ajmk e = tabLayout.e();
        e.d(str);
        e.e(drawable);
        View childAt = e.h.getChildAt(0);
        childAt.getClass();
        ImageView imageView = (ImageView) childAt;
        imageView.setImageTintList(egl.f(imageView.getContext(), R.color.selectable_action_selector));
        tabLayout.g(e);
    }

    private final void bc(boolean z) {
        adef adefVar = this.ao;
        adef adefVar2 = null;
        if (adefVar == null) {
            arro.b("views");
            adefVar = null;
        }
        Object obj = adefVar.d;
        int i = 0;
        if (z) {
            RecyclerView recyclerView = (RecyclerView) obj;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((Number) this.as.a()).intValue());
            recyclerView.aL(this.au);
        } else {
            RecyclerView recyclerView2 = (RecyclerView) obj;
            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), 0);
            recyclerView2.aM(this.au);
            i = 8;
        }
        adef adefVar3 = this.ao;
        if (adefVar3 == null) {
            arro.b("views");
        } else {
            adefVar2 = adefVar3;
        }
        ((View) adefVar2.e).setVisibility(i);
        ((TabLayout) adefVar2.c).setVisibility(i);
    }

    private final void bd() {
        e().m = aW();
        o().m = aW();
        final int r = arrn.r(e().f, 1);
        final Context x = x();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(r, this, x) { // from class: com.google.android.libraries.compose.emoji.ui.screen.EmojiScreen$initGridLayoutManager$gridManager$1
            final /* synthetic */ afof J;

            @Override // android.support.v7.widget.LinearLayoutManager
            protected final int O(ol olVar) {
                olVar.getClass();
                return 1000;
            }

            @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
            public final boolean ah() {
                if (!this.J.p().isShowing()) {
                    return true;
                }
                return false;
            }
        };
        gridLayoutManager.g = new afoa(this);
        this.aj = gridLayoutManager;
        adef adefVar = this.ao;
        if (adefVar == null) {
            arro.b("views");
            adefVar = null;
        }
        GridLayoutManager gridLayoutManager2 = this.aj;
        if (gridLayoutManager2 == null) {
            arro.b("layoutManager");
            gridLayoutManager2 = null;
        }
        ((RecyclerView) adefVar.d).aj(gridLayoutManager2);
        adef adefVar2 = this.ao;
        if (adefVar2 == null) {
            arro.b("views");
            adefVar2 = null;
        }
        ((ViewGroup) adefVar2.d).setAccessibilityTraversalAfter(R.id.proxy_screen_header);
        arrn.J(bo(), null, null, new afmg(this, (arpe) null, 8, (char[]) null), 3);
    }

    private final boolean be(arqg arqgVar) {
        afoq afoqVar;
        if (this.aT != null && arqgVar.a() != agdp.b && (afoqVar = this.e) != null && d.F(afoqVar, e())) {
            return true;
        }
        return false;
    }

    private final void bf(TabLayout tabLayout) {
        arrn.J(bo(), null, null, new afju(this, tabLayout, (arpe) null, 5), 3);
    }

    public static final /* synthetic */ afnx d(afof afofVar) {
        return (afnx) afofVar.bj();
    }

    public final afjn a() {
        afjn afjnVar = this.ah;
        if (afjnVar != null) {
            return afjnVar;
        }
        arro.b("emojiUsageProcessor");
        return null;
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.ar;
    }

    public final void aO(int i) {
        int N = e().N(i);
        GridLayoutManager gridLayoutManager = this.aj;
        if (gridLayoutManager == null) {
            arro.b("layoutManager");
            gridLayoutManager = null;
        }
        gridLayoutManager.ad(N, 0);
        if (i > 0) {
            bz().c(false);
        }
    }

    public final void aP(int i) {
        adef adefVar = this.ao;
        if (adefVar == null) {
            arro.b("views");
            adefVar = null;
        }
        ajmk d = ((TabLayout) adefVar.c).d(i);
        if (d != null) {
            this.ak = i;
            d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agem
    public final void aT(afzr afzrVar) {
        ((alvg) aq.d().h("com/google/android/libraries/compose/emoji/ui/screen/EmojiScreen", "applyHugoColors", 121, "EmojiScreen.kt")).t("Applying HugoColors: %s", afzrVar);
        adef adefVar = this.ao;
        if (adefVar == null) {
            arro.b("views");
            adefVar = null;
        }
        ColorStateList colorStateList = afzrVar.f;
        TabLayout tabLayout = (TabLayout) adefVar.c;
        if (tabLayout.l != colorStateList) {
            tabLayout.l = colorStateList;
            tabLayout.t();
        }
        ((TabLayout) adefVar.c).setBackgroundColor(afzrVar.d);
        ((ImageButton) adefVar.a).setImageTintList(afzrVar.k);
        ((View) adefVar.b).setBackgroundColor(afzrVar.j);
    }

    public final afmq aU() {
        afmq afmqVar = this.an;
        if (afmqVar != null) {
            return afmqVar;
        }
        arro.b("emojiPreferencesService");
        return null;
    }

    public final ahjj aW() {
        return (ahjj) this.at.a();
    }

    @Override // defpackage.agem
    public final void aY() {
        if (this.ao != null) {
            bc(aV(this));
        }
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        int i;
        view.getClass();
        e().J((afnx) bj());
        o().J((afnx) bj());
        this.ao = new adef((ViewGroup) view);
        by();
        bd();
        adef adefVar = this.ao;
        adef adefVar2 = null;
        if (adefVar == null) {
            arro.b("views");
            adefVar = null;
        }
        ((RecyclerView) adefVar.d).ag(e());
        adef adefVar3 = this.ao;
        if (adefVar3 == null) {
            arro.b("views");
            adefVar3 = null;
        }
        if (true != ((afnx) bj()).e) {
            i = 8;
        } else {
            i = 0;
        }
        ((View) adefVar3.a).setVisibility(i);
        adef adefVar4 = this.ao;
        if (adefVar4 == null) {
            arro.b("views");
        } else {
            adefVar2 = adefVar4;
        }
        ((ImageButton) adefVar2.a).setOnClickListener(bh().a("EmojiScreen.backspace#onClick", new acah(this, 12)));
        bh().d("EmojiScreen#onViewCreated", new afjm(this, 20));
    }

    public final afox e() {
        afox afoxVar = this.c;
        if (afoxVar != null) {
            return afoxVar;
        }
        arro.b("galleryAdapter");
        return null;
    }

    @Override // defpackage.afoh, defpackage.agai, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        adef adefVar = this.ap;
        if (adefVar == null) {
            arro.b("emojiUsageProcessorFactory");
            adefVar = null;
        }
        this.ah = adefVar.e(new afka(29));
        bh().d("EmojiScreen#onAttach", new afjm(this, 18));
    }

    @Override // defpackage.agai
    public final boolean gE() {
        boolean isShowing = p().isShowing();
        if (isShowing) {
            p().a();
        }
        return isShowing;
    }

    @Override // defpackage.agem
    public final void gy(agdp agdpVar) {
        agdpVar.getClass();
        if (this.ao != null) {
            bc(be(new afjm(agdpVar, 19)));
        }
    }

    @Override // defpackage.cg
    public final void h() {
        super.h();
        adef adefVar = this.ao;
        afoq afoqVar = null;
        if (adefVar != null) {
            ((RecyclerView) adefVar.d).A();
            adef adefVar2 = this.ao;
            if (adefVar2 == null) {
                arro.b("views");
                adefVar2 = null;
            }
            ((TabLayout) adefVar2.c).D.clear();
        }
        if (this.e != null) {
            afmq aU = aU();
            afoq afoqVar2 = this.e;
            if (afoqVar2 == null) {
                arro.b("currentAdapter");
            } else {
                afoqVar = afoqVar2;
            }
            aU.h(afoqVar);
        }
    }

    public final afoy o() {
        afoy afoyVar = this.d;
        if (afoyVar != null) {
            return afoyVar;
        }
        arro.b("searchAdapter");
        return null;
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        adef adefVar = this.ao;
        if (adefVar != null) {
            bf((TabLayout) adefVar.c);
            bd();
        }
        if (this.b != null && p().isShowing()) {
            p().a();
        }
    }

    public final afpp p() {
        afpp afppVar = this.b;
        if (afppVar != null) {
            return afppVar;
        }
        arro.b("variantMenu");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.arpe r8) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afof.q(arpe):java.lang.Object");
    }

    @Override // defpackage.ageb
    public final agea r() {
        adef adefVar = this.ao;
        if (adefVar != null) {
            return afzv.q((RecyclerView) adefVar.d);
        }
        return null;
    }
}
