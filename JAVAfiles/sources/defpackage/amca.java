package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amca extends amba {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    private final void b(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.b = j3;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            this.a = amcb.i(this.a, amcb.j((int) j3));
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.ambl
    public final void c(byte b) {
        b(1, b & 255);
    }

    @Override // defpackage.amba
    public final void d(char c) {
        b(2, c);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.remaining() >= 4) {
            h(byteBuffer.getInt());
        }
        while (byteBuffer.hasRemaining()) {
            c(byteBuffer.get());
        }
        byteBuffer.order(order);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void g(byte[] bArr, int i) {
        int i2 = 0;
        albo.S(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            b(4, amcb.h(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            c(bArr[i2]);
            i2++;
        }
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void h(int i) {
        b(4, i);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final ambl k(CharSequence charSequence, Charset charset) {
        if (StandardCharsets.UTF_8.equals(charset)) {
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                b(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    b(1, charAt5);
                } else if (charAt5 < 2048) {
                    b(2, amcb.l(charAt5));
                } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt == charAt5) {
                        j(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    b(4, amcb.m(codePointAt));
                    i++;
                } else {
                    b(3, amcb.k(charAt5));
                }
                i++;
            }
            return this;
        }
        return super.k(charSequence, charset);
    }

    @Override // defpackage.ambl
    public final ambj q() {
        albo.T(!this.e);
        this.e = true;
        int j = this.a ^ amcb.j((int) this.b);
        this.a = j;
        return amcb.n(j, this.d);
    }
}
