package defpackage;

import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqj {
    public static final boolean a;
    public static final WeakHashMap b;
    public static final ThreadLocal c;
    public static final Deque d;
    public static final Deque e;
    public static final Object f;
    public static final Runnable g;
    public static int h;
    public static int i;
    public static akry j;
    private static final alpt k;
    private static alpt l;
    private static final AtomicReference m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class a {
        public static boolean a() {
            boolean isEnabled;
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
    }

    static {
        alpt u = alpt.u("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl.isCrashLoopMonitorEnabled", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        k = u;
        l = u;
        a = true;
        m = new AtomicReference(altg.a);
        b = new WeakHashMap();
        new akqm();
        c = new akqi();
        d = new ArrayDeque();
        e = new ArrayDeque();
        f = new Object();
        g = new akqg(0);
        i = 0;
    }

    public static akrc a(akrc akrcVar) {
        if (akrcVar != null && !(akrcVar instanceof akry)) {
            throw new IllegalStateException("RootTrace object can't be casted to Trace, this might be caused by duplicate trace error");
        }
        return g((akry) akrcVar);
    }

    public static akru b() {
        return (akru) c.get();
    }

    public static akry c() {
        return b().c;
    }

    static akry d() {
        return (akry) e.peek();
    }

    public static akry e() {
        akru b2 = b();
        akry akryVar = b2.c;
        if (akryVar != null) {
            return akryVar;
        }
        return akqu.k(b2);
    }

    public static akry f() {
        akry akryVar = j;
        if (akryVar == null) {
            return null;
        }
        j = null;
        return akryVar;
    }

    public static akry g(akry akryVar) {
        return h(b(), akryVar);
    }

    public static akry h(akru akruVar, akry akryVar) {
        if (akruVar.e != null) {
            return w(akruVar, akryVar, 2);
        }
        return w(akruVar, akryVar, 4);
    }

    public static akry i(akru akruVar, akry akryVar) {
        akry akryVar2 = akruVar.d;
        akruVar.d = akryVar;
        return akryVar2;
    }

    public static aksa j() {
        z();
        return new akqh(0);
    }

    public static aksa k() {
        akru b2 = b();
        if (!b2.a) {
            return new akqh(2);
        }
        aksa aksaVar = b2.c;
        if (aksaVar == null) {
            aksaVar = akqu.k(b2);
        }
        d.add(aksaVar);
        aiut.e(g);
        return new akqh(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alpt l() {
        return (alpt) m.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String m(String str) {
        if (str.length() > 127) {
            return str.substring(0, 127);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fd, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        r15 = r1.c.d;
        r4 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        if (r15.containsKey(r4) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r1.c.d.put(r4, new defpackage.akrp(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d1, code lost:
    
        r1.d = r7;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cc, code lost:
    
        if (r1.c(r12, r13, r14, (r14 + r13) - r12) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String n(defpackage.akry r16) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.n(akry):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(akry akryVar) {
        akru b2 = b();
        akry akryVar2 = b2.c;
        if (akryVar2 != null) {
            if (akryVar == akryVar2) {
                h(b2, akryVar2.a());
                return;
            }
            throw new akql("Tried to end span " + akryVar.c() + ", but that span is not the current span. The current span is " + akryVar2.c() + ".");
        }
        throw new akqk("Tried to end [" + akryVar.c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
    }

    public static void p() {
        int i2 = h;
        int i3 = i2 - 1;
        h = i3;
        if (i3 >= 0) {
            if (i == i2) {
                albo.U(!e.isEmpty(), "current async trace should not be null");
                g(null);
                i = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException("More calls to pause than to resume");
    }

    public static void q() {
        j = c();
        aiut.e(new akqg(2));
    }

    public static void r() {
        akry d2;
        h++;
        if (i == 0) {
            akru b2 = b();
            if (b2.c == null && (d2 = d()) != null) {
                h(b2, d2);
                i = h;
            }
        }
    }

    public static void s(alpt alptVar) {
        alpr alprVar = new alpr();
        alprVar.j(alptVar);
        alprVar.j(k);
        l = alprVar.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(Throwable th) {
        if (l.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            aluq listIterator = l.listIterator();
            while (listIterator.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) listIterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u() {
        akry c2 = c();
        if (c2 != null && c2 != akrf.a) {
            return true;
        }
        return false;
    }

    public static boolean v() {
        akry d2 = d();
        if (d2 != null) {
            if (!(d2 instanceof akqc) || ((akqc) d2).h()) {
                r();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009c, code lost:
    
        if (r8.p() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a6, code lost:
    
        if (r0.p() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a8, code lost:
    
        r3 = (int) android.os.SystemClock.currentThreadTimeMillis();
        r4 = r3 - r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b1, code lost:
    
        if (r4 <= 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b3, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b9, code lost:
    
        if (r0.p() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bb, code lost:
    
        r0.n(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00be, code lost:
    
        r7.f = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.akry w(defpackage.akru r7, defpackage.akry r8, int r9) {
        /*
            akry r0 = r7.c
            r1 = 2
            if (r0 != r8) goto Le
            if (r9 == r1) goto Ld
            r2 = 4
            if (r9 == r2) goto Ld
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return r8
        Le:
            if (r0 != 0) goto L1e
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L1b
            boolean r2 = akqj.a.a()
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r7.b = r2
        L1e:
            aktx r2 = r7.e
            boolean r3 = r7.b
            r4 = 0
            if (r3 == 0) goto L93
            if (r2 == 0) goto L62
            int r3 = r9 + (-1)
            if (r3 == 0) goto L33
            if (r3 == r1) goto L30
            r5 = r8
            r3 = r0
            goto L35
        L30:
            r3 = r0
            r5 = r4
            goto L35
        L33:
            r5 = r8
            r3 = r4
        L35:
            if (r3 == 0) goto L5c
            if (r5 == 0) goto L59
            akry r6 = r3.a()
            if (r6 != r5) goto L49
            boolean r6 = r2.d(r3)
            if (r6 != 0) goto L49
            android.os.Trace.endSection()
            goto L93
        L49:
            akry r6 = r5.a()
            if (r3 != r6) goto L59
            boolean r6 = r2.d(r5)
            if (r6 != 0) goto L59
            defpackage.aktx.a(r5)
            goto L93
        L59:
            r2.c(r3)
        L5c:
            if (r5 == 0) goto L93
            r2.b(r5)
            goto L93
        L62:
            if (r0 == 0) goto L8d
            if (r8 == 0) goto L88
            akry r3 = r0.a()
            if (r3 != r8) goto L76
            boolean r3 = defpackage.aktp.o(r0)
            if (r3 != 0) goto L76
            android.os.Trace.endSection()
            goto L93
        L76:
            akry r3 = r8.a()
            if (r0 != r3) goto L86
            boolean r3 = defpackage.aktp.o(r8)
            if (r3 != 0) goto L86
            defpackage.aktp.l(r8)
            goto L93
        L86:
            r3 = r8
            goto L89
        L88:
            r3 = r4
        L89:
            defpackage.aktp.n(r0)
            goto L8e
        L8d:
            r3 = r8
        L8e:
            if (r3 == 0) goto L93
            defpackage.aktp.m(r3)
        L93:
            if (r0 != r8) goto L96
            return r8
        L96:
            if (r8 == 0) goto L9f
            boolean r3 = r8.p()
            if (r3 == 0) goto La0
            goto La8
        L9f:
            r8 = r4
        La0:
            if (r0 == 0) goto Lc0
            boolean r3 = r0.p()
            if (r3 == 0) goto Lc0
        La8:
            long r3 = android.os.SystemClock.currentThreadTimeMillis()
            int r3 = (int) r3
            int r4 = r7.f
            int r4 = r3 - r4
            if (r4 <= 0) goto Lbe
            if (r0 == 0) goto Lbe
            boolean r5 = r0.p()
            if (r5 == 0) goto Lbe
            r0.n(r4)
        Lbe:
            r7.f = r3
        Lc0:
            r7.c = r8
            if (r9 != r1) goto Lc9
            r2.getClass()
            r2.a = r8
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqj.w(akru, akry, int):akry");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x() {
        y(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(boolean z) {
        IllegalStateException illegalStateException;
        boolean t;
        if (akrz.a()) {
            akry c2 = c();
            if (c2 != null && !(c2 instanceof akrf)) {
                if (c2 instanceof akqc) {
                    illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((akqc) c2).g());
                } else {
                    illegalStateException = null;
                }
            } else {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            }
            if (illegalStateException != null) {
                if (c2 instanceof akqc) {
                    t = ((akqc) c2).h();
                } else {
                    t = t(illegalStateException);
                }
                if (!t) {
                    if (z) {
                        Log.e("Tracer", "Missing trace", illegalStateException);
                        return;
                    }
                    throw illegalStateException;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z() {
        akry d2;
        h++;
        if (i == 0) {
            akru b2 = b();
            if (b2.c == null && (d2 = d()) != null) {
                h(b2, d2);
                i = h;
            }
        }
    }
}
