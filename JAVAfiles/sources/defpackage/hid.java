package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hid {
    private static final ThreadLocal b = new hhz();
    private static final ThreadLocal c = new hia();
    private static final ThreadLocal d = new hib();
    public static final ThreadLocal a = new hic();
    private static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float a() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float b(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float c(Matrix matrix) {
        float[] fArr = (float[]) a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void e(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) b.get();
        Path path2 = (Path) c.get();
        Path path3 = (Path) d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == brg.a) {
            hav.a();
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = hhy.b(min, length);
                max = hhy.b(max, length);
            }
            if (min < brg.a) {
                min = hhy.b(min, length);
            }
            if (max < brg.a) {
                max = hhy.b(max, length);
            }
            if (min == max) {
                path.reset();
                hav.a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(brg.a, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < brg.a) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            hav.a();
            return;
        }
        hav.a();
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        hav.a();
    }
}
