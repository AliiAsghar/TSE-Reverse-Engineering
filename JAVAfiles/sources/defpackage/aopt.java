package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopt extends aoon {
    static final aopt a = new aopt();

    private aopt() {
    }

    public static final aood e(aoro aoroVar) {
        String str;
        aood aoodVar;
        int t = aoroVar.t();
        aood g = g(aoroVar, t);
        if (g == null) {
            return f(aoroVar, t);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aoroVar.r()) {
                if (g instanceof aoog) {
                    str = aoroVar.h();
                } else {
                    str = null;
                }
                int t2 = aoroVar.t();
                aood g2 = g(aoroVar, t2);
                if (g2 == null) {
                    aoodVar = f(aoroVar, t2);
                } else {
                    aoodVar = g2;
                }
                if (g instanceof aooa) {
                    ((aooa) g).a.add(aoodVar);
                } else {
                    ((aoog) g).e(str, aoodVar);
                }
                if (g2 != null) {
                    arrayDeque.addLast(g);
                    g = aoodVar;
                }
            } else {
                if (g instanceof aooa) {
                    aoroVar.n();
                } else {
                    aoroVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return g;
                }
                g = (aood) arrayDeque.removeLast();
            }
        }
    }

    private static final aood f(aoro aoroVar, int i) {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        aoroVar.p();
                        return aoof.a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(d.C(i)));
                }
                return new aooi(Boolean.valueOf(aoroVar.s()));
            }
            return new aooi(new aopb(aoroVar.j()));
        }
        return new aooi(aoroVar.j());
    }

    private static final aood g(aoro aoroVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                return null;
            }
            aoroVar.m();
            return new aoog();
        }
        aoroVar.l();
        return new aooa();
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        return e(aoroVar);
    }

    @Override // defpackage.aoon
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(aorp aorpVar, aood aoodVar) {
        boolean parseBoolean;
        if (aoodVar != null && !(aoodVar instanceof aoof)) {
            if (aoodVar instanceof aooi) {
                aooi aooiVar = (aooi) aoodVar;
                if (aooiVar.i()) {
                    aorpVar.l(aooiVar.e());
                    return;
                }
                if (aooiVar.h()) {
                    if (aooiVar.h()) {
                        parseBoolean = ((Boolean) aooiVar.a).booleanValue();
                    } else {
                        parseBoolean = Boolean.parseBoolean(aooiVar.a());
                    }
                    aorpVar.n(parseBoolean);
                    return;
                }
                aorpVar.m(aooiVar.a());
                return;
            }
            if (aoodVar instanceof aooa) {
                aorpVar.e();
                Iterator<aood> it = aoodVar.b().iterator();
                while (it.hasNext()) {
                    b(aorpVar, it.next());
                }
                aorpVar.g();
                return;
            }
            if (aoodVar instanceof aoog) {
                aorpVar.f();
                aopc aopcVar = new aopc((aopd) aoodVar.c().a.entrySet());
                while (aopcVar.hasNext()) {
                    aoph a2 = aopcVar.a();
                    aorpVar.i((String) a2.f);
                    b(aorpVar, (aood) a2.h);
                }
                aorpVar.h();
                return;
            }
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(aoodVar.getClass()))));
        }
        aorpVar.j();
    }
}
