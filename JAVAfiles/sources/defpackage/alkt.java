package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
class alkt extends alkm implements SortedMap {
    SortedSet d;
    final /* synthetic */ alla e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkt(alla allaVar, SortedMap sortedMap) {
        super(allaVar, sortedMap);
        this.e = allaVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new alkt(this.e, h().headMap(obj));
    }

    @Override // defpackage.alry
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SortedSet g() {
        return new alku(this.e, h());
    }

    @Override // defpackage.alkm, defpackage.alry, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet == null) {
            SortedSet g = g();
            this.d = g;
            return g;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new alkt(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new alkt(this.e, h().tailMap(obj));
    }
}
