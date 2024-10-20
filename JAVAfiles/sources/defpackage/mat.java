package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mat implements maq {
    public static final alwo a = alwo.o("BugleClearcutLogger");
    static final utz b;
    private static final int e;
    public aboj c;
    public final aneo d;
    private final boolean f;
    private final armf g;
    private final armf h;
    private abnr i;
    private abnr j;
    private abnr k;
    private Map l;
    private final xnv m;
    private final mdt n;
    private Map o;
    private final alhr p;
    private final acog q;
    private final mbb r;
    private final mbb s;
    private final mbb t;

    static {
        uuh.n(uuh.b, "enable_clearcut_verbose_logging", false);
        uuh.v(180745245);
        uuh.e(uuh.b, "log_loss_sample_size", 0);
        uuh.i(uuh.b, "log_loss_log_compact_sample", false);
        uuh.x(206395810, "log_cs_lib_experiment_id");
        uuh.w("enable_sample_logging");
        b = uuh.i(uuh.b, "filter_non_northstar_clearcut_logs_enable", false);
        e = (int) TimeUnit.SECONDS.toMillis(1L);
    }

    public mat(Context context, aneo aneoVar, yep yepVar, armf armfVar, wfh wfhVar, armf armfVar2, xnv xnvVar, mdt mdtVar, acog acogVar, kor korVar, armf armfVar3, mbb mbbVar, mbb mbbVar2, mbb mbbVar3) {
        this.h = armfVar;
        this.m = xnvVar;
        this.n = mdtVar;
        this.d = aneoVar;
        boolean i = yepVar.i("bugle_enable_analytics", true);
        this.f = i;
        this.g = armfVar3;
        if (i && wfhVar.U(context)) {
            this.i = new abnm((Context) korVar.a, "ANDROID_MESSAGING").a();
            this.j = korVar.r();
            this.k = korVar.s();
            this.c = new aboj(this.i, "BUGLE_COUNTERS", Integer.MAX_VALUE);
            if (((Boolean) utw.C.e()).booleanValue()) {
                this.c.h(aneoVar, e);
            }
            armfVar2.b();
            z(armfVar, this.c, true, this.i);
            this.l = new HashMap();
        } else if (!i) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 214, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because analytics GServices is not enabled.");
        } else {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 217, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because Google Play Services isn't available.");
        }
        this.p = albo.D(new ezp(yepVar, 20));
        this.q = acogVar;
        this.r = mbbVar;
        this.s = mbbVar2;
        this.t = mbbVar3;
    }

    private static boolean A(aboj abojVar, boolean z, abnr abnrVar) {
        if (!z) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 746, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled via GServices.");
            return false;
        }
        if (abnrVar != null && abojVar != null) {
            return true;
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 751, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled because Play Services isn't available.");
        return false;
    }

    private static void B(mbb mbbVar, amfq amfqVar, amrs amrsVar, Long l, Long l2) {
        mar a2 = mbbVar.a();
        a2.e(amrsVar);
        if (l != null && l2 != null) {
            a2.g(new mbh(l.longValue(), l2.longValue()));
        }
        a2.a(amfqVar, mbt.LOG_SPEC_LEGACY_LOGGING);
    }

    private final void C(aboj abojVar, String str, long j) {
        if (!s(abojVar, str)) {
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, str);
        n.X(mdu.f, Long.valueOf(j));
        n.X(mdu.a, 1L);
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 669, "BugleClearcutLoggerImpl.java")).q("Incrementing long histogram.");
        v(abojVar, str, new maa(abojVar, str, j, 3));
    }

    private final synchronized Optional t(String str) {
        Map map = this.l;
        if (map == null) {
            return Optional.empty();
        }
        if (!map.containsKey(str)) {
            aboj abojVar = new aboj(this.i, "BUGLE_COUNTERS", Integer.MAX_VALUE);
            abojVar.i(((mbn) this.h.b()).b(str));
            this.l.put(str, abojVar);
        }
        return Optional.of((aboj) this.l.get(str));
    }

    private final synchronized Map u() {
        if (this.o == null) {
            this.o = new ArrayMap();
            for (String str : anna.e(',').a((String) utw.v.e())) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        int indexOf = str.indexOf(58);
                        this.o.put(str.substring(0, indexOf), Double.valueOf(Double.parseDouble(str.substring(indexOf + 1))));
                    } catch (Exception e2) {
                        ((alwl) ((alwl) ((alwl) a.h()).g(e2)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "getHistogramUploadRatios", 789, "BugleClearcutLoggerImpl.java")).t("Error parsing %s", str);
                    }
                }
            }
        }
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arwe, java.lang.Object] */
    private final void v(aboj abojVar, String str, Runnable runnable) {
        akul c;
        lru lruVar = (lru) this.g.b();
        str.getClass();
        c = qjh.c(lruVar.c, arpj.a, arwf.a, new mlg(lruVar, str, (arpe) null, 1));
        qiu.h(c.h(new kxr(this, runnable, abojVar, 2), this.d));
    }

    private final void w(aboj abojVar, String str, long j) {
        if (!A(this.c, this.f, this.i)) {
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, str);
        n.X(mdu.a, Long.valueOf(j));
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 590, "BugleClearcutLoggerImpl.java")).q("Incrementing counter.");
        v(abojVar, str, new maa(abojVar, str, j, 2));
    }

    private final void x(aboj abojVar, String str, int i, long j) {
        if (!s(abojVar, str)) {
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, str);
        n.X(mdu.e, Integer.valueOf(i));
        n.X(mdu.a, Long.valueOf(j));
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementIntegerHistogram", 627, "BugleClearcutLoggerImpl.java")).q("Incrementing integer histogram.");
        v(abojVar, str, new rbq(abojVar, str, i, j, 1));
    }

    private final void y(amfq amfqVar, abnr abnrVar, amrs amrsVar, double d, Long l, Long l2, boolean z) {
        boolean z2;
        boolean z3;
        if (d >= 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        if (d <= 100.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        d.s(z3);
        if (this.q.a() < d) {
            if (((Boolean) b.e()).booleanValue()) {
                amfp b2 = amfp.b(((amfr) amfqVar.b).i);
                if (b2 == null) {
                    b2 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 12 || ordinal == 18 || ordinal == 23 || ordinal == 37 || ordinal == 40 || ordinal == 44 || ordinal == 60 || ordinal == 88 || ordinal == 108 || ordinal == 28 || ordinal == 29) {
                    return;
                }
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfp b3 = amfp.b(amfrVar.i);
            if (b3 == null) {
                b3 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            if (b3 == amfp.BUGLE_MESSAGE) {
                amgu amguVar = amfrVar.k;
                if (amguVar == null) {
                    amguVar = amgu.a;
                }
                int aJ = a.aJ(amguVar.g);
                if (aJ == 0 || aJ == 1) {
                    return;
                }
            }
            aktp.aa(this.n.f(this.m.f().toEpochMilli()), new ydv(new ldx(14), new ldx(15), 0), andi.a);
            if (this.f && abnrVar != null) {
                if (amfqVar != null) {
                    ((Optional) this.p.get()).ifPresent(new leq(amfqVar, 18));
                }
                if (!abnrVar.e()) {
                    if (!abnrVar.j.equals(abon.c) && !z) {
                        B(this.r, amfqVar, amrsVar, l, l2);
                        return;
                    } else {
                        B(this.s, amfqVar, amrsVar, l, l2);
                        return;
                    }
                }
                B(this.t, amfqVar, amrsVar, l, l2);
            }
        }
    }

    private static void z(armf armfVar, aboj abojVar, boolean z, abnr abnrVar) {
        amfk a2 = ((mbn) armfVar.b()).a();
        alvw n = a.n();
        n.X(mdu.h, a2.c);
        alvz alvzVar = mdu.i;
        int ab = a.ab(a2.e);
        if (ab == 0) {
            ab = 1;
        }
        n.X(alvzVar, Integer.valueOf(ab - 1));
        n.X(mdu.j, a2.r);
        n.X(mdu.k, a2.f);
        n.X(mdu.l, a2.g);
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "logCustomDimensions", 739, "BugleClearcutLoggerImpl.java")).q("---COUNTER DIMENSIONS---");
        if (!A(abojVar, z, abnrVar)) {
            return;
        }
        abojVar.i(a2);
    }

    @Override // defpackage.maq
    public final void a() {
        aiut.b();
        aboj abojVar = this.c;
        if (abojVar == null) {
            return;
        }
        try {
            actx.v(abojVar.f(), 1100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.maq
    public final void b() {
        aiut.b();
        aboj abojVar = this.c;
        if (abojVar == null) {
            return;
        }
        xnv xnvVar = this.m;
        acir f = abojVar.f();
        long a2 = xnvVar.a();
        this.i.g.c(TimeUnit.MILLISECONDS);
        try {
            actx.v(f, Math.max(0L, 1100 - (this.m.a() - a2)), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.maq
    public final void c(String str, amdy amdyVar, long j) {
        if (!s(this.c, str)) {
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, str);
        n.X(mdu.g, amdyVar.name());
        n.X(mdu.a, Long.valueOf(j));
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementActionHistogramBy", 691, "BugleClearcutLoggerImpl.java")).q("Incrementing action histogram.");
        aozy createBuilder = amfk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfk amfkVar = (amfk) apagVar;
        amfkVar.t = amdyVar.bI;
        amfkVar.b |= 131072;
        int i = xyp.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amfk amfkVar2 = (amfk) createBuilder.b;
        int i2 = i - 1;
        if (i != 0) {
            amfkVar2.u = i2;
            amfkVar2.b |= 262144;
            v(this.c, str, new prc(this, str, j, (amfk) createBuilder.s(), 1));
            return;
        }
        throw null;
    }

    @Override // defpackage.maq
    public final void d(String str) {
        w(this.c, str, 1L);
    }

    @Override // defpackage.maq
    public final void e(String str, int i) {
        w(this.c, str, i);
    }

    @Override // defpackage.maq
    public final void f(String str, int i) {
        x(this.c, str, i, 1L);
    }

    @Override // defpackage.maq
    public final void g(String str, int i, long j) {
        x(this.c, str, i, j);
    }

    @Override // defpackage.maq
    public final void h(String str, long j) {
        C(this.c, str, j);
    }

    @Override // defpackage.maq
    public final void i(String str, long j, String str2) {
        Optional t = t(str2);
        if (t.isPresent()) {
            C((aboj) t.get(), str, j);
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, str);
        n.X(mdu.k, str2);
        n.X(mdu.f, Long.valueOf(j));
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 649, "BugleClearcutLoggerImpl.java")).q("Unable to increment long histogram for rbm bot.");
    }

    @Override // defpackage.maq
    public final void j(amfq amfqVar) {
        k(amfqVar, amrs.UNKNOWN_BUGLE_EVENT_CODE);
    }

    @Override // defpackage.maq
    public final void k(amfq amfqVar, amrs amrsVar) {
        y(amfqVar, this.i, amrsVar, 100.0d, null, null, false);
    }

    @Override // defpackage.maq
    public final void l(amfq amfqVar, amrs amrsVar, long j) {
        y(amfqVar, this.i, amrsVar, 100.0d, Long.valueOf(j), null, false);
    }

    @Override // defpackage.maq
    public final void m(amfq amfqVar, amrs amrsVar, mbh mbhVar) {
        long j = mbhVar.b;
        y(amfqVar, this.i, amrsVar, 100.0d, Long.valueOf(mbhVar.a), Long.valueOf(j), false);
    }

    @Override // defpackage.maq
    public final void n(amfq amfqVar) {
        y(amfqVar, this.j, amrs.UNKNOWN_BUGLE_EVENT_CODE, 100.0d, null, null, false);
    }

    @Override // defpackage.maq
    public final void o(amfq amfqVar) {
        y(amfqVar, this.k, amrs.UNKNOWN_BUGLE_EVENT_CODE, 100.0d, null, null, true);
    }

    @Override // defpackage.maq
    public final void p(amfq amfqVar, double d) {
        y(amfqVar, this.i, amrs.UNKNOWN_BUGLE_EVENT_CODE, d, null, null, false);
    }

    @Override // defpackage.maq
    public final void q() {
        z(this.h, this.c, this.f, this.i);
    }

    @Override // defpackage.maq
    public final void r() {
        Optional t = t("112855188");
        if (t.isPresent()) {
            w((aboj) t.get(), "Bugle.BugOccurrence.Counts", 1L);
            return;
        }
        alvw n = a.n();
        n.X(mdu.b, "Bugle.BugOccurrence.Counts");
        n.X(mdu.k, "112855188");
        n.X(mdu.a, 1L);
        ((alwl) n.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 572, "BugleClearcutLoggerImpl.java")).q("Unable to increment counter for rbm bot.");
    }

    final boolean s(aboj abojVar, String str) {
        if (!A(abojVar, this.f, this.i)) {
            return false;
        }
        Double d = (Double) u().get(str);
        if (d != null && ThreadLocalRandom.current().nextDouble() >= d.doubleValue()) {
            return false;
        }
        return true;
    }
}
