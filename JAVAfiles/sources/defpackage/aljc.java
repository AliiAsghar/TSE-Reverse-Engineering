package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aljc extends alim {
    final /* synthetic */ alkd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aljc(alkd alkdVar) {
        super(alkdVar);
        this.b = alkdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aljb(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (this.b.remove(obj) != null) {
            return true;
        }
        return false;
    }
}
