package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htv {
    public static final hni a = new hni("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", hmw.c, hni.a);
    public static final hni b = new hni("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, hni.a);
    public static final hni c;
    public static final hni d;
    public static final htu e;
    private static final Queue h;
    public final List f;
    public final hqh g;
    private final hqa i;
    private final DisplayMetrics j;
    private final hue k = hue.a();

    static {
        hts htsVar = hts.a;
        c = new hni("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, hni.a);
        d = new hni("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, hni.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new htt();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        h = new ArrayDeque(0);
    }

    public htv(List list, DisplayMetrics displayMetrics, hqa hqaVar, hqh hqhVar) {
        this.f = list;
        hwr.i(displayMetrics);
        this.j = displayMetrics;
        hwr.i(hqaVar);
        this.i = hqaVar;
        hwr.i(hqhVar);
        this.g = hqhVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap d(defpackage.hug r9, android.graphics.BitmapFactory.Options r10, defpackage.htu r11, defpackage.hqa r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.hun.c
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalArgumentException -> L20
            goto L6a
        L1e:
            r9 = move-exception
            goto L72
        L20:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r7 = g(r10)     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r8.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L1e
            r8.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L1e
            r8.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L1e
            r8.append(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L1e
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L1e
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L5a
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L1e
        L5a:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L71
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L70
            r12.d(r0)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L70
            r0 = 0
            r10.inBitmap = r0     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L70
            android.graphics.Bitmap r9 = d(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L70
        L6a:
            java.util.concurrent.locks.Lock r10 = defpackage.hun.c
            r10.unlock()
            return r9
        L70:
            throw r6     // Catch: java.lang.Throwable -> L1e
        L71:
            throw r6     // Catch: java.lang.Throwable -> L1e
        L72:
            java.util.concurrent.locks.Lock r10 = defpackage.hun.c
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htv.d(hug, android.graphics.BitmapFactory$Options, htu, hqa):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (htv.class) {
            Queue queue = h;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                i(options2);
                return options2;
            }
            return options;
        }
    }

    private static String f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    private static String g(BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static void h(BitmapFactory.Options options) {
        i(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean j(int i) {
        if (i != 90 && i != 270) {
            return false;
        }
        return true;
    }

    private static boolean k(BitmapFactory.Options options) {
        if (options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity) {
            return true;
        }
        return false;
    }

    private static int[] l(hug hugVar, BitmapFactory.Options options, htu htuVar, hqa hqaVar) {
        options.inJustDecodeBounds = true;
        d(hugVar, options, htuVar, hqaVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x035c A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x038c A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030e A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0343 A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[Catch: all -> 0x0514, TryCatch #2 {all -> 0x0514, blocks: (B:7:0x006a, B:12:0x008f, B:13:0x0095, B:15:0x00a7, B:17:0x00b1, B:22:0x00bc, B:25:0x00c7), top: B:6:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[Catch: all -> 0x0514, TryCatch #2 {all -> 0x0514, blocks: (B:7:0x006a, B:12:0x008f, B:13:0x0095, B:15:0x00a7, B:17:0x00b1, B:22:0x00bc, B:25:0x00c7), top: B:6:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02cf A[Catch: all -> 0x0510, TRY_LEAVE, TryCatch #0 {all -> 0x0510, blocks: (B:31:0x02c9, B:33:0x02cf, B:131:0x00f3, B:136:0x0108, B:138:0x0112, B:140:0x013b, B:141:0x0144, B:143:0x014e, B:145:0x0155, B:146:0x0156, B:148:0x015c, B:150:0x0175, B:151:0x01bc, B:153:0x01e9, B:155:0x01f6, B:157:0x01fc, B:160:0x01f0, B:161:0x0178, B:163:0x017c, B:166:0x0181, B:168:0x0187, B:169:0x0193, B:171:0x0197, B:174:0x019c, B:175:0x01a1, B:176:0x01ad, B:177:0x0140, B:178:0x027d, B:179:0x02c0), top: B:27:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0304 A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03e3 A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f3 A[Catch: all -> 0x050d, TryCatch #6 {all -> 0x050d, blocks: (B:36:0x02f8, B:38:0x0304, B:39:0x034b, B:46:0x03d8, B:49:0x03e3, B:51:0x03e9, B:52:0x03eb, B:54:0x03f3, B:56:0x03f9, B:58:0x03ff, B:60:0x0405, B:62:0x040f, B:63:0x0418, B:64:0x0414, B:65:0x0420, B:66:0x042b, B:103:0x0356, B:105:0x035c, B:106:0x0364, B:108:0x038c, B:110:0x030e, B:115:0x0314, B:117:0x031e, B:118:0x033b, B:120:0x0343, B:121:0x0339, B:113:0x0347, B:124:0x0322, B:126:0x0328), top: B:35:0x02f8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hpt a(defpackage.hug r43, int r44, int r45, defpackage.hnj r46, defpackage.htu r47) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htv.a(hug, int, int, hnj, htu):hpt");
    }
}
