package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final aswk g;
    public final boolean h;
    public final boolean i;
    private final int j;

    public aswd(int i, int i2, int i3, boolean z) {
        aswk aswjVar;
        this.i = z;
        this.a = i2;
        this.b = i3;
        this.c = i;
        this.d = i3 + i3;
        int i4 = i3 * i;
        this.e = i4;
        this.j = i2 - i4;
        this.f = (1 << i) - 1;
        if (i == 12) {
            aswjVar = new aswi();
        } else {
            aswjVar = new aswj();
        }
        this.g = aswjVar;
        this.h = (i3 & 7) != 0;
    }

    public final int a() {
        if (this.h) {
            int i = this.e;
            return i * ((this.a >> 3) - ((i - 1) >> 3));
        }
        return (this.e * this.j) >> 3;
    }
}
