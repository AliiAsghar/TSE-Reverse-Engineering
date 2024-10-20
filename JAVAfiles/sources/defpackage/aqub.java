package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqub {
    private static final Logger a = Logger.getLogger(aqub.class.getName());
    private static aqub b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("arfe"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("arma"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized aqub b() {
        aqub aqubVar;
        synchronized (aqub.class) {
            if (b == null) {
                List<aqua> r = aqae.r(aqua.class, c, aqua.class.getClassLoader(), new aquh(1));
                b = new aqub();
                for (aqua aquaVar : r) {
                    a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(aquaVar))));
                    b.c(aquaVar);
                }
                b.d();
            }
            aqubVar = b;
        }
        return aqubVar;
    }

    private final synchronized void c(aqua aquaVar) {
        aquaVar.e();
        d.t(true, "isAvailable() returned false");
        this.d.add(aquaVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            aqua aquaVar = (aqua) it.next();
            String c2 = aquaVar.c();
            if (((aqua) this.e.get(c2)) != null) {
                aquaVar.d();
            } else {
                this.e.put(c2, aquaVar);
            }
        }
    }

    public final synchronized aqua a(String str) {
        return (aqua) this.e.get(str);
    }
}
