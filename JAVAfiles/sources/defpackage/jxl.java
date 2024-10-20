package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemProperties;
import android.util.Size;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxl implements aerg, kkl {
    private static final int a = arrn.r(SystemProperties.getInt("ro.hwui.max_texture_allocation_size", 104857600), 104857600) / 4;
    private final pkh b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();

    public jxl(pkh pkhVar) {
        this.b = pkhVar;
    }

    @Override // defpackage.aerg
    public final void a(Uri uri, int i, int i2) {
        if (this.b.a()) {
            this.c.put(uri, new Size(i, i2));
        }
    }

    @Override // defpackage.aerg
    public final void b(hpp hppVar, Object obj) {
        if (this.b.a() && obj != null) {
            ConcurrentHashMap concurrentHashMap = this.c;
            arsd.i(concurrentHashMap);
            concurrentHashMap.remove(obj);
        }
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        if (this.b.a()) {
            this.c.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aerg
    public final void d(Drawable drawable, Object obj) {
        Size size;
        String str;
        Integer num;
        Integer num2 = null;
        if (this.b.a() && obj != null) {
            ConcurrentHashMap concurrentHashMap = this.c;
            arsd.i(concurrentHashMap);
            size = (Size) concurrentHashMap.remove(obj);
        } else {
            size = null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap().getWidth() * bitmapDrawable.getBitmap().getHeight() > a) {
                if (obj instanceof Uri) {
                    str = yyb.bl((Uri) obj);
                } else {
                    str = "unknown";
                }
                if (this.b.a()) {
                    int width = bitmapDrawable.getBitmap().getWidth();
                    int height = bitmapDrawable.getBitmap().getHeight();
                    if (size != null) {
                        num = Integer.valueOf(size.getWidth());
                    } else {
                        num = null;
                    }
                    if (size != null) {
                        num2 = Integer.valueOf(size.getHeight());
                    }
                    throw new IllegalArgumentException("Image loading from " + str + " is too large to be drawn on the canvas. Actual size: " + width + " x " + height + " pixels, Requested size: " + num + " x " + num2 + " pixels.");
                }
                throw new IllegalArgumentException("Image loading from " + str + " is too large (" + bitmapDrawable.getBitmap().getWidth() + " x " + bitmapDrawable.getBitmap().getHeight() + " pixels) to draw on canvas");
            }
        }
    }

    @Override // defpackage.aerg
    public final /* synthetic */ void c(Uri uri) {
    }
}
