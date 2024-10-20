package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htg extends hte {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hte
    protected final Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Paint paint = hun.a;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Matrix matrix = new Matrix();
            int width = bitmap.getWidth() * i2;
            int height = bitmap.getHeight() * i;
            float f3 = i2;
            float f4 = i;
            float f5 = brg.a;
            if (width > height) {
                f = f3 / bitmap.getHeight();
                f2 = 0.0f;
                f5 = (f4 - (bitmap.getWidth() * f)) * 0.5f;
            } else {
                float width2 = f4 / bitmap.getWidth();
                float height2 = (f3 - (bitmap.getHeight() * width2)) * 0.5f;
                f = width2;
                f2 = height2;
            }
            matrix.setScale(f, f);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f2 + 0.5f));
            Bitmap a = hqaVar.a(i, i2, hun.b(bitmap));
            hun.f(bitmap, a);
            hun.d(bitmap, a, matrix);
            return a;
        }
        return bitmap;
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        return obj instanceof htg;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return -599754482;
    }
}
