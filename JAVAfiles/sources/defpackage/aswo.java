package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswo extends aswm {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public aswo(aswn aswnVar, byte[] bArr, aswp aswpVar) {
        super(true, aswnVar);
        aswl aswlVar = new aswl(aswnVar.d);
        this.c = atow.S(bArr, 0, 32);
        this.d = atow.S(bArr, 32, 64);
        this.e = atow.S(bArr, 64, 128);
        int i = (aswlVar.c * aswlVar.a) + 128;
        this.f = atow.S(bArr, 128, i);
        int i2 = (aswlVar.b * aswlVar.a) + i;
        this.g = atow.S(bArr, i, i2);
        this.h = atow.S(bArr, i2, (aswlVar.b * 416) + i2);
        if (aswpVar != null) {
            this.i = aswpVar.b();
        } else {
            this.i = null;
        }
    }

    public aswo(aswn aswnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, aswnVar);
        this.c = atow.O(bArr);
        this.d = atow.O(bArr2);
        this.e = atow.O(bArr3);
        this.f = atow.O(bArr4);
        this.g = atow.O(bArr5);
        this.h = atow.O(bArr6);
        this.i = atow.O(bArr7);
    }
}
