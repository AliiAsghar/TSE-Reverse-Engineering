package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airg extends ConstraintLayout {
    public final StickerSearchView d;
    public final ViewPager e;
    public RecyclerView f;
    public ProgressBar g;
    public ImageView h;
    public TextView i;
    public final aird j;
    public final airh k;
    public final StickerGalleryActivity l;
    private final Toolbar m;
    private final ViewFlipper n;
    private final TabLayout o;
    private MenuItem p;
    private final boolean q;
    private int r;
    private airc s;

    public airg(Context context, StickerGalleryActivity stickerGalleryActivity) {
        super(context);
        boolean z;
        this.r = -16777216;
        this.l = stickerGalleryActivity;
        setId(R.id.sticker_gallery_view);
        aiqj b = ((aiqi) getContext().getApplicationContext()).b();
        inflate(getContext(), R.layout.sticker_gallery_layout, this);
        this.k = (airh) b.g;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.m = toolbar;
        toolbar.s(new agrb(this, 13, null));
        StickerSearchView stickerSearchView = (StickerSearchView) findViewById(R.id.search_view);
        this.d = stickerSearchView;
        stickerSearchView.setVisibility(8);
        this.n = (ViewFlipper) findViewById(R.id.view_flipper);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.e = viewPager;
        aird airdVar = new aird(viewPager, stickerGalleryActivity);
        this.j = airdVar;
        viewPager.i(airdVar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.o = tabLayout;
        tabLayout.s(viewPager);
        int aK = a.aK(((aoda) b.c).b);
        if (aK != 0 && aK == 5) {
            z = false;
        } else {
            z = true;
        }
        this.q = z;
        if (z) {
            toolbar.n(R.menu.sticker_gallery_search_menu);
            MenuItem findItem = toolbar.f().findItem(R.id.action_search);
            this.p = findItem;
            findItem.setOnMenuItemClickListener(new pf(this, 3));
            this.f = (RecyclerView) findViewById(R.id.search_recycler_view);
            this.g = (ProgressBar) findViewById(R.id.search_progress_bar);
            this.h = (ImageView) findViewById(R.id.search_no_result_image);
            this.i = (TextView) findViewById(R.id.search_no_result_text);
            airb airbVar = new airb(stickerGalleryActivity);
            airc aircVar = new airc(b, airbVar, this, stickerGalleryActivity);
            this.s = aircVar;
            stickerSearchView.d = aircVar;
            RecyclerView recyclerView = this.f;
            getContext();
            Context context2 = getContext();
            Resources resources = context2.getResources();
            recyclerView.aj(new GridLayoutManager(ahmc.J(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.search_sticker_icon_size), resources.getDimension(R.dimen.search_item_margin), resources.getDimension(R.dimen.search_view_padding_lr))));
            this.f.ah(null);
            this.f.ag(airbVar);
        }
        if (stickerGalleryActivity.n) {
            toolbar.q(R.drawable.quantum_ic_arrow_back_black_24);
        }
        if (stickerGalleryActivity.B()) {
            int color = getContext().getColor(R.color.theme_color_dark_mode);
            int color2 = getContext().getColor(R.color.white);
            int color3 = getContext().getColor(R.color.sticker_gallery_tab_text_color_dark_mode);
            int color4 = getContext().getColor(R.color.sticker_gallery_tab_selected_color_dark_mode);
            int dimension = (int) getResources().getDimension(R.dimen.sticker_shadow_height_dark_mode);
            int color5 = getContext().getColor(R.color.sticker_shadow_color_dark_mode);
            this.r = color2;
            toolbar.e().mutate().setTint(color2);
            if (z) {
                this.p.getIcon().mutate().setTint(color2);
                stickerSearchView.b.getDrawable().mutate().setTint(color2);
            }
            tabLayout.setBackgroundColor(color);
            tabLayout.r(TabLayout.c(color3, color4));
            tabLayout.p(color4);
            View findViewById = findViewById(R.id.view_pager_shadow);
            ad adVar = (ad) findViewById.getLayoutParams();
            adVar.height = dimension;
            findViewById.setLayoutParams(adVar);
            findViewById.setBackgroundColor(color5);
            View findViewById2 = findViewById(R.id.toolbar_shadow);
            ad adVar2 = (ad) findViewById2.getLayoutParams();
            adVar2.height = dimension;
            findViewById2.setLayoutParams(adVar2);
            findViewById2.setBackgroundColor(color5);
            this.g.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
            this.i.setTextColor(getContext().getColor(R.color.search_not_result_text_color_dark_mode));
        }
    }

    public final void b() {
        if (this.d.getVisibility() != 8) {
            this.n.showPrevious();
            this.d.setVisibility(8);
            StickerSearchView stickerSearchView = this.d;
            stickerSearchView.a.setText("");
            stickerSearchView.a.clearFocus();
            if (!this.l.n) {
                this.m.q(R.drawable.quantum_ic_close_black_24);
                if (this.r != -16777216) {
                    this.m.e().mutate().setTint(this.r);
                }
            }
            this.p.setVisible(true);
            airc aircVar = this.s;
            if (aircVar != null) {
                aircVar.a();
                aircVar.e.c();
            }
        }
    }

    public final void c() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }

    public final void d(String str) {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.i.setText(getContext().getString(R.string.search_no_result_text, str));
        this.h.setVisibility(0);
        this.i.setVisibility(0);
    }

    public final void e() {
        if (this.d.getVisibility() == 0) {
            return;
        }
        this.n.showNext();
        this.d.setVisibility(0);
        c();
        if (!this.l.n) {
            this.m.q(R.drawable.quantum_ic_arrow_back_black_24);
            if (this.r != -16777216) {
                this.m.e().mutate().setTint(this.r);
            }
        }
        this.p.setVisible(false);
        this.k.c(8);
    }

    public final boolean f() {
        if (this.d.getVisibility() == 0) {
            b();
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.q && Build.VERSION.SDK_INT >= 27) {
            this.f.setSystemUiVisibility(1280);
            this.e.setOnApplyWindowInsetsListener(new iwv(this, 10));
            this.f.setOnApplyWindowInsetsListener(new iwv(this, 11));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        airc aircVar = this.s;
        if (aircVar != null) {
            aircVar.a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        airf airfVar = (airf) parcelable;
        super.onRestoreInstanceState(airfVar.getSuperState());
        if (airfVar.a) {
            e();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        airf airfVar = new airf(super.onSaveInstanceState());
        if (this.d.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        airfVar.a = z;
        return airfVar;
    }
}
