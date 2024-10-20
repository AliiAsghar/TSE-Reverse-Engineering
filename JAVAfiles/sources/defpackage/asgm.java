package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgm extends asgq {
    public final arve a = new arve(asgn.a, arvf.a);

    public final boolean a() {
        if (Math.max(this.d.b, 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object b(arpe arpeVar) {
        Object a;
        long j;
        if (c()) {
            return arnb.a;
        }
        arvp E = arrn.E(arhi.i(arpeVar));
        try {
            asgl asglVar = new asgl(this, E);
            while (true) {
                int andDecrement = arvc.a.getAndDecrement(this.d);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        asglVar.f(arnb.a, this.e);
                        break;
                    }
                    asgs asgsVar = (asgs) this.b.a;
                    long b = this.c.b();
                    asgo asgoVar = asgo.a;
                    arve arveVar = this.b;
                    long j2 = b / asgr.f;
                    while (true) {
                        a = asen.a(asgsVar, j2, asgoVar);
                        if (!asfl.a(a)) {
                            aseo b2 = asfl.b(a);
                            while (true) {
                                aseo aseoVar = (aseo) arveVar.a;
                                j = j2;
                                if (aseoVar.b >= b2.b) {
                                    break;
                                }
                                if (b2.v()) {
                                    if (arveVar.d(aseoVar, b2)) {
                                        if (aseoVar.t()) {
                                            aseoVar.q();
                                        }
                                    } else {
                                        if (b2.t()) {
                                            b2.q();
                                        }
                                        j2 = j;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                        j2 = j;
                    }
                    asgs asgsVar2 = (asgs) asfl.b(a);
                    int i = (int) (b % asgr.f);
                    if (asgsVar2.c.a(i).d(null, asglVar)) {
                        asglVar.F(asgsVar2, i);
                        break;
                    }
                    if (asgsVar2.c.a(i).d(asgr.b, asgr.c)) {
                        asglVar.f(arnb.a, this.e);
                        break;
                    }
                    boolean z = arwh.a;
                }
            }
            Object l = E.l();
            arpl arplVar = arpl.a;
            if (l == arplVar) {
                arpeVar.getClass();
            }
            if (l != arplVar) {
                l = arnb.a;
            }
            if (l != arplVar) {
                return arnb.a;
            }
            return l;
        } catch (Throwable th) {
            E.C();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            int i = this.d.b;
            if (i > 1) {
                super.e();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (this.d.c(1, 0)) {
                    boolean z = arwh.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            Object obj = this.a.a;
            asfn asfnVar = asgn.a;
            if (obj != asfnVar && this.a.d(obj, asfnVar)) {
                f();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + arwi.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
