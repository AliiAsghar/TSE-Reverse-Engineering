package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atix {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                ArrayList arrayList = this.a;
                Object obj2 = arrayList.get(0);
                Object obj3 = arrayList.get(1);
                if (obj2 != null) {
                    if (obj2 == obj3 || obj3 == null) {
                        obj = obj2;
                    }
                } else {
                    obj = obj3;
                }
            }
            if (obj == null) {
                obj = new atik(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final void H(atjf atjfVar) {
        if (atjfVar != null) {
        } else {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (!(obj instanceof atje)) {
            return false;
        }
        if ((obj instanceof atik) && ((atik) obj).b == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append((char) 65533);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(atfy.t, i, 2);
    }

    public final void B(int i) {
        n(atfy.h, i, 2);
    }

    public final void C(int i) {
        n(atfy.v, i, 2);
    }

    public final void D(int i) {
        n(atfy.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(atfy.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(atfy.f, i, i2);
    }

    public final atii a() {
        atjg atjgVar;
        Object G = G();
        atje atjeVar = null;
        if ((G instanceof atjg) && (!(G instanceof atik) || ((atik) G).a != null)) {
            atjgVar = (atjg) G;
        } else {
            atjgVar = null;
        }
        if (I(G)) {
            atjeVar = (atje) G;
        }
        if (atjgVar == null && atjeVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new atii(atjgVar, atjeVar);
    }

    public final atjf e() {
        Object G = G();
        if (I(G)) {
            return atjf.b((atje) G);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void g(atjg atjgVar, atje atjeVar) {
        this.b = null;
        this.a.add(atjgVar);
        this.a.add(atjeVar);
    }

    public final void h(atfy atfyVar) {
        f(new atir(atfyVar, true));
    }

    public final void i(atfy atfyVar) {
        f(new atir(atfyVar, false));
    }

    public final void j(boolean z) {
        f(new atiu(null, "Z", z, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, atjg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [atje, java.lang.Object] */
    public final void k(atii atiiVar) {
        if (atiiVar != null) {
            g(atiiVar.a, atiiVar.b);
            return;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public final void l(atjf atjfVar) {
        H(atjfVar);
        g(null, atjb.b(atjfVar));
    }

    public final void m(atjf[] atjfVarArr) {
        int length = atjfVarArr.length;
        atje[] atjeVarArr = new atje[length];
        int i = 0;
        while (i < length - 1) {
            atje b = atjb.b(atjfVarArr[i]);
            atjeVarArr[i] = b;
            if (b != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }
        atjeVarArr[i] = atjb.b(atjfVarArr[i]);
        g(null, new atin(atjeVarArr));
    }

    public final void n(atfy atfyVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new atiw(atfyVar, i2, false));
                    return;
                } else {
                    f(new atip(atfyVar, i2, false, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(atfy atfyVar, int i) {
        f(new atil(atfyVar, i));
    }

    public final void p(atfy atfyVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                f(new atim(atfyVar, i, i2));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        f(new atij(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new atiq(str));
            } else {
                f(new atij(str.charAt(0)));
            }
        }
    }

    public final void s(atjf atjfVar) {
        H(atjfVar);
        g(null, new atin(new atje[]{atjb.b(atjfVar), null}));
    }

    public final void t(atfy atfyVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new atiw(atfyVar, i2, true));
                    return;
                } else {
                    f(new atip(atfyVar, i2, true, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String str, boolean z, int i) {
        f(new atiu(str, str, z, i));
    }

    public final void v(int i) {
        n(atfy.i, i, 2);
    }

    public final void w(int i) {
        n(atfy.m, i, 1);
    }

    public final void x(int i) {
        n(atfy.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(atfy.u, i, i2);
    }

    public final void z(int i) {
        n(atfy.r, i, 2);
    }
}
