package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0242x extends C0240v implements java.util.SortedSet, SortedSet {
    private static final long serialVersionUID = -4929149591599911165L;
    private final java.util.SortedSet b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0242x(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.b = sortedSet;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return this.b.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.b.first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        return new C0242x(this.b.headSet(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.b.last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return new C0242x(this.b.subSet(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        return new C0242x(this.b.tailSet(obj));
    }
}
