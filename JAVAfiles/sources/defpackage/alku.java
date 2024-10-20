package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
class alku extends alkp implements SortedSet {
    final /* synthetic */ alla c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alku(alla allaVar, SortedMap sortedMap) {
        super(allaVar, sortedMap);
        this.c = allaVar;
    }

    public SortedMap b() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new alku(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new alku(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new alku(this.c, b().tailMap(obj));
    }
}
