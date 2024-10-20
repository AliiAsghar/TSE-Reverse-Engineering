package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdd extends ess {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = eul.f;
    private int k;

    @Override // defpackage.ess, defpackage.esr
    public final long a(long j) {
        return j - eul.v(this.f + this.e, this.b.b);
    }

    @Override // defpackage.ess, defpackage.esr
    public final ByteBuffer c() {
        int i;
        if (super.i() && (i = this.k) > 0) {
            k(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.c();
    }

    @Override // defpackage.esr
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.i);
            this.g += min / this.b.e;
            this.i -= min;
            byteBuffer.position(position + min);
            if (this.i <= 0) {
                int i2 = i - min;
                int length = (this.k + i2) - this.j.length;
                ByteBuffer k = k(length);
                int d = eul.d(length, 0, this.k);
                k.put(this.j, 0, d);
                int d2 = eul.d(length - d, 0, i2);
                byteBuffer.limit(byteBuffer.position() + d2);
                k.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - d2;
                int i4 = this.k - d;
                this.k = i4;
                byte[] bArr = this.j;
                System.arraycopy(bArr, d, bArr, 0, i4);
                byteBuffer.get(this.j, this.k, i3);
                this.k += i3;
                k.flip();
            }
        }
    }

    @Override // defpackage.ess, defpackage.esr
    public final boolean i() {
        if (super.i() && this.k == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ess
    public final esp j(esp espVar) {
        if (espVar.d == 2) {
            this.h = true;
            if (this.e == 0 && this.f == 0) {
                return esp.a;
            }
            return espVar;
        }
        throw new esq(espVar);
    }

    @Override // defpackage.ess
    protected final void l() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.ess
    protected final void m() {
        if (this.h) {
            if (this.k > 0) {
                this.g += r0 / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.ess
    protected final void n() {
        this.j = eul.f;
    }
}
