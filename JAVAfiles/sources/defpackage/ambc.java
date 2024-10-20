package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambc extends ByteArrayOutputStream {
    public ambc(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.count;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.count + remaining > this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.count + remaining);
        }
        byteBuffer.get(this.buf, this.count, remaining);
        this.count += remaining;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c() {
        return this.buf;
    }
}
