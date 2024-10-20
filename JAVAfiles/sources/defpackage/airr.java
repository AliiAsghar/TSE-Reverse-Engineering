package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airr extends ConstraintLayout {
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageButton h;
    public final RecyclerView i;
    public ListenableFuture j;
    public aova k;
    public airp l;
    public boolean m;
    public final aiqj n;
    public final PackDetailsActivity o;
    public nq p;
    private final Toolbar q;
    private final View r;

    public airr(Context context, PackDetailsActivity packDetailsActivity) {
        super(context);
        this.o = packDetailsActivity;
        setId(R.id.sticker_pack_details_view);
        this.n = ((aiqi) getContext().getApplicationContext()).b();
        inflate(getContext(), R.layout.pack_details_layout, this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.q = toolbar;
        toolbar.s(new agrb(this, 15, null));
        this.d = (ImageView) findViewById(R.id.pack_icon);
        TextView textView = (TextView) findViewById(R.id.pack_name);
        this.e = textView;
        TextView textView2 = (TextView) findViewById(R.id.pack_author);
        this.f = textView2;
        TextView textView3 = (TextView) findViewById(R.id.pack_description);
        this.g = textView3;
        this.h = (ImageButton) findViewById(R.id.favorite_pack_icon);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pack_recyclerView);
        this.i = recyclerView;
        View findViewById = findViewById(R.id.pack_details_shadow);
        this.r = findViewById;
        getContext();
        Context context2 = getContext();
        Resources resources = context2.getResources();
        recyclerView.aj(new GridLayoutManager(ahmc.J(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.pack_details_recycler_view_item_size), resources.getDimension(R.dimen.pack_details_recycler_view_item_margin), resources.getDimension(R.dimen.pack_details_view_grid_padding_lr))));
        if (packDetailsActivity.y()) {
            Context context3 = getContext();
            int color = context3.getColor(R.color.white);
            int dimension = (int) getResources().getDimension(R.dimen.sticker_shadow_height_dark_mode);
            int color2 = getContext().getColor(R.color.sticker_shadow_color_dark_mode);
            toolbar.e().mutate().setTint(color);
            textView.setTextColor(context3.getColor(R.color.pack_details_name_color_dark_mode));
            textView2.setTextColor(context3.getColor(R.color.pack_details_author_color_dark_mode));
            textView3.setTextColor(context3.getColor(R.color.pack_details_description_color_dark_mode));
            findViewById.setBackgroundColor(color2);
            ad adVar = (ad) findViewById.getLayoutParams();
            adVar.height = dimension;
            findViewById.setLayoutParams(adVar);
            View findViewById2 = findViewById(R.id.toolbar_shadow);
            findViewById2.setBackgroundColor(color2);
            ad adVar2 = (ad) findViewById2.getLayoutParams();
            adVar2.height = dimension;
            findViewById2.setLayoutParams(adVar2);
        }
    }

    public final void b() {
        int i;
        int i2;
        Context context = getContext();
        if (this.m) {
            if (true != this.o.y()) {
                i2 = R.color.favorite_enabled_color;
            } else {
                i2 = R.color.favorite_enabled_color_dark_mode;
            }
            int color = context.getColor(i2);
            this.h.setImageResource(R.drawable.quantum_ic_favorite_white_24);
            this.h.setColorFilter(color);
            this.h.setContentDescription(getContext().getString(R.string.cd_sticker_favorite_on_icon));
            return;
        }
        if (true != this.o.y()) {
            i = R.color.favorite_disabled_color;
        } else {
            i = R.color.favorite_disabled_color_dark_mode;
        }
        int color2 = context.getColor(i);
        this.h.setImageResource(R.drawable.quantum_ic_favorite_border_white_24);
        this.h.setColorFilter(color2);
        this.h.setContentDescription(getContext().getString(R.string.cd_sticker_favorite_off_icon));
    }

    public final void c() {
        if (((GridLayoutManager) this.i.m).K() > 0) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 27) {
            this.i.setSystemUiVisibility(1280);
            this.i.setOnApplyWindowInsetsListener(new iwv(this, 12));
        }
        aova aovaVar = this.k;
        if (aovaVar != null) {
            aiqj aiqjVar = this.n;
            ((airh) aiqjVar.g).e(aovaVar.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ListenableFuture listenableFuture = this.j;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
    }
}
