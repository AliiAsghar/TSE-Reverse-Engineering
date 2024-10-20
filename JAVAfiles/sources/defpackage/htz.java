package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htz implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, hqh hqhVar) {
        int a = new elx(inputStream).a("Orientation", 1);
        if (a == 0) {
            return -1;
        }
        return a;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, hqh hqhVar) {
        int i = hyi.a;
        return c(new hyg(byteBuffer), hqhVar);
    }
}
