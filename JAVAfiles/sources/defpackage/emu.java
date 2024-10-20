package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class emu {
    final Map a = new HashMap();
    final Map b;

    public emu(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            enf enfVar = (enf) entry.getValue();
            List list = (List) this.a.get(enfVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(enfVar, list);
            }
            list.add((emv) entry.getKey());
        }
    }

    public static void a(List list, enm enmVar, enf enfVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    emv emvVar = (emv) list.get(size);
                    try {
                        int i = emvVar.a;
                        if (i != 0) {
                            if (i != 1) {
                                emvVar.b.invoke(obj, enmVar, enfVar);
                            } else {
                                emvVar.b.invoke(obj, enmVar);
                            }
                        } else {
                            emvVar.b.invoke(obj, null);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                } else {
                    return;
                }
            }
        }
    }
}
