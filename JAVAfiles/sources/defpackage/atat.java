package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atat {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public atat(atas atasVar) {
        this.d = atasVar.e;
        this.e = atasVar.f;
        this.a = atasVar.d;
        this.f = atasVar.g;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        atow.G(this.d, bArr, 0);
        atow.I(this.e, bArr, 4);
        atow.G(this.a, bArr, 12);
        atow.G(this.f, bArr, 28);
        return bArr;
    }
}
