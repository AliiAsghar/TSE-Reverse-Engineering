package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hun {
    public static final Paint b;
    public static final Lock c;
    private static final Set e;
    private static final Paint d = new Paint(6);
    public static final Paint a = new Paint(7);

    static {
        Lock humVar;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        e = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            humVar = new ReentrantLock();
        } else {
            humVar = new hum();
        }
        c = humVar;
        Paint paint = new Paint(7);
        b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap.Config a(Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        config = Bitmap.Config.RGBA_F16;
        if (config.equals(bitmap.getConfig())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Bitmap.Config b(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
        } else {
            float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                }
            } else {
                Bitmap a2 = hqaVar.a((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), b(bitmap));
                f(bitmap, a2);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", a.bU(i2, i, "request: ", "x"));
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + a2.getWidth() + "x" + a2.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(min);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                d(bitmap, a2, matrix);
                return a2;
            }
        }
        return bitmap;
    }

    public static void d(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = c;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, d);
            e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static void f(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static boolean g(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap h(Bitmap bitmap, int i) {
        if (!g(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
