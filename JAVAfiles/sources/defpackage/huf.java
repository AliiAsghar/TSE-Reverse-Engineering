package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huf implements hug {
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public huf(ByteBuffer byteBuffer, List list, hqh hqhVar, int i) {
        this.b = i;
        this.d = byteBuffer;
        this.a = list;
        this.c = hqhVar;
    }

    @Override // defpackage.hug
    public final int a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return hlc.j(this.a, new hnb((ParcelFileDescriptorRewinder) this.c, (hqh) this.d, 2));
            }
            ByteBuffer b = hyi.b((ByteBuffer) this.d);
            if (b == null) {
                return -1;
            }
            return hlc.j(this.a, new hnb(b, (hqh) this.c, 1));
        }
        return hlc.m(this.a, ((hod) this.c).a(), (hqh) this.d);
    }

    @Override // defpackage.hug
    public final Bitmap b(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                FileDescriptor fileDescriptor = ((ParcelFileDescriptorRewinder) this.c).a().getFileDescriptor();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT == 34 && hud.a(options)) {
                    Bitmap.Config config4 = options.inPreferredConfig;
                    config = Bitmap.Config.HARDWARE;
                    if (config4 != config) {
                        z = false;
                    }
                    hwr.e(z);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (decodeFileDescriptor == null) {
                            config3 = Bitmap.Config.HARDWARE;
                        } else {
                            try {
                                bitmap = hld.c(decodeFileDescriptor);
                                decodeFileDescriptor.recycle();
                                config3 = Bitmap.Config.HARDWARE;
                            } catch (Throwable th) {
                                th = th;
                                bitmap = decodeFileDescriptor;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                config2 = Bitmap.Config.HARDWARE;
                                options.inPreferredConfig = config2;
                                throw th;
                            }
                        }
                        options.inPreferredConfig = config3;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
            } else {
                return hld.b(new hyg(hyi.b((ByteBuffer) this.d)), options);
            }
        } else {
            return hld.b(((hod) this.c).a(), options);
        }
    }

    @Override // defpackage.hug
    public final ImageHeaderParser.ImageType c() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return hlc.l(this.a, new hna((ParcelFileDescriptorRewinder) this.c, (hqh) this.d));
            }
            return hlc.k(this.a, hyi.b((ByteBuffer) this.d));
        }
        return hlc.n(this.a, ((hod) this.c).a(), (hqh) this.d);
    }

    @Override // defpackage.hug
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((hod) this.c).a.a();
    }

    public huf(InputStream inputStream, List list, hqh hqhVar, int i) {
        this.b = i;
        hwr.i(hqhVar);
        this.d = hqhVar;
        hwr.i(list);
        this.a = list;
        this.c = new hod(inputStream, hqhVar);
    }

    public huf(ParcelFileDescriptor parcelFileDescriptor, List list, hqh hqhVar, int i) {
        this.b = i;
        hwr.i(hqhVar);
        this.d = hqhVar;
        hwr.i(list);
        this.a = list;
        this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }
}
