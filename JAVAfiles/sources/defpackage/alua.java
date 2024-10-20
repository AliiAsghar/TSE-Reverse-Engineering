package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alua extends alui {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public alua(Map map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.alui, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.alui, java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new alud(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.alui, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection A;
        synchronized (this.g) {
            Collection collection = (Collection) super.get(obj);
            if (collection == null) {
                A = null;
            } else {
                A = alzz.A(collection, this.g);
            }
        }
        return A;
    }

    @Override // defpackage.alui, java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new aluf(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}
