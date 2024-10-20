package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alkl implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ alkm c;

    public alkl(alkm alkmVar) {
        this.c = alkmVar;
        this.a = alkmVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
