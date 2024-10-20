package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpy implements fpv {
    private final euf a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public fpy(euo euoVar) {
        euf eufVar = euoVar.a;
        this.a = eufVar;
        eufVar.J(12);
        this.c = eufVar.m() & 255;
        this.b = eufVar.m();
    }

    @Override // defpackage.fpv
    public final int a() {
        return -1;
    }

    @Override // defpackage.fpv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpv
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.j();
        }
        if (i == 16) {
            return this.a.n();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int j = this.a.j();
            this.e = j;
            return (j & 240) >> 4;
        }
        return this.e & 15;
    }
}
