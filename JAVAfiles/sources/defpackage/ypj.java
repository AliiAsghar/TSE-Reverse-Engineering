package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypj {
    public final Set a;

    public ypj() {
        this(arnx.a);
    }

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((ypi) it.next()).l;
        }
        return i;
    }

    public final boolean b() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((ypi) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((ypi) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (e() || c()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((ypi) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ypj)) {
            return d.F(this.a, ((ypj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ypj(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((ypi) obj) != ypi.a) {
                arrayList.add(obj);
            }
        }
        this.a = aqjn.aE(arrayList);
    }
}
