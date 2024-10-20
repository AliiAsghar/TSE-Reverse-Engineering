package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbd implements hh {
    public final gdm a;
    public final gdm b;
    public final hh c;
    public int d;
    public int e;
    public int f;
    private int g = 1;
    private int h = 1;

    public gbd(gdm gdmVar, gdm gdmVar2, hh hhVar) {
        this.a = gdmVar;
        this.b = gdmVar2;
        this.c = hhVar;
        this.d = gdmVar.e();
        this.e = gdmVar.d();
        this.f = gdmVar.a();
    }

    @Override // defpackage.hh
    public final void a(int i, int i2, Object obj) {
        this.c.a(i + this.d, i2, obj);
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        if (i >= this.f && this.h != 2) {
            int min = Math.min(i2, this.e);
            if (min > 0) {
                this.h = 3;
                this.c.a(this.d + i, min, gaa.PLACEHOLDER_TO_ITEM);
                this.e -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.c.b(i + min + this.d, i3);
            }
        } else if (i <= 0 && this.g != 2) {
            int min2 = Math.min(i2, this.d);
            if (min2 > 0) {
                this.g = 3;
                this.c.a((-min2) + this.d, min2, gaa.PLACEHOLDER_TO_ITEM);
                this.d -= min2;
            }
            int i4 = i2 - min2;
            if (i4 > 0) {
                this.c.b(this.d, i4);
            }
        } else {
            this.c.b(i + this.d, i2);
        }
        this.f += i2;
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        int i3 = this.d;
        this.c.c(i + i3, i2 + i3);
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        if (i + i2 >= this.f && this.h != 3) {
            int r = arrn.r(Math.min(this.b.d() - this.e, i2), 0);
            int i3 = i2 - r;
            if (r > 0) {
                this.h = 2;
                this.c.a(this.d + i, r, gaa.ITEM_TO_PLACEHOLDER);
                this.e += r;
            }
            if (i3 > 0) {
                this.c.d(i + r + this.d, i3);
            }
        } else if (i <= 0 && this.g != 3) {
            int r2 = arrn.r(Math.min(this.b.e() - this.d, i2), 0);
            int i4 = i2 - r2;
            if (i4 > 0) {
                this.c.d(this.d, i4);
            }
            if (r2 > 0) {
                this.g = 2;
                this.c.a(this.d, r2, gaa.ITEM_TO_PLACEHOLDER);
                this.d += r2;
            }
        } else {
            this.c.d(i + this.d, i2);
        }
        this.f -= i2;
    }
}
