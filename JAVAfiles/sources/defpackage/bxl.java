package defpackage;

import defpackage.bwj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxl {
    public static final bxi a = new bxi();

    public static final arwe a(arpi arpiVar, bwj bwjVar) {
        arpiVar.get(arxm.c);
        return new bzv(bwjVar.i(), arpiVar);
    }

    public static final void b(Object obj, Object obj2, arqr arqrVar, bwj bwjVar) {
        boolean G = bwjVar.G(obj) | bwjVar.G(obj2);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new bxg(arqrVar);
            bwkVar.ad(T);
        }
    }

    public static final void c(Object obj, arqr arqrVar, bwj bwjVar) {
        boolean G = bwjVar.G(obj);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new bxg(arqrVar);
            bwjVar.B(h);
        }
    }

    public static final void d(Object[] objArr, arqr arqrVar, bwj bwjVar) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= bwjVar.G(obj);
        }
        Object h = bwjVar.h();
        if (!z && h != bwj.a.a) {
            return;
        }
        bwjVar.B(new bxg(arqrVar));
    }

    public static final void e(Object obj, Object obj2, Object obj3, arqv arqvVar, bwj bwjVar) {
        arpi i = bwjVar.i();
        boolean G = bwjVar.G(obj) | bwjVar.G(obj2) | bwjVar.G(obj3);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new bxz(i, arqvVar);
            bwkVar.ad(T);
        }
    }

    public static final void f(Object obj, Object obj2, arqv arqvVar, bwj bwjVar) {
        arpi i = bwjVar.i();
        boolean G = bwjVar.G(obj) | bwjVar.G(obj2);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new bxz(i, arqvVar);
            bwjVar.B(h);
        }
    }

    public static final void g(Object obj, arqv arqvVar, bwj bwjVar) {
        arpi i = bwjVar.i();
        boolean G = bwjVar.G(obj);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new bxz(i, arqvVar);
            bwjVar.B(h);
        }
    }

    public static final void h(arqg arqgVar, bwj bwjVar) {
        bwjVar.u(arqgVar);
    }
}
