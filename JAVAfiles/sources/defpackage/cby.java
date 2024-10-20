package defpackage;

import defpackage.cbm;
import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cby<E> extends cbq<E> implements List<E>, cbl {
    public static final cby a = new cby(new Object[0]);
    private final Object[] b;

    public cby(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.cbm
    public final cbm.a b() {
        return new cbu(this, null, this.b, 0);
    }

    @Override // defpackage.cbm
    public final cbm c(Object obj) {
        if (a() < 32) {
            Object[] copyOf = Arrays.copyOf(this.b, a() + 1);
            copyOf.getClass();
            copyOf[a()] = obj;
            return new cby(copyOf);
        }
        return new cbt(this.b, cca.c(obj), a() + 1, 0);
    }

    @Override // defpackage.cbm
    public final cbm d(int i, Object obj) {
        a.O(i, a());
        if (i != a()) {
            int i2 = i + 1;
            if (a() < 32) {
                Object[] objArr = new Object[a() + 1];
                aqil.K(this.b, objArr, 0, i, 6);
                aqil.y(this.b, objArr, i2, i, a());
                objArr[i] = obj;
                return new cby(objArr);
            }
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf.getClass();
            aqil.y(this.b, copyOf, i2, i, a() - 1);
            copyOf[i] = obj;
            return new cbt(copyOf, cca.c(this.b[31]), a() + 1, 0);
        }
        return c(obj);
    }

    @Override // defpackage.cbq, defpackage.cbm
    public final cbm e(Collection collection) {
        if (a() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.b, a() + collection.size());
            copyOf.getClass();
            int a2 = a();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[a2] = it.next();
                a2++;
            }
            return new cby(copyOf);
        }
        cbm.a b = b();
        b.addAll(collection);
        return b.a();
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        a.N(i, a());
        return this.b[i];
    }

    @Override // defpackage.cbm
    public final cbm h(arqr arqrVar) {
        Object[] objArr = this.b;
        int a2 = a();
        int a3 = a();
        boolean z = false;
        for (int i = 0; i < a3; i++) {
            Object obj = this.b[i];
            if (((Boolean) arqrVar.a(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    objArr.getClass();
                    z = true;
                    a2 = i;
                }
            } else if (z) {
                objArr[a2] = obj;
                a2++;
            }
        }
        if (a2 == a()) {
            return this;
        }
        if (a2 == 0) {
            return a;
        }
        return new cby(aqil.e(objArr, 0, a2));
    }

    @Override // defpackage.cbm
    public final cbm i(int i) {
        a.N(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] copyOf = Arrays.copyOf(this.b, a() - 1);
        copyOf.getClass();
        aqil.y(this.b, copyOf, i, i + 1, a());
        return new cby(copyOf);
    }

    @Override // defpackage.arnj, java.util.List
    public final int indexOf(Object obj) {
        return aqil.k(this.b, obj);
    }

    @Override // defpackage.cbm
    public final cbm j(int i, Object obj) {
        a.N(i, a());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf.getClass();
        copyOf[i] = obj;
        return new cby(copyOf);
    }

    @Override // defpackage.arnj, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (!d.F(obj, objArr[length2])) {
                    if (i2 < 0) {
                        return -1;
                    }
                    length2 = i2;
                } else {
                    return length2;
                }
            }
        }
    }

    @Override // defpackage.arnj, java.util.List
    public final ListIterator listIterator(int i) {
        a.O(i, a());
        return new cbr(this.b, i, a());
    }
}
