package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrl {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public asrl f;
    public asrl g;

    public asrl() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final asrl a() {
        asrl asrlVar;
        asrl asrlVar2 = this.f;
        if (asrlVar2 != this) {
            asrlVar = asrlVar2;
        } else {
            asrlVar = null;
        }
        asrl asrlVar3 = this.g;
        asrlVar3.getClass();
        asrlVar3.f = asrlVar2;
        asrl asrlVar4 = this.f;
        asrlVar4.getClass();
        asrlVar4.g = asrlVar3;
        this.f = null;
        this.g = null;
        return asrlVar;
    }

    public final asrl b() {
        this.d = true;
        return new asrl(this.a, this.b, this.c, true);
    }

    public final void c(asrl asrlVar, int i) {
        if (asrlVar.e) {
            int i2 = asrlVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!asrlVar.d) {
                    int i4 = asrlVar.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = asrlVar.a;
                        aqil.u(bArr, bArr, 0, i4, i2);
                        i2 = asrlVar.c - asrlVar.b;
                        asrlVar.c = i2;
                        asrlVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = asrlVar.a;
            int i5 = this.b;
            aqil.u(bArr2, bArr3, i2, i5, i5 + i);
            asrlVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public final void d(asrl asrlVar) {
        asrlVar.g = this;
        asrlVar.f = this.f;
        asrl asrlVar2 = this.f;
        asrlVar2.getClass();
        asrlVar2.g = asrlVar;
        this.f = asrlVar;
    }

    public asrl(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
