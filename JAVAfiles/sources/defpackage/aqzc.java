package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzc implements arhv {
    public final ByteBuffer a;

    public aqzc(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.arhv
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.arhv
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.arhv
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.arhv
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
