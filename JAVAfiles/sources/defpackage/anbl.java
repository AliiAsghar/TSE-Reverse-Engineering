package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbl extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final float[] a;
    final int b;
    final int c;

    public anbl(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Float) && albo.cA(this.a, ((Float) obj).floatValue(), this.b, this.c) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anbl) {
            anbl anblVar = (anbl) obj;
            int size = size();
            if (anblVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != anblVar.a[anblVar.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        albo.ad(i, size());
        return Float.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + albo.cz(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int cA;
        if ((obj instanceof Float) && (cA = albo.cA(this.a, ((Float) obj).floatValue(), this.b, this.c)) >= 0) {
            return cA - this.b;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.a;
            float floatValue = ((Float) obj).floatValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 >= i) {
                    if (fArr[i2] == floatValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        albo.ad(i, size());
        int i2 = this.b;
        float[] fArr = this.a;
        int i3 = i2 + i;
        float f2 = fArr[i3];
        f.getClass();
        fArr[i3] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        albo.S(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.a;
        int i3 = this.b;
        return new anbl(fArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(this.a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
