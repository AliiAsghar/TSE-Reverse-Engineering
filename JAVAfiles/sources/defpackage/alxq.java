package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxq extends alxr {
    private final Map a;

    public alxq(alxa alxaVar, alxa alxaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, alxaVar);
        e(linkedHashMap, alxaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((alvz) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, alxa alxaVar) {
        for (int i = 0; i < alxaVar.b(); i++) {
            alvz c = alxaVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.c(alxaVar.e(i)));
            } else {
                map.put(c, c.c(alxaVar.e(i)));
            }
        }
    }

    @Override // defpackage.alxr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.alxr
    public final Object b(alvz alvzVar) {
        alzz.c(!alvzVar.b, "key must be single valued");
        Object obj = this.a.get(alvzVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.alxr
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.alxr
    public final void d(alxh alxhVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            alvz alvzVar = (alvz) entry.getKey();
            Object value = entry.getValue();
            if (alvzVar.b) {
                alxhVar.b(alvzVar, ((List) value).iterator(), obj);
            } else {
                alxhVar.a(alvzVar, value, obj);
            }
        }
    }
}
