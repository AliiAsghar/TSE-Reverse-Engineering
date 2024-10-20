package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amaq extends AbstractSet {
    final /* synthetic */ amar a;

    public amaq(amar amarVar) {
        this.a = amarVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        amar amarVar = this.a;
        if (amarVar.b(obj) == null && !amarVar.a.containsKey(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new amap(this, this.a.a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.a.size();
    }
}
