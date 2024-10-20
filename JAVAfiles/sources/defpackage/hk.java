package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hk {
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public hj f;
    public int g = 0;
    public final Class h;
    private hi i;

    public hk(Class cls, hj hjVar) {
        this.h = cls;
        this.a = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.f = hjVar;
    }

    private final int j(Object obj, Object[] objArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            Object obj2 = objArr[i4];
            int compare = this.f.compare(obj2, obj);
            if (compare < 0) {
                i = i4 + 1;
            } else {
                if (compare == 0) {
                    if (!this.f.f(obj2, obj)) {
                        int i5 = i4 - 1;
                        while (i5 >= i) {
                            Object obj3 = this.a[i5];
                            if (this.f.compare(obj3, obj) == 0) {
                                if (this.f.f(obj3, obj)) {
                                    break;
                                }
                                i5--;
                            } else {
                                break;
                            }
                        }
                        i5 = i4 + 1;
                        while (i5 < i2) {
                            Object obj4 = this.a[i5];
                            if (this.f.compare(obj4, obj) == 0) {
                                if (this.f.f(obj4, obj)) {
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        i5 = -1;
                        if (i3 == 1 && i5 == -1) {
                            return i4;
                        }
                        return i5;
                    }
                    return i4;
                }
                i2 = i4;
            }
        }
        if (i3 != 1) {
            return -1;
        }
        return i;
    }

    public final int a(Object obj) {
        h();
        return b(obj, true);
    }

    public final int b(Object obj, boolean z) {
        int j = j(obj, this.a, 0, this.g, 1);
        if (j == -1) {
            j = 0;
        } else if (j < this.g) {
            Object obj2 = this.a[j];
            if (this.f.f(obj2, obj)) {
                if (this.f.e(obj2, obj)) {
                    this.a[j] = obj;
                    return j;
                }
                this.a[j] = obj;
                hj hjVar = this.f;
                hjVar.g(obj2, obj);
                hjVar.a(j, 1, null);
                return j;
            }
        }
        int i = this.g;
        if (j <= i) {
            int i2 = j + 1;
            Object[] objArr = this.a;
            int length = objArr.length;
            if (i == length) {
                Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.h, length + 10);
                System.arraycopy(this.a, 0, objArr2, 0, j);
                objArr2[j] = obj;
                System.arraycopy(this.a, j, objArr2, i2, this.g - j);
                this.a = objArr2;
            } else {
                System.arraycopy(objArr, j, objArr, i2, i - j);
                this.a[j] = obj;
            }
            this.g++;
            if (z) {
                this.f.b(j, 1);
            }
            return j;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + j + " because size is " + this.g);
    }

    public final int c(Object obj) {
        if (this.b != null) {
            int j = j(obj, this.a, 0, this.e, 4);
            if (j != -1) {
                return j;
            }
            int j2 = j(obj, this.b, this.c, this.d, 4);
            if (j2 == -1) {
                return -1;
            }
            return (j2 - this.c) + this.e;
        }
        return j(obj, this.a, 0, this.g, 4);
    }

    public final Object d(int i) {
        int i2;
        if (i < this.g && i >= 0) {
            Object[] objArr = this.b;
            if (objArr != null && i >= (i2 = this.e)) {
                return objArr[(i - i2) + this.c];
            }
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.g);
    }

    public final void e() {
        h();
        hj hjVar = this.f;
        if (hjVar instanceof hi) {
            return;
        }
        if (this.i == null) {
            this.i = new hi(hjVar);
        }
        this.f = this.i;
    }

    public final void f() {
        h();
        hj hjVar = this.f;
        if (hjVar instanceof hi) {
            ((hi) hjVar).b.e();
        }
        hj hjVar2 = this.f;
        hi hiVar = this.i;
        if (hjVar2 == hiVar) {
            this.f = hiVar.a;
        }
    }

    public final void g(int i, boolean z) {
        Object[] objArr = this.a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.g - i) - 1);
        int i2 = this.g - 1;
        this.g = i2;
        this.a[i2] = null;
        if (z) {
            this.f.d(i, 1);
        }
    }

    public final void h() {
        if (this.b == null) {
        } else {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public final void i(int i, Object obj) {
        boolean z;
        h();
        Object d = d(i);
        if (d != obj && this.f.e(d, obj)) {
            z = false;
        } else {
            z = true;
        }
        if (d != obj && this.f.compare(d, obj) == 0) {
            this.a[i] = obj;
            if (z) {
                hj hjVar = this.f;
                hjVar.g(d, obj);
                hjVar.a(i, 1, null);
                return;
            }
            return;
        }
        if (z) {
            hj hjVar2 = this.f;
            hjVar2.g(d, obj);
            hjVar2.a(i, 1, null);
        }
        g(i, false);
        int b = b(obj, false);
        if (i != b) {
            this.f.c(i, b);
        }
    }
}
