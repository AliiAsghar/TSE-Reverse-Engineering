package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hna implements hnd {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ hqh b;

    public hna(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, hqh hqhVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = hqhVar;
    }

    @Override // defpackage.hnd
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        huj hujVar;
        try {
            hujVar = new huj(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
            hujVar = null;
        }
        try {
            ImageHeaderParser.ImageType a = imageHeaderParser.a(hujVar);
            hujVar.b();
            this.a.a();
            return a;
        } catch (Throwable th2) {
            th = th2;
            if (hujVar != null) {
                hujVar.b();
            }
            this.a.a();
            throw th;
        }
    }
}
