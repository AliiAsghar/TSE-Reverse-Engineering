package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ut extends vg implements Set, arsj {
    final /* synthetic */ vh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(vh vhVar) {
        super(vhVar);
        this.a = vhVar;
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.j(obj);
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.k(collection);
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new us(this.a);
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        vh vhVar = this.a;
        int i = vhVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            vhVar.e(it.next());
        }
        if (i != vhVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vg, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        vh vhVar = this.a;
        Object[] objArr = vhVar.b;
        int i2 = vhVar.d;
        long[] jArr = vhVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!aqjn.aH(collection, objArr[i6])) {
                                vhVar.i(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        if (i2 == vhVar.d) {
            return false;
        }
        return true;
    }
}
