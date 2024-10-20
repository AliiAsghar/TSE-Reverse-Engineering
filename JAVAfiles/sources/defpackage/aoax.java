package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoax implements aocf {
    private final SecretKeySpec a;
    private final Cipher b = aoay.i();
    private final byte[] c;
    private final ByteBuffer d;
    private long e;

    public aoax(aoay aoayVar, byte[] bArr) {
        this.e = 0L;
        this.e = 0L;
        byte[] b = anud.b(aoayVar.a);
        byte[] b2 = anud.b(7);
        this.c = b2;
        ByteBuffer allocate = ByteBuffer.allocate(aoayVar.e());
        this.d = allocate;
        allocate.put((byte) aoayVar.e());
        allocate.put(b);
        allocate.put(b2);
        allocate.flip();
        this.a = aoayVar.k(b, bArr);
    }

    @Override // defpackage.aocf
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // defpackage.aocf
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.b.init(1, this.a, aoay.j(this.c, this.e, false));
        this.e++;
        if (byteBuffer2.hasRemaining()) {
            this.b.update(byteBuffer, byteBuffer3);
            this.b.doFinal(byteBuffer2, byteBuffer3);
        } else {
            this.b.doFinal(byteBuffer, byteBuffer3);
        }
    }

    @Override // defpackage.aocf
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.b.init(1, this.a, aoay.j(this.c, this.e, true));
        this.e++;
        this.b.doFinal(byteBuffer, byteBuffer2);
    }
}
