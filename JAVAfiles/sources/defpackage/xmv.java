package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmv {
    public static final arml a = armd.a(tzt.k);
    public static final arml b = armd.a(tzt.l);

    public static final xmw a(xlb xlbVar, xlb xlbVar2) {
        xlb xlbVar3;
        xky xkyVar;
        xkx xkxVar;
        Collection bQ = yyb.bQ(xlbVar);
        ArrayList arrayList = new ArrayList(aqjn.J(bQ, 10));
        Iterator it = bQ.iterator();
        while (it.hasNext()) {
            arrayList.add(yyb.bN((xlb) it.next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            xlb xlbVar4 = (xlb) next;
            if (xlbVar4.c == 5) {
                xkyVar = (xky) xlbVar4.d;
            } else {
                xkyVar = xky.a;
            }
            apct apctVar = xkyVar.d;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            apctVar.getClass();
            if (xlbVar2.c == 4) {
                xkxVar = (xkx) xlbVar2.d;
            } else {
                xkxVar = xkx.a;
            }
            apct apctVar2 = xkxVar.c;
            if (apctVar2 == null) {
                apctVar2 = apct.a;
            }
            apctVar2.getClass();
            if (apdr.a(apctVar, apctVar2) >= 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        List list = (List) Map.EL.getOrDefault(linkedHashMap, true, arnv.a);
        List list2 = (List) linkedHashMap.get(false);
        if (list2 != null) {
            xlbVar3 = yyb.bM(list2);
        } else {
            xlbVar3 = null;
        }
        return new xmw(xlbVar2, list, xlbVar3);
    }

    public static final List b(Collection collection, xlb xlbVar, xmw xmwVar) {
        return aqjn.an(aqjn.ar(aqjn.ar(aqjn.ap(collection, xlbVar), xmwVar.a), xmwVar.c));
    }
}
