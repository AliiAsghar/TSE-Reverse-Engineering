package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwu extends dwy {
    public dwu(dwc dwcVar) {
        super(dwcVar);
    }

    private final void g(dwq dwqVar) {
        this.h.j.add(dwqVar);
        dwqVar.k.add(this.h);
    }

    @Override // defpackage.dwy
    public final void b() {
        dwc dwcVar = this.d;
        if (dwcVar instanceof dvz) {
            dwq dwqVar = this.h;
            dwqVar.b = true;
            dvz dvzVar = (dvz) dwcVar;
            int i = dvzVar.a;
            boolean z = dvzVar.b;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            dwqVar.l = 7;
                            while (i2 < dvzVar.aM) {
                                dwc dwcVar2 = dvzVar.aL[i2];
                                if (z || dwcVar2.ar != 8) {
                                    dwq dwqVar2 = dwcVar2.p.i;
                                    dwqVar2.j.add(this.h);
                                    this.h.k.add(dwqVar2);
                                }
                                i2++;
                            }
                            g(this.d.p.h);
                            g(this.d.p.i);
                            return;
                        }
                        return;
                    }
                    dwqVar.l = 6;
                    while (i2 < dvzVar.aM) {
                        dwc dwcVar3 = dvzVar.aL[i2];
                        if (z || dwcVar3.ar != 8) {
                            dwq dwqVar3 = dwcVar3.p.h;
                            dwqVar3.j.add(this.h);
                            this.h.k.add(dwqVar3);
                        }
                        i2++;
                    }
                    g(this.d.p.h);
                    g(this.d.p.i);
                    return;
                }
                dwqVar.l = 5;
                while (i2 < dvzVar.aM) {
                    dwc dwcVar4 = dvzVar.aL[i2];
                    if (z || dwcVar4.ar != 8) {
                        dwq dwqVar4 = dwcVar4.o.i;
                        dwqVar4.j.add(this.h);
                        this.h.k.add(dwqVar4);
                    }
                    i2++;
                }
                g(this.d.o.h);
                g(this.d.o.i);
                return;
            }
            dwqVar.l = 4;
            while (i2 < dvzVar.aM) {
                dwc dwcVar5 = dvzVar.aL[i2];
                if (z || dwcVar5.ar != 8) {
                    dwq dwqVar5 = dwcVar5.o.h;
                    dwqVar5.j.add(this.h);
                    this.h.k.add(dwqVar5);
                }
                i2++;
            }
            g(this.d.o.h);
            g(this.d.o.i);
        }
    }

    @Override // defpackage.dwy
    public final void c() {
        dwc dwcVar = this.d;
        if (dwcVar instanceof dvz) {
            int i = ((dvz) dwcVar).a;
            if (i != 0 && i != 1) {
                dwcVar.ak = this.h.f;
            } else {
                dwcVar.aj = this.h.f;
            }
        }
    }

    @Override // defpackage.dwy
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.dwy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.dwy, defpackage.dwo
    public final void f() {
        dvz dvzVar = (dvz) this.d;
        int i = dvzVar.a;
        Iterator it = this.h.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((dwq) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            this.h.c(i2 + dvzVar.c);
        } else {
            this.h.c(i3 + dvzVar.c);
        }
    }
}
