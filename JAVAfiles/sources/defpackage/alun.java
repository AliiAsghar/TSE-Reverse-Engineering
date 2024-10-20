package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alun extends alum implements SortedSet {
    private static final long serialVersionUID = 0;

    public alun(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.alum
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SortedSet a() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.g) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object first;
        synchronized (this.g) {
            first = a().first();
        }
        return first;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        alun alunVar;
        synchronized (this.g) {
            alunVar = new alun(a().headSet(obj), this.g);
        }
        return alunVar;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object last;
        synchronized (this.g) {
            last = a().last();
        }
        return last;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        alun alunVar;
        synchronized (this.g) {
            alunVar = new alun(a().subSet(obj, obj2), this.g);
        }
        return alunVar;
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        alun alunVar;
        synchronized (this.g) {
            alunVar = new alun(a().tailSet(obj), this.g);
        }
        return alunVar;
    }
}
