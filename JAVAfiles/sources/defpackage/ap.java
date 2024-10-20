package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ap extends an {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private am aj = this.j;
    public int ai = 0;

    public ap() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.an
    public final am t(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai != 0) {
                return null;
            }
            return this.aj;
        }
        if (this.ai != 1) {
            return null;
        }
        return this.aj;
    }

    @Override // defpackage.an
    public final void x(ak akVar) {
        an anVar = this.r;
        if (anVar != null) {
            am t = anVar.t(2);
            am t2 = anVar.t(4);
            if (this.ai == 0) {
                t = anVar.t(3);
                t2 = anVar.t(5);
            }
            if (this.ag != -1) {
                akVar.g(ak.c(akVar, akVar.e(this.aj), akVar.e(t), this.ag, false));
                return;
            }
            if (this.ah != -1) {
                akVar.g(ak.c(akVar, akVar.e(this.aj), akVar.e(t2), -this.ah, false));
                return;
            }
            if (this.af != -1.0f) {
                al e = akVar.e(this.aj);
                al e2 = akVar.e(t);
                al e3 = akVar.e(t2);
                float f = this.af;
                ai a = akVar.a();
                a.d.f(e, -1.0f);
                a.d.f(e2, 1.0f - f);
                a.d.f(e3, f);
                akVar.g(a);
            }
        }
    }

    @Override // defpackage.an
    public final void y() {
        if (this.r == null) {
            return;
        }
        int p = ak.p(this.aj);
        if (this.ai == 1) {
            this.w = p;
            this.x = 0;
            j(this.r.d());
            p(0);
            return;
        }
        this.w = 0;
        this.x = p;
        p(this.r.h());
        j(0);
    }
}
