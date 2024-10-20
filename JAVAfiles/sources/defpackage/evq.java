package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evq extends almy {
    private final Map a;

    public evq(Map map) {
        this.a = map;
    }

    @Override // defpackage.almy
    protected final Map b() {
        return this.a;
    }

    @Override // defpackage.almy, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.almy, java.util.Map
    public final boolean containsValue(Object obj) {
        return alzz.aF(new alri(entrySet().iterator()), obj);
    }

    @Override // defpackage.almy, java.util.Map
    public final Set entrySet() {
        return alzz.M(this.a.entrySet(), new evp(1));
    }

    @Override // defpackage.almy, java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && alzz.am(this, obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.a;
    }

    @Override // defpackage.almy, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // defpackage.almy, java.util.Map
    public final int hashCode() {
        return alzz.F(entrySet());
    }

    @Override // defpackage.almy, java.util.Map
    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.almy, java.util.Map
    public final Set keySet() {
        return alzz.M(this.a.keySet(), new evp(0));
    }

    @Override // defpackage.almy, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
