package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoys extends aoym implements RandomAccess, apai, apcb {
    public static final boolean[] a;
    public static final aoys b;
    public int c;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        a = zArr;
        b = new aoys(zArr, 0, false);
    }

    aoys() {
        this(a, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i >= 0 && i < this.c) {
        } else {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int max;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        gZ();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            boolean[] zArr = this.d;
            int length = zArr.length;
            if (i2 < length) {
                System.arraycopy(zArr, i, zArr, i3, i2 - i);
            } else {
                max = Math.max(((length * 3) / 2) + 1, 10);
                boolean[] zArr2 = new boolean[max];
                System.arraycopy(this.d, 0, zArr2, 0, i);
                System.arraycopy(this.d, i, zArr2, i3, this.c - i);
                this.d = zArr2;
            }
            this.d[i] = booleanValue;
            this.c++;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    @Override // defpackage.aoym, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        gZ();
        apay.b(collection);
        if (!(collection instanceof aoys)) {
            return super.addAll(collection);
        }
        aoys aoysVar = (aoys) collection;
        int i = aoysVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.d;
            if (i3 > zArr.length) {
                this.d = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(aoysVar.d, 0, this.d, this.c, aoysVar.c);
            this.c = i3;
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

    @Override // defpackage.apax
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final apai e(int i) {
        boolean[] copyOf;
        if (i >= this.c) {
            if (i == 0) {
                copyOf = a;
            } else {
                copyOf = Arrays.copyOf(this.d, i);
            }
            return new aoys(copyOf, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoys)) {
            return super.equals(obj);
        }
        aoys aoysVar = (aoys) obj;
        if (this.c != aoysVar.c) {
            return false;
        }
        boolean[] zArr = aoysVar.d;
        for (int i = 0; i < this.c; i++) {
            if (this.d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z) {
        int max;
        gZ();
        int i = this.c;
        int length = this.d.length;
        if (i == length) {
            max = Math.max(((length * 3) / 2) + 1, 10);
            boolean[] zArr = new boolean[max];
            System.arraycopy(this.d, 0, zArr, 0, this.c);
            this.d = zArr;
        }
        boolean[] zArr2 = this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr2[i2] = z;
    }

    @Override // defpackage.apai
    public final boolean g(int i) {
        i(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(g(i));
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + a.v(this.d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        gZ();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        gZ();
        if (i2 >= i) {
            boolean[] zArr = this.d;
            System.arraycopy(zArr, i2, zArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        gZ();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public aoys(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.c = i;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
