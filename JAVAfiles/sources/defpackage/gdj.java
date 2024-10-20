package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdj<Key, Value> extends dyi implements Iterable<Value>, arse {
    public static final gdj a = new gdj(arnv.a, null, null, 0, 0);
    public final List b;
    public final Object c;
    public final Object d;
    public final int e;
    public final int f;

    public gdj(List list, Object obj, Object obj2) {
        this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj)) {
            return false;
        }
        gdj gdjVar = (gdj) obj;
        if (d.F(this.b, gdjVar.b) && d.F(this.c, gdjVar.c) && d.F(this.d, gdjVar.d) && this.e == gdjVar.e && this.f == gdjVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        Object obj = this.c;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Object obj2 = this.d;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return ((((i2 + i) * 31) + this.e) * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator<Value> iterator() {
        return this.b.listIterator();
    }

    public final String toString() {
        return arsd.s("LoadResult.Page(\n                    |   data size: " + this.b.size() + "\n                    |   first Item: " + aqjn.Z(this.b) + "\n                    |   last Item: " + aqjn.ad(this.b) + "\n                    |   nextKey: " + this.d + "\n                    |   prevKey: " + this.c + "\n                    |   itemsBefore: " + this.e + "\n                    |   itemsAfter: " + this.f + "\n                    |) ");
    }

    public gdj(List list, Object obj, Object obj2, int i, int i2) {
        super(null);
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = i;
        this.f = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }
}
