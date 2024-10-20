package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htf implements hnl {
    private final /* synthetic */ int a;
    private final Object b;

    public htf(int i) {
        this.a = i;
        this.b = new htd();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [hqa, java.lang.Object] */
    @Override // defpackage.hnl
    public final /* synthetic */ hpt a(Object obj, int i, int i2, hnj hnjVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                return huh.g(((hmb) obj).a(), this.b);
                            }
                            createSource4 = ImageDecoder.createSource(hyi.a((InputStream) obj));
                            return ico.n(createSource4, i, i2, hnjVar);
                        }
                        createSource3 = ImageDecoder.createSource((ByteBuffer) obj);
                        return ico.n(createSource3, i, i2, hnjVar);
                    }
                    htv htvVar = (htv) this.b;
                    return htvVar.a(new huf((ParcelFileDescriptor) obj, htvVar.f, htvVar.g, 2), i, i2, hnjVar, htv.e);
                }
                createSource2 = ImageDecoder.createSource(hyi.a((InputStream) obj));
                return ((htd) this.b).c(createSource2, i, i2, hnjVar);
            }
            htv htvVar2 = (htv) this.b;
            return htvVar2.a(new huf((ByteBuffer) obj, htvVar2.f, htvVar2.g, 1), i, i2, hnjVar, htv.e);
        }
        createSource = ImageDecoder.createSource((ByteBuffer) obj);
        return ((htd) this.b).c(createSource, i, i2, hnjVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hnl
    public final /* synthetic */ boolean b(Object obj, hnj hnjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return true;
                            }
                            ico icoVar = (ico) this.b;
                            return ico.o(hlc.n(icoVar.a, (InputStream) obj, (hqh) icoVar.b));
                        }
                        return ico.o(hlc.k(((ico) this.b).a, (ByteBuffer) obj));
                    }
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                    if (((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || parcelFileDescriptor.getStatSize() <= 536870912) && ParcelFileDescriptorRewinder.d()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public htf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
