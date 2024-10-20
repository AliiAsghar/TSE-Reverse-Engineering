package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ta<K, V> implements Iterable<Map.Entry<K, V>> {
    public sw b;
    public sw c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected sw a(Object obj) {
        sw swVar = this.b;
        while (swVar != null && !swVar.a.equals(obj)) {
            swVar = swVar.c;
        }
        return swVar;
    }

    public Object b(Object obj) {
        sw a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator<K> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((sz) it.next()).dI(a);
            }
        }
        sw swVar = a.d;
        sw swVar2 = a.c;
        if (swVar != null) {
            swVar.c = swVar2;
        } else {
            this.b = swVar2;
        }
        sw swVar3 = a.c;
        if (swVar3 != null) {
            swVar3.d = swVar;
        } else {
            this.c = swVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final sw d(Object obj, Object obj2) {
        sw swVar = new sw(obj, obj2);
        this.e++;
        sw swVar2 = this.c;
        if (swVar2 == null) {
            this.b = swVar;
        } else {
            swVar2.c = swVar;
            swVar.d = swVar2;
        }
        this.c = swVar;
        return swVar;
    }

    public final sx e() {
        sx sxVar = new sx(this);
        this.d.put(sxVar, false);
        return sxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        if (this.e != taVar.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = taVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((sy) it).next();
            Map.Entry next2 = ((sy) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object f(Object obj, Object obj2) {
        sw a = a(obj);
        if (a != null) {
            return a.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((sy) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        su suVar = new su(this.b, this.c);
        this.d.put(suVar, false);
        return suVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(((sy) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
