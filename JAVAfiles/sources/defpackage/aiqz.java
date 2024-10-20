package defpackage;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqz extends ConstraintLayout implements aire {
    public final RecyclerView d;
    public final ImageView e;
    public final View f;
    public final aiqu g;
    public final aiqj h;
    private final aira i;
    private final TextView j;
    private final ImageButton k;
    private final aiqy l;
    private final StickerGalleryActivity m;

    public aiqz(Context context, StickerGalleryActivity stickerGalleryActivity) {
        super(context);
        this.m = stickerGalleryActivity;
        setId(R.id.favorites_sticker_packs_view);
        aiqj b = ((aiqi) getContext().getApplicationContext()).b();
        this.h = b;
        this.i = new aira(b);
        inflate(getContext(), R.layout.favorite_sticker_packs_layout, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.favorites_recycler_view);
        this.d = recyclerView;
        this.e = (ImageView) findViewById(R.id.empty_favorites_image);
        this.j = (TextView) findViewById(R.id.empty_favorites_text);
        View findViewById = findViewById(R.id.favorites_prompt);
        this.f = findViewById;
        ImageButton imageButton = (ImageButton) findViewById(R.id.favorites_prompt_close_button);
        this.k = imageButton;
        imageButton.setOnClickListener(new agrb(this, 12, null));
        aiqu aiquVar = new aiqu(b, stickerGalleryActivity);
        this.g = aiquVar;
        getContext();
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ag(aiquVar);
        aiquVar.D(new aiqw(this));
        aiqy aiqyVar = new aiqy(aiquVar, 0);
        this.l = aiqyVar;
        b.g(aiqyVar);
        if (stickerGalleryActivity.B()) {
            int color = getContext().getColor(R.color.white);
            TextView textView = (TextView) findViewById(R.id.favorites_prompt_text);
            TextView textView2 = (TextView) findViewById(R.id.empty_favorites_text);
            findViewById.setBackground(getResources().getDrawable(R.drawable.favorites_prompt_background_dark_mode));
            imageButton.getDrawable().mutate().setTint(color);
            textView.setTextColor(color);
            textView2.setTextColor(color);
        }
    }

    private final void g() {
        if (this.f.getVisibility() == 0 && !((agcp) this.h.k).z()) {
            e(false);
        }
    }

    @Override // defpackage.aire
    public final void b() {
        g();
        ((airh) this.h.g).c(7);
    }

    @Override // defpackage.aire
    public final void c() {
        aiqu aiquVar = this.g;
        Iterator it = aiquVar.d.iterator();
        while (it.hasNext()) {
            aiquVar.m((String) it.next());
        }
        aiquVar.d.clear();
        g();
    }

    public final void d() {
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void e(boolean z) {
        if (this.f.getVisibility() == 8) {
            return;
        }
        this.k.setClickable(false);
        if (z) {
            this.f.setVisibility(4);
            this.d.animate().translationY(-this.f.getHeight()).setDuration(300L).setListener(new aiqx(this));
            return;
        }
        this.f.setVisibility(8);
    }

    public final void f() {
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.j.setVisibility(0);
        e(false);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        this.d.setSystemUiVisibility(1280);
        this.d.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: aiqv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                view.setPadding(0, aiqz.this.getResources().getDimensionPixelSize(R.dimen.favorites_view_padding_top), 0, windowInsets2.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
        return windowInsets;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, anen] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aira airaVar = this.i;
        airaVar.d = this;
        aiqj aiqjVar = airaVar.c;
        airaVar.a = aiqjVar.b.submit(new aidu(aiqjVar.k, 4));
        albo.bR(airaVar.a, new adnx(airaVar, 13), aiqk.a);
        aira airaVar2 = this.i;
        airaVar2.b = airaVar2.c.a();
        albo.bR(airaVar2.b, new adnx(airaVar2, 14), aiqk.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aira airaVar = this.i;
        airaVar.d = null;
        ListenableFuture listenableFuture = airaVar.a;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        ListenableFuture listenableFuture2 = airaVar.b;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(true);
        }
        this.h.j(this.l);
        aiqu aiquVar = this.g;
        Iterator it = aiquVar.f.values().iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(true);
        }
        Iterator it2 = aiquVar.g.values().iterator();
        while (it2.hasNext()) {
            ((ListenableFuture) it2.next()).cancel(true);
        }
    }
}
