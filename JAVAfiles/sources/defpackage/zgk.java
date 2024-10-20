package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgk {
    final /* synthetic */ zgl a;
    private final int b;
    private int c;
    private int d;

    public zgk(zgl zglVar, int i) {
        this.a = zglVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 == i) {
            return;
        }
        int i4 = this.d;
        if (i > i4) {
            this.d = i;
            i4 = i;
        }
        if (i == i4) {
            this.a.a.f(false);
        }
        int i5 = this.d - i;
        int i6 = this.b;
        if (i5 > i6) {
            this.a.a.f(true);
            this.a.a.e(i5);
        } else if (i3 > 0 && (i2 = i - i3) > i6) {
            this.a.a.f(false);
            this.a.a.e(i2);
        }
        this.c = i;
    }
}
