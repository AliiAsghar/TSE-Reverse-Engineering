package defpackage;

import android.os.LocaleList;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpc implements Collection<dpb>, j$.util.Collection<dpb>, arse {
    public static final dpc a = new dpc(arnv.a);
    public final List b;
    private final int c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final dpc a() {
            dpc dpcVar;
            int size;
            Locale locale;
            dpd dpdVar = dpe.a;
            dpr dprVar = ((dpa) dpdVar).c;
            LocaleList m386m = fo$$ExternalSyntheticApiModelOutline0.m386m();
            synchronized (dprVar) {
                dpcVar = ((dpa) dpdVar).b;
                if (dpcVar == null || m386m != ((dpa) dpdVar).a) {
                    size = m386m.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        locale = m386m.get(i);
                        arrayList.add(new dpb(locale));
                    }
                    dpcVar = new dpc(arrayList);
                    ((dpa) dpdVar).a = m386m;
                    ((dpa) dpdVar).b = dpcVar;
                }
            }
            return dpcVar;
        }
    }

    public dpc(List list) {
        this.b = list;
        this.c = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(dpb dpbVar) {
        return defpackage.a.h();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends dpb> collection) {
        return defpackage.a.i();
    }

    @Override // java.util.Collection
    public final void clear() {
        defpackage.a.g();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof dpb)) {
            return false;
        }
        return this.b.contains((dpb) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dpc) && d.F(this.b, ((dpc) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<dpb> iterator() {
        return this.b.iterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return defpackage.a.h();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.a.i();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.a.i();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.b + ')';
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return arri.b(this, objArr);
    }
}
