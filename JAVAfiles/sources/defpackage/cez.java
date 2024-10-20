package defpackage;

import defpackage.cbm;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cez<T> implements List<T>, RandomAccess, cfg, arsh {
    public cfi a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cez$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<List<T>, Boolean> {
        final /* synthetic */ int a;
        final /* synthetic */ Collection b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Collection collection) {
            super(1);
            this.a = i;
            this.b = collection;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.a, this.b));
        }
    }

    /* compiled from: PG */
    /* renamed from: cez$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<T>, Boolean> {
        final /* synthetic */ Collection a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Collection collection) {
            super(1);
            this.a = collection;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.a));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> extends cfi {
        public cbm a;
        public int b;
        public int c;

        public a(int i, cbm cbmVar) {
            super(i);
            this.a = cbmVar;
        }

        @Override // defpackage.cfi
        public final cfi a(int i) {
            return new a(i, this.a);
        }

        @Override // defpackage.cfi
        public final void b(cfi cfiVar) {
            synchronized (cfa.a) {
                cfiVar.getClass();
                a aVar = (a) cfiVar;
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.c;
            }
        }
    }

    public cez() {
        cby cbyVar = cby.a;
        ces b = cex.b();
        a aVar = new a(b.v(), cbyVar);
        if (!(b instanceof cel)) {
            aVar.h = new a(1, cbyVar);
        }
        this.a = aVar;
    }

    public static final boolean g(a aVar, int i, cbm cbmVar, boolean z) {
        boolean z2;
        synchronized (cfa.a) {
            int i2 = aVar.b;
            if (i2 == i) {
                aVar.a = cbmVar;
                z2 = true;
                if (z) {
                    aVar.c++;
                }
                aVar.b = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    private final boolean h(arqr arqrVar) {
        int i;
        cbm cbmVar;
        Object a2;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm.a b2 = cbmVar.b();
            a2 = arqrVar.a(b2);
            cbm a3 = b2.a();
            if (d.F(a3, cbmVar)) {
                break;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i, a3, true);
            }
            cex.t(b, this);
        } while (!g);
        return ((Boolean) a2).booleanValue();
    }

    public final int a() {
        return c().a.size();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        cbm cbmVar;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i2 = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm d = cbmVar.d(i, obj);
            if (d.F(d, cbmVar)) {
                return;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i2, d, true);
            }
            cex.t(b, this);
        } while (!g);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return h(new AnonymousClass1(i, collection));
    }

    public final int b() {
        cfi cfiVar = this.a;
        cfiVar.getClass();
        return ((a) cex.e(cfiVar)).c;
    }

    public final a c() {
        cfi cfiVar = this.a;
        cfiVar.getClass();
        return (a) cex.j(cfiVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ces b;
        cfi cfiVar = this.a;
        cfiVar.getClass();
        arqr arqrVar = cex.a;
        synchronized (cex.c) {
            b = cex.b();
            a aVar = (a) cex.l(cfiVar, this, b);
            synchronized (cfa.a) {
                aVar.a = cby.a;
                aVar.b++;
                aVar.c++;
            }
        }
        cex.t(b, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c().a.containsAll(collection);
    }

    public final Object d(int i) {
        int i2;
        cbm cbmVar;
        ces b;
        boolean g;
        Object obj = get(i);
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i2 = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm i3 = cbmVar.i(i);
            if (d.F(i3, cbmVar)) {
                break;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i2, i3, true);
            }
            cex.t(b, this);
        } while (!g);
        return obj;
    }

    @Override // defpackage.cfg
    public final cfi e() {
        return this.a;
    }

    @Override // defpackage.cfg
    public final void f(cfi cfiVar) {
        cfiVar.h = this.a;
        cfiVar.getClass();
        this.a = (a) cfiVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c().a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cff(this, 0);
    }

    @Override // defpackage.cfg
    public final /* synthetic */ cfi j(cfi cfiVar, cfi cfiVar2, cfi cfiVar3) {
        return null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new cff(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return d(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm g2 = cbmVar.g(collection);
            if (d.F(g2, cbmVar)) {
                return false;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i, g2, true);
            }
            cex.t(b, this);
        } while (!g);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return h(new AnonymousClass2(collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        cbm cbmVar;
        ces b;
        boolean g;
        Object obj2 = get(i);
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i2 = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm j = cbmVar.j(i, obj);
            if (d.F(j, cbmVar)) {
                break;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i2, j, false);
            }
            cex.t(b, this);
        } while (!g);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            byy.a("fromIndex or toIndex are out of bounds");
        }
        return new cfj(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return arri.a(this);
    }

    public final String toString() {
        cfi cfiVar = this.a;
        cfiVar.getClass();
        return "SnapshotStateList(value=" + ((a) cex.e(cfiVar)).a + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm e = cbmVar.e(collection);
            if (d.F(e, cbmVar)) {
                return false;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i, e, true);
            }
            cex.t(b, this);
        } while (!g);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new cff(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm f = cbmVar.f(obj);
            if (d.F(f, cbmVar)) {
                return false;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i, f, true);
            }
            cex.t(b, this);
        } while (!g);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return arri.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        cbm cbmVar;
        ces b;
        boolean g;
        do {
            synchronized (cfa.a) {
                cfi cfiVar = this.a;
                cfiVar.getClass();
                a aVar = (a) cex.e(cfiVar);
                i = aVar.b;
                cbmVar = aVar.a;
            }
            cbmVar.getClass();
            cbm c = cbmVar.c(obj);
            if (d.F(c, cbmVar)) {
                return false;
            }
            cfi cfiVar2 = this.a;
            cfiVar2.getClass();
            synchronized (cex.c) {
                b = cex.b();
                g = g((a) cex.l(cfiVar2, this, b), i, c, true);
            }
            cex.t(b, this);
        } while (!g);
        return true;
    }
}
