package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxk extends hxl {
    public hxk(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.hxl
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    @Deprecated
    public hxk(ImageView imageView, byte[] bArr) {
        super(imageView, null);
    }
}
