package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmz implements hnd {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hmz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hnd
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        if (this.b != 0) {
            try {
                return imageHeaderParser.a((InputStream) this.a);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return imageHeaderParser.b((ByteBuffer) this.a);
        } finally {
            hyi.b((ByteBuffer) this.a);
        }
    }
}
