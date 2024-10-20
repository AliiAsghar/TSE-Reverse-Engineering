package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt<E> extends cbq<E> implements List<E>, cbm {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public cbt(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            byy.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return cca.b(this.c);
    }

    private final cbm m(Object[] objArr, int i, int i2, int i3) {
        cbt cbtVar;
        int i4 = this.c - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    objArr.getClass();
                }
                return new cby(objArr);
            }
            cbs cbsVar = new cbs(null);
            Object[] q = q(objArr, i2, i - 1, cbsVar);
            q.getClass();
            Object obj = cbsVar.a;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (q[1] == null) {
                Object obj2 = q[0];
                obj2.getClass();
                cbtVar = new cbt((Object[]) obj2, objArr2, i, i2 - 5);
            } else {
                cbtVar = new cbt(q, objArr2, i, i2);
            }
            return cbtVar;
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        int i5 = i4 - 1;
        if (i3 < i5) {
            aqil.y(this.b, copyOf, i3, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new cbt(objArr, copyOf, (i + i4) - 1, i2);
    }

    private final cbt n(Object[] objArr, int i, Object obj) {
        int l = this.c - l();
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        int i2 = i + 1;
        if (l < 32) {
            aqil.y(this.b, copyOf, i2, i, l);
            copyOf[i] = obj;
            return new cbt(objArr, copyOf, this.c + 1, this.d);
        }
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[31];
        aqil.y(objArr2, copyOf, i2, i, l - 1);
        copyOf[i] = obj;
        return o(objArr, copyOf, cca.c(obj2));
    }

    private final cbt o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = this.d;
        if ((i >> 5) > (1 << i2)) {
            Object[] c = cca.c(objArr);
            int i3 = this.d + 5;
            return new cbt(r(c, i3, objArr2), objArr3, this.c + 1, i3);
        }
        return new cbt(r(objArr, i2, objArr2), objArr3, this.c + 1, this.d);
    }

    private final Object[] p(Object[] objArr, int i, int i2, Object obj, cbs cbsVar) {
        Object[] copyOf;
        int a = cca.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            aqil.y(objArr, copyOf, a + 1, a, 31);
            cbsVar.a = objArr[31];
            copyOf[a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[a];
        obj2.getClass();
        copyOf2[a] = p((Object[]) obj2, i3, i2, obj, cbsVar);
        while (true) {
            a++;
            if (a >= 32 || copyOf2[a] == null) {
                break;
            }
            Object obj3 = objArr[a];
            obj3.getClass();
            copyOf2[a] = p((Object[]) obj3, i3, 0, cbsVar.a, cbsVar);
        }
        return copyOf2;
    }

    private final Object[] q(Object[] objArr, int i, int i2, cbs cbsVar) {
        Object[] q;
        int a = cca.a(i2, i);
        if (i == 5) {
            cbsVar.a = objArr[a];
            q = null;
        } else {
            Object obj = objArr[a];
            obj.getClass();
            q = q((Object[]) obj, i - 5, i2, cbsVar);
        }
        if (q == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        copyOf[a] = q;
        return copyOf;
    }

    private final Object[] r(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            objArr3.getClass();
        } else {
            objArr3 = new Object[32];
        }
        int a = cca.a(this.c - 1, i);
        if (i == 5) {
            objArr3[a] = objArr2;
        } else {
            objArr3[a] = r((Object[]) objArr3[a], i - 5, objArr2);
        }
        return objArr3;
    }

    private final Object[] s(Object[] objArr, int i, int i2, cbs cbsVar) {
        Object[] copyOf;
        int a = cca.a(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            aqil.y(objArr, copyOf, a, a + 1, 32);
            copyOf[31] = cbsVar.a;
            cbsVar.a = objArr[a];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = cca.a(l() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i4 = i - 5;
        int i5 = a + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = s((Object[]) obj, i4, 0, cbsVar);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[a];
        obj2.getClass();
        copyOf2[a] = s((Object[]) obj2, i4, i2, cbsVar);
        return copyOf2;
    }

    private final Object[] t(Object[] objArr, int i, int i2, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        int a = cca.a(i2, i);
        if (i == 0) {
            copyOf[a] = obj;
        } else {
            Object obj2 = copyOf[a];
            obj2.getClass();
            copyOf[a] = t((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cbm
    public final cbm c(Object obj) {
        int l = this.c - l();
        if (l < 32) {
            Object[] copyOf = Arrays.copyOf(this.b, 32);
            copyOf.getClass();
            copyOf[l] = obj;
            return new cbt(this.a, copyOf, this.c + 1, this.d);
        }
        return o(this.a, this.b, cca.c(obj));
    }

    @Override // defpackage.cbm
    public final cbm d(int i, Object obj) {
        a.O(i, this.c);
        if (i == this.c) {
            return c(obj);
        }
        int l = l();
        if (i >= l) {
            return n(this.a, i - l, obj);
        }
        cbs cbsVar = new cbs(null);
        return n(p(this.a, this.d, i, obj, cbsVar), 0, cbsVar.a);
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        a.N(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[cca.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.cbm
    public final cbm h(arqr arqrVar) {
        cbu b = b();
        b.e(arqrVar);
        return b.a();
    }

    @Override // defpackage.cbm
    public final cbm i(int i) {
        a.N(i, this.c);
        int l = l();
        if (i >= l) {
            return m(this.a, l, this.d, i - l);
        }
        return m(s(this.a, this.d, i, new cbs(this.b[0])), l, this.d, 0);
    }

    @Override // defpackage.cbm
    public final cbm j(int i, Object obj) {
        a.N(i, this.c);
        if (l() <= i) {
            Object[] copyOf = Arrays.copyOf(this.b, 32);
            copyOf.getClass();
            copyOf[i & 31] = obj;
            return new cbt(this.a, copyOf, this.c, this.d);
        }
        return new cbt(t(this.a, this.d, i, obj), this.b, this.c, this.d);
    }

    @Override // defpackage.cbm
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final cbu b() {
        return new cbu(this, this.a, this.b, this.d);
    }

    @Override // defpackage.arnj, java.util.List
    public final ListIterator listIterator(int i) {
        a.O(i, this.c);
        int i2 = this.d / 5;
        return new cbv(this.a, this.b, i, this.c, i2 + 1);
    }
}
