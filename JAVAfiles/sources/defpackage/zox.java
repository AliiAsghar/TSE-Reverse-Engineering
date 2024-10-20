package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.android.apps.messaging.ui.attachment.ImageAttachmentPhoneView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zox extends xzs {
    final /* synthetic */ ImageAttachmentPhoneView a;
    private final MessagePartCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zox(ImageAttachmentPhoneView imageAttachmentPhoneView, MessagePartCoreData messagePartCoreData) {
        super("ImageAttachmentPhoneView.adjustImageViewBounds");
        this.a = imageAttachmentPhoneView;
        this.b = messagePartCoreData;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        Rect s;
        Point point = new Point();
        this.b.ah();
        Resources resources = this.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.conversation_message_photo_min_height);
        if (this.b.c() != -1 && this.b.b() != -1) {
            point.x = this.b.c();
            point.y = this.b.b();
            yfo.j(point, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        } else if (this.b.x() != null && (s = this.b.s()) != null) {
            float a = yfo.a(s.width(), s.height(), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
            point.x = (int) (s.width() * a);
            point.y = (int) (s.height() * a);
        } else {
            point.x = dimensionPixelSize;
            point.y = dimensionPixelSize2;
        }
        return point;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Object tag;
        Point point = (Point) obj;
        RoundedImageView roundedImageView = ((xus) this.a).a;
        if (roundedImageView != null && (tag = roundedImageView.getTag()) != null && tag.equals(this.b)) {
            ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
            layoutParams.width = point.x;
            layoutParams.height = point.y;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        RoundedImageView roundedImageView = ((xus) this.a).a;
        if (roundedImageView != null) {
            roundedImageView.setTag(this.b);
        }
    }
}
