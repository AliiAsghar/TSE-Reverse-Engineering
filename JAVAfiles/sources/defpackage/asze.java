package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asze extends asza {
    private final asmb c;

    public asze(aszc aszcVar, byte[] bArr) {
        super(false, aszcVar);
        int a = aszcVar.a();
        int i = a + a;
        if (bArr.length == i) {
            this.c = new asmb(atow.S(bArr, 0, a), atow.S(bArr, a, i));
            return;
        }
        throw new IllegalArgumentException("public key encoding does not match parameters");
    }

    public final byte[] a() {
        asmb asmbVar = this.c;
        return atow.Q((byte[]) asmbVar.a, (byte[]) asmbVar.b);
    }
}
