package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosj {
    int a = 0;
    final /* synthetic */ aosk b;

    public aosj(aosk aoskVar) {
        this.b = aoskVar;
    }

    public final int a(int i) {
        return this.b.a[this.a + i] & 255;
    }

    public final int b() {
        int i = this.a;
        this.a = i + 1;
        return this.b.a[i] & 255;
    }

    public final int c() {
        return (b() << 8) | b();
    }

    public final int d(int i) {
        this.a += i;
        if (i != 0) {
            return 1;
        }
        return 2;
    }

    public final int e(int i) {
        return d(a(i));
    }
}
