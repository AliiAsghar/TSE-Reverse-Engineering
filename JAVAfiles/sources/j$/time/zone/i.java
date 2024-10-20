package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public abstract class i {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;
    private static volatile Set c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e b(String str, boolean z) {
        Objects.a(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new RuntimeException("No time-zone data files registered");
            }
            throw new RuntimeException("Unknown time-zone ID: ".concat(str));
        }
        return iVar.c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(i iVar) {
        Objects.a(iVar, "provider");
        synchronized (i.class) {
            try {
                for (String str : iVar.d()) {
                    Objects.a(str, "zoneId");
                    if (((i) b.putIfAbsent(str, iVar)) != null) {
                        throw new RuntimeException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(iVar));
                    }
                }
                c = Collections.unmodifiableSet(new HashSet(b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        a.add(iVar);
    }

    protected abstract e c(String str);

    protected abstract Set d();
}
