package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpt {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final euf f;
    private final euf g;
    private int h;
    private int i;

    public fpt(euf eufVar, euf eufVar2, boolean z) {
        this.g = eufVar;
        this.f = eufVar2;
        this.e = z;
        eufVar2.J(12);
        this.a = eufVar2.m();
        eufVar.J(12);
        this.i = eufVar.m();
        eef.i(eufVar.e() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long r;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        if (this.e) {
            r = this.f.s();
        } else {
            r = this.f.r();
        }
        this.d = r;
        if (this.b == this.h) {
            this.c = this.g.m();
            this.g.K(4);
            int i2 = -1;
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i2 = (-1) + this.g.m();
            }
            this.h = i2;
        }
        return true;
    }
}
