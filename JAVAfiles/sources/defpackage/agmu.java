package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmu {
    private static final alvi b = alvi.m("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider");
    public final ConcurrentMap a = new ConcurrentHashMap();
    private final armf c;

    public agmu(armf armfVar) {
        this.c = armfVar;
    }

    public final void a() {
        agnw agnwVar = (agnw) this.a.remove("backup");
        if (agnwVar != null) {
            agnwVar.x();
        }
    }

    public final void b() {
        this.a.remove("backup");
    }

    public final synchronized void c(String str) {
        if (!agnc.u()) {
            return;
        }
        agnw agnwVar = (agnw) this.a.get("backup");
        if (agnwVar != null) {
            if (agnwVar.n().a.equals(str)) {
                if (agnwVar.n().a.equals(str)) {
                    ((alvg) ((alvg) b.g()).h("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider", "setStorageFileName", 56, "D26rDatabaseInterfaceOverrider.java")).t("Override already set for db handle [%s]", "backup");
                    return;
                }
            } else {
                throw new IllegalStateException("Attempting to set new override for db handle [backup], which is already set");
            }
        }
        agna n = agnc.d("backup").n();
        int i = n.c;
        agmy a = agna.a();
        a.b(i);
        a.c(n.b);
        a.g(n.d);
        a.f(str);
        a.d(true);
        a.e(n.f);
        agna a2 = a.a();
        ahjj ahjjVar = (ahjj) this.c.b();
        ahjjVar.getClass();
        this.a.put("backup", ahjjVar.u(a2));
    }
}
