package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoao implements aoce {
    final /* synthetic */ aoaq a;
    private SecretKeySpec b;
    private SecretKeySpec c;
    private Cipher d;
    private Mac e;
    private byte[] f;

    public aoao(aoaq aoaqVar) {
        this.a = aoaqVar;
    }

    @Override // defpackage.aoce
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int position = byteBuffer.position();
        byte[] n = aoaq.n(this.f, i, z);
        int remaining = byteBuffer.remaining();
        int i2 = this.a.b;
        if (remaining >= i2) {
            int i3 = position + (remaining - i2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(i3);
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            duplicate2.position(i3);
            this.e.init(this.c);
            this.e.update(n);
            this.e.update(duplicate);
            byte[] copyOf = Arrays.copyOf(this.e.doFinal(), this.a.b);
            byte[] bArr = new byte[this.a.b];
            duplicate2.get(bArr);
            if (MessageDigest.isEqual(bArr, copyOf)) {
                byteBuffer.limit(i3);
                this.d.init(1, this.b, new IvParameterSpec(n));
                this.d.doFinal(byteBuffer, byteBuffer2);
            } else {
                throw new GeneralSecurityException("Tag mismatch");
            }
        } else {
            throw new GeneralSecurityException("Ciphertext too short");
        }
    }

    @Override // defpackage.aoce
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == this.a.e()) {
            byte b = byteBuffer.get();
            aoaq aoaqVar = this.a;
            if (b == aoaqVar.e()) {
                this.f = new byte[7];
                byte[] bArr2 = new byte[aoaqVar.a];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.f);
                byte[] m = this.a.m(bArr2, bArr);
                this.b = this.a.l(m);
                this.c = this.a.k(m);
                this.d = aoaq.i();
                this.e = this.a.j();
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }
}
