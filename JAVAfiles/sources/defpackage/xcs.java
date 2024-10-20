package defpackage;

import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcs {
    public static final utz a = uuh.e(uuh.b, "message_in_memory_window_sec", 15);
    public static final alvi b;
    public static final xze c;
    public static final ahka d;
    public static final ahka e;
    public static final alog f;
    public static final alog g;
    public static final alog h;
    public static final alog i;
    public static final uuf j;
    public static final uuf k;
    public static final uuf l;
    public static final uuf m;
    public static final uuf n;
    private static final ahka v;
    private static final ahka w;
    private static final ahka x;
    private final oby A;
    private final ConcurrentHashMap C;
    public final ahqr o;
    public final xnv p;
    public final armf q;
    public final armf r;
    public final alog u;
    private final aneo y;
    private final armf z;
    public final AtomicInteger s = new AtomicInteger(0);
    private long B = 0;
    public final AtomicInteger t = new AtomicInteger();

    static {
        uuh.e(uuh.b, "receive_message_timer_removal_delay_sec", 45);
        b = alvi.m("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics");
        c = xze.g("MessageLatencyAnalytics", "Performance");
        v = new ahka("MLA::NamedTrace::pressButtonToVisible");
        w = new ahka("MLA::NamedTrace::pressButtonToVisibleFromDisk");
        d = new ahka("MLA::NamedTrace::pressButtonToTachygramStartingSend");
        e = new ahka("MLA::NamedTrace::pressButtonToTachygramFinishedSend");
        x = new ahka("MLA::NamedTrace::pressButtonToSentVisible");
        alog s = alog.s(xcr.SEND_BUTTON_ACCURATE, xcr.SEND_BUTTON_LEGACY);
        f = s;
        alob alobVar = new alob();
        alobVar.j(s);
        alobVar.h(xcr.NOTIFICATION);
        alog g2 = alobVar.g();
        g = g2;
        alob alobVar2 = new alob();
        alobVar2.j(g2);
        alobVar2.h(xcr.TACHYGRAM_FINISHED_SENDING);
        h = alobVar2.g();
        i = alog.s(xcr.TICKLE_ARRIVED, xcr.TACHYGRAM_MESSAGE_ARRIVED);
        j = uuh.r(239071186, "enable_prime_metrics_for_message_latency");
        k = uuh.r(239071186, "enable_prime_metrics_for_compose_view_peer");
        l = uuh.r(249281779, "enable_prime_metrics_for_receive_message_latency");
        m = uuh.r(249281779, "enable_tachygram_to_sent_visible_latency");
        n = uuh.r(248087153, "enable_macro_benchmark_named_trace");
    }

    public xcs(ahqr ahqrVar, xnv xnvVar, aneo aneoVar, armf armfVar, oby obyVar, armf armfVar2, armf armfVar3) {
        Stream map = DesugarArrays.stream(xcr.values()).map(new wmi(18));
        int i2 = alog.d;
        this.u = (alog) map.collect(alls.a);
        this.C = new ConcurrentHashMap();
        this.o = ahqrVar;
        this.p = xnvVar;
        this.y = aneoVar;
        this.z = armfVar;
        this.A = obyVar;
        this.q = armfVar2;
        this.r = armfVar3;
    }

    public static ahka a(int i2) {
        switch (i2) {
            case -1:
            case 4:
            case 5:
            case 6:
                return new ahka("Unknown");
            case 0:
                return new ahka("Sms");
            case 1:
            case 2:
                return new ahka("Mms");
            case 3:
                return new ahka("Rcs");
            default:
                return new ahka("UnknownDefault");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(String str, ahka ahkaVar, ashu ashuVar, alog alogVar) {
        for (int i2 = 0; i2 < ((alsx) alogVar).c; i2++) {
            xcr xcrVar = (xcr) alogVar.get(i2);
            ahka a2 = ahka.a(xcrVar.g, ahkaVar);
            xcq xcqVar = (xcq) ((ConcurrentHashMap) this.u.get(xcrVar.ordinal())).get(str);
            if (xcqVar == null) {
                ((alvg) ((alvg) b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 959, "MessageLatencyAnalytics.java")).J("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, ahkaVar, xcrVar);
            } else if (this.B > xcqVar.a) {
                ((alvg) ((alvg) b.d()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 968, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, ahkaVar);
            } else {
                xcqVar.b(a2, ashuVar);
            }
        }
    }

    private final void q() {
        armf armfVar = this.q;
        int incrementAndGet = this.t.incrementAndGet();
        ((kor) armfVar.b()).h(v, incrementAndGet);
        ((kor) this.q.b()).h(w, incrementAndGet);
        ((kor) this.q.b()).h(d, incrementAndGet);
        ((kor) this.q.b()).h(e, incrementAndGet);
        ((kor) this.q.b()).h(x, incrementAndGet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(xcr xcrVar, String str, xcq xcqVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.u.get(xcrVar.ordinal());
        if (concurrentHashMap.mappingCount() > 300) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "addTracker", 375, "MessageLatencyAnalytics.java")).q("Exceeded limit of tracked messages");
            concurrentHashMap.clear();
        }
        if (((xcq) concurrentHashMap.putIfAbsent(str, xcqVar)) != null) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "logDuplicateTimer", 268, "MessageLatencyAnalytics.java")).D("Duplicate trace for startPoint=%s and traceId=%s. Ignoring", new aomj(aomi.NO_USER_DATA, xcrVar.g), str);
        }
    }

    public final void c() {
        ((alvg) ((alvg) b.d()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "conversationScreenOpened", 900, "MessageLatencyAnalytics.java")).q("Recording new conversation screen open time.");
        this.B = this.p.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str, String str2) {
        if (((Boolean) l.e()).booleanValue()) {
            alog alogVar = this.u;
            int size = alogVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) alogVar.get(i2);
                if (concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str2, (xcq) concurrentHashMap.get(str));
                }
            }
        }
    }

    public final void e(xcr xcrVar, String str) {
        xcq xcqVar = (xcq) this.C.remove(xcrVar);
        if (xcqVar == null) {
            return;
        }
        b(xcrVar, str, xcqVar);
    }

    public final void f(String str, int i2, alog alogVar) {
        qiu.e(this.y.schedule(akto.j(new vri(this, alogVar, str, 9, (int[]) null)), i2, TimeUnit.SECONDS));
    }

    public final void g(xcr xcrVar, String str) {
        if (((Boolean) j.e()).booleanValue()) {
            if (!this.A.a() || xcrVar != xcr.SEND_BUTTON_LEGACY) {
                b(xcrVar, str, new xcq(this));
                if (((Boolean) n.e()).booleanValue() && xcrVar.equals(xcr.SEND_BUTTON_ACCURATE)) {
                    q();
                }
            }
        }
    }

    public final void h(xcr xcrVar) {
        if (((Boolean) j.e()).booleanValue()) {
            if (!this.A.a() || xcrVar != xcr.SEND_BUTTON_LEGACY) {
                if (((xcq) this.C.put(xcrVar, new xcq(this))) != null) {
                    ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "startTrackingGlobal", 249, "MessageLatencyAnalytics.java")).t("Previous global tracker for start point was still not consumed. %s", xcrVar.g);
                }
                if (((Boolean) n.e()).booleanValue() && xcrVar.equals(xcr.SEND_BUTTON_ACCURATE)) {
                    q();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(String str, ahka ahkaVar, alog alogVar) {
        for (int i2 = 0; i2 < ((alsx) alogVar).c; i2++) {
            xcr xcrVar = (xcr) alogVar.get(i2);
            ahka a2 = ahka.a(xcrVar.g, ahkaVar);
            xcq xcqVar = (xcq) ((ConcurrentHashMap) this.u.get(xcrVar.ordinal())).get(str);
            if (xcqVar == null) {
                ((alvg) ((alvg) b.f()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 922, "MessageLatencyAnalytics.java")).J("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, ahkaVar, xcrVar);
            } else if (this.B > xcqVar.a) {
                ((alvg) ((alvg) b.f()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 931, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, ahkaVar);
            } else {
                xcqVar.a(a2);
            }
        }
    }

    public final void j(String str, ashu ashuVar, int i2) {
        ahka ahkaVar = new ahka("ToVisible");
        if (ashuVar != null) {
            p(str, ahkaVar, ashuVar, i);
        }
        alog alogVar = i;
        i(str, ahkaVar, alogVar);
        i(str, ahka.a(ahkaVar, a(i2)), alogVar);
    }

    public final void k(String str, ashu ashuVar, int i2) {
        ahka ahkaVar = new ahka("ToDeliveredVisible");
        if (ashuVar != null) {
            p(str, ahkaVar, ashuVar, g);
            p(str, ahkaVar, ashuVar, i);
        }
        alog alogVar = g;
        i(str, ahkaVar, alogVar);
        i(str, ahkaVar, i);
        i(str, ahka.a(ahkaVar, a(i2)), alogVar);
    }

    public final void l(String str, ashu ashuVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((kor) this.q.b()).l(x, this.t.get());
        }
        ahka ahkaVar = new ahka("ToSentVisible");
        if (ashuVar != null) {
            p(str, ahkaVar, ashuVar, h);
        }
        i(str, ahkaVar, g);
        i(str, ahka.a(ahkaVar, a(i2)), h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(String str, ashu ashuVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((kor) this.q.b()).l(v, this.t.get());
        }
        ahka ahkaVar = new ahka("ToVisible");
        alog alogVar = g;
        p(str, ahkaVar, ashuVar, alogVar);
        i(str, ahkaVar, alogVar);
        i(str, ahka.a(ahkaVar, a(i2)), f);
        ((ConcurrentHashMap) this.u.get(xcr.SEND_BUTTON_ACCURATE.ordinal())).get(str);
    }

    public final void n(String str, ashu ashuVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((kor) this.q.b()).l(w, this.t.get());
        }
        ahka ahkaVar = new ahka("ToVisibleFromDisk");
        alog alogVar = f;
        p(str, ahkaVar, ashuVar, alogVar);
        i(str, ahka.a(ahkaVar, a(i2)), alogVar);
    }

    public final void o(String str, ahka ahkaVar, xcr... xcrVarArr) {
        i(str, ahkaVar, alog.p(xcrVarArr));
    }
}
