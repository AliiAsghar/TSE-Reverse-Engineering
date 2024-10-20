package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arvp extends arwq implements arvo, arpt, arys {
    public final arpe a;
    public final arpi b;
    public final arvc c;
    public final arve d;
    private final arve f;

    public arvp(arpe arpeVar, int i) {
        super(i);
        this.a = arpeVar;
        boolean z = arwh.a;
        this.b = arpeVar.u();
        this.c = new arvc(536870911, arvf.a);
        this.d = new arve(arvh.a, arvf.a);
        this.f = new arve(null, arvf.a);
    }

    private final arwu K() {
        arwu u;
        arxm arxmVar = (arxm) this.b.get(arxm.c);
        if (arxmVar != null) {
            u = arwi.u(arxmVar, true, new arvs(this));
            this.f.d(null, u);
            return u;
        }
        return null;
    }

    private final void L(int i) {
        int i2;
        boolean z;
        do {
            i2 = this.c.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z2 = arwh.a;
                    arpe s = s();
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && (s instanceof aset) && d.A(i) == d.A(this.e)) {
                        aset asetVar = (aset) s;
                        arwb arwbVar = asetVar.a;
                        arpi u = asetVar.u();
                        if (!arwbVar.ey(u)) {
                            ThreadLocal threadLocal = aryl.a;
                            arwx a = aryl.a();
                            if (a.p()) {
                                a.n(this);
                                return;
                            }
                            a.o(true);
                            try {
                                arwi.j(this, s(), true);
                                do {
                                } while (a.r());
                                return;
                            } catch (Throwable th) {
                                try {
                                    J(th);
                                    return;
                                } finally {
                                    a.m(true);
                                }
                            }
                        }
                        arwbVar.a(u, this);
                        return;
                    }
                    arwi.j(this, s, z);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.c.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void M(Object obj, Object obj2) {
        throw new IllegalStateException(a.cd(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object N(arye aryeVar, Object obj, int i, arqw arqwVar) {
        arqw arqwVar2;
        if (obj instanceof arvx) {
            boolean z = arwh.a;
            return obj;
        }
        if (d.A(i)) {
            arvn arvnVar = null;
            if (arqwVar == null) {
                if (aryeVar instanceof arvn) {
                    arqwVar2 = null;
                } else {
                    return obj;
                }
            } else {
                arqwVar2 = arqwVar;
            }
            if (aryeVar instanceof arvn) {
                arvnVar = (arvn) aryeVar;
            }
            return new arvw(obj, arvnVar, arqwVar2, null, 16);
        }
        return obj;
    }

    private final void O(aseo aseoVar) {
        int i = this.c.b & 536870911;
        if (i != 536870911) {
            try {
                aseoVar.l(i);
                return;
            } catch (Throwable th) {
                arpi arpiVar = this.b;
                toString();
                arro.m(arpiVar, new arvy("Exception in invokeOnCancellation handler for ".concat(toString()), th));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final void A() {
        arwu K = K();
        if (K != null && j()) {
            K.hd();
            this.f.c(aryd.a);
        }
    }

    public final void B(Object obj) {
        boolean z = arwh.a;
        while (true) {
            Object obj2 = this.d.a;
            if (obj2 instanceof arvh) {
                if (this.d.d(obj2, obj)) {
                    return;
                }
            } else if (!(obj2 instanceof arvn) && !(obj2 instanceof aseo)) {
                Throwable th = null;
                if (obj2 instanceof arvx) {
                    arvx arvxVar = (arvx) obj2;
                    if (!arvxVar.a()) {
                        M(obj, obj2);
                    }
                    if (obj2 instanceof arvr) {
                        if (arvxVar != null) {
                            th = arvxVar.b;
                        }
                        if (obj instanceof arvn) {
                            v((arvn) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            O((aseo) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof arvw) {
                    arvw arvwVar = (arvw) obj2;
                    if (arvwVar.b != null) {
                        M(obj, obj2);
                    }
                    if (!(obj instanceof aseo)) {
                        obj.getClass();
                        arvn arvnVar = (arvn) obj;
                        if (arvwVar.a()) {
                            v(arvnVar, arvwVar.e);
                            return;
                        } else {
                            if (this.d.d(obj2, arvw.b(arvwVar, arvnVar, null, 29))) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if (!(obj instanceof aseo)) {
                    obj.getClass();
                    if (this.d.d(obj2, new arvw(obj2, (arvn) obj, null, null, 28))) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                M(obj, obj2);
            }
        }
    }

    public final void C() {
        aset asetVar;
        arpe arpeVar = this.a;
        Throwable th = null;
        if (arpeVar instanceof aset) {
            asetVar = (aset) arpeVar;
        } else {
            asetVar = null;
        }
        if (asetVar == null) {
            return;
        }
        while (true) {
            Object obj = asetVar.f.a;
            asfn asfnVar = aseu.b;
            if (obj == asfnVar) {
                if (asetVar.f.d(asfnVar, this)) {
                    break;
                }
            } else if (obj instanceof Throwable) {
                if (asetVar.f.d(obj, null)) {
                    th = (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                Objects.toString(obj);
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
            }
        }
        if (th != null) {
            y();
            h(th);
        }
    }

    public final void D(Object obj, int i, arqw arqwVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (obj2 instanceof arye) {
            } else {
                if (obj2 instanceof arvr) {
                    arvr arvrVar = (arvr) obj2;
                    if (arvrVar.a.a(false, true)) {
                        if (arqwVar != null) {
                            x(arqwVar, arvrVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!this.d.d(obj2, N((arye) obj2, obj, i, arqwVar)));
        z();
        L(i);
    }

    public final boolean E() {
        if (this.e == 2 && ((aset) this.a).f.a != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arys
    public final void F(aseo aseoVar, int i) {
        arvc arvcVar;
        int i2;
        do {
            arvcVar = this.c;
            i2 = arvcVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!arvcVar.c(i2, ((i2 >> 29) << 29) + i));
        B(aseoVar);
    }

    @Override // defpackage.arwq
    public final void G(Throwable th) {
        while (true) {
            Object obj = this.d.a;
            if (!(obj instanceof arye)) {
                if (!(obj instanceof arvx)) {
                    if (obj instanceof arvw) {
                        arvw arvwVar = (arvw) obj;
                        if (!arvwVar.a()) {
                            if (this.d.d(obj, arvw.b(arvwVar, null, th, 15))) {
                                arvn arvnVar = arvwVar.b;
                                if (arvnVar != null) {
                                    v(arvnVar, th);
                                }
                                arqw arqwVar = arvwVar.c;
                                if (arqwVar != null) {
                                    x(arqwVar, th, arvwVar.a);
                                    return;
                                }
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        if (this.d.d(obj, new arvw(obj, null, null, th, 14))) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    public final asfn I(Object obj, arqw arqwVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (obj2 instanceof arye) {
            } else {
                return null;
            }
        } while (!this.d.d(obj2, N((arye) obj2, obj, this.e, arqwVar)));
        z();
        return arvq.a;
    }

    @Override // defpackage.arvo
    public final void a(Object obj) {
        boolean z = arwh.a;
        L(this.e);
    }

    @Override // defpackage.arvo
    public final void d(arqr arqrVar) {
        B(new arvm(arqrVar, 0));
    }

    @Override // defpackage.arpt
    public final arpt dJ() {
        arpe arpeVar = this.a;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    @Override // defpackage.arvo
    public final void e(Object obj, arqr arqrVar) {
        aeyj aeyjVar;
        int i = this.e;
        if (arqrVar != null) {
            aeyjVar = new aeyj(arqrVar, 7);
        } else {
            aeyjVar = null;
        }
        D(obj, i, aeyjVar);
    }

    @Override // defpackage.arvo
    public final void f(Object obj, arqw arqwVar) {
        D(obj, this.e, null);
    }

    @Override // defpackage.arvo
    public final void g(arwb arwbVar, Object obj) {
        aset asetVar;
        int i;
        arpe arpeVar = this.a;
        arwb arwbVar2 = null;
        if (arpeVar instanceof aset) {
            asetVar = (aset) arpeVar;
        } else {
            asetVar = null;
        }
        if (asetVar != null) {
            arwbVar2 = asetVar.a;
        }
        if (arwbVar2 == arwbVar) {
            i = 4;
        } else {
            i = this.e;
        }
        D(obj, i, null);
    }

    @Override // defpackage.arvo
    public final boolean h(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this.d.a;
            z = false;
            if (!(obj instanceof arye)) {
                return false;
            }
            if ((obj instanceof arvn) || (obj instanceof aseo)) {
                z = true;
            }
        } while (!this.d.d(obj, new arvr(this, th, z)));
        arye aryeVar = (arye) obj;
        if (aryeVar instanceof arvn) {
            v((arvn) obj, th);
        } else if (aryeVar instanceof aseo) {
            O((aseo) obj);
        }
        z();
        L(this.e);
        return true;
    }

    @Override // defpackage.arvo
    public final boolean i() {
        return m() instanceof arye;
    }

    @Override // defpackage.arvo
    public final boolean j() {
        if (!(m() instanceof arye)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arvo
    public final Object k(Object obj, arqw arqwVar) {
        return I(obj, arqwVar);
    }

    public final Object l() {
        int i;
        arxm arxmVar;
        boolean E = E();
        do {
            i = this.c.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (E) {
                        C();
                    }
                    Object m = m();
                    if (m instanceof arvx) {
                        Throwable th = ((arvx) m).b;
                        if (arwh.b) {
                            throw asfm.a(th, this);
                        }
                        throw th;
                    }
                    if (d.A(this.e) && (arxmVar = (arxm) this.b.get(arxm.c)) != null && !arxmVar.x()) {
                        CancellationException r = arxmVar.r();
                        G(r);
                        if (arwh.b) {
                            throw asfm.a(r, this);
                        }
                        throw r;
                    }
                    return n(m);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!this.c.c(i, (536870911 & i) + 536870912));
        if (t() == null) {
            K();
        }
        if (E) {
            C();
        }
        return arpl.a;
    }

    public final Object m() {
        return this.d.a;
    }

    @Override // defpackage.arwq
    public final Object n(Object obj) {
        if (obj instanceof arvw) {
            return ((arvw) obj).a;
        }
        return obj;
    }

    @Override // defpackage.arwq
    public final Object o() {
        return m();
    }

    protected String p() {
        return "CancellableContinuation";
    }

    public Throwable q(arxm arxmVar) {
        return arxmVar.r();
    }

    @Override // defpackage.arwq
    public final Throwable r(Object obj) {
        Throwable r = super.r(obj);
        if (r != null) {
            arpe arpeVar = this.a;
            if (arwh.b && (arpeVar instanceof arpt)) {
                return asfm.a(r, (arpt) arpeVar);
            }
            return r;
        }
        return null;
    }

    @Override // defpackage.arwq
    public final arpe s() {
        return this.a;
    }

    public final arwu t() {
        return (arwu) this.f.a;
    }

    public final String toString() {
        String str;
        String c = arwi.c(this.a);
        Object m = m();
        if (m instanceof arye) {
            str = "Active";
        } else if (m instanceof arvr) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        return p() + "(" + c + "){" + str + "}@" + arwi.b(this);
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.b;
    }

    public final void v(arvn arvnVar, Throwable th) {
        try {
            arvnVar.b(th);
        } catch (Throwable th2) {
            arpi arpiVar = this.b;
            toString();
            arro.m(arpiVar, new arvy("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        Throwable c = armq.c(obj);
        if (c != null) {
            if (arwh.b) {
                c = asfm.a(c, this);
            }
            obj = new arvx(c);
        }
        D(obj, this.e, null);
    }

    public final void x(arqw arqwVar, Throwable th, Object obj) {
        try {
            arqwVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            arpi arpiVar = this.b;
            toString();
            arro.m(arpiVar, new arvy("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void y() {
        arwu t = t();
        if (t == null) {
            return;
        }
        t.hd();
        this.f.c(aryd.a);
    }

    public final void z() {
        if (!E()) {
            y();
        }
    }

    @Override // defpackage.arpt
    public final void dK() {
    }
}
