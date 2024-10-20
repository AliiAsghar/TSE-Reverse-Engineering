package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqui {
    private static final Logger a = Logger.getLogger(aqui.class.getName());
    private static aqui b;
    private final LinkedHashSet c = new LinkedHashSet();
    private List d = Collections.emptyList();

    public static synchronized aqui a() {
        aqui aquiVar;
        synchronized (aqui.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("ariz"));
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (Throwable) e);
                }
                try {
                    arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
                } catch (ClassNotFoundException e2) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (Throwable) e2);
                }
                try {
                    arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
                } catch (ClassNotFoundException e3) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (Throwable) e3);
                }
                List<aqug> r = aqae.r(aqug.class, DesugarCollections.unmodifiableList(arrayList), aqug.class.getClassLoader(), new aquh(0));
                b = new aqui();
                for (aqug aqugVar : r) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(aqugVar))));
                    b.c(aqugVar);
                }
                b.d();
            }
            aquiVar = b;
        }
        return aquiVar;
    }

    private final synchronized void c(aqug aqugVar) {
        aqugVar.c();
        d.t(true, "isAvailable() returned false");
        this.c.add(aqugVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList, Collections.reverseOrder(new mm(18)));
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized List b() {
        return this.d;
    }
}
