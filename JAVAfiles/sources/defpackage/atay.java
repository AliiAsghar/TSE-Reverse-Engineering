package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atay extends atav implements atdc {
    public final ataw c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile atae i;

    public atay(atax ataxVar) {
        super(true, ataxVar.a.b());
        ataw atawVar = ataxVar.a;
        this.c = atawVar;
        int a = atawVar.a();
        this.h = ataxVar.b;
        byte[] bArr = ataxVar.d;
        if (bArr != null) {
            if (bArr.length == a) {
                this.d = bArr;
            } else {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
        } else {
            this.d = new byte[a];
        }
        byte[] bArr2 = ataxVar.e;
        if (bArr2 != null) {
            if (bArr2.length == a) {
                this.e = bArr2;
            } else {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
        } else {
            this.e = new byte[a];
        }
        byte[] bArr3 = ataxVar.f;
        if (bArr3 != null) {
            if (bArr3.length == a) {
                this.f = bArr3;
            } else {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
        } else {
            this.f = new byte[a];
        }
        byte[] bArr4 = ataxVar.g;
        if (bArr4 != null) {
            if (bArr4.length == a) {
                this.g = bArr4;
            } else {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
        } else {
            this.g = new byte[a];
        }
        atae ataeVar = ataxVar.h;
        if (ataeVar != null) {
            this.i = ataeVar;
        } else {
            if (atow.aj(atawVar.d, ataxVar.b) && bArr3 != null && bArr != null) {
                this.i = new atae(atawVar, ataxVar.b, bArr3, bArr);
            } else {
                this.i = new atae(ataxVar.c + 1);
            }
        }
        long j = ataxVar.c;
        if (j >= 0 && j != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] Q;
        synchronized (this) {
            ataw atawVar = this.c;
            int a = atawVar.a();
            int i = (atawVar.d + 7) / 8;
            int i2 = i + a;
            int i3 = i2 + a;
            int i4 = i3 + a;
            byte[] bArr = new byte[a + i4];
            atow.ah(bArr, atow.an(this.h, i), 0);
            atow.ah(bArr, this.d, i);
            atow.ah(bArr, this.e, i2);
            atow.ah(bArr, this.f, i3);
            atow.ah(bArr, this.g, i4);
            try {
                Q = atow.Q(bArr, atow.am(this.i));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return Q;
    }

    @Override // defpackage.atdc
    public final byte[] s() {
        byte[] a;
        synchronized (this) {
            a = a();
        }
        return a;
    }
}
