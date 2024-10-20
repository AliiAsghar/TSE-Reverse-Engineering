package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnb implements hnc {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hnb(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, hqh hqhVar, int i) {
        this.c = i;
        this.b = parcelFileDescriptorRewinder;
        this.a = hqhVar;
    }

    @Override // defpackage.hnc
    public final int a(ImageHeaderParser imageHeaderParser) {
        huj hujVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                try {
                    hujVar = new huj(new FileInputStream(((ParcelFileDescriptorRewinder) this.b).a().getFileDescriptor()), (hqh) this.a);
                } catch (Throwable th) {
                    th = th;
                    hujVar = null;
                }
                try {
                    int c = imageHeaderParser.c(hujVar, (hqh) this.a);
                    hujVar.b();
                    ((ParcelFileDescriptorRewinder) this.b).a();
                    return c;
                } catch (Throwable th2) {
                    th = th2;
                    if (hujVar != null) {
                        hujVar.b();
                    }
                    ((ParcelFileDescriptorRewinder) this.b).a();
                    throw th;
                }
            }
            try {
                return imageHeaderParser.d((ByteBuffer) this.a, (hqh) this.b);
            } finally {
                hyi.b((ByteBuffer) this.a);
            }
        }
        try {
            return imageHeaderParser.c((InputStream) this.a, (hqh) this.b);
        } finally {
            ((InputStream) this.a).reset();
        }
    }

    public hnb(Object obj, hqh hqhVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = hqhVar;
    }
}
