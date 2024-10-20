package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fco extends ess {
    public int[] e;
    private int[] f;

    @Override // defpackage.esr
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f;
        dzg.g(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.e) * this.c.e);
        while (position < limit) {
            for (int i : iArr) {
                k.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.e;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    @Override // defpackage.ess
    public final esp j(esp espVar) {
        boolean z;
        boolean z2;
        int[] iArr = this.e;
        if (iArr == null) {
            return esp.a;
        }
        if (espVar.d == 2) {
            if (espVar.c != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i < length) {
                    int i2 = iArr[i];
                    if (i2 < espVar.c) {
                        if (i2 != i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z |= z2;
                        i++;
                    } else {
                        throw new esq(espVar);
                    }
                } else {
                    if (z) {
                        return new esp(espVar.b, length, 2);
                    }
                    return esp.a;
                }
            }
        } else {
            throw new esq(espVar);
        }
    }

    @Override // defpackage.ess
    protected final void l() {
        this.f = this.e;
    }

    @Override // defpackage.ess
    protected final void n() {
        this.f = null;
        this.e = null;
    }
}
