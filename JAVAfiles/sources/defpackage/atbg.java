package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbg extends atau implements atdc {
    public final atbc c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public atbg(atbf atbfVar) {
        super(false, ((atbc) atbfVar.d).e);
        atbc atbcVar = (atbc) atbfVar.d;
        this.c = atbcVar;
        if (atbcVar != null) {
            int i = atbcVar.f;
            byte[] bArr = atbfVar.c;
            if (bArr != null) {
                int i2 = i + i;
                int length = bArr.length;
                if (length == i2) {
                    this.f = 0;
                    this.d = atow.al(bArr, 0, i);
                    this.e = atow.al(bArr, i, i);
                    return;
                } else {
                    int i3 = i + 4;
                    if (length == i3 + i) {
                        this.f = atow.C(bArr, 0);
                        this.d = atow.al(bArr, 4, i);
                        this.e = atow.al(bArr, i3, i);
                        return;
                    }
                    throw new IllegalArgumentException("public key has wrong size");
                }
            }
            atbb atbbVar = atbcVar.b;
            if (atbbVar != null) {
                this.f = ((atah) atbbVar).b;
            } else {
                this.f = 0;
            }
            byte[] bArr2 = atbfVar.a;
            if (bArr2 != null) {
                if (bArr2.length == i) {
                    this.d = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
            } else {
                this.d = new byte[i];
            }
            byte[] bArr3 = atbfVar.b;
            if (bArr3 != null) {
                if (bArr3.length == i) {
                    this.e = bArr3;
                    return;
                }
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.e = new byte[i];
            return;
        }
        throw new NullPointerException("params == null");
    }

    public final byte[] a() {
        byte[] bArr;
        int i = this.c.f;
        int i2 = this.f;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            atow.G(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        atow.ah(bArr, this.d, i3);
        atow.ah(bArr, this.e, i3 + i);
        return bArr;
    }

    @Override // defpackage.atdc
    public final byte[] s() {
        return a();
    }
}
