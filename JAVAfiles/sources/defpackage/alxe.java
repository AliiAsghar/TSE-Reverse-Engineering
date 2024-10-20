package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alxe extends alxh {
    private final Map a;
    private final Map b;
    private final alxg c;
    private final alxf d;

    public alxe(alxd alxdVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(alxdVar.c);
        hashMap2.putAll(alxdVar.d);
        this.c = alxdVar.e;
        this.d = alxdVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alxh
    public final void a(alvz alvzVar, Object obj, Object obj2) {
        alxg alxgVar = (alxg) this.a.get(alvzVar);
        if (alxgVar != null) {
            alxgVar.a(alvzVar, obj, obj2);
        } else {
            this.c.a(alvzVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alxh
    public final void b(alvz alvzVar, Iterator it, Object obj) {
        alxf alxfVar = (alxf) this.b.get(alvzVar);
        if (alxfVar != null) {
            alxfVar.a(alvzVar, it, obj);
        } else if (this.d != null && !this.a.containsKey(alvzVar)) {
            this.d.a(alvzVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(alvzVar, it.next(), obj);
            }
        }
    }
}
