package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altu extends altt implements SortedSet {
    public altu(SortedSet sortedSet, algy algyVar) {
        super(sortedSet, algyVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return alzz.ay(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new altu(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            algy algyVar = this.b;
            Object last = sortedSet.last();
            if (algyVar.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new altu(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new altu(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
