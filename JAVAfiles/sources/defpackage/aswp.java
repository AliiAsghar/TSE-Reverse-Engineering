package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswp extends aswm {
    final byte[] c;
    final byte[] d;

    public aswp(aswn aswnVar, byte[] bArr) {
        super(false, aswnVar);
        this.c = atow.S(bArr, 0, 32);
        this.d = atow.S(bArr, 32, bArr.length);
    }

    public final byte[] a() {
        return atow.Q(this.c, this.d);
    }

    public final byte[] b() {
        return atow.O(this.d);
    }

    public aswp(aswn aswnVar, byte[] bArr, byte[] bArr2) {
        super(false, aswnVar);
        this.c = atow.O(bArr);
        this.d = atow.O(bArr2);
    }
}
