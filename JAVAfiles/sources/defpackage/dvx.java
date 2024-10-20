package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvx extends dvr {
    public dvx(dvo dvoVar) {
        super(dvoVar, 2);
    }

    @Override // defpackage.dvk, defpackage.dve, defpackage.dvl
    public final void e() {
        int i;
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dve b = this.al.b(arrayList.get(i2));
            if (b.R != null) {
                b.ak = 9;
            } else {
                b.ak = 10;
            }
            b.k();
            b.ak = 15;
            b.k();
            if (b.U != null) {
                i = 12;
            } else {
                i = 13;
            }
            b.ak = i;
            b.k();
        }
        ArrayList arrayList2 = this.am;
        int size2 = arrayList2.size();
        dve dveVar = null;
        int i3 = 0;
        dve dveVar2 = null;
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            dve b2 = this.al.b(obj);
            if (dveVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    b2.v(obj2);
                    b2.o(this.n);
                    b2.p(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        b2.u(obj3);
                        b2.o(this.n);
                        b2.p(this.t);
                    } else {
                        String obj4 = b2.a.toString();
                        b2.v(dvo.a);
                        b2.w(Float.valueOf(D(obj4)));
                        b2.q(Float.valueOf(C(obj4)));
                    }
                }
                dveVar2 = b2;
            }
            if (dveVar != null) {
                String obj5 = dveVar.a.toString();
                String obj6 = b2.a.toString();
                dveVar.j(b2.a);
                dveVar.w(Float.valueOf(B(obj5)));
                dveVar.q(Float.valueOf(A(obj5)));
                b2.u(dveVar.a);
                b2.w(Float.valueOf(D(obj6)));
                b2.q(Float.valueOf(C(obj6)));
            }
            float E = E(obj.toString());
            if (E != -1.0f) {
                b2.g = E;
            }
            i3++;
            dveVar = b2;
        }
        if (dveVar != null) {
            Object obj7 = this.U;
            if (obj7 != null) {
                dveVar.j(obj7);
                dveVar.o(this.o);
                dveVar.p(this.u);
            } else {
                Object obj8 = this.V;
                if (obj8 != null) {
                    dveVar.i(obj8);
                    dveVar.o(this.o);
                    dveVar.p(this.u);
                } else {
                    String obj9 = dveVar.a.toString();
                    dveVar.i(dvo.a);
                    dveVar.w(Float.valueOf(B(obj9)));
                    dveVar.q(Float.valueOf(A(obj9)));
                }
            }
        }
        if (dveVar2 != null) {
            float f = this.ao;
            if (f != 0.5f) {
                dveVar2.i = f;
            }
            dvm dvmVar = dvm.SPREAD;
            int ordinal = this.as.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    dveVar2.e = 2;
                    return;
                }
                dveVar2.e = 1;
                return;
            }
            dveVar2.e = 0;
        }
    }
}
