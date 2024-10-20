package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugf {
    final /* synthetic */ uge b;
    private final AtomicInteger c = new AtomicInteger(0);
    private final AtomicInteger d = new AtomicInteger(0);
    public final SparseArray a = new SparseArray();

    public ugf(uge ugeVar) {
        this.b = ugeVar;
    }

    public static final Bitmap d(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        BitmapRegionDecoder newInstance;
        Bitmap decodeRegion;
        if (rect != null && (newInstance = BitmapRegionDecoder.newInstance(inputStream, false)) != null && (decodeRegion = newInstance.decodeRegion(rect, options)) != null) {
            return decodeRegion;
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final int e(ufu ufuVar) {
        if (ufuVar.i()) {
            try {
                Bitmap d = ufuVar.d();
                if (d != null && d.isMutable()) {
                    int width = d.getWidth();
                    int height = d.getHeight();
                    if (width > 0 && height > 0) {
                        return g(width, height);
                    }
                    return 0;
                }
                return 0;
            } catch (uft unused) {
                return 0;
            }
        }
        return 0;
    }

    private final Bitmap f(int i, int i2) {
        LinkedList linkedList;
        ufu ufuVar;
        synchronized (this.b) {
            int g = g(i, i2);
            if (g == 0 || (linkedList = (LinkedList) this.a.get(g)) == null || linkedList.isEmpty()) {
                return null;
            }
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 < linkedList.size()) {
                    ufu ufuVar2 = (ufu) linkedList.get(i3);
                    if (ufuVar2.n() == 1) {
                        ufuVar2.o();
                        if (ufuVar2.n() == 1) {
                            ufuVar = (ufu) linkedList.remove(i3);
                            break;
                        }
                        ((alwl) ((alwl) uge.b.i()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 324, "PoolableImageCache.java")).q("Image refCount changed from 1 in getReusableBitmapFromPool.");
                        ufuVar2.r();
                    }
                    i3++;
                } else {
                    ufuVar = null;
                    break;
                }
            }
            if (ufuVar == null) {
                return null;
            }
            try {
                xyl.k(ufuVar.h.isHeldByCurrentThread());
                long a = this.b.e.a();
                ufuVar.o();
                long j = ufuVar.g;
                ufuVar.r();
                long j2 = a - j;
                if (j2 < uge.c) {
                    alvw n = uge.b.n();
                    n.X(ugl.c, Long.valueOf(j2));
                    ((alwl) n.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 346, "PoolableImageCache.java")).q("Not reusing first available bitmap from the pool because it has not been in the pool long enough. ");
                    linkedList.addLast(ufuVar);
                    return null;
                }
                ufuVar.p();
                if (((ufu) this.b.remove(ufuVar.e)) == ufuVar) {
                    z = true;
                }
                xyl.k(z);
                Bitmap e = ufuVar.e();
                ufuVar.q();
                return e;
            } catch (Throwable th) {
                throw th;
            } finally {
                ufuVar.r();
            }
        }
    }

    private static final int g(int i, int i2) {
        if (i <= 65535 && i2 <= 65535) {
            return (i << 16) | i2;
        }
        return 0;
    }

    public final Bitmap a(int i, int i2) {
        return b(i, i2, 0);
    }

    public final Bitmap b(int i, int i2, int i3) {
        Bitmap bitmap;
        OutOfMemoryError outOfMemoryError;
        try {
            Bitmap f = f(i, i2);
            if (f == null) {
                f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            try {
                f.eraseColor(i3);
                return f;
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                bitmap = f;
                ((alwl) ((alwl) ((alwl) uge.b.i()).g(outOfMemoryError)).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "createOrReuseBitmap", (char) 411, "PoolableImageCache.java")).q("try to createOrReuseBitmap.");
                this.b.f.a(15, 1);
                return bitmap;
            }
        } catch (OutOfMemoryError e2) {
            bitmap = null;
            outOfMemoryError = e2;
        }
    }

    public final Bitmap c(InputStream inputStream, Rect rect, BitmapFactory.Options options, int i, int i2) {
        Bitmap bitmap;
        if (i > 0 && i2 > 0) {
            xyl.l(inputStream);
            if (!options.inJustDecodeBounds) {
                options.inBitmap = f(i, i2);
            }
            Bitmap bitmap2 = null;
            try {
                bitmap = d(inputStream, rect, options);
                try {
                    this.d.incrementAndGet();
                    return bitmap;
                } catch (IllegalArgumentException unused) {
                    if (options.inBitmap != null) {
                        options.inBitmap.recycle();
                        options.inBitmap = null;
                        Bitmap d = d(inputStream, rect, options);
                        int incrementAndGet = this.c.incrementAndGet();
                        if (incrementAndGet % 100 == 0) {
                            alwl alwlVar = (alwl) uge.b.i();
                            alwlVar.X(ugl.a, Integer.valueOf(this.d.get()));
                            alwlVar.X(ugl.b, Integer.valueOf(incrementAndGet));
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "onFailedToReuse", 463, "PoolableImageCache.java")).q("Pooled bitmap consistently not being reused.");
                            return d;
                        }
                        return d;
                    }
                    return bitmap;
                } catch (OutOfMemoryError unused2) {
                    bitmap2 = bitmap;
                    ((alwl) ((alwl) uge.b.i()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 181, "PoolableImageCache.java")).q("Oom decoding inputStream.");
                    this.b.f.a(15, 1);
                    return bitmap2;
                }
            } catch (IllegalArgumentException unused3) {
                bitmap = null;
            } catch (OutOfMemoryError unused4) {
            }
        } else {
            ((alwl) ((alwl) uge.b.i()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 163, "PoolableImageCache.java")).q("Decoding bitmap with invalid size.");
            throw new IOException("Invalid size / corrupted image");
        }
    }
}
