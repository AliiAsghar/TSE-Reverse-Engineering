package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alrp extends alry {
    public final Set a;
    final algk b;

    public alrp(Set set, algk algkVar) {
        this.a = set;
        this.b = algkVar;
    }

    @Override // defpackage.alry
    public final Set b() {
        return new alro(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.alry
    public final Set g() {
        return new alrk(this.a);
    }

    @Override // defpackage.alry
    public final Collection gW() {
        return new allu(this.a, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (albo.u(this.a, obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.remove(obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }
}
