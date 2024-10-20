package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaar extends aaal {
    public static final alvi ah = alvi.m("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment");
    public RecyclerView ai;
    public aaau aj;
    public aaax ak;
    public GridLayoutManager al;
    public int am;
    public ahjj ao;
    private TabLayout ap;
    private final ajmg aq = new aaam(this, 0);
    private final ViewTreeObserver.OnGlobalLayoutListener ar = new ja(this, 8);
    public final nq an = new aaan(this);
    private final ViewTreeObserver.OnGlobalLayoutListener as = new ja(this, 9);

    private final void aO() {
        if (abbv.b(x()).x / this.ap.b() >= z().getDimensionPixelOffset(R.dimen.emoji_gallery_tab_min_width)) {
            this.ap.q(1);
            this.ap.w();
        } else {
            this.ap.q(0);
        }
    }

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long a = this.a.a();
        View inflate = layoutInflater.inflate(R.layout.emoji_gallery_fragment, viewGroup, false);
        this.ap = (TabLayout) inflate.findViewById(R.id.emoji_category_tab_layout);
        this.ai = (RecyclerView) inflate.findViewById(R.id.emoji_recycler_view);
        TabLayout tabLayout = this.ap;
        aaaq[] values = aaaq.values();
        for (int i = 0; i < aaaq.values().length; i++) {
            aaaq aaaqVar = values[i];
            int i2 = aaaqVar.k;
            int i3 = aaaqVar.l;
            ajmk e = tabLayout.e();
            e.d(S(i2));
            e.e(x().getDrawable(i3));
            tabLayout.i(e, i, tabLayout.b.isEmpty());
        }
        tabLayout.f(this.aq);
        aO();
        aaaz aaazVar = new aaaz(x(), this.d);
        aaazVar.k = aaazVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_gallery_column_size_updated);
        aaazVar.l = aaazVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_selector_panel_side_clearance);
        int i4 = aaazVar.k;
        aaazVar.m = new FrameLayout.LayoutParams(i4, i4);
        aaazVar.setWidth(-1);
        aaazVar.setHeight(-1);
        aaazVar.setBackgroundDrawable(null);
        aaazVar.g = aaazVar.c.inflate(R.layout.emoji_variant_selector_popup_window, (ViewGroup) null);
        aaazVar.setContentView(aaazVar.g);
        aaazVar.g.setOnClickListener(new zqq(aaazVar, 12));
        aaazVar.e = new aaay(aaazVar);
        aaazVar.f = new GridLayoutManager(6);
        RecyclerView recyclerView = (RecyclerView) aaazVar.g.findViewById(R.id.emoji_variant_selector_recycler_view);
        recyclerView.aj(aaazVar.f);
        recyclerView.ag(aaazVar.e);
        recyclerView.addOnLayoutChangeListener(new fyc(aaazVar, 13));
        aaazVar.h = aaazVar.g.findViewById(R.id.descender);
        aaazVar.i = aaazVar.g.findViewById(R.id.panel);
        this.ak = aaazVar;
        aaau aaauVar = new aaau(fe(), this.ag, this.b, this.c, this.e, this.d, this.ak);
        this.aj = aaauVar;
        this.ai.ag(aaauVar);
        this.ai.aF();
        RecyclerView recyclerView2 = this.ai;
        x();
        recyclerView2.aj(new GridLayoutManager(1));
        this.ai.getViewTreeObserver().addOnGlobalLayoutListener(this.as);
        long a2 = this.a.a();
        alvw d = ah.d();
        d.X(alwp.a, "emojiGallery");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment", "onCreateView", 294, "EmojiGalleryFragment.java")).z("Emoji: Fragment onCreateView @%d took: %d", a2, a2 - a);
        inflate.setOnApplyWindowInsetsListener(new ivf(9));
        return inflate;
    }

    @Override // defpackage.aaal
    public final void a() {
        this.e.d();
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        this.e.e();
    }

    @Override // defpackage.aaal
    public final void d() {
        this.ao = null;
        aaau aaauVar = this.aj;
        if (aaauVar != null) {
            aaauVar.J();
        }
    }

    @Override // defpackage.aaal
    public final boolean e() {
        if (this.ak.isShowing()) {
            this.ak.dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.cg
    public final void h() {
        zxy zxyVar;
        super.h();
        aaau aaauVar = this.aj;
        if (aaauVar != null && (zxyVar = aaauVar.v) != null) {
            zxyVar.h(aaauVar);
        }
        this.ap.k(this.aq);
        p(this.ar);
        p(this.as);
    }

    @Override // defpackage.aaal
    public final void o(ahjj ahjjVar) {
        this.ao = ahjjVar;
        aaau aaauVar = this.aj;
        if (aaauVar != null) {
            aaauVar.w = ahjjVar;
        }
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ai.getViewTreeObserver().addOnGlobalLayoutListener(this.ar);
        aO();
    }

    public final void p(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        RecyclerView recyclerView = this.ai;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public final void q(int i) {
        int m = this.aj.m(i);
        GridLayoutManager gridLayoutManager = this.al;
        if (gridLayoutManager != null) {
            gridLayoutManager.ad(m, 0);
        }
    }

    public final void r(int i) {
        ajmk d = this.ap.d(i);
        if (d != null) {
            this.am = i;
            d.b();
        }
    }
}
