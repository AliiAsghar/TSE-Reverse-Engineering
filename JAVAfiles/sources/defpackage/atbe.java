package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbe extends atau implements atdc {
    public final atbc c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile atad h;

    public atbe(atbd atbdVar) {
        super(true, atbdVar.a.e);
        atbc atbcVar = atbdVar.a;
        this.c = atbcVar;
        int i = atbcVar.f;
        byte[] bArr = atbdVar.d;
        if (bArr != null) {
            if (bArr.length == i) {
                this.d = bArr;
            } else {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
        } else {
            this.d = new byte[i];
        }
        byte[] bArr2 = atbdVar.e;
        if (bArr2 != null) {
            if (bArr2.length == i) {
                this.e = bArr2;
            } else {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
        } else {
            this.e = new byte[i];
        }
        byte[] bArr3 = atbdVar.f;
        if (bArr3 != null) {
            if (bArr3.length == i) {
                this.f = bArr3;
            } else {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
        } else {
            this.f = new byte[i];
        }
        byte[] bArr4 = atbdVar.g;
        if (bArr4 != null) {
            if (bArr4.length == i) {
                this.g = bArr4;
            } else {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
        } else {
            this.g = new byte[i];
        }
        atad atadVar = atbdVar.h;
        if (atadVar != null) {
            this.h = atadVar;
        } else {
            int i2 = atbdVar.b;
            int i3 = 1 << atbcVar.c;
            if (i2 < i3 - 2 && bArr3 != null && bArr != null) {
                this.h = new atad(atbcVar, bArr3, bArr, new atao(new atan()), i2);
            } else {
                this.h = new atad(atbcVar, i3 - 1, i2);
            }
        }
        int i4 = atbdVar.c;
        if (i4 >= 0 && i4 != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] Q;
        synchronized (this) {
            int i = this.c.f;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[i + i4];
            atow.G(this.h.a, bArr, 0);
            atow.ah(bArr, this.d, 4);
            atow.ah(bArr, this.e, i2);
            atow.ah(bArr, this.f, i3);
            atow.ah(bArr, this.g, i4);
            try {
                Q = atow.Q(bArr, atow.am(this.h));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
