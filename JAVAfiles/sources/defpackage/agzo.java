package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzo implements aguc {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager");
    public static final agyb b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public volatile List e;
    public final ArrayDeque f;
    public final AtomicInteger g;
    public volatile boolean h;
    public amak i;
    private final anen j;
    private volatile anen k;
    private final agzp l;
    private final aegu m;
    private volatile boolean n;
    private volatile int o;
    private final agyc p;
    private volatile aglo q;

    static {
        long j;
        if (true != ahaz.a) {
            j = 500;
        } else {
            j = 1000;
        }
        b = agyd.a("timer_default_sample_rate", j);
    }

    public agzo(aegu aeguVar, anen anenVar) {
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = null;
        this.f = new ArrayDeque();
        this.i = null;
        this.g = new AtomicInteger(0);
        agyc agycVar = new agyc() { // from class: agzl
        };
        this.p = agycVar;
        this.q = new aglo();
        this.m = aeguVar;
        agzp agzpVar = new agzp();
        this.l = agzpVar;
        agzpVar.b = new aglo();
        agyb agybVar = b;
        this.o = ((Long) agybVar.b()).intValue();
        agyd.c(agycVar, agybVar);
        agub.a.a(this);
        this.j = anenVar;
    }

    public final anen a() {
        return this.j;
    }

    public final void b(agzf agzfVar, Object... objArr) {
        agzj agzjVar = this.l.a;
        if (agzfVar != agzk.BEGIN_SESSION && agzfVar != agzk.END_SESSION) {
            this.m.f().toEpochMilli();
            SystemClock.elapsedRealtime();
            agzfVar.b();
            if (d(agzfVar)) {
                if (this.g.get() <= 0 && this.c.get(agzfVar) == null) {
                    return;
                }
                final agrk agrkVar = new agrk(agzfVar, objArr);
                c(albo.bL(new Runnable() { // from class: agzm
                    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Queue] */
                    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Queue] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        amak amakVar;
                        boolean z;
                        alia aliaVar;
                        agzo agzoVar = agzo.this;
                        agzoVar.f.add(agrkVar);
                        if (ahaw.a) {
                            agzoVar.i = new amak(new ahlp((int[]) null));
                        }
                        while (!agzoVar.f.isEmpty()) {
                            agrk agrkVar2 = (agrk) agzoVar.f.poll();
                            if (agrkVar2 != null) {
                                ConcurrentHashMap concurrentHashMap = agzoVar.c;
                                Object obj = agrkVar2.a;
                                agze[] agzeVarArr = (agze[]) concurrentHashMap.get(obj);
                                char c = 0;
                                if (agzeVarArr != null && obj != agzb.a) {
                                    int length = agzeVarArr.length;
                                    int i = 0;
                                    while (i < length) {
                                        agze agzeVar = agzeVarArr[i];
                                        try {
                                            boolean z2 = agzoVar.h;
                                            if (!agzeVar.a()) {
                                                agzeVar.b();
                                            }
                                        } finally {
                                            if (!z) {
                                                i++;
                                                c = 0;
                                            }
                                        }
                                        i++;
                                        c = 0;
                                    }
                                } else {
                                    ((alvg) ((alvg) agzo.a.f()).h("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "processMetricsImpl", 793, "MetricsManager.java")).D("Metrics are not logged: MetricsType=%s, IMetricsProcessor=%s", obj, new ivm(agzeVarArr, 11));
                                }
                                Object obj2 = agrkVar2.b;
                                int i2 = 0;
                                while (true) {
                                    Object[] objArr2 = (Object[]) obj2;
                                    if (i2 >= objArr2.length) {
                                        break;
                                    }
                                    Object obj3 = objArr2[i2];
                                    if (obj3 != null && !(obj3 instanceof Integer) && !(obj3 instanceof Boolean) && !(obj3 instanceof Long) && !(obj3 instanceof String) && !(obj3 instanceof Double) && !(obj3 instanceof Float)) {
                                        if (obj3 instanceof agsq) {
                                            ((agsq) obj3).a();
                                        } else if (obj3 instanceof MotionEvent) {
                                            ((MotionEvent) obj3).recycle();
                                        }
                                    }
                                    i2++;
                                }
                                if (ahaw.a && (amakVar = agzoVar.i) != null && new amab(amakVar).size() != 0) {
                                    HashMap aj = alzz.aj(amakVar.d().size());
                                    for (Object obj4 : amakVar.d()) {
                                        ArrayDeque arrayDeque = new ArrayDeque();
                                        arrayDeque.addLast(new aohs(obj4, (byte[]) null));
                                        while (!arrayDeque.isEmpty()) {
                                            aohs aohsVar = (aohs) arrayDeque.removeLast();
                                            arrayDeque.addLast(aohsVar);
                                            Object obj5 = aohsVar.b;
                                            if (aohsVar.a == null) {
                                                aman amanVar = (aman) aj.get(obj5);
                                                if (amanVar == aman.COMPLETE) {
                                                    arrayDeque.removeLast();
                                                } else {
                                                    aman amanVar2 = aman.PENDING;
                                                    if (amanVar != amanVar2) {
                                                        aj.put(obj5, amanVar2);
                                                        aohsVar.a = new ArrayDeque(amakVar.e(obj5));
                                                    } else {
                                                        throw new IllegalStateException(String.format(Locale.getDefault(), "Cycle detected while processing metrics type: %s", agrkVar2.a));
                                                    }
                                                }
                                            }
                                            if (!aohsVar.a.isEmpty()) {
                                                arrayDeque.addLast(new aohs(aohsVar.a.remove(), (byte[]) null));
                                            } else {
                                                arrayDeque.removeLast();
                                                aj.put(obj5, aman.COMPLETE);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (ahaw.a) {
                            agzoVar.i = null;
                        }
                    }
                }, a()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Metrics type [%s] should not be used by developers.", agzfVar));
    }

    public final void c(ListenableFuture listenableFuture) {
        albo.bR(listenableFuture, new adnx(this, 9), andi.a);
    }

    public final boolean d(agzi agziVar) {
        int a2 = agziVar.a();
        if (a2 == -1) {
            if (agziVar instanceof agzh) {
                a2 = this.o;
            } else {
                a2 = 1000;
            }
        }
        if (a2 >= 1000 || a2 < 0) {
            return true;
        }
        if (a2 != 0 && ThreadLocalRandom.current().nextInt(0, 1000) < a2) {
            return true;
        }
        return false;
    }
}
