package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagj extends hxj {
    final /* synthetic */ ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagj(ImageView imageView) {
        super(imageView);
        this.b = imageView;
    }

    @Override // defpackage.hxq
    public final /* bridge */ /* synthetic */ void b(Object obj, hxz hxzVar) {
        this.b.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.hxq
    public final void a(Drawable drawable) {
    }
}
