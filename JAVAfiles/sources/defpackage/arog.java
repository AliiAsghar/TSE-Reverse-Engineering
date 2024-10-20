package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arog<T> extends arnj<T> {
    public final List a;

    public arog(List list) {
        this.a = list;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        if (new artb(0, aqjn.z(this)).e(i)) {
            return this.a.get(aqjn.z(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new artb(0, aqjn.z(this)) + "].");
    }

    @Override // defpackage.arnj, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new arof(this, 0);
    }

    @Override // defpackage.arnj, java.util.List
    public final ListIterator listIterator() {
        return new arof(this, 0);
    }

    @Override // defpackage.arnj, java.util.List
    public final ListIterator listIterator(int i) {
        return new arof(this, i);
    }
}
