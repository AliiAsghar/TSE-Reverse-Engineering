package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface cvo {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements Collection<Object>, j$.util.Collection<Object>, arse {
        private final vc a;

        public a() {
            this(null);
        }

        @Override // java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.a.f(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            return defpackage.a.i();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.d();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.b();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return new uq(this.a).iterator();
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection collection) {
            return this.a.g(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection collection) {
            return this.a.h(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return this.a.g;
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterators.spliterator(this, 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return arri.a(this);
        }

        public /* synthetic */ a(byte[] bArr) {
            this.a = new vc(6);
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

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
