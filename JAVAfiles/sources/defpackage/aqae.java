package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aqae {
    public static volatile aqux f;
    public static volatile aqux g;
    public static volatile aqux h;
    public static volatile aqux i;
    public static volatile aqux j;

    private aqae() {
    }

    public static /* synthetic */ aqhz f(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqhz) s;
    }

    public static /* synthetic */ aqfi h(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqfi) s;
    }

    public static void i(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfi aqfiVar = (aqfi) aozyVar.b;
        aqfi aqfiVar2 = aqfi.a;
        aqfiVar.b = 1;
        aqfiVar.c = str;
    }

    public static /* synthetic */ aqhh j(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aqhh) s;
    }

    public static void k(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        aqhhVar.e = str;
    }

    public static void l(aqgb aqgbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        aqhhVar.c = aqgbVar;
        aqhhVar.b |= 1;
    }

    public static void m(aqfn aqfnVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        aqhhVar.d = aqfnVar;
        aqhhVar.b |= 2;
    }

    public static void n(aqge aqgeVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        aqhhVar.f = aqgeVar;
        aqhhVar.b |= 4;
    }

    public static /* synthetic */ void o(aqhg aqhgVar, aozy aozyVar) {
        aqhgVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        apax apaxVar = aqhhVar.g;
        if (!apaxVar.c()) {
            aqhhVar.g = apag.mutableCopy(apaxVar);
        }
        aqhhVar.g.add(aqhgVar);
    }

    public static void p(int i2, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqhh aqhhVar = (aqhh) aozyVar.b;
        aqhh aqhhVar2 = aqhh.a;
        aqhhVar.h = a.an(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List, java.util.ArrayList] */
    public static List r(Class cls, Iterable iterable, ClassLoader classLoader, aqvx aqvxVar) {
        ?? load;
        Object obj;
        if (s(classLoader)) {
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                    obj = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } else {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            aqvxVar.b(obj2);
            arrayList.add(obj2);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new kdw(aqvxVar, 13, null)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void t(aqux aquxVar, aqvs aqvsVar, String str, aqvw aqvwVar, Map map) {
        v(new asmb(aquxVar, aqvsVar), str, map);
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List, java.lang.Object] */
    public static asmb u(String str, aqvw aqvwVar, Map map) {
        if (aqvwVar == null) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((asmb) it.next()).a);
            }
            asmb asmbVar = new asmb(str, (byte[]) null);
            asmbVar.b.addAll(arrayList);
            aqvwVar = new aqvw(asmbVar);
        }
        HashMap hashMap = new HashMap(map);
        for (aqux aquxVar : aqvwVar.b) {
            asmb asmbVar2 = (asmb) hashMap.remove(aquxVar.b);
            if (asmbVar2 != null) {
                if (asmbVar2.a != aquxVar) {
                    throw new IllegalStateException("Bound method for " + aquxVar.b + " not same instance as method in service descriptor");
                }
            } else {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(aquxVar.b));
            }
        }
        if (hashMap.size() <= 0) {
            return new asmb(aqvwVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((aqux) ((asmb) hashMap.values().iterator().next()).a).b));
    }

    public static void v(asmb asmbVar, String str, Map map) {
        aqux aquxVar = (aqux) asmbVar.a;
        albo.Q(str.equals(aquxVar.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, aquxVar.b);
        String str2 = aquxVar.b;
        albo.X(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, asmbVar);
    }

    public aqae(byte[] bArr) {
    }

    public void e() {
    }

    public void b(long j2) {
    }

    public void c(long j2) {
    }
}
