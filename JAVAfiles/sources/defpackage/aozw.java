package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozw extends aoym implements RandomAccess, apan, apcb {
    public static final float[] a;
    public static final aozw b;
    public float[] c;
    public int d;

    static {
        float[] fArr = new float[0];
        a = fArr;
        b = new aozw(fArr, 0, false);
    }

    aozw() {
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
        float floatValue = ((Float) obj).floatValue();
        gZ();
        if (i >= 0 && i <= (i2 = this.d)) {
            int i3 = i + 1;
            float[] fArr = this.c;
            int length = fArr.length;
            if (i2 < length) {
                System.arraycopy(fArr, i, fArr, i3, i2 - i);
            } else {
                max = Math.max(((length * 3) / 2) + 1, 10);
                float[] fArr2 = new float[max];
                System.arraycopy(this.c, 0, fArr2, 0, i);
                System.arraycopy(this.c, i, fArr2, i3, this.d - i);
                this.c = fArr2;
            }
            this.c[i] = floatValue;
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
        if (!(collection instanceof aozw)) {
            return super.addAll(collection);
        }
        aozw aozwVar = (aozw) collection;
        int i = aozwVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.c;
            if (i3 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(aozwVar.c, 0, this.c, this.d, aozwVar.d);
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

    @Override // defpackage.apan
    public final float d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aozw)) {
            return super.equals(obj);
        }
        aozw aozwVar = (aozw) obj;
        if (this.d != aozwVar.d) {
            return false;
        }
        float[] fArr = aozwVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.apax
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final apan e(int i) {
        float[] copyOf;
        if (i >= this.d) {
            if (i == 0) {
                copyOf = a;
            } else {
                copyOf = Arrays.copyOf(this.c, i);
            }
            return new aozw(copyOf, this.d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(float f) {
        int max;
        gZ();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            max = Math.max(((length * 3) / 2) + 1, 10);
            float[] fArr = new float[max];
            System.arraycopy(this.c, 0, fArr, 0, this.d);
            this.c = fArr;
        }
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        gZ();
        i(i);
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        gZ();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        gZ();
        i(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aozw(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.aoym, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
