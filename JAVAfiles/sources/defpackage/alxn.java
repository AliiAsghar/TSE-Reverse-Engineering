package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alxn extends AbstractSet {
    final /* synthetic */ alxp a;

    public alxn(alxp alxpVar) {
        this.a = alxpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<alvz<?>> iterator() {
        return new alxm(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
