package androidx.work;

import defpackage.gsi;
import defpackage.gsr;
import defpackage.hgi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends gsr {
    @Override // defpackage.gsr
    public final gsi a(List list) {
        hgi hgiVar = new hgi((char[]) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((gsi) it.next()).e());
        }
        hgiVar.l(linkedHashMap);
        return hgiVar.j();
    }
}
