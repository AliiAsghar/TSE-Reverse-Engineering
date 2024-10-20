package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altm extends altw {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public altm(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.altw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final aluq iterator() {
        return new altl(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!this.a.contains(obj) && !this.b.contains(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.a.isEmpty() && this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.b;
        int size = this.a.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!this.a.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
