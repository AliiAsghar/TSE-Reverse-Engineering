package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsq implements hsf {
    public static final hsq a = new hsq(1, null);
    private final /* synthetic */ int b;

    public hsq(int i) {
        this.b = i;
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new agqm(hsjVar.a(agqj.class, InputStream.class));
                            }
                            return new agqm(hsjVar.a(agqj.class, ByteBuffer.class));
                        }
                        return new agql(hsjVar.a(hrv.class, InputStream.class));
                    }
                    return new agql(hsjVar.a(hrv.class, ByteBuffer.class));
                }
                return new hru(hsjVar.a(hrv.class, InputStream.class), 6);
            }
            return hsi.a;
        }
        return new hsr(hsjVar.a(hrv.class, InputStream.class));
    }

    @Deprecated
    public hsq(int i, byte[] bArr) {
        this.b = i;
    }
}
