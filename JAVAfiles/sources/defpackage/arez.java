package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arez implements aqty {
    final /* synthetic */ Object a;
    final /* synthetic */ aqtz b;
    private final /* synthetic */ int c;

    public /* synthetic */ arez(arey areyVar, arex arexVar, int i) {
        this.c = i;
        this.b = areyVar;
        this.a = arexVar;
    }

    @Override // defpackage.aqty
    public final void a(aqse aqseVar) {
        aqtx arfbVar;
        aqsd aqsdVar;
        if (this.c != 0) {
            Object obj = this.a;
            arex arexVar = (arex) obj;
            aqtw aqtwVar = arexVar.a;
            aqtz aqtzVar = this.b;
            arey areyVar = (arey) aqtzVar;
            if (obj == areyVar.h.get(arey.k(aqtwVar)) && (aqsdVar = aqseVar.a) != aqsd.SHUTDOWN) {
                if (aqsdVar == aqsd.IDLE && arexVar.b == aqsd.READY) {
                    areyVar.g.e();
                }
                arexVar.b(aqsdVar);
                aqsd aqsdVar2 = areyVar.l;
                aqsd aqsdVar3 = aqsd.TRANSIENT_FAILURE;
                if (aqsdVar2 == aqsdVar3 || areyVar.m == aqsdVar3) {
                    if (aqsdVar != aqsd.CONNECTING) {
                        if (aqsdVar == aqsd.IDLE) {
                            aqtzVar.d();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int ordinal = aqsdVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                areyVar.i.c();
                                aqsd aqsdVar4 = aqsd.IDLE;
                                areyVar.l = aqsdVar4;
                                areyVar.h(aqsdVar4, new arew(areyVar, areyVar));
                                return;
                            }
                            throw new IllegalArgumentException("Unsupported state:".concat(aqsdVar.toString()));
                        }
                        if (areyVar.i.f() && areyVar.h.get(areyVar.i.b()) == obj) {
                            if (areyVar.i.e()) {
                                areyVar.f();
                                aqtzVar.d();
                            } else {
                                areyVar.g();
                            }
                        }
                        if (areyVar.h.size() >= areyVar.i.a) {
                            Iterator it = areyVar.h.values().iterator();
                            while (it.hasNext()) {
                                if (!((arex) it.next()).c) {
                                    return;
                                }
                            }
                            aqsd aqsdVar5 = aqsd.TRANSIENT_FAILURE;
                            areyVar.l = aqsdVar5;
                            areyVar.h(aqsdVar5, new arev(aqtt.a(aqseVar.b)));
                            int i = areyVar.j + 1;
                            areyVar.j = i;
                            if (i >= areyVar.i.a || areyVar.k) {
                                areyVar.k = false;
                                areyVar.j = 0;
                                areyVar.g.e();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    asmb asmbVar = areyVar.q;
                    if (asmbVar != null) {
                        asmbVar.m();
                        areyVar.q = null;
                    }
                    areyVar.o = null;
                    areyVar.f();
                    for (arex arexVar2 : areyVar.h.values()) {
                        if (!arexVar2.a.equals(arexVar.a)) {
                            arexVar2.a.b();
                        }
                    }
                    areyVar.h.clear();
                    arexVar.b(aqsd.READY);
                    areyVar.h.put(arey.k(arexVar.a), obj);
                    areyVar.i.g(arey.k(arexVar.a));
                    areyVar.l = aqsd.READY;
                    areyVar.i(arexVar);
                    return;
                }
                aqsd aqsdVar6 = aqsd.CONNECTING;
                areyVar.l = aqsdVar6;
                areyVar.h(aqsdVar6, new arev(aqtt.a));
                return;
            }
            return;
        }
        aqsd aqsdVar7 = aqseVar.a;
        if (aqsdVar7 != aqsd.SHUTDOWN) {
            aqtz aqtzVar2 = this.b;
            if (aqsdVar7 == aqsd.TRANSIENT_FAILURE || aqsdVar7 == aqsd.IDLE) {
                ((arfd) aqtzVar2).f.e();
            }
            arfd arfdVar = (arfd) aqtzVar2;
            if (arfdVar.g == aqsd.TRANSIENT_FAILURE) {
                if (aqsdVar7 != aqsd.CONNECTING) {
                    if (aqsdVar7 == aqsd.IDLE) {
                        aqtzVar2.d();
                        return;
                    }
                } else {
                    return;
                }
            }
            Object obj2 = this.a;
            int ordinal2 = aqsdVar7.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            arfbVar = new arfc(arfdVar, (aqtw) obj2);
                        } else {
                            throw new IllegalArgumentException("Unsupported state:".concat(aqsdVar7.toString()));
                        }
                    } else {
                        arfbVar = new arfb(aqtt.a(aqseVar.b));
                    }
                } else {
                    arfbVar = new arfb(aqtt.b((aqtw) obj2));
                }
            } else {
                arfbVar = new arfb(aqtt.a);
            }
            arfdVar.f(aqsdVar7, arfbVar);
        }
    }

    public arez(arfd arfdVar, aqtw aqtwVar, int i) {
        this.c = i;
        this.a = aqtwVar;
        this.b = arfdVar;
    }
}
