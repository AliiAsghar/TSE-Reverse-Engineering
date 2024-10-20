package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvw extends dvr {
    public dvw(dvo dvoVar) {
        super(dvoVar, 1);
    }

    @Override // defpackage.dvk, defpackage.dve, defpackage.dvl
    public final void e() {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dve b = this.al.b(arrayList.get(i));
            if (b.N != null) {
                b.ak = 5;
            } else {
                b.ak = 6;
            }
            b.k();
            if (b.P != null) {
                b.ak = 7;
            } else {
                b.ak = 8;
            }
            b.k();
            if (b.J != null) {
                b.ak = 1;
            } else {
                b.ak = 2;
            }
            b.k();
            if (b.L != null) {
                b.ak = 3;
            } else {
                b.ak = 4;
            }
            b.k();
        }
        ArrayList arrayList2 = this.am;
        int size2 = arrayList2.size();
        dve dveVar = null;
        int i2 = 0;
        dve dveVar2 = null;
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            dve b2 = this.al.b(obj);
            if (dveVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    b2.t(obj2);
                    b2.o(this.l);
                    b2.p(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        b2.s(obj3);
                        b2.o(this.l);
                        b2.p(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            b2.t(obj4);
                            b2.o(this.j);
                            b2.p(this.p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                b2.s(obj5);
                                b2.o(this.j);
                                b2.p(this.p);
                            } else {
                                String obj6 = b2.a.toString();
                                b2.t(dvo.a);
                                b2.w(Float.valueOf(D(obj6)));
                                b2.q(Float.valueOf(C(obj6)));
                            }
                        }
                    }
                }
                dveVar2 = b2;
            }
            if (dveVar != null) {
                String obj7 = dveVar.a.toString();
                String obj8 = b2.a.toString();
                dveVar.m(b2.a);
                dveVar.w(Float.valueOf(B(obj7)));
                dveVar.q(Float.valueOf(A(obj7)));
                b2.s(dveVar.a);
                b2.w(Float.valueOf(D(obj8)));
                b2.q(Float.valueOf(C(obj8)));
            }
            float E = E(obj.toString());
            if (E != -1.0f) {
                b2.f = E;
            }
            i2++;
            dveVar = b2;
        }
        if (dveVar != null) {
            Object obj9 = this.P;
            if (obj9 != null) {
                dveVar.m(obj9);
                dveVar.o(this.m);
                dveVar.p(this.s);
            } else {
                Object obj10 = this.Q;
                if (obj10 != null) {
                    dveVar.l(obj10);
                    dveVar.o(this.m);
                    dveVar.p(this.s);
                } else {
                    Object obj11 = this.L;
                    if (obj11 != null) {
                        dveVar.m(obj11);
                        dveVar.o(this.k);
                        dveVar.p(this.q);
                    } else {
                        Object obj12 = this.M;
                        if (obj12 != null) {
                            dveVar.l(obj12);
                            dveVar.o(this.k);
                            dveVar.p(this.q);
                        } else {
                            String obj13 = dveVar.a.toString();
                            dveVar.l(dvo.a);
                            dveVar.w(Float.valueOf(B(obj13)));
                            dveVar.q(Float.valueOf(A(obj13)));
                        }
                    }
                }
            }
        }
        if (dveVar2 != null) {
            float f = this.ao;
            if (f != 0.5f) {
                dveVar2.h = f;
            }
            dvm dvmVar = dvm.SPREAD;
            int ordinal = this.as.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    dveVar2.d = 2;
                    return;
                }
                dveVar2.d = 1;
                return;
            }
            dveVar2.d = 0;
        }
    }
}
