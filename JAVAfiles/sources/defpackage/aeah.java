package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeah implements aeag {
    private final Optional a;
    private final Map b;

    public aeah(Optional optional, Map map) {
        this.a = optional;
        this.b = map;
    }

    private final aeck d(String str) {
        aeck aeckVar;
        aeck aeckVar2 = (aeck) this.b.get(str);
        if (aeckVar2 == null) {
            armf armfVar = (armf) arsd.k(this.a);
            if (armfVar != null) {
                aeckVar = (aeck) armfVar.b();
            } else {
                aeckVar = null;
            }
            if (aeckVar == null) {
                return aeck.a;
            }
            return aeckVar;
        }
        return aeckVar2;
    }

    @Override // defpackage.aeag
    public final iap a(String str) {
        aeck d = d(str);
        aozy createBuilder = iap.a.createBuilder();
        createBuilder.getClass();
        DesugarCollections.unmodifiableList(((iap) createBuilder.b).b).getClass();
        Set set = d.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iap iapVar = (iap) createBuilder.b;
        apax apaxVar = iapVar.b;
        if (!apaxVar.c()) {
            iapVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(set, iapVar.b);
        apag s = createBuilder.s();
        s.getClass();
        return (iap) s;
    }

    @Override // defpackage.aeag
    public final aecq b(String str) {
        return d(str).c;
    }

    @Override // defpackage.aeag
    public final boolean c(String str) {
        return d(str).e;
    }
}
