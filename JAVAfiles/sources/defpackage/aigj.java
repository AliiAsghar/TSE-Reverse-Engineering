package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigj extends aifi {
    public final ByteBuffer a;

    public aigj(OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(1024);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(int i) {
        this.a.put((byte) i);
        super.write(i);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.put(bArr);
        super.write(bArr);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
        super.write(bArr, i, i2);
    }
}
