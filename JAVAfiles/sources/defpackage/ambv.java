package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambv extends amay {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public ambv(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void m() {
        albo.U(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.amay
    public final void a(byte b) {
        m();
        this.a.update(b);
    }

    @Override // defpackage.amay
    public final void b(ByteBuffer byteBuffer) {
        m();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.amay
    protected final void e(byte[] bArr, int i) {
        m();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.ambl
    public final ambj q() {
        m();
        this.c = true;
        int i = this.b;
        if (i == this.a.getDigestLength()) {
            byte[] digest = this.a.digest();
            int i2 = ambj.b;
            return new ambg(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.a.digest(), i);
        int i3 = ambj.b;
        return new ambg(copyOf);
    }
}
