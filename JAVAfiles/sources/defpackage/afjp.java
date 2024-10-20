package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjp extends arrp implements arqg {
    final /* synthetic */ Iterable a;
    final /* synthetic */ afjs b;
    final /* synthetic */ Instant c;
    final /* synthetic */ afiu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjp(Iterable iterable, afjs afjsVar, Instant instant, afiu afiuVar) {
        super(0);
        this.a = iterable;
        this.b = afjsVar;
        this.c = instant;
        this.d = afiuVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.a) {
            afjs afjsVar = this.b;
            Object a = afjsVar.d.a((afjz) obj);
            Object obj2 = linkedHashMap.get(a);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a, obj2);
            }
            ((List) obj2).add(obj);
        }
        afjs afjsVar2 = this.b;
        Instant instant = this.c;
        afiu afiuVar = this.d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aqjn.i(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            double d = 0.0d;
            while (it.hasNext()) {
                d += afjsVar2.a((afjz) it.next(), instant, afiuVar);
            }
            linkedHashMap2.put(key, new afjo(key2, d));
        }
        return linkedHashMap2;
    }
}
