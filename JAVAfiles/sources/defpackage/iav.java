package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iav {
    private static final arml a = armd.b(3, gqj.g);

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    public static final Handler b() {
        return (Handler) a.a();
    }
}
