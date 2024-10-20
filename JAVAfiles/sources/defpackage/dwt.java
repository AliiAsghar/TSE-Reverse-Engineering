package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwt extends dwy {
    public dwt(dwc dwcVar) {
        super(dwcVar);
        dwcVar.o.d();
        dwcVar.p.d();
        this.f = ((dwg) dwcVar).e;
    }

    private final void g(dwq dwqVar) {
        this.h.j.add(dwqVar);
        dwqVar.k.add(this.h);
    }

    @Override // defpackage.dwy
    public final void b() {
        dwc dwcVar = this.d;
        dwg dwgVar = (dwg) dwcVar;
        int i = dwgVar.b;
        int i2 = dwgVar.c;
        float f = dwgVar.a;
        if (dwgVar.e == 1) {
            if (i != -1) {
                this.h.k.add(dwcVar.ae.o.h);
                this.d.ae.o.h.j.add(this.h);
                this.h.e = i;
            } else if (i2 != -1) {
                this.h.k.add(dwcVar.ae.o.i);
                this.d.ae.o.i.j.add(this.h);
                this.h.e = -i2;
            } else {
                dwq dwqVar = this.h;
                dwqVar.b = true;
                dwqVar.k.add(dwcVar.ae.o.i);
                this.d.ae.o.i.j.add(this.h);
            }
            g(this.d.o.h);
            g(this.d.o.i);
            return;
        }
        if (i != -1) {
            this.h.k.add(dwcVar.ae.p.h);
            this.d.ae.p.h.j.add(this.h);
            this.h.e = i;
        } else if (i2 != -1) {
            this.h.k.add(dwcVar.ae.p.i);
            this.d.ae.p.i.j.add(this.h);
            this.h.e = -i2;
        } else {
            dwq dwqVar2 = this.h;
            dwqVar2.b = true;
            dwqVar2.k.add(dwcVar.ae.p.i);
            this.d.ae.p.i.j.add(this.h);
        }
        g(this.d.p.h);
        g(this.d.p.i);
    }

    @Override // defpackage.dwy
    public final void c() {
        dwc dwcVar = this.d;
        if (((dwg) dwcVar).e == 1) {
            dwcVar.aj = this.h.f;
        } else {
            dwcVar.ak = this.h.f;
        }
    }

    @Override // defpackage.dwy
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.dwy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.dwy, defpackage.dwo
    public final void f() {
        dwq dwqVar = this.h;
        if (dwqVar.c && !dwqVar.i) {
            this.h.c((int) ((((dwq) dwqVar.k.get(0)).f * ((dwg) this.d).a) + 0.5f));
        }
    }
}
