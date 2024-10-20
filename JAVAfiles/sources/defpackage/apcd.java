package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apcd extends aoym implements RandomAccess {
    public static final Object[] a;
    public static final apcd b;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new apcd(objArr, 0, false);
    }

    apcd() {
        this(a, 0, true);
    }

    private final String f(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void g(int i) {
        if (i >= 0 && i < this.d) {
        } else {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int max;
        gZ();
        if (i >= 0 && i <= (i2 = this.d)) {
            int i3 = i + 1;
            Object[] objArr = this.c;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                max = Math.max(((length * 3) / 2) + 1, 10);
                Object[] objArr2 = new Object[max];
                System.arraycopy(this.c, 0, objArr2, 0, i);
                System.arraycopy(this.c, i, objArr2, i3, this.d - i);
                this.c = objArr2;
            }
            this.c[i] = obj;
            this.d++;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        int length = this.c.length;
        if (i <= length) {
            return;
        }
        if (length != 0) {
            while (length < i) {
                length = Math.max(((length * 3) / 2) + 1, 10);
            }
            this.c = Arrays.copyOf(this.c, length);
            return;
        }
        this.c = new Object[Math.max(i, 10)];
    }

    @Override // defpackage.apax
    public final /* bridge */ /* synthetic */ apax e(int i) {
        Object[] copyOf;
        if (i >= this.d) {
            if (i == 0) {
                copyOf = a;
            } else {
                copyOf = Arrays.copyOf(this.c, i);
            }
            return new apcd(copyOf, this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.c[i];
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        gZ();
        g(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        gZ();
        g(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public apcd(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int max;
        gZ();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            max = Math.max(((length * 3) / 2) + 1, 10);
            this.c = Arrays.copyOf(this.c, max);
        }
        Object[] objArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
