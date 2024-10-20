package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aszd extends asza {
    final asmb c;
    public final asmb d;

    public aszd(aszc aszcVar, byte[] bArr) {
        super(true, aszcVar);
        int a = aszcVar.a();
        int i = a * 4;
        if (bArr.length == i) {
            int i2 = a + a;
            this.c = new asmb(atow.S(bArr, 0, a), atow.S(bArr, a, i2));
            int i3 = a * 3;
            this.d = new asmb(atow.S(bArr, i2, i3), atow.S(bArr, i3, i));
            return;
        }
        throw new IllegalArgumentException("private key encoding does not match parameters");
    }

    public final byte[] a() {
        asmb asmbVar = this.c;
        byte[] bArr = (byte[]) asmbVar.a;
        byte[] bArr2 = (byte[]) asmbVar.b;
        asmb asmbVar2 = this.d;
        return atow.P(new byte[][]{bArr, bArr2, (byte[]) asmbVar2.a, (byte[]) asmbVar2.b});
    }

    public aszd(aszc aszcVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, aszcVar);
        this.c = new asmb(bArr, bArr2);
        this.d = new asmb(bArr3, bArr4);
    }
}
