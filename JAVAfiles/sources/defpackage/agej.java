package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agej {
    public abstract int a(Context context);

    public final void b(Context context, Drawable drawable) {
        drawable.setColorFilter(new PorterDuffColorFilter(a(context), PorterDuff.Mode.SRC_ATOP));
    }
}
