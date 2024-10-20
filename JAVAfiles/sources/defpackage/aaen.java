package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaen extends hxo {
    final /* synthetic */ Uri a;
    final /* synthetic */ RichCardMediaAttachmentView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaen(RichCardMediaAttachmentView richCardMediaAttachmentView, int i, int i2, Uri uri) {
        super(i, i2);
        this.a = uri;
        this.b = richCardMediaAttachmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hxq
    public final /* bridge */ /* synthetic */ void b(Object obj, hxz hxzVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        this.b.b.setImageDrawable(drawable);
        this.b.j = this.a;
    }
}
