package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arjn implements arhv {
    public final asqu a;
    private int b;
    private int c;

    public arjn(asqu asquVar, int i) {
        this.a = asquVar;
        this.b = i;
    }

    @Override // defpackage.arhv
    public final int a() {
        return this.c;
    }

    @Override // defpackage.arhv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.arhv
    public final void c(byte b) {
        this.a.M(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.arhv
    public final void d(byte[] bArr, int i, int i2) {
        this.a.K(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
