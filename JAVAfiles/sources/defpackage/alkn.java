package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alkn implements Iterator {
    final Iterator a;
    Object b = null;
    Collection c = null;
    Iterator d = alqr.a;
    final /* synthetic */ alla e;

    public alkn(alla allaVar) {
        this.e = allaVar;
        this.a = allaVar.a.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        alla allaVar = this.e;
        allaVar.b--;
    }
}
