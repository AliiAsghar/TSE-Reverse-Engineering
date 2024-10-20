package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uoq implements uop {
    private final armf c;
    private final armf d;
    private static final xze b = xze.g("BugleWorkQueue", "WorkQueueHandlerManagerImpl");
    static final uuf a = new uac(uuh.a, "WorkQueue__").n("max_rows_per_query", 100);

    public uoq(armf armfVar, armf armfVar2) {
        boolean z;
        this.c = armfVar;
        this.d = armfVar2;
        Iterator it = ((Map) armfVar.b()).keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                String str = (String) it.next();
                if (str.contains("-")) {
                    b.m("illegal handler name (contains -): ".concat(String.valueOf(str)));
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        albo.T(z);
    }

    @Override // defpackage.uop
    public final int a(String str) {
        Integer num = (Integer) ((Map) ((apxx) this.d).a).get(str);
        if (num == null) {
            num = (Integer) a.e();
        }
        return num.intValue();
    }

    @Override // defpackage.uop
    public final unx b(String str) {
        armf armfVar = (armf) ((Map) this.c.b()).get(str);
        if (armfVar != null) {
            return (unx) armfVar.b();
        }
        return null;
    }

    @Override // defpackage.uop
    public final unx c(String str) {
        armf armfVar = (armf) ((Map) this.c.b()).get(str);
        if (armfVar == null) {
            armfVar = (armf) ((Map) this.c.b()).get("__UNHANDLED_HANDLER");
        }
        if (armfVar != null) {
            return (unx) armfVar.b();
        }
        throw new IllegalArgumentException(a.bW(str, "no default handler found (type was ", ")"));
    }

    @Override // defpackage.uop
    public final String d(unx unxVar) {
        for (Map.Entry entry : ((Map) this.c.b()).entrySet()) {
            if (((unx) ((armf) entry.getValue()).b()).getClass().getName().equals(unxVar.getClass().getName())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
