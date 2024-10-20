package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvf {
    private static final Logger a = Logger.getLogger(aqvf.class.getName());
    private static aqvf b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private alor e = altc.a;

    public static synchronized aqvf b() {
        aqvf aqvfVar;
        synchronized (aqvf.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("arbo"));
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<aqve> r = aqae.r(aqve.class, DesugarCollections.unmodifiableList(arrayList), aqve.class.getClassLoader(), new aquh(2));
                if (r.isEmpty()) {
                    a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                b = new aqvf();
                for (aqve aqveVar : r) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(aqveVar))));
                    b.f(aqveVar);
                }
                b.g();
            }
            aqvfVar = b;
        }
        return aqvfVar;
    }

    private final synchronized void f(aqve aqveVar) {
        aqveVar.d();
        d.t(true, "isAvailable() returned false");
        this.d.add(aqveVar);
    }

    private final synchronized void g() {
        HashMap hashMap = new HashMap();
        Iterator it = this.d.iterator();
        String str = "unknown";
        char c = 0;
        while (it.hasNext()) {
            aqve aqveVar = (aqve) it.next();
            String b2 = aqveVar.b();
            if (((aqve) hashMap.get(b2)) != null) {
                aqveVar.e();
            } else {
                hashMap.put(b2, aqveVar);
            }
            aqveVar.e();
            if (c < 5) {
                aqveVar.e();
                str = aqveVar.b();
            }
            c = 5;
        }
        this.e = alor.j(hashMap);
        this.c = str;
    }

    public final aqve a(String str) {
        if (str == null) {
            return null;
        }
        return (aqve) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(aqve aqveVar) {
        f(aqveVar);
        g();
    }
}
