package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswt extends aswr {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;

    public aswt(asws aswsVar, byte[] bArr) {
        super(true, aswsVar);
        aswq aswqVar = new aswq(aswsVar.e);
        this.c = atow.S(bArr, 0, aswqVar.b);
        int i = aswqVar.b;
        this.f = atow.S(bArr, i, (aswqVar.a + i) - 32);
        int i2 = i + (aswqVar.a - 32);
        int i3 = i2 + 32;
        this.g = atow.S(bArr, i2, i3);
        int i4 = i2 + 64;
        this.d = atow.S(bArr, i3, i4);
        this.e = atow.S(bArr, i4, i2 + 96);
    }
}
