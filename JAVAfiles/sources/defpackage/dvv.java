package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvv implements dvs, dvl {
    public final dvo a;
    public int b;
    public int c = -1;
    public int d = -1;
    public float e = brg.a;
    public Object f;
    private dwg g;

    public dvv(dvo dvoVar) {
        this.a = dvoVar;
    }

    @Override // defpackage.dvl
    public final dvs a() {
        return null;
    }

    @Override // defpackage.dvs, defpackage.dvl
    public final dwc b() {
        if (this.g == null) {
            this.g = new dwg();
        }
        return this.g;
    }

    public final void c(float f) {
        this.c = -1;
        this.d = -1;
        this.e = f;
    }

    @Override // defpackage.dvl
    public final Object d() {
        return this.f;
    }

    @Override // defpackage.dvs, defpackage.dvl
    public final void e() {
        this.g.ag(this.b);
        int i = this.c;
        if (i != -1) {
            this.g.c(i);
            return;
        }
        int i2 = this.d;
        if (i2 != -1) {
            this.g.ae(i2);
        } else {
            this.g.af(this.e);
        }
    }

    @Override // defpackage.dvl
    public final void f(dwc dwcVar) {
        dwg dwgVar;
        if (dwcVar instanceof dwg) {
            dwgVar = (dwg) dwcVar;
        } else {
            dwgVar = null;
        }
        this.g = dwgVar;
    }
}
