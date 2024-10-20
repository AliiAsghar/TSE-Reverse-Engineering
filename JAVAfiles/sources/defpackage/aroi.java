package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aroi<T> extends arnj<T> implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public aroi(Object[] objArr, int i) {
        objArr.getClass();
        this.a = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.b = length;
                this.d = i;
                return;
            }
            throw new IllegalArgumentException(a.bU(length, i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        throw new IllegalArgumentException(a.bV(i, "ring buffer filled size should not be negative but it is "));
    }

    @Override // defpackage.arne
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                if (i > 0) {
                    int i3 = this.c;
                    int i4 = this.b;
                    int i5 = (i3 + i) % i4;
                    if (i3 > i5) {
                        aqil.d(this.a, null, i3, i4);
                        aqil.d(this.a, null, 0, i5);
                    } else {
                        aqil.d(this.a, null, i3, i5);
                    }
                    this.c = i5;
                    this.d -= i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(a.bU(i2, i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        throw new IllegalArgumentException(a.bV(i, "n shouldn't be negative but it is "));
    }

    public final boolean c() {
        if (this.d == this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        a.N(i, this.d);
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.arnj, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new aroh(this);
    }

    @Override // defpackage.arne, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[this.d]);
    }

    @Override // defpackage.arne, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            objArr.getClass();
        }
        int i2 = this.d;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.c; i4 < i2 && i5 < this.b; i5++) {
            objArr[i4] = this.a[i5];
            i4++;
        }
        while (i4 < i2) {
            objArr[i4] = this.a[i3];
            i4++;
            i3++;
        }
        aqjn.I(i2, objArr);
        return objArr;
    }
}
