package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozh {
    public int a;
    public int b;
    public int c;
    public final Object d;

    public aozh(View view) {
        this.d = view;
    }

    private final void S(Object obj, apcj apcjVar, aozs aozsVar) {
        int i = this.b;
        this.b = apdh.c(apdh.a(this.a), 4);
        try {
            apcjVar.l(obj, this, aozsVar);
            if (this.a == this.b) {
            } else {
                throw new apba("Failed to parse the message.");
            }
        } finally {
            this.b = i;
        }
    }

    private final void T(Object obj, apcj apcjVar, aozs aozsVar) {
        aozg aozgVar = (aozg) this.d;
        int n = aozgVar.n();
        if (aozgVar.a < aozgVar.b) {
            int e = aozgVar.e(n);
            ((aozg) this.d).a++;
            apcjVar.l(obj, this, aozsVar);
            ((aozg) this.d).z(0);
            r5.a--;
            ((aozg) this.d).A(e);
            return;
        }
        throw new apba("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void U(int i) {
        if (((aozg) this.d).d() == i) {
        } else {
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void V(int i) {
        if ((i & 3) == 0) {
        } else {
            throw new apba("Failed to parse the message.");
        }
    }

    private static final void W(int i) {
        if ((i & 7) == 0) {
        } else {
            throw new apba("Failed to parse the message.");
        }
    }

    public static aozh p(aozg aozgVar) {
        aozh aozhVar = aozgVar.d;
        if (aozhVar != null) {
            return aozhVar;
        }
        return new aozh(aozgVar);
    }

    public final void A(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apahVar.g(((aozg) this.d).f());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apahVar.g(((aozg) this.d).f());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Integer.valueOf(((aozg) this.d).f()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Integer.valueOf(((aozg) this.d).f()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void B(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new apaz();
                }
                do {
                    apahVar.g(((aozg) this.d).g());
                    if (!((aozg) this.d).C()) {
                        i = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((aozg) this.d).n();
                V(n);
                int d = ((aozg) this.d).d() + n;
                do {
                    apahVar.g(((aozg) this.d).g());
                } while (((aozg) this.d).d() < d);
                return;
            }
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new apaz();
                }
                do {
                    list.add(Integer.valueOf(((aozg) this.d).g()));
                    if (!((aozg) this.d).C()) {
                        m = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((aozg) this.d).n();
                V(n2);
                int d2 = ((aozg) this.d).d() + n2;
                do {
                    list.add(Integer.valueOf(((aozg) this.d).g()));
                } while (((aozg) this.d).d() < d2);
                return;
            }
        }
        this.c = i;
    }

    public final void C(List list) {
        int m;
        int i;
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            int b = apdh.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((aozg) this.d).n();
                    W(n);
                    int d = ((aozg) this.d).d() + n;
                    do {
                        apbkVar.f(((aozg) this.d).o());
                    } while (((aozg) this.d).d() < d);
                    return;
                }
                throw new apaz();
            }
            do {
                apbkVar.f(((aozg) this.d).o());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((aozg) this.d).n();
                    W(n2);
                    int d2 = ((aozg) this.d).d() + n2;
                    do {
                        list.add(Long.valueOf(((aozg) this.d).o()));
                    } while (((aozg) this.d).d() < d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Long.valueOf(((aozg) this.d).o()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void D(List list) {
        int m;
        int i;
        if (list instanceof aozw) {
            aozw aozwVar = (aozw) list;
            int b = apdh.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new apaz();
                }
                do {
                    aozwVar.g(((aozg) this.d).c());
                    if (!((aozg) this.d).C()) {
                        i = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((aozg) this.d).n();
                V(n);
                int d = ((aozg) this.d).d() + n;
                do {
                    aozwVar.g(((aozg) this.d).c());
                } while (((aozg) this.d).d() < d);
                return;
            }
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new apaz();
                }
                do {
                    list.add(Float.valueOf(((aozg) this.d).c()));
                    if (!((aozg) this.d).C()) {
                        m = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((aozg) this.d).n();
                V(n2);
                int d2 = ((aozg) this.d).d() + n2;
                do {
                    list.add(Float.valueOf(((aozg) this.d).c()));
                } while (((aozg) this.d).d() < d2);
                return;
            }
        }
        this.c = i;
    }

    public final void E(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apahVar.g(((aozg) this.d).h());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apahVar.g(((aozg) this.d).h());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Integer.valueOf(((aozg) this.d).h()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Integer.valueOf(((aozg) this.d).h()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void F(List list) {
        int m;
        int i;
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apbkVar.f(((aozg) this.d).p());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apbkVar.f(((aozg) this.d).p());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Long.valueOf(((aozg) this.d).p()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Long.valueOf(((aozg) this.d).p()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void G(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new apaz();
                }
                do {
                    apahVar.g(((aozg) this.d).k());
                    if (!((aozg) this.d).C()) {
                        i = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((aozg) this.d).n();
                V(n);
                int d = ((aozg) this.d).d() + n;
                do {
                    apahVar.g(((aozg) this.d).k());
                } while (((aozg) this.d).d() < d);
                return;
            }
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new apaz();
                }
                do {
                    list.add(Integer.valueOf(((aozg) this.d).k()));
                    if (!((aozg) this.d).C()) {
                        m = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((aozg) this.d).n();
                V(n2);
                int d2 = ((aozg) this.d).d() + n2;
                do {
                    list.add(Integer.valueOf(((aozg) this.d).k()));
                } while (((aozg) this.d).d() < d2);
                return;
            }
        }
        this.c = i;
    }

    public final void H(List list) {
        int m;
        int i;
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            int b = apdh.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((aozg) this.d).n();
                    W(n);
                    int d = ((aozg) this.d).d() + n;
                    do {
                        apbkVar.f(((aozg) this.d).t());
                    } while (((aozg) this.d).d() < d);
                    return;
                }
                throw new apaz();
            }
            do {
                apbkVar.f(((aozg) this.d).t());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((aozg) this.d).n();
                    W(n2);
                    int d2 = ((aozg) this.d).d() + n2;
                    do {
                        list.add(Long.valueOf(((aozg) this.d).t()));
                    } while (((aozg) this.d).d() < d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Long.valueOf(((aozg) this.d).t()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void I(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apahVar.g(((aozg) this.d).l());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apahVar.g(((aozg) this.d).l());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Integer.valueOf(((aozg) this.d).l()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Integer.valueOf(((aozg) this.d).l()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void J(List list) {
        int m;
        int i;
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apbkVar.f(((aozg) this.d).u());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apbkVar.f(((aozg) this.d).u());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Long.valueOf(((aozg) this.d).u()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Long.valueOf(((aozg) this.d).u()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void K(List list, boolean z) {
        String u;
        int m;
        int i;
        if (apdh.b(this.a) == 2) {
            if ((list instanceof apbh) && !z) {
                apbh apbhVar = (apbh) list;
                do {
                    o();
                    apbhVar.b();
                    if (!((aozg) this.d).C()) {
                        i = ((aozg) this.d).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                do {
                    if (z) {
                        u = v();
                    } else {
                        u = u();
                    }
                    list.add(u);
                    if (((aozg) this.d).C()) {
                        return;
                    } else {
                        m = ((aozg) this.d).m();
                    }
                } while (m == this.a);
                i = m;
            }
            this.c = i;
            return;
        }
        throw new apaz();
    }

    public final void L(List list) {
        int m;
        int i;
        if (list instanceof apah) {
            apah apahVar = (apah) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apahVar.g(((aozg) this.d).n());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apahVar.g(((aozg) this.d).n());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Integer.valueOf(((aozg) this.d).n()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Integer.valueOf(((aozg) this.d).n()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void M(List list) {
        int m;
        int i;
        if (list instanceof apbk) {
            apbk apbkVar = (apbk) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        apbkVar.f(((aozg) this.d).v());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                apbkVar.f(((aozg) this.d).v());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Long.valueOf(((aozg) this.d).v()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Long.valueOf(((aozg) this.d).v()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void N(int i) {
        if (apdh.b(this.a) == i) {
        } else {
            throw new apaz();
        }
    }

    public final boolean O() {
        N(0);
        return ((aozg) this.d).D();
    }

    public final boolean P() {
        int i;
        if (!((aozg) this.d).C() && (i = this.a) != this.b) {
            return ((aozg) this.d).E(i);
        }
        return false;
    }

    public final void Q() {
        View view = (View) this.d;
        int top = this.a - (view.getTop() - this.c);
        int[] iArr = eek.a;
        view.offsetTopAndBottom(top);
        View view2 = (View) this.d;
        view2.offsetLeftAndRight(-(view2.getLeft() - this.b));
    }

    public final boolean R(int i) {
        if (this.a != i) {
            this.a = i;
            Q();
            return true;
        }
        return false;
    }

    public final double a() {
        N(1);
        return ((aozg) this.d).b();
    }

    public final float b() {
        N(5);
        return ((aozg) this.d).c();
    }

    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            i = ((aozg) this.d).m();
            this.a = i;
        }
        if (i != 0 && i != this.b) {
            return apdh.a(i);
        }
        return Integer.MAX_VALUE;
    }

    public final int d() {
        N(0);
        return ((aozg) this.d).f();
    }

    public final int e() {
        N(5);
        return ((aozg) this.d).g();
    }

    public final int f() {
        N(0);
        return ((aozg) this.d).h();
    }

    public final int g() {
        N(5);
        return ((aozg) this.d).k();
    }

    public final int h() {
        N(0);
        return ((aozg) this.d).l();
    }

    public final int i() {
        N(0);
        return ((aozg) this.d).n();
    }

    public final long j() {
        N(1);
        return ((aozg) this.d).o();
    }

    public final long k() {
        N(0);
        return ((aozg) this.d).p();
    }

    public final long l() {
        N(1);
        return ((aozg) this.d).t();
    }

    public final long m() {
        N(0);
        return ((aozg) this.d).u();
    }

    public final long n() {
        N(0);
        return ((aozg) this.d).v();
    }

    public final aozb o() {
        N(2);
        return ((aozg) this.d).w();
    }

    public final Object q(apdf apdfVar, Class cls, aozs aozsVar) {
        apdf apdfVar2 = apdf.DOUBLE;
        switch (apdfVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(O());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return t(cls, aozsVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object r(apcj apcjVar, aozs aozsVar) {
        Object e = apcjVar.e();
        S(e, apcjVar, aozsVar);
        apcjVar.g(e);
        return e;
    }

    public final Object s(apcj apcjVar, aozs aozsVar) {
        Object e = apcjVar.e();
        T(e, apcjVar, aozsVar);
        apcjVar.g(e);
        return e;
    }

    public final Object t(Class cls, aozs aozsVar) {
        N(2);
        return s(apcc.a.a(cls), aozsVar);
    }

    public final String u() {
        N(2);
        return ((aozg) this.d).x();
    }

    public final String v() {
        N(2);
        return ((aozg) this.d).y();
    }

    public final void w(Object obj, apcj apcjVar, aozs aozsVar) {
        N(3);
        S(obj, apcjVar, aozsVar);
    }

    public final void x(Object obj, apcj apcjVar, aozs aozsVar) {
        N(2);
        T(obj, apcjVar, aozsVar);
    }

    public final void y(List list) {
        int m;
        int i;
        if (list instanceof aoys) {
            aoys aoysVar = (aoys) list;
            int b = apdh.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    aozg aozgVar = (aozg) this.d;
                    int d = aozgVar.d() + aozgVar.n();
                    do {
                        aoysVar.f(((aozg) this.d).D());
                    } while (((aozg) this.d).d() < d);
                    U(d);
                    return;
                }
                throw new apaz();
            }
            do {
                aoysVar.f(((aozg) this.d).D());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    aozg aozgVar2 = (aozg) this.d;
                    int d2 = aozgVar2.d() + aozgVar2.n();
                    do {
                        list.add(Boolean.valueOf(((aozg) this.d).D()));
                    } while (((aozg) this.d).d() < d2);
                    U(d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Boolean.valueOf(((aozg) this.d).D()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    public final void z(List list) {
        int m;
        int i;
        if (list instanceof aozm) {
            aozm aozmVar = (aozm) list;
            int b = apdh.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((aozg) this.d).n();
                    W(n);
                    int d = ((aozg) this.d).d() + n;
                    do {
                        aozmVar.g(((aozg) this.d).b());
                    } while (((aozg) this.d).d() < d);
                    return;
                }
                throw new apaz();
            }
            do {
                aozmVar.g(((aozg) this.d).b());
                if (!((aozg) this.d).C()) {
                    i = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = apdh.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((aozg) this.d).n();
                    W(n2);
                    int d2 = ((aozg) this.d).d() + n2;
                    do {
                        list.add(Double.valueOf(((aozg) this.d).b()));
                    } while (((aozg) this.d).d() < d2);
                    return;
                }
                throw new apaz();
            }
            do {
                list.add(Double.valueOf(((aozg) this.d).b()));
                if (!((aozg) this.d).C()) {
                    m = ((aozg) this.d).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.c = i;
    }

    private aozh(aozg aozgVar) {
        this.c = 0;
        d.aB(aozgVar, "input");
        this.d = aozgVar;
        aozgVar.d = this;
    }
}
