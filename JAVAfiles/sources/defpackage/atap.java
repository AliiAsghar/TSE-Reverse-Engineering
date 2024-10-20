package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atap {
    public final atar a;
    public final atal b;
    public byte[] c;
    private byte[] d;

    public atap(atar atarVar) {
        this.a = atarVar;
        int i = atarVar.a;
        this.b = new atal(atarVar.c, i);
        this.d = new byte[i];
        this.c = new byte[i];
    }

    private final byte[] d(byte[] bArr, int i, atao ataoVar) {
        int length = bArr.length;
        int i2 = this.a.a;
        if (length == i2) {
            ataoVar.a();
            if (i <= 15) {
                if (i == 0) {
                    return bArr;
                }
                int i3 = i - 1;
                byte[] d = d(bArr, i3, ataoVar);
                atan atanVar = new atan();
                atanVar.e = ataoVar.d;
                atanVar.f = ataoVar.e;
                atanVar.a = ataoVar.a;
                atanVar.b = ataoVar.b;
                atanVar.c = i3;
                atanVar.g = 0;
                atao ataoVar2 = new atao(atanVar);
                byte[] a = this.b.a(this.c, ataoVar2.a());
                atan atanVar2 = new atan();
                atanVar2.e = ataoVar2.d;
                atanVar2.f = ataoVar2.e;
                atanVar2.a = ataoVar2.a;
                atanVar2.b = ataoVar2.b;
                atanVar2.c = ataoVar2.c;
                atanVar2.g = 1;
                byte[] a2 = this.b.a(this.c, new atao(atanVar2).a());
                byte[] bArr2 = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = (byte) (d[i4] ^ a2[i4]);
                }
                atal atalVar = this.b;
                int length2 = a.length;
                int i5 = atalVar.a;
                if (length2 == i5) {
                    if (i2 == i5) {
                        return atalVar.b(0, a, bArr2);
                    }
                    throw new IllegalArgumentException("wrong in length");
                }
                throw new IllegalArgumentException("wrong key length");
            }
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        throw new IllegalArgumentException(a.cb(i2, "startHash needs to be ", "bytes"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(byte[] bArr, byte[] bArr2) {
        atar atarVar = this.a;
        int length = bArr.length;
        int i = atarVar.a;
        if (length == i) {
            if (bArr2.length == i) {
                this.d = bArr;
                this.c = bArr2;
                return;
            }
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] b(byte[] bArr, atao ataoVar) {
        atan atanVar = new atan();
        atanVar.e = ataoVar.d;
        atanVar.f = ataoVar.e;
        atanVar.a = ataoVar.a;
        return this.b.a(bArr, new atao(atanVar).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final atoi c(atao ataoVar) {
        byte[][] bArr = new byte[this.a.b];
        int i = 0;
        while (true) {
            atar atarVar = this.a;
            int i2 = atarVar.b;
            if (i < i2) {
                atan atanVar = new atan();
                atanVar.e = ataoVar.d;
                atanVar.f = ataoVar.e;
                atanVar.a = ataoVar.a;
                atanVar.b = i;
                atanVar.c = ataoVar.c;
                atanVar.g = ataoVar.f;
                ataoVar = new atao(atanVar);
                if (i < i2) {
                    bArr[i] = d(this.b.a(this.d, atow.an(i, 32)), 15, ataoVar);
                    i++;
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                return new atoi(atarVar, bArr);
            }
        }
    }
}
