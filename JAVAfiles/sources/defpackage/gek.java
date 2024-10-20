package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gek {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ gel j;

    public gek(gel gelVar, int i, int i2) {
        this.j = gelVar;
        this.a = i;
        this.b = i2;
        b();
    }

    public final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            gel gelVar = this.j;
            int[] iArr = gelVar.a;
            int[] iArr2 = gelVar.b;
            int i9 = iArr[i8];
            i += iArr2[i9];
            int d = gel.d(i9);
            int c = gel.c(i9);
            int b = gel.b(i9);
            if (d > i2) {
                i2 = d;
            }
            if (d < i4) {
                i4 = d;
            }
            if (c > i7) {
                i7 = c;
            }
            if (c < i5) {
                i5 = c;
            }
            if (b > i3) {
                i3 = b;
            }
            if (b < i6) {
                i6 = b;
            }
        }
        this.d = i4;
        this.e = i2;
        this.f = i5;
        this.g = i7;
        this.h = i6;
        this.i = i3;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if ((this.b + 1) - this.a > 1) {
            return true;
        }
        return false;
    }
}
