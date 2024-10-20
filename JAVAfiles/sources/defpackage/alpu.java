package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpu extends alpc {
    public final alpx a() {
        Map map = this.a;
        if (map == null) {
            return almr.a;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return almr.a;
        }
        alok alokVar = new alok(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            alpt o = alpt.o(((alpr) entry.getValue()).g());
            if (!o.isEmpty()) {
                alokVar.h(key, o);
                i += o.size();
            }
        }
        return new alpx(alokVar.b(), i);
    }

    public final void b(Object obj, Object obj2) {
        super.g(obj, obj2);
    }

    public final void c(Map.Entry entry) {
        super.h(entry);
    }

    @Override // defpackage.alpc
    public final alnt d(int i) {
        return alpt.i(i);
    }

    @Override // defpackage.alpc
    public final int j(Iterable iterable) {
        if (!(iterable instanceof Set)) {
            return 4;
        }
        return Math.max(4, ((Set) iterable).size());
    }

    public final void k(Object obj, Object... objArr) {
        super.i(obj, Arrays.asList(objArr));
    }
}
