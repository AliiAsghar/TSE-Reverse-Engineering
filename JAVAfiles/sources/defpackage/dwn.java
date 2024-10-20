package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwn extends dwy {
    ArrayList a;
    private int b;

    public dwn(dwc dwcVar, int i) {
        super(dwcVar);
        dwc dwcVar2;
        int i2;
        this.a = new ArrayList();
        this.f = i;
        dwc dwcVar3 = this.d;
        dwc n = dwcVar3.n(i);
        while (true) {
            dwc dwcVar4 = n;
            dwcVar2 = dwcVar3;
            dwcVar3 = dwcVar4;
            if (dwcVar3 == null) {
                break;
            } else {
                n = dwcVar3.n(this.f);
            }
        }
        this.d = dwcVar2;
        this.a.add(dwcVar2.o(this.f));
        dwc m = dwcVar2.m(this.f);
        while (m != null) {
            this.a.add(m.o(this.f));
            m = m.m(this.f);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            dwy dwyVar = (dwy) arrayList.get(i3);
            int i4 = this.f;
            if (i4 == 0) {
                dwyVar.d.m = this;
            } else if (i4 == 1) {
                dwyVar.d.n = this;
            }
        }
        if (this.f == 0 && ((dwd) this.d.ae).d && this.a.size() > 1) {
            this.d = ((dwy) this.a.get(r6.size() - 1)).d;
        }
        if (this.f == 0) {
            i2 = this.d.at;
        } else {
            i2 = this.d.au;
        }
        this.b = i2;
    }

    private final dwc g() {
        for (int i = 0; i < this.a.size(); i++) {
            dwc dwcVar = ((dwy) this.a.get(i)).d;
            if (dwcVar.ar != 8) {
                return dwcVar;
            }
        }
        return null;
    }

    private final dwc n() {
        dwc dwcVar;
        int size = this.a.size();
        do {
            size--;
            if (size >= 0) {
                dwcVar = ((dwy) this.a.get(size)).d;
            } else {
                return null;
            }
        } while (dwcVar.ar == 8);
        return dwcVar;
    }

    @Override // defpackage.dwy
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.h.e + ((dwy) this.a.get(i)).a() + r4.i.e;
        }
        return j;
    }

    @Override // defpackage.dwy
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dwy) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        dwc dwcVar = ((dwy) this.a.get(0)).d;
        dwc dwcVar2 = ((dwy) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            dwb dwbVar = dwcVar.T;
            dwb dwbVar2 = dwcVar2.V;
            dwq l = l(dwbVar, 0);
            int b = dwbVar.b();
            dwc g = g();
            if (g != null) {
                b = g.T.b();
            }
            if (l != null) {
                j(this.h, l, b);
            }
            dwq l2 = l(dwbVar2, 0);
            int b2 = dwbVar2.b();
            dwc n = n();
            if (n != null) {
                b2 = n.V.b();
            }
            if (l2 != null) {
                j(this.i, l2, -b2);
            }
        } else {
            dwb dwbVar3 = dwcVar.U;
            dwb dwbVar4 = dwcVar2.W;
            dwq l3 = l(dwbVar3, 1);
            int b3 = dwbVar3.b();
            dwc g2 = g();
            if (g2 != null) {
                b3 = g2.U.b();
            }
            if (l3 != null) {
                j(this.h, l3, b3);
            }
            dwq l4 = l(dwbVar4, 1);
            int b4 = dwbVar4.b();
            dwc n2 = n();
            if (n2 != null) {
                b4 = n2.W.b();
            }
            if (l4 != null) {
                j(this.i, l4, -b4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.dwy
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((dwy) this.a.get(i)).c();
        }
    }

    @Override // defpackage.dwy
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dwy) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.dwy
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((dwy) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03c4, code lost:
    
        r10 = r10 - r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    @Override // defpackage.dwy, defpackage.dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwn.f():void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dwy dwyVar = (dwy) arrayList.get(i);
            sb.append("<");
            sb.append(dwyVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
