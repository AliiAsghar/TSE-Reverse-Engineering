package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fui implements fur {
    private final fuh a;
    private final euf b = new euf(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public fui(fuh fuhVar) {
        this.a = fuhVar;
    }

    @Override // defpackage.fur
    public final void a(euf eufVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 1;
        if (i3 != 0) {
            i2 = eufVar.b + eufVar.j();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (i3 != 0) {
                this.f = false;
                eufVar.J(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (eufVar.b() > 0) {
            int i4 = this.d;
            if (i4 < 3) {
                if (i4 == 0) {
                    int j = eufVar.j();
                    eufVar.J(eufVar.b - 1);
                    if (j == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(eufVar.b(), 3 - this.d);
                eufVar.E(this.b.a, this.d, min);
                int i5 = this.d + min;
                this.d = i5;
                if (i5 == 3) {
                    this.b.J(0);
                    this.b.I(3);
                    this.b.K(1);
                    euf eufVar2 = this.b;
                    int j2 = eufVar2.j();
                    if ((j2 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int j3 = eufVar2.j();
                    this.e = z;
                    this.c = (j3 | ((j2 & 15) << 8)) + 3;
                    int c = this.b.c();
                    int i6 = this.c;
                    if (c < i6) {
                        int c2 = this.b.c();
                        this.b.D(Math.min(4098, Math.max(i6, c2 + c2)));
                    }
                }
            } else {
                int min2 = Math.min(eufVar.b(), this.c - i4);
                eufVar.E(this.b.a, this.d, min2);
                int i7 = this.d + min2;
                this.d = i7;
                int i8 = this.c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (this.e) {
                        if (eul.f(this.b.a, 0, i8, -1) == 0) {
                            this.b.I(this.c - 4);
                        } else {
                            this.f = true;
                            return;
                        }
                    } else {
                        this.b.I(i8);
                    }
                    this.b.J(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.fur
    public final void b(euj eujVar, flw flwVar, fuq fuqVar) {
        this.a.b(eujVar, flwVar, fuqVar);
        this.f = true;
    }

    @Override // defpackage.fur
    public final void c() {
        this.f = true;
    }
}
