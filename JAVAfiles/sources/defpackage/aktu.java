package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktu extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public aktu(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static ListenableFuture a(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        akry c = akqj.c();
        ListenableFuture bJ = albo.bJ(listenableFuture);
        ListenableFuture bP = albo.bP(bJ, j, timeUnit, scheduledExecutorService);
        return ancd.g(bP, TimeoutException.class, new ajym(listenableFuture, bP, c, bJ, 3), andi.a);
    }

    public static RuntimeException b(Throwable th) {
        akry c = akqj.c();
        aktu aktuVar = new aktu(th, l(c, null));
        i(c, aktuVar);
        g(c, aktuVar);
        return aktuVar;
    }

    public static RuntimeException c() {
        return new aktu(null, l(akqj.c(), null));
    }

    public static String d(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void e(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new aktt(stackTraceElementArr));
        }
    }

    public static void f(alor alorVar) {
        algw h;
        HashMap hashMap = new HashMap();
        synchronized (akqj.b) {
            for (Map.Entry entry : akqj.b.entrySet()) {
                akry akryVar = ((akru) entry.getValue()).c;
                if (akryVar != null) {
                    hashMap.put((Thread) entry.getKey(), akryVar);
                }
            }
        }
        alpr alprVar = new alpr();
        Iterator<E> it = alorVar.keySet().iterator();
        while (it.hasNext()) {
            alprVar.c(((akry) it.next()).e());
        }
        alpt g = alprVar.g();
        int i = Integer.MAX_VALUE;
        for (akry akryVar2 : alorVar.keySet()) {
            if (akryVar2 instanceof akrb) {
                akrb akrbVar = (akrb) akryVar2;
                if (akrbVar.f() < i) {
                    i = akrbVar.f();
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            akry akryVar3 = (akry) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (!g.contains(akryVar3.e())) {
                    h = alfd.a;
                } else {
                    akry akryVar4 = akryVar3;
                    while (akryVar4 != null && (!(akryVar4 instanceof akrb) || ((akrb) akryVar4).f() >= i)) {
                        if (hashMap2.containsKey(akryVar4)) {
                            akryVar4 = (akry) hashMap2.get(akryVar4);
                            break;
                        } else if (alorVar.containsKey(akryVar4)) {
                            break;
                        } else {
                            akryVar4 = akryVar4.a();
                        }
                    }
                    akryVar4 = null;
                    for (akry akryVar5 = akryVar3; akryVar5 != akryVar4 && !hashMap2.containsKey(akryVar5); akryVar5 = akryVar5.a()) {
                        hashMap2.put(akryVar5, akryVar4);
                    }
                    h = algw.h(akryVar4);
                }
                if (h.f()) {
                    Throwable th = (Throwable) alorVar.get(h.b());
                    agka agkaVar = new agka(thread);
                    agkaVar.addSuppressed(new aktu(null, l(akryVar3, ((akry) h.b()).a())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", d(agkaVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, agkaVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(agkaVar);
                }
            }
        }
    }

    public static void g(akry akryVar, Throwable th) {
        if (aktp.u(akryVar)) {
            f(alor.l(akryVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(alor alorVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        aluq listIterator = alorVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            akry akryVar = (akry) entry.getKey();
            if (akryVar instanceof akrb) {
                aktq aktqVar = (aktq) hashMap.get(((akry) entry.getKey()).e());
                if (aktqVar == null) {
                    aktqVar = ((akrb) akryVar).a.b().c;
                    hashMap.put(akryVar.e(), aktqVar);
                }
                Map map = (Map) hashMap2.get(aktqVar);
                if (map == null) {
                    map = new HashMap();
                    hashMap2.put(aktqVar, map);
                }
                map.put(Integer.valueOf(((akrb) akryVar).f()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            aktq aktqVar2 = (aktq) entry2.getKey();
            int intValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap hashMap3 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = aktqVar2.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ((((akrg) it.next()).b & 32) == 0) {
                        break;
                    }
                } else {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            }
            akpv akpvVar = aktqVar2.i;
            if (akpvVar == null) {
                akpvVar = akpv.a;
            }
            if ((akpvVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((akrg) aktqVar2.e.get(0)).c;
                akpv akpvVar2 = aktqVar2.i;
                if (akpvVar2 == null) {
                    akpvVar2 = akpv.a;
                }
                akpu akpuVar = akpvVar2.c;
                if (akpuVar == null) {
                    akpuVar = akpu.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", d(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(akpuVar.c))), null, 0));
            }
            if (!arrayList.isEmpty()) {
                e(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                j(aktqVar2, (Map) entry2.getValue(), intValue, hashMap3);
            }
        }
    }

    public static void i(akry akryVar, Throwable th) {
        if (aktp.u(akryVar)) {
            h(alor.l(akryVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(aktq aktqVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (akrg akrgVar : alzz.ar(aktqVar.e)) {
            Integer num = null;
            if (i3 >= 10) {
                e(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((akrgVar.b & 32) == 0 && !map2.containsKey(akrgVar)) {
                apax apaxVar = aktqVar.e;
                Set keySet = map.keySet();
                boolean z = false;
                akrg akrgVar2 = akrgVar;
                while (!z) {
                    if (map2.containsKey(akrgVar2)) {
                        num = (Integer) map2.get(akrgVar2);
                    } else if (keySet.contains(Integer.valueOf(akrgVar2.d))) {
                        num = Integer.valueOf(akrgVar2.d);
                    } else {
                        int i4 = akrgVar2.e;
                        if (i4 >= i) {
                            akrgVar2 = (akrg) apaxVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                akrg akrgVar3 = akrgVar;
                while (!z2) {
                    if (!map2.containsKey(akrgVar3)) {
                        map2.put(akrgVar3, num);
                        if ((num == null || akrgVar3.e != num.intValue()) && (i2 = akrgVar3.e) >= 0) {
                            akrgVar3 = (akrg) apaxVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                algw h = algw.h(num);
                if (h.f()) {
                    i3++;
                    Throwable th = (Throwable) map.get(h.b());
                    apax apaxVar2 = aktqVar.e;
                    int intValue = ((Integer) h.b()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m(akrgVar));
                    while (akrgVar.d != intValue) {
                        akrgVar = (akrg) apaxVar2.get(akrgVar.e);
                        arrayList.add(m(akrgVar));
                    }
                    th.addSuppressed(new aktt((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static void k(Throwable th) {
        akqd.a(th);
        throw new aktu(th, l(akqj.c(), null));
    }

    public static StackTraceElement[] l(akry akryVar, akry akryVar2) {
        ArrayList arrayList = new ArrayList();
        for (akry akryVar3 = akryVar; akryVar3 != akryVar2; akryVar3 = akryVar3.a()) {
            arrayList.add(new StackTraceElement("tk_trace", d(akryVar3.c()), null, 0));
        }
        if (akryVar instanceof akqc) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement m(akrg akrgVar) {
        String str;
        if ((akrgVar.b & 32) != 0) {
            str = " " + akrgVar.h + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", d(String.valueOf(akrgVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
