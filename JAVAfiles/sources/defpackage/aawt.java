package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawt {
    public aaov a;
    public boolean b;
    public CenterFitVideoView c;
    public ZoomableImageView d;
    public long e;
    public final aawo g;
    public final armf h;
    public aaxd i;
    public final Point f = new Point();
    private final Runnable j = new aaqk(this, 19, null);

    public aawt(aawo aawoVar, armf armfVar) {
        this.g = aawoVar;
        this.h = armfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aawo g(Uri uri, String str, int i) {
        aawo o = aawo.o();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        bundle.putString("content_type", str);
        bundle.putInt("starting_view_state", 0);
        o.ak(bundle);
        return o;
    }

    public final void a() {
        this.e = -1L;
        CenterFitVideoView centerFitVideoView = this.c;
        if (centerFitVideoView != null) {
            centerFitVideoView.removeCallbacks(this.j);
        }
    }

    public final void b() {
        if (this.c.isPlaying()) {
            this.c.postDelayed(this.j, 250L);
        }
    }

    public final void c() {
        Insets of;
        aawo aawoVar = this.g;
        if (aawoVar == null) {
            return;
        }
        Resources z = aawoVar.z();
        int dimension = (int) z.getDimension(R.dimen.media_viewer_edit_horizontal_padding);
        int dimension2 = (int) z.getDimension(R.dimen.media_viewer_edit_vertical_padding);
        int dimension3 = (int) z.getDimension(R.dimen.media_viewer_edit_corner_radius);
        ZoomableImageView zoomableImageView = this.d;
        of = Insets.of(dimension, dimension2, dimension, dimension2);
        zoomableImageView.g = of;
        ZoomableImageView zoomableImageView2 = this.d;
        zoomableImageView2.h = new Path();
        zoomableImageView2.i = dimension3;
        zoomableImageView2.d();
    }

    public final void d() {
        aaxd aaxdVar;
        long currentPosition = this.c.getCurrentPosition() / 1000;
        if (this.e != currentPosition && (aaxdVar = this.i) != null) {
            this.e = currentPosition;
            Context x = this.g.x();
            aaxdVar.u.setText(String.format("%s/%s", yyb.bn(x, this.c.getCurrentPosition()), yyb.bn(x, this.c.getDuration())));
        }
    }

    public final void e() {
        Point point = this.f;
        CenterFitVideoView centerFitVideoView = this.c;
        int i = point.x;
        int i2 = point.y;
        ViewGroup viewGroup = (ViewGroup) centerFitVideoView.getParent();
        float f = i;
        float f2 = i2;
        float min = Math.min(viewGroup.getWidth() / f, viewGroup.getHeight() / f2);
        float f3 = f * min;
        float f4 = f2 * min;
        ViewGroup.LayoutParams layoutParams = centerFitVideoView.getLayoutParams();
        layoutParams.width = (int) f3;
        layoutParams.height = (int) f4;
        centerFitVideoView.setLayoutParams(layoutParams);
    }

    public final boolean f() {
        if (this.g != null && this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        if (!f()) {
            new Rect();
            return;
        }
        c();
        this.d.c();
        this.d.a();
    }
}
