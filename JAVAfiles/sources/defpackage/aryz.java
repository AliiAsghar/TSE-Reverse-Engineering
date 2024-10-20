package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryz implements arys {
    public Object a = arzh.p;
    public arvp b;
    final /* synthetic */ arzf c;

    public aryz(arzf arzfVar) {
        this.c = arzfVar;
    }

    @Override // defpackage.arys
    public final void F(aseo aseoVar, int i) {
        arvp arvpVar = this.b;
        if (arvpVar != null) {
            arvpVar.F(aseoVar, i);
        }
    }

    public final Object a(arpe arpeVar) {
        arzo arzoVar;
        arzo arzoVar2;
        boolean z = true;
        if (this.a == arzh.p || this.a == arzh.l) {
            arzf arzfVar = this.c;
            arzo arzoVar3 = (arzo) arzfVar.d.a;
            while (true) {
                if (arzfVar.y()) {
                    this.a = arzh.l;
                    Throwable o = this.c.o();
                    if (o == null) {
                        z = false;
                    } else {
                        throw asfm.b(o);
                    }
                } else {
                    long b = arzfVar.b.b();
                    long j = arzh.b;
                    long j2 = b / j;
                    int i = (int) (b % j);
                    if (arzoVar3.b != j2) {
                        arzo r = arzfVar.r(j2, arzoVar3);
                        if (r != null) {
                            arzoVar = r;
                        } else {
                            continue;
                        }
                    } else {
                        arzoVar = arzoVar3;
                    }
                    Object n = arzfVar.n(arzoVar, i, b, null);
                    if (n != arzh.m) {
                        if (n == arzh.o) {
                            if (b < arzfVar.h()) {
                                arzoVar.p();
                            }
                            arzoVar3 = arzoVar;
                        } else {
                            if (n == arzh.n) {
                                arzf arzfVar2 = this.c;
                                arvp E = arrn.E(arhi.i(arpeVar));
                                try {
                                    this.b = E;
                                    arzo arzoVar4 = arzoVar;
                                    Object n2 = arzfVar2.n(arzoVar, i, b, this);
                                    if (n2 == arzh.m) {
                                        arzfVar2.u(this, arzoVar4, i);
                                    } else {
                                        if (n2 == arzh.o) {
                                            if (b < arzfVar2.h()) {
                                                arzoVar4.p();
                                            }
                                            arzo arzoVar5 = (arzo) arzfVar2.d.a;
                                            while (true) {
                                                if (arzfVar2.y()) {
                                                    arvp arvpVar = this.b;
                                                    arvpVar.getClass();
                                                    this.b = null;
                                                    this.a = arzh.l;
                                                    Throwable o2 = this.c.o();
                                                    if (o2 == null) {
                                                        arvpVar.w(false);
                                                    } else {
                                                        if (arwh.b) {
                                                            o2 = asfm.a(o2, arvpVar);
                                                        }
                                                        arvpVar.w(aqil.O(o2));
                                                    }
                                                } else {
                                                    long b2 = arzfVar2.b.b();
                                                    long j3 = arzh.b;
                                                    long j4 = b2 / j3;
                                                    int i2 = (int) (b2 % j3);
                                                    if (arzoVar5.b != j4) {
                                                        arzo r2 = arzfVar2.r(j4, arzoVar5);
                                                        if (r2 != null) {
                                                            arzoVar2 = r2;
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        arzoVar2 = arzoVar5;
                                                    }
                                                    Object n3 = arzfVar2.n(arzoVar2, i2, b2, this);
                                                    if (n3 == arzh.m) {
                                                        arzfVar2.u(this, arzoVar2, i2);
                                                        break;
                                                    }
                                                    if (n3 == arzh.o) {
                                                        if (b2 < arzfVar2.h()) {
                                                            arzoVar2.p();
                                                        }
                                                        arzoVar5 = arzoVar2;
                                                    } else if (n3 != arzh.n) {
                                                        arzoVar2.p();
                                                        this.a = n3;
                                                        this.b = null;
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            arzoVar4.p();
                                            this.a = n2;
                                            this.b = null;
                                        }
                                        E.f(true, null);
                                    }
                                    Object l = E.l();
                                    if (l == arpl.a) {
                                        arpeVar.getClass();
                                    }
                                    return l;
                                } catch (Throwable th) {
                                    E.C();
                                    throw th;
                                }
                            }
                            arzoVar.p();
                            this.a = n;
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object b() {
        Object obj = this.a;
        if (obj != arzh.p) {
            this.a = arzh.p;
            if (obj != arzh.l) {
                return obj;
            }
            throw asfm.b(this.c.p());
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }
}
