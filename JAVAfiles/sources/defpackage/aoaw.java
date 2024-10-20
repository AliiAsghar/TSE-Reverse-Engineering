package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoaw implements aoce {
    final /* synthetic */ aoay a;
    private SecretKeySpec b;
    private Cipher c;
    private byte[] d;

    public aoaw(aoay aoayVar) {
        this.a = aoayVar;
    }

    @Override // defpackage.aoce
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        this.c.init(2, this.b, aoay.j(this.d, i, z));
        this.c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.aoce
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == this.a.e()) {
            byte b = byteBuffer.get();
            aoay aoayVar = this.a;
            if (b == aoayVar.e()) {
                this.d = new byte[7];
                byte[] bArr2 = new byte[aoayVar.a];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.d);
                this.b = this.a.k(bArr2, bArr);
                this.c = aoay.i();
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }
}
