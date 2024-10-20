package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etn<E> implements Iterable<E> {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public Set c = Collections.emptySet();
    public List d = Collections.emptyList();

    public final int a(Object obj) {
        int i;
        synchronized (this.a) {
            if (this.b.containsKey(obj)) {
                i = ((Integer) this.b.get(obj)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
