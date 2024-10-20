package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arfj extends aqzg {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public arfj(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "offset must be >= 0");
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "length must be >= 0");
        int i3 = i2 + i;
        d.t(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void c() {
        int i = this.d;
        if (i != -1) {
            this.a = i;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final boolean d() {
        return true;
    }

    @Override // defpackage.arfh
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.arfh
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.arfh
    public final /* bridge */ /* synthetic */ arfh g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new arfj(this.c, i2, i);
    }

    @Override // defpackage.arfh
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.arfh
    public final void j(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.arfh
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.arfh
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
