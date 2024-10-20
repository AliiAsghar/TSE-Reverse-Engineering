package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amab extends AbstractSet {
    final /* synthetic */ amac a;

    public amab(amac amacVar) {
        this.a = amacVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof amai)) {
            return false;
        }
        amai amaiVar = (amai) obj;
        amac amacVar = this.a;
        if (!amacVar.d().contains(amaiVar.a) || !this.a.e(amaiVar.a).contains(amaiVar.b)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new amaj(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return albo.cu(this.a.a());
    }
}
