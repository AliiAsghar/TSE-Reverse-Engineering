package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anta {
    private static final Logger c = Logger.getLogger(anta.class.getName());
    public static final anta a = new anta();
    private final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    private final synchronized void d(anmw anmwVar, boolean z) {
        String d = anmwVar.d();
        if (z && this.b.containsKey(d) && !((Boolean) this.b.get(d)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(d));
        }
        anmw anmwVar2 = (anmw) this.d.get(d);
        if (anmwVar2 != null && !anmwVar2.getClass().equals(anmwVar.getClass())) {
            c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(d));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", d, anmwVar2.getClass().getName(), anmwVar.getClass().getName()));
        }
        this.d.putIfAbsent(d, anmwVar);
        this.b.put(d, Boolean.valueOf(z));
    }

    public final synchronized anmw a(String str) {
        if (this.d.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (anmw) this.d.get(str);
    }

    public final synchronized void b(anmw anmwVar, boolean z) {
        c(anmwVar, 1, z);
    }

    public final synchronized void c(anmw anmwVar, int i, boolean z) {
        if (anme.z(i)) {
            d(anmwVar, z);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
