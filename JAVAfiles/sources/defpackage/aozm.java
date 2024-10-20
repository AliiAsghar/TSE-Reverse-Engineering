package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozm extends aoym implements RandomAccess, apaj, apcb {
    public static final double[] a;
    public static final aozm b;
    public double[] c;
    public int d;

    static {
        double[] dArr = new double[0];
        a = dArr;
        b = new aozm(dArr, 0, false);
    }

    aozm() {
        this(a, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void i(int i) {
        if (i >= 0 && i < this.d) {
        } else {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int max;
        double doubleValue = ((Double) obj).doubleValue();
        gZ();
        if (i >= 0 && i <= (i2 = this.d)) {
            int i3 = i + 1;
            double[] dArr = this.c;
            int length = dArr.length;
            if (i2 < length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                max = Math.max(((length * 3) / 2) + 1, 10);
                double[] dArr2 = new double[max];
                System.arraycopy(this.c, 0, dArr2, 0, i);
                System.arraycopy(this.c, i, dArr2, i3, this.d - i);
                this.c = dArr2;
            }
            this.c[i] = doubleValue;
            this.d++;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // defpackage.aoym, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        gZ();
        apay.b(collection);
        if (!(collection instanceof aozm)) {
            return super.addAll(collection);
        }
        aozm aozmVar = (aozm) collection;
        int i = aozmVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(aozmVar.c, 0, this.c, this.d, aozmVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.apaj
    public final double d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aozm)) {
            return super.equals(obj);
        }
        aozm aozmVar = (aozm) obj;
        if (this.d != aozmVar.d) {
            return false;
        }
        double[] dArr = aozmVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.apax
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final apaj e(int i) {
        double[] copyOf;
        if (i >= this.d) {
            if (i == 0) {
                copyOf = a;
            } else {
                copyOf = Arrays.copyOf(this.c, i);
            }
            return new aozm(copyOf, this.d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(double d) {
        int max;
        gZ();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            max = Math.max(((length * 3) / 2) + 1, 10);
            double[] dArr = new double[max];
            System.arraycopy(this.c, 0, dArr, 0, this.d);
            this.c = dArr;
        }
        double[] dArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr2[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Double.valueOf(d(i));
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + a.A(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        gZ();
        i(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        gZ();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        gZ();
        i(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aozm(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
