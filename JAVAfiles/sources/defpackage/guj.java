package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class guj implements gui {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.gui
    public final List a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            if (d.F(((gyg) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.a.remove((gyg) it.next());
        }
        return aqjn.ax(linkedHashMap.values());
    }

    @Override // defpackage.gui
    public final boolean b(gyg gygVar) {
        return this.a.containsKey(gygVar);
    }

    @Override // defpackage.gui
    public final hgi c(gyg gygVar) {
        return (hgi) this.a.remove(gygVar);
    }

    @Override // defpackage.gui
    public final hgi d(gyg gygVar) {
        Map map = this.a;
        Object obj = map.get(gygVar);
        if (obj == null) {
            obj = new hgi(gygVar);
            map.put(gygVar, obj);
        }
        return (hgi) obj;
    }

    @Override // defpackage.gui
    public final /* synthetic */ hgi e(gys gysVar) {
        return gvf.aG(this, gysVar);
    }
}
