package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class abvh {
    @Deprecated
    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                d.q(inputStream);
                d.q(outputStream);
            }
        }
    }
}
