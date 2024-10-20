package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoma extends aqsx {
    private final Map b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private static final alvi a = alvi.m("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final asmb h = new asmb((Object) null, (Object) null);
    private static final asmb g = aqae.u("not_found", null, new HashMap());

    public aoma(Map map) {
        this.b = map;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aqsx
    public final asmb a(String str) {
        int indexOf;
        asmb asmbVar = (asmb) this.f.get(str);
        if (asmbVar == null && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            synchronized (this.c) {
                asmb asmbVar2 = (asmb) this.e.get(substring);
                if (asmbVar2 == null) {
                    armf armfVar = (armf) this.b.get(substring);
                    if (armfVar != null) {
                        aqrn aqrnVar = (aqrn) armfVar.b();
                        this.d.put(substring, aqrnVar);
                        asmbVar2 = aqrnVar.n();
                    } else {
                        ((alvg) ((alvg) a.i()).h("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java")).t("No factory available for service %s.", substring);
                        asmbVar2 = g;
                    }
                    this.e.put(substring, asmbVar2);
                }
                if (asmbVar2 != g) {
                    asmbVar = (asmb) asmbVar2.b.get(str);
                } else {
                    asmbVar = null;
                }
                if (asmbVar == null) {
                    asmbVar = h;
                }
                this.f.put(str, asmbVar);
            }
        }
        if (asmbVar == h) {
            return null;
        }
        return asmbVar;
    }
}
