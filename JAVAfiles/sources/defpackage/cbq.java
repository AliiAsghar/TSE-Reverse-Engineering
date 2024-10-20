package defpackage;

import defpackage.cbl;
import defpackage.cbm;
import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbq<E> extends arnj<E> implements List<E>, cbm {

    /* compiled from: PG */
    /* renamed from: cbq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<E, Boolean> {
        final /* synthetic */ Collection a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Collection collection) {
            super(1);
            this.a = collection;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(this.a.contains(obj));
        }
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cbm
    public cbm e(Collection collection) {
        cbm.a b = b();
        b.addAll(collection);
        return b.a();
    }

    @Override // defpackage.cbm
    public final cbm f(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf != -1) {
            return i(indexOf);
        }
        return this;
    }

    @Override // defpackage.cbm
    public final cbm g(Collection collection) {
        return h(new AnonymousClass1(collection));
    }

    @Override // defpackage.arnj, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.arnj, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.arnj, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new cbl.a(this, i, i2);
    }
}
