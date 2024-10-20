package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class anpy {
    int[] a;
    private final int b;

    public anpy(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.a = anpw.d(bArr);
            this.b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(anpw.d(bArr), i);
        int[] iArr = (int[]) b.clone();
        anpw.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == a()) {
            int remaining = byteBuffer2.remaining();
            int i = remaining / 64;
            for (int i2 = 0; i2 < i + 1; i2++) {
                ByteBuffer c = c(bArr, this.b + i2);
                if (i2 == i) {
                    aode.N(byteBuffer, byteBuffer2, c, remaining % 64);
                } else {
                    aode.N(byteBuffer, byteBuffer2, c, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
    }
}
