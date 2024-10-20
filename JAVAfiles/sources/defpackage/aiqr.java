package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqr extends FrameLayout implements aire {
    public final aiqq a;
    public final StickerGalleryActivity b;
    private final ProgressBar c;
    private ListenableFuture d;
    private final RecyclerView e;
    private final aiqj f;
    private final aiqy g;

    public aiqr(Context context, StickerGalleryActivity stickerGalleryActivity) {
        super(context);
        this.b = stickerGalleryActivity;
        setId(R.id.browse_sticker_packs_view);
        aiqj b = ((aiqi) getContext().getApplicationContext()).b();
        this.f = b;
        inflate(getContext(), R.layout.browse_sticker_packs_layout, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.c = progressBar;
        aiqq aiqqVar = new aiqq(b, (AccessibilityManager) getContext().getSystemService("accessibility"), ((Boolean) ((alhw) b.i).a).booleanValue(), stickerGalleryActivity);
        this.a = aiqqVar;
        getContext();
        Context context2 = getContext();
        Resources resources = context2.getResources();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Math.max(ahmc.J(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.browse_sticker_icon_size), resources.getDimension(R.dimen.browse_item_margin_lr), resources.getDimension(R.dimen.browse_view_padding_lr)), resources.getInteger(R.integer.browse_min_sticker_pack_per_row)));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.browse_recycler_view);
        this.e = recyclerView;
        recyclerView.aj(gridLayoutManager);
        recyclerView.ag(aiqqVar);
        aiqy aiqyVar = new aiqy(aiqqVar, 1);
        this.g = aiqyVar;
        b.g(aiqyVar);
        if (stickerGalleryActivity.B()) {
            progressBar.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        }
    }

    public final void a() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.aire
    public final void b() {
        ((airh) this.f.g).c(6);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        this.e.setSystemUiVisibility(1280);
        this.e.setOnApplyWindowInsetsListener(new iwv(this, 9));
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListenableFuture c = this.f.c();
        this.d = c;
        albo.bR(c, new adnx(this, 11), aiqk.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.cancel(true);
        this.f.j(this.g);
    }

    @Override // defpackage.aire
    public final void c() {
    }
}
