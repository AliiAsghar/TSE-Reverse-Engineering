package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hth extends hte {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hte
    protected final Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2) {
        Paint paint = hun.a;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return hun.c(hqaVar, bitmap, i, i2);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        return obj instanceof hth;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return -670243078;
    }
}
