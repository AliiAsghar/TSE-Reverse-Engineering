package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgl implements evg {
    private final evg a;
    private final int b;
    private final byte[] c;
    private int d;
    private final fhj e;

    public fgl(evg evgVar, int i, fhj fhjVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = evgVar;
        this.b = i;
        this.e = fhjVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.d;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.c, 0, 1) != -1) {
                int i5 = (this.c[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.a.a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        fhj fhjVar = this.e;
                        euf eufVar = new euf(bArr2, i5);
                        if (!fhjVar.j) {
                            max = fhjVar.g;
                        } else {
                            max = Math.max(fhjVar.k.c(true), fhjVar.g);
                        }
                        int b = eufVar.b();
                        fmq fmqVar = fhjVar.i;
                        dzg.g(fmqVar);
                        fmqVar.l(eufVar, b);
                        fmqVar.n(max, 1, b, 0, null);
                        fhjVar.j = true;
                    }
                }
                i3 = this.b;
                this.d = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.d -= a2;
        }
        return a2;
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.evg
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.evg
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.evg
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.evg
    public final void f(ewc ewcVar) {
        dzg.g(ewcVar);
        this.a.f(ewcVar);
    }
}
