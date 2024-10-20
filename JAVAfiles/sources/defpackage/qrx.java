package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrx implements vfx {
    private final Map a;

    public qrx(Map map) {
        this.a = map;
    }

    @Override // defpackage.vfx
    public final akul a(aozy aozyVar, msh mshVar) {
        aozyVar.getClass();
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            aozy createBuilder = aqfh.a.createBuilder();
            createBuilder.getClass();
            aozy createBuilder2 = aqfi.a.createBuilder();
            createBuilder2.getClass();
            aqae.i((String) entry.getKey(), createBuilder2);
            aqfi h = aqae.h(createBuilder2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqfh aqfhVar = (aqfh) createBuilder.b;
            aqfhVar.c = h;
            aqfhVar.b |= 1;
            aozy createBuilder3 = aqfi.a.createBuilder();
            createBuilder3.getClass();
            aqae.i((String) entry.getValue(), createBuilder3);
            aqfi h2 = aqae.h(createBuilder3);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqfh aqfhVar2 = (aqfh) createBuilder.b;
            aqfhVar2.d = h2;
            aqfhVar2.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqfh) createBuilder.b).e = a.an(4);
            apag s = createBuilder.s();
            s.getClass();
            arrayList.add((aqfh) s);
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfj aqfjVar = (aqfj) aozyVar.b;
        aqfj aqfjVar2 = aqfj.a;
        aqfjVar.a();
        aoyj.addAll(arrayList, aqfjVar.b);
        akul ag = aktp.ag(aozyVar);
        ag.getClass();
        return ag;
    }
}
