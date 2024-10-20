package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ataz extends atav implements atdc {
    public final ataw c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public ataz(atbf atbfVar) {
        super(false, ((ataw) atbfVar.d).b());
        ataw atawVar = (ataw) atbfVar.d;
        this.c = atawVar;
        if (atawVar != null) {
            int a = atawVar.a();
            byte[] bArr = atbfVar.c;
            if (bArr != null) {
                int i = a + a;
                int length = bArr.length;
                if (length == i) {
                    this.d = 0;
                    this.e = atow.al(bArr, 0, a);
                    this.f = atow.al(bArr, a, a);
                    return;
                } else {
                    int i2 = a + 4;
                    if (length == i2 + a) {
                        this.d = atow.C(bArr, 0);
                        this.e = atow.al(bArr, 4, a);
                        this.f = atow.al(bArr, i2, a);
                        return;
                    }
                    throw new IllegalArgumentException("public key has wrong size");
                }
            }
            atbb atbbVar = atawVar.b;
            if (atbbVar != null) {
                this.d = ((atag) atbbVar).b;
            } else {
                this.d = 0;
            }
            byte[] bArr2 = atbfVar.a;
            if (bArr2 != null) {
                if (bArr2.length == a) {
                    this.e = bArr2;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
            } else {
                this.e = new byte[a];
            }
            byte[] bArr3 = atbfVar.b;
            if (bArr3 != null) {
                if (bArr3.length == a) {
                    this.f = bArr3;
                    return;
                }
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f = new byte[a];
            return;
        }
        throw new NullPointerException("params == null");
    }

    public final byte[] a() {
        return atow.ak(this.f);
    }

    public final byte[] b() {
        return atow.ak(this.e);
    }

    public final byte[] c() {
        byte[] bArr;
        int i = this.d;
        int a = this.c.a();
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[a + 4 + a];
            atow.G(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[a + a];
        }
        atow.ah(bArr, this.e, i2);
        atow.ah(bArr, this.f, i2 + a);
        return bArr;
    }

    @Override // defpackage.atdc
    public final byte[] s() {
        return c();
    }
}
