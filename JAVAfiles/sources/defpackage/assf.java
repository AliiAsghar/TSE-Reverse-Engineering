package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assf implements Iterable<assj> {
    private final List<assj> a = new LinkedList();
    private final Map<String, List<assj>> b = new HashMap();

    public int a(String str) {
        if (str != null) {
            List<assj> remove = this.b.remove(str.toLowerCase(Locale.US));
            if (remove != null && !remove.isEmpty()) {
                this.a.removeAll(remove);
                return remove.size();
            }
            return 0;
        }
        return 0;
    }

    public List<assj> b() {
        return new ArrayList(this.a);
    }

    public List<assj> c(String str) {
        if (str == null) {
            return null;
        }
        List<assj> list = this.b.get(str.toLowerCase(Locale.US));
        if (list != null && !list.isEmpty()) {
            return new ArrayList(list);
        }
        return Collections.emptyList();
    }

    public assj d(String str) {
        if (str != null) {
            List<assj> list = this.b.get(str.toLowerCase(Locale.US));
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        return null;
    }

    public void e(assj assjVar) {
        if (assjVar == null) {
            return;
        }
        String lowerCase = assjVar.b().toLowerCase(Locale.US);
        List<assj> list = this.b.get(lowerCase);
        if (list == null) {
            list = new LinkedList<>();
            this.b.put(lowerCase, list);
        }
        list.add(assjVar);
        this.a.add(assjVar);
    }

    public void f(assj assjVar) {
        if (assjVar == null) {
            return;
        }
        List<assj> list = this.b.get(assjVar.b().toLowerCase(Locale.US));
        if (list != null && !list.isEmpty()) {
            list.clear();
            list.add(assjVar);
            Iterator<assj> it = this.a.iterator();
            int i = 0;
            int i2 = -1;
            while (it.hasNext()) {
                if (it.next().b().equalsIgnoreCase(assjVar.b())) {
                    it.remove();
                    if (i2 == -1) {
                        i2 = i;
                    }
                }
                i++;
            }
            this.a.add(i2, assjVar);
            return;
        }
        e(assjVar);
    }

    @Override // java.lang.Iterable
    public Iterator<assj> iterator() {
        return DesugarCollections.unmodifiableList(this.a).iterator();
    }

    public String toString() {
        return this.a.toString();
    }
}
