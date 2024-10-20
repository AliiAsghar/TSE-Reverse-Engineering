package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asgq {
    private final arve a;
    public final arve b;
    public final arvc d;
    public final arqw e;
    private final arvd f = new arvd(0, arvf.a);
    public final arvd c = new arvd(0, arvf.a);

    public asgq() {
        asgs asgsVar = new asgs(0L, null, 2);
        this.a = new arve(asgsVar, arvf.a);
        arvf arvfVar = arvf.a;
        this.b = new arve(asgsVar, arvfVar);
        this.d = new arvc(1, arvfVar);
        this.e = new aeyj(this, 9);
    }

    public final void e() {
        int i;
        do {
            i = this.d.b;
            if (i <= 1) {
                return;
            }
        } while (!this.d.c(i, 1));
    }

    public final void f() {
        Object a;
        while (true) {
            int andIncrement = arvc.a.getAndIncrement(this.d);
            if (andIncrement <= 0) {
                if (andIncrement < 0) {
                    asgs asgsVar = (asgs) this.a.a;
                    long b = this.f.b();
                    long j = b / asgr.f;
                    arve arveVar = this.a;
                    asgp asgpVar = asgp.a;
                    while (true) {
                        a = asen.a(asgsVar, j, asgpVar);
                        if (asfl.a(a)) {
                            break;
                        }
                        aseo b2 = asfl.b(a);
                        while (true) {
                            aseo aseoVar = (aseo) arveVar.a;
                            if (aseoVar.b >= b2.b) {
                                break;
                            }
                            if (b2.v()) {
                                if (arveVar.d(aseoVar, b2)) {
                                    if (aseoVar.t()) {
                                        aseoVar.q();
                                    }
                                } else if (b2.t()) {
                                    b2.q();
                                }
                            }
                        }
                    }
                    asgs asgsVar2 = (asgs) asfl.b(a);
                    asgsVar2.p();
                    if (asgsVar2.b <= j) {
                        int i = (int) (b % asgr.f);
                        Object a2 = asgsVar2.c.a(i).a(asgr.b);
                        if (a2 == null) {
                            int i2 = asgr.a;
                            for (int i3 = 0; i3 < i2; i3++) {
                                if (asgsVar2.c.a(i).a == asgr.c) {
                                    return;
                                }
                            }
                            if (!asgsVar2.c.a(i).d(asgr.b, asgr.d)) {
                                return;
                            }
                        } else if (a2 == asgr.e) {
                            continue;
                        } else if (a2 instanceof arvo) {
                            arvo arvoVar = (arvo) a2;
                            Object k = arvoVar.k(arnb.a, this.e);
                            if (k != null) {
                                arvoVar.a(k);
                                return;
                            }
                        } else if (a2 instanceof asgj) {
                            if (((asgj) a2).g(this, arnb.a)) {
                                return;
                            }
                        } else {
                            Objects.toString(a2);
                            throw new IllegalStateException("unexpected: ".concat(a2.toString()));
                        }
                    }
                } else {
                    return;
                }
            } else {
                e();
                throw new IllegalStateException("The number of released permits cannot be greater than 1");
            }
        }
    }
}
