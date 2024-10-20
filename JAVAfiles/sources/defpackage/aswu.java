package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswu extends aswr {
    public final byte[] c;
    public final byte[] d;

    public aswu(asws aswsVar, byte[] bArr) {
        super(false, aswsVar);
        int length = bArr.length;
        int i = length - 32;
        this.c = atow.S(bArr, 0, i);
        this.d = atow.S(bArr, i, length);
    }

    public aswu(asws aswsVar, byte[] bArr, byte[] bArr2) {
        super(false, aswsVar);
        this.c = atow.O(bArr);
        this.d = atow.O(bArr2);
    }
}
