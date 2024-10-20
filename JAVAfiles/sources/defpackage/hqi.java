package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqi implements hqa {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final hqj b;
    private final Set c;
    private final long d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public hqi(long j) {
        Bitmap.Config config;
        hqo hqoVar = new hqo();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        config = Bitmap.Config.HARDWARE;
        hashSet.remove(config);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.e = j;
        this.b = hqoVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            hqj hqjVar = this.b;
            if (config != null) {
                config3 = config;
            } else {
                config3 = a;
            }
            hqn hqnVar = ((hqo) hqjVar).f;
            int b = hyv.b(i, i2, config3);
            hqm d = hqnVar.d(b, config3);
            config4 = Bitmap.Config.RGBA_F16;
            int i3 = 0;
            if (config4.equals(config3)) {
                configArr = hqo.b;
            } else {
                int i4 = hql.a[config3.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                configArr = new Bitmap.Config[]{config3};
                            } else {
                                configArr = hqo.e;
                            }
                        } else {
                            configArr = hqo.d;
                        }
                    } else {
                        configArr = hqo.c;
                    }
                } else {
                    configArr = hqo.a;
                }
            }
            int length = configArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Bitmap.Config config5 = configArr[i3];
                Integer num = (Integer) ((hqo) hqjVar).d(config5).ceilingKey(Integer.valueOf(b));
                if (num != null && num.intValue() <= b * 8) {
                    if (num.intValue() == b) {
                        if (config5 == null) {
                            if (config3 != null) {
                            }
                        } else if (config5.equals(config3)) {
                        }
                    }
                    ((hqo) hqjVar).f.c(d);
                    d = ((hqo) hqjVar).f.d(num.intValue(), config5);
                } else {
                    i3++;
                }
            }
            bitmap = (Bitmap) ((hqo) hqjVar).g.a(d);
            if (bitmap != null) {
                ((hqo) hqjVar).e(Integer.valueOf(d.a), bitmap);
                bitmap.reconfigure(i, i2, config3);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(this.b.b(i, i2, config)));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= hyv.a(bitmap);
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=".concat(this.b.b(i, i2, config)));
            }
            i();
        } else {
            throw new IllegalArgumentException(hht.b(config, "Cannot create a mutable Bitmap with config: ", ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"));
        }
        return bitmap;
    }

    private final void i() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            j();
        }
    }

    private final void j() {
        hqj hqjVar = this.b;
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + hqjVar.toString());
    }

    private final void k() {
        l(this.e);
    }

    private final synchronized void l(long j) {
        while (this.f > j) {
            hqj hqjVar = this.b;
            Bitmap bitmap = (Bitmap) ((hqo) hqjVar).g.b();
            if (bitmap != null) {
                ((hqo) hqjVar).e(Integer.valueOf(hyv.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    j();
                }
                this.f = 0L;
                return;
            }
            this.f -= hyv.a(bitmap);
            this.j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(this.b.a(bitmap)));
            }
            i();
            bitmap.recycle();
        }
    }

    @Override // defpackage.hqa
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        if (h != null) {
            h.eraseColor(0);
            return h;
        }
        return g(i, i2, config);
    }

    @Override // defpackage.hqa
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        if (h == null) {
            return g(i, i2, config);
        }
        return h;
    }

    @Override // defpackage.hqa
    public final void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        l(0L);
    }

    @Override // defpackage.hqa
    public synchronized void d(Bitmap bitmap) {
        int intValue;
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && hyv.a(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                        int a2 = hyv.a(bitmap);
                        hqj hqjVar = this.b;
                        hqm d = ((hqo) hqjVar).f.d(hyv.a(bitmap), bitmap.getConfig());
                        ((hqo) hqjVar).g.c(d, bitmap);
                        NavigableMap d2 = ((hqo) hqjVar).d(bitmap.getConfig());
                        Integer num = (Integer) d2.get(Integer.valueOf(d.a));
                        Integer valueOf = Integer.valueOf(d.a);
                        if (num == null) {
                            intValue = 1;
                        } else {
                            intValue = num.intValue() + 1;
                        }
                        d2.put(valueOf, Integer.valueOf(intValue));
                        this.i++;
                        this.f += a2;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=".concat(this.b.a(bitmap)));
                        }
                        i();
                        k();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.c.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.hqa
    public final synchronized void e(float f) {
        this.e = Math.round(((float) this.d) * f);
        k();
    }

    @Override // defpackage.hqa
    public final void f(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", a.bV(i, "trimMemory, level="));
        }
        if (i < 40 && i < 20) {
            if (i == 15) {
                l(this.e / 2);
                return;
            }
            return;
        }
        c();
    }
}
