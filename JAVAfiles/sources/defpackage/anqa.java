package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class anqa {
    public final anpy a;
    private final anpy b;

    public anqa(byte[] bArr) {
        if (anme.z(1)) {
            this.a = a(bArr, 1);
            this.b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int i;
        int remaining = byteBuffer.remaining();
        int i2 = remaining % 16;
        if (i2 == 0) {
            i = remaining;
        } else {
            i = (remaining + 16) - i2;
        }
        ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(0);
        order.put(byteBuffer);
        order.position(i);
        order.putLong(0L);
        order.putLong(remaining);
        return order.array();
    }

    public abstract anpy a(byte[] bArr, int i);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                if (MessageDigest.isEqual(anme.h(c(bArr), d(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    anpy anpyVar = this.a;
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    anpyVar.d(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.b.c(bArr, 0).get(bArr2);
        return bArr2;
    }
}
