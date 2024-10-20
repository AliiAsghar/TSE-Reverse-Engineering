package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asyd extends asya {
    public final byte[] c;
    public final byte[] d;

    public asyd(asyb asybVar, byte[] bArr) {
        super(false, asybVar);
        byte[] S = atow.S(bArr, 0, 32);
        this.c = S;
        this.d = atow.S(bArr, S.length, bArr.length);
    }
}
