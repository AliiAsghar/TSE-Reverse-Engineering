package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class amba implements ambl {
    public void d(char c) {
        c((byte) c);
        c((byte) (c >>> '\b'));
    }

    @Override // defpackage.ambl
    public void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.ambl
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.ambl
    public void h(int i) {
        throw null;
    }

    @Override // defpackage.ambl
    public void i(long j) {
        throw null;
    }

    @Override // defpackage.ambl
    public void j(byte[] bArr) {
        g(bArr, bArr.length);
    }

    @Override // defpackage.ambl
    public ambl k(CharSequence charSequence, Charset charset) {
        j(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.ambl
    public final void l(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            d(charSequence.charAt(i));
        }
    }
}
