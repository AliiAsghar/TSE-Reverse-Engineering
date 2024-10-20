package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfo {
    private final Context j;
    private final apwt k;
    private final xwg l;
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/util/image/ImageUtils");
    private static final byte[] h = "GIF87a".getBytes(Charset.forName("US-ASCII"));
    private static final byte[] i = "GIF89a".getBytes(Charset.forName("US-ASCII"));
    public static final utz a = uuh.f(uuh.b, "ditto_image_gif_size_limit", 800000);
    public static final utz b = uuh.e(uuh.b, "ditto_image_jpeg_width_limit", 600);
    public static final utz c = uuh.e(uuh.b, "ditto_image_jpeg_height_limit", 600);
    public static final utz d = uuh.f(uuh.b, "ditto_image_static_size_limit", 150000);
    public static final utz e = uuh.e(uuh.b, "ditto_image_png_height_limit", 400);
    public static final utz f = uuh.e(uuh.b, "ditto_image_png_width_limit", 400);

    public yfo(Context context, xwg xwgVar, apwt apwtVar) {
        this.j = context;
        this.l = xwgVar;
        this.k = apwtVar;
    }

    public static float a(int i2, int i3, int i4, int i5, int i6) {
        if (i2 < i4 && i3 < i5) {
            if (Math.min(i2, i3) < i6) {
                return i6 / Math.min(i2, i3);
            }
            return 1.0f;
        }
        float f2 = i4;
        float f3 = i5;
        float f4 = i2;
        float f5 = i3;
        if (f2 / f3 < f4 / f5) {
            return f2 / f4;
        }
        return f3 / f5;
    }

    public static Bitmap d(Bitmap bitmap) {
        Bitmap.Config config;
        if (bitmap.getConfig() == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = bitmap.getConfig();
        }
        return bitmap.copy(config, false);
    }

    public static Bitmap f(Bitmap bitmap, int i2, int i3) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = i3;
        float f3 = i2;
        float max = Math.max(f3 / width, f2 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f3 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    public static Drawable h(Context context, int i2, int i3) {
        Drawable drawable = context.getDrawable(i2);
        drawable.getClass();
        return i(context, drawable, i3);
    }

    public static Drawable i(Context context, Drawable drawable, int i2) {
        Drawable drawable2;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            drawable2 = constantState.newDrawable(context.getResources()).mutate();
        } else {
            drawable2 = null;
        }
        if (drawable2 != null || (drawable2 = drawable.mutate()) != null) {
            drawable = drawable2;
        }
        drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    public static void j(Point point, int i2, int i3, int i4) {
        if (point.x == -1 || point.x == 0) {
            point.x = i2;
        }
        if (point.y == -1 || point.y == 0) {
            point.y = i3;
        }
        float max = Math.max(1.0f, i4 / Math.min(point.x, point.y));
        point.x = (int) (point.x * max);
        point.y = (int) (point.y * max);
        float a2 = a(point.x, point.y, i2, i3, i4);
        if (a2 < 1.0f) {
            point.x = Math.min((int) (point.x * a2), i2);
            point.y = Math.min((int) (point.y * a2), i3);
        }
        if (point.y < i4) {
            point.y = i4;
        }
        if (point.x < i4) {
            point.x = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (java.util.Arrays.equals(r2, defpackage.yfo.i) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(java.io.InputStream r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L2b
            r1 = 6
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            int r3 = r4.read(r2, r0, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r3 != r1) goto L1f
            byte[] r1 = defpackage.yfo.h     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r3 = 1
            if (r1 != 0) goto L1d
            byte[] r1 = defpackage.yfo.i     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r1 == 0) goto L28
        L1d:
            r0 = r3
            goto L28
        L1f:
            r4.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L23:
            r0 = move-exception
            r4.close()     // Catch: java.io.IOException -> L27
        L27:
            throw r0
        L28:
            r4.close()     // Catch: java.io.IOException -> L2b
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfo.k(java.io.InputStream):boolean");
    }

    public static void p(Bitmap bitmap, Canvas canvas, RectF rectF, RectF rectF2, boolean z, int i2, boolean z2) {
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            paint.setColor(i2);
            if (z2) {
                canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
            } else {
                canvas.drawColor(i2);
            }
        }
        paint.setShader(bitmapShader);
        if (z2) {
            canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
        paint.setShader(null);
    }

    private static boolean q(String str) {
        if (!gh.o(str) && !gh.j(str)) {
            return false;
        }
        return true;
    }

    public final int b(InputStream inputStream) {
        int i2 = 0;
        if (inputStream != null) {
            try {
                try {
                    i2 = new elx(inputStream).a("Orientation", 0);
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        alvw h2 = g.h();
                        h2.X(alwp.a, "BugleImage");
                        ((alvg) ((alvg) ((alvg) h2).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                    }
                } catch (IOException | ArrayIndexOutOfBoundsException | NegativeArraySizeException | NullPointerException unused) {
                    alvw d2 = g.d();
                    d2.X(alwp.a, "BugleImage");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 309, "ImageUtils.java")).q("ImageUtils: Failed to get image orientation, returning undefined.");
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        alvw h3 = g.h();
                        h3.X(alwp.a, "BugleImage");
                        ((alvg) ((alvg) ((alvg) h3).g(e3)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                    }
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    alvw h4 = g.h();
                    h4.X(alwp.a, "BugleImage");
                    ((alvg) ((alvg) ((alvg) h4).g(e4)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                }
                throw th;
            }
        }
        return i2;
    }

    public final int c(Uri uri, String str) {
        if (str != null) {
            try {
                if (q(str)) {
                    return b(this.j.getContentResolver().openInputStream(uri));
                }
                return 0;
            } catch (FileNotFoundException e2) {
                alvw h2 = g.h();
                h2.X(alwp.a, "BugleImage");
                alvg alvgVar = (alvg) ((alvg) h2).g(e2);
                alvgVar.X(ydl.R, uri);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 289, "ImageUtils.java")).q("getOrientation couldn't open uri.");
                return 0;
            }
        }
        return 0;
    }

    public final Bitmap e(Uri uri, int i2, int i3) {
        ygt ygtVar = new ygt(this.j);
        try {
            ygtVar.c(uri);
            Bitmap a2 = ygtVar.a(0L);
            if (a2 == null) {
                a2 = null;
            } else {
                int width = a2.getWidth();
                int height = a2.getHeight();
                if (i3 <= 0) {
                    i3 = 250;
                }
                if (i2 <= 0) {
                    i2 = 250;
                }
                if (width > i2 || height > i3) {
                    int min = Math.min(width, i2);
                    int min2 = Math.min(height, i3);
                    float width2 = a2.getWidth();
                    float height2 = a2.getHeight();
                    float max = Math.max(min / width2, min2 / height2);
                    float f2 = width2 * max;
                    float f3 = max * height2;
                    Bitmap createBitmap = Bitmap.createBitmap((int) f2, (int) f3, a2.getConfig());
                    new Canvas(createBitmap).drawBitmap(a2, (Rect) null, new RectF(brg.a, brg.a, f2, f3), (Paint) null);
                    if (createBitmap != null) {
                        a2.recycle();
                        a2 = createBitmap;
                    }
                }
            }
            return a2;
        } finally {
            ygtVar.b();
        }
    }

    public final Rect g(Uri uri, String str) {
        if (uri == null) {
            xyl.c("Couldn't open input stream for null uri");
        } else {
            try {
                InputStream openInputStream = this.j.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(openInputStream, null, options);
                        if (str != null && q(str) && c(uri, str) >= 5) {
                            return new Rect(0, 0, options.outHeight, options.outWidth);
                        }
                        Rect rect = new Rect(0, 0, options.outWidth, options.outHeight);
                        try {
                            openInputStream.close();
                        } catch (IOException unused) {
                        }
                        return rect;
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (FileNotFoundException | SecurityException e2) {
                alvw h2 = g.h();
                h2.X(alwp.a, "BugleImage");
                alvg alvgVar = (alvg) ((alvg) h2).g(e2);
                alvgVar.X(ydl.R, uri);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "decodeImageBounds", 666, "ImageUtils.java")).q("Couldn't open input stream.");
            }
        }
        return new Rect(0, 0, -1, -1);
    }

    public final boolean l(String str, Uri uri) {
        if (gh.i(str)) {
            return true;
        }
        if (gh.m(str) && uri != null) {
            try {
                return k(this.j.getContentResolver().openInputStream(uri));
            } catch (Exception e2) {
                alvw i2 = g.i();
                i2.X(alwp.a, "BugleImage");
                ((alvg) ((alvg) ((alvg) i2).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "isGif", (char) 332, "ImageUtils.java")).q("Could not open GIF input stream.");
                return false;
            }
        }
        return false;
    }

    public final byte[] m(Bitmap bitmap, int i2) {
        return n(bitmap, Bitmap.CompressFormat.JPEG, i2);
    }

    final byte[] n(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) {
        if (bitmap != null) {
            int i3 = 0;
            while (true) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(compressFormat, i2, byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } catch (OutOfMemoryError e2) {
                    alvi alviVar = g;
                    alvw i4 = alviVar.i();
                    i4.X(alwp.a, "BugleImage");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 164, "ImageUtils.java")).q("OutOfMemory converting bitmap to bytes.");
                    i3++;
                    if (i3 <= 1) {
                        this.l.a(15, 1);
                    } else {
                        alvw i5 = alviVar.i();
                        i5.X(alwp.a, "BugleImage");
                        ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 169, "ImageUtils.java")).q("Failed to convert bitmap to bytes. Out of Memory.");
                        throw e2;
                    }
                }
            }
        } else {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:30|31|(9:35|36|37|(3:48|49|(15:51|52|53|54|55|(2:56|(8:58|59|60|61|62|(1:64)|65|(2:89|90)(2:67|(2:70|71)(1:69)))(2:104|105))|72|73|(1:75)(1:88)|76|(6:78|79|80|81|42|43)(1:87)|86|81|42|43))|39|40|41|42|43)|117|36|37|(0)|39|40|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0362, code lost:
    
        r1 = defpackage.yfl.a.h();
        r1.X(defpackage.alwp.a, "BugleResizing");
        ((defpackage.alvg) ((defpackage.alvg) ((defpackage.alvg) r1).g(r0)).h("com/google/android/apps/messaging/shared/util/image/GifCompressor", "compress", 151, "GifCompressor.java")).t("Could not create FileInputStream. Input path: %s", r11);
        r2.d.e("Bugle.Media.Attachment.Resize.Failure.Gif.Error.Counts", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0388, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] o(int r42, int r43, int r44, int r45, long r46, android.net.Uri r48, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfo.o(int, int, int, int, long, android.net.Uri, java.lang.String):byte[]");
    }
}
