package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpj implements xun {
    public Uri a;
    public final akms b;
    public ListenableFuture c = null;
    public final VideoAttachmentView d;
    public final armf e;
    public final RoundedImageView f;
    public final VideoOverlayView g;
    public final boolean h;
    public final boolean i;
    private final armf j;
    private final armf k;
    private final Context l;
    private final int m;

    public zpj(VideoAttachmentView videoAttachmentView, TypedArray typedArray, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        int dimensionPixelSize;
        this.d = videoAttachmentView;
        this.j = armfVar;
        this.k = armfVar2;
        this.e = armfVar5;
        Context context = videoAttachmentView.getContext();
        this.l = context;
        this.m = context.getColor(R.color.message_video_selected_tint);
        this.b = aktp.y(videoAttachmentView).c().o(huz.b());
        View.inflate(context, R.layout.video_attachment_view_inline, videoAttachmentView);
        int i = 1;
        int i2 = 0;
        if (typedArray == null) {
            this.h = false;
            this.i = false;
            dimensionPixelSize = -1;
        } else {
            int[] iArr = zpe.a;
            this.h = typedArray.getBoolean(1, false);
            this.i = typedArray.getBoolean(3, false);
            dimensionPixelSize = typedArray.getDimensionPixelSize(4, -1);
            i2 = typedArray.getDimensionPixelSize(2, 0);
        }
        RoundedImageView roundedImageView = (RoundedImageView) videoAttachmentView.findViewById(R.id.video_thumbnail_image);
        this.f = roundedImageView;
        if (dimensionPixelSize >= 0) {
            roundedImageView.u = dimensionPixelSize;
        }
        VideoOverlayView videoOverlayView = (VideoOverlayView) videoAttachmentView.findViewById(R.id.video_overlay);
        this.g = videoOverlayView;
        if (i2 > 0) {
            videoOverlayView.setPadding(i2, i2, i2, i2);
        }
        if (this.h) {
            videoOverlayView.setVisibility(8);
        } else {
            roundedImageView.setOnClickListener(((zmr) armfVar4.b()).a(new aarn(this, armfVar3, dimensionPixelSize, i)));
        }
        if (this.i) {
            roundedImageView.getLayoutParams().width = -1;
            roundedImageView.getLayoutParams().height = -1;
            roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // defpackage.xun
    public final void c() {
        this.a = null;
        this.f.setImageDrawable(null);
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        int i;
        this.d.setSelected(z);
        if (true != rryVar.ah(this.l)) {
            i = 0;
        } else {
            i = 8;
        }
        this.g.setVisibility(i);
        if (z) {
            int i2 = this.m;
            this.f.setColorFilter(i2);
            VideoOverlayView videoOverlayView = this.g;
            TextView textView = (TextView) videoOverlayView.findViewById(R.id.duration);
            ((ImageView) videoOverlayView.findViewById(R.id.icon)).setColorFilter(i2);
            textView.setTextColor(i2);
        } else {
            this.f.clearColorFilter();
            VideoOverlayView videoOverlayView2 = this.g;
            TextView textView2 = (TextView) videoOverlayView2.findViewById(R.id.duration);
            ((ImageView) videoOverlayView2.findViewById(R.id.icon)).clearColorFilter();
            textView2.setTextColor(videoOverlayView2.getResources().getColor(R.color.video_duration_text));
        }
        this.f.r(fArr);
    }

    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        akul ag;
        byte[] bArr = null;
        if (messagePartCoreData == null) {
            this.a = null;
            this.f.setImageURI(null);
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        ((FrameLayout.LayoutParams) this.g.getLayoutParams()).gravity = 85;
        VideoOverlayView videoOverlayView = this.g;
        if (videoOverlayView.b != 2) {
            xyl.d(2, 0, 2);
            videoOverlayView.b = 2;
            videoOverlayView.requestLayout();
        }
        ryz ryzVar = (ryz) this.k.b();
        Uri v = messagePartCoreData.v();
        if (v != null && "file".equals(v.getScheme()) && ryzVar.b.n()) {
            ag = aktp.ai(new rbn(ryzVar, v, messagePartCoreData, 3, (byte[]) null), ryzVar.c);
        } else {
            ag = aktp.ag(messagePartCoreData.t());
        }
        this.c = ag;
        albo.bR(ag, qjc.a(new ydv(new zcd(this, messagePartCoreData, 3, bArr), new zle(12), 0)), (Executor) this.j.b());
    }
}
