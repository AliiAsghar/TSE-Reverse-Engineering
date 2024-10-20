package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advh {
    public static aboj b;
    private static abnr c;
    private static adtl f;
    private static abqa g;
    private static yjy h;
    private static acjj i;
    private static anen j;
    public static final advp a = new advp("RcsAnalyticsUtil");
    private static final SparseArray d = new SparseArray();
    private static final AtomicInteger e = new AtomicInteger();

    public static int a(String str) {
        abnz abnzVar;
        if (!h()) {
            advr.d(a, "Analytics are disabled. Ignoring UMA timer %s", str);
            return -1;
        }
        aboj abojVar = b;
        abojVar.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = abojVar.d;
        abob abobVar = aboj.k;
        reentrantReadWriteLock.writeLock().lock();
        try {
            abny abnyVar = (abny) abojVar.h.get(str);
            if (abnyVar == null) {
                abnzVar = (aboi) abojVar.b(str, new tdw(abojVar, str, abobVar, 17, (short[]) null));
            } else {
                try {
                    abnz abnzVar2 = (abnz) abnyVar;
                    if (abobVar.equals(abnzVar2.f)) {
                        abojVar.d.writeLock().unlock();
                        abnzVar = abnzVar2;
                    } else {
                        throw new IllegalArgumentException(a.cp(str, "alias mismatch: "));
                    }
                } catch (ClassCastException e2) {
                    throw new IllegalArgumentException(a.cp(str, "another type of counter exists with name: "), e2);
                }
            }
            aboh abohVar = new aboh((aboi) abnzVar);
            int andIncrement = e.getAndIncrement();
            SparseArray sparseArray = d;
            synchronized (sparseArray) {
                sparseArray.put(andIncrement, abohVar);
            }
            return andIncrement;
        } finally {
            abojVar.d.writeLock().unlock();
        }
    }

    public static amjd b(Context context) {
        String m = adwt.g(context).m();
        aozy createBuilder = amjd.a.createBuilder();
        if (m != null) {
            if (m.length() >= 5) {
                int parseInt = Integer.parseInt(m.substring(0, 3));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amjd amjdVar = (amjd) createBuilder.b;
                amjdVar.b = 1 | amjdVar.b;
                amjdVar.c = parseInt;
                int parseInt2 = Integer.parseInt(m.substring(3));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amjd amjdVar2 = (amjd) createBuilder.b;
                amjdVar2.b |= 2;
                amjdVar2.d = parseInt2;
                return (amjd) createBuilder.s();
            }
        }
        advr.d(a, "Invalid mcc/mnc from system %s.", m);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amjd amjdVar3 = (amjd) apagVar;
        amjdVar3.b = 1 | amjdVar3.b;
        amjdVar3.c = 0;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amjd amjdVar4 = (amjd) createBuilder.b;
        amjdVar4.b |= 2;
        amjdVar4.d = 0;
        return (amjd) createBuilder.s();
    }

    public static void c(int i2) {
        if (i2 == -1) {
            advr.d(a, "CancelTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            sparseArray.remove(i2);
        }
    }

    public static void d(String str) {
        if (!h()) {
            advr.d(a, "Analytics are disabled. Ignoring UMA counter %s", str);
            return;
        }
        aboj abojVar = b;
        abojVar.getClass();
        abojVar.c(str).a(0L, 1L, aboj.b);
        f();
    }

    public static void e(Context context, adtl adtlVar, abqa abqaVar, yjy yjyVar, anen anenVar, acjj acjjVar) {
        g = abqaVar;
        h = yjyVar;
        i = acjjVar;
        j = anenVar;
        abqaVar.getClass();
        if (abqaVar.h(context, 12200000) == 0) {
            f = adtlVar;
            c = new abnm(context, "ANDROID_MESSAGING").a();
            b = new aboj(c, "BUGLE_COUNTERS", Integer.MAX_VALUE);
            d.clear();
            e.set(0);
            return;
        }
        advr.d(a, "Google Play Service unavailable. Clearcut logging is disabled!", new Object[0]);
    }

    public static void f() {
        if (!h()) {
            advr.r(a, "sendCounters invoked though logging disabled!", new Object[0]);
            return;
        }
        advr.l(a, "Sending counters: %s", b);
        aboj abojVar = b;
        abojVar.getClass();
        abojVar.f();
    }

    public static void g(int i2) {
        aboh abohVar;
        if (i2 == -1) {
            advr.d(a, "StopTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            abohVar = (aboh) sparseArray.get(i2);
            sparseArray.remove(i2);
        }
        if (abohVar == null) {
            advr.r(a, "StopTimer: Unknown UMA timer key %d", Integer.valueOf(i2));
            return;
        }
        ((abny) abohVar.b).a(SystemClock.elapsedRealtime() - abohVar.a, 1L, aboj.b);
        f();
    }

    public static boolean h() {
        if (c == null) {
            return false;
        }
        return ((Boolean) acpq.E().f().a()).booleanValue();
    }

    public static void i(Context context) {
        int i2;
        amfk amfkVar;
        int i3;
        boolean z;
        boolean isDataEnabled;
        amil amilVar;
        aozy createBuilder = amht.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar = (amht) createBuilder.b;
        int i4 = 8;
        amhtVar.c = 8;
        amhtVar.b |= 1;
        aozy createBuilder2 = amfk.a.createBuilder();
        yjy yjyVar = h;
        yjyVar.getClass();
        ykb k = yjyVar.k();
        String w = k.w();
        if (w != null) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amfk amfkVar2 = (amfk) createBuilder2.b;
            amfkVar2.b |= 1;
            amfkVar2.c = w;
        }
        String s = k.s();
        if (s != null) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amfk amfkVar3 = (amfk) createBuilder2.b;
            amfkVar3.b |= 2;
            amfkVar3.d = s;
        }
        if (!h()) {
            advr.d(a, "RcsAnalytics is NOT initialized, event will be ignored", new Object[0]);
            amfkVar = (amfk) createBuilder2.s();
        } else {
            adtl adtlVar = f;
            adtlVar.getClass();
            if (true != adtlVar.k()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amfk amfkVar4 = (amfk) createBuilder2.b;
            amfkVar4.e = i2 - 1;
            amfkVar4.b |= 4;
            amfkVar = (amfk) createBuilder2.s();
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar2 = (amht) createBuilder.b;
        amfkVar.getClass();
        amhtVar2.f = amfkVar;
        amhtVar2.b |= 16;
        int i5 = 3;
        if (context.getSharedPreferences("bugle", 0).getInt("seamless_provisioning_progress", 0) == 2) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar3 = (amht) createBuilder.b;
        amhtVar3.g = i3 - 1;
        amhtVar3.b |= 32;
        amjd b2 = b(context);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar4 = (amht) createBuilder.b;
        b2.getClass();
        amhtVar4.h = b2;
        amhtVar4.b |= 64;
        yjy yjyVar2 = h;
        yjyVar2.getClass();
        ykb k2 = yjyVar2.k();
        int i6 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        aozy createBuilder3 = amee.b.createBuilder();
        boolean F = k2.F();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar = createBuilder3.b;
        amee ameeVar = (amee) apagVar;
        ameeVar.c |= 4;
        ameeVar.f = F;
        if (!apagVar.isMutable()) {
            createBuilder3.u();
        }
        if (i6 != 0) {
            z = true;
        } else {
            z = false;
        }
        amee ameeVar2 = (amee) createBuilder3.b;
        ameeVar2.c |= 16;
        ameeVar2.h = z;
        isDataEnabled = adwt.g(context).a.isDataEnabled();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amee ameeVar3 = (amee) createBuilder3.b;
        ameeVar3.c |= 32;
        ameeVar3.i = isDataEnabled;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar2 = createBuilder3.b;
            amee ameeVar4 = (amee) apagVar2;
            ameeVar4.e = 6;
            ameeVar4.c |= 2;
            if (!apagVar2.isMutable()) {
                createBuilder3.u();
            }
            amee ameeVar5 = (amee) createBuilder3.b;
            ameeVar5.d = 0;
            ameeVar5.c |= 1;
        } else {
            switch (advg.a[activeNetworkInfo.getDetailedState().ordinal()]) {
                case 1:
                    i4 = 2;
                    break;
                case 2:
                    i4 = 3;
                    break;
                case 3:
                    i4 = 4;
                    break;
                case 4:
                    i4 = 5;
                    break;
                case 5:
                    i4 = 6;
                    break;
                case 6:
                    i4 = 7;
                    break;
                case 7:
                    break;
                case 8:
                    i4 = 9;
                    break;
                case 9:
                    i4 = 10;
                    break;
                case 10:
                    i4 = 11;
                    break;
                case 11:
                    i4 = 12;
                    break;
                case 12:
                    i4 = 13;
                    break;
                case 13:
                    i4 = 14;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amee ameeVar6 = (amee) createBuilder3.b;
            ameeVar6.e = i4 - 1;
            ameeVar6.c |= 2;
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 6) {
                        i5 = 5;
                    } else {
                        i5 = 4;
                    }
                }
            } else {
                i5 = 2;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amee ameeVar7 = (amee) createBuilder3.b;
            ameeVar7.d = i5 - 1;
            ameeVar7.c |= 1;
        }
        amee ameeVar8 = (amee) createBuilder3.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amht amhtVar5 = (amht) apagVar3;
        ameeVar8.getClass();
        amhtVar5.d = ameeVar8;
        amhtVar5.b |= 2;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar6 = (amht) createBuilder.b;
        amhtVar6.e = 6;
        amhtVar6.b |= 4;
        amht amhtVar7 = (amht) createBuilder.s();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_RCS_PROVISIONING;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amhtVar7.getClass();
        amfrVar2.s = amhtVar7;
        amfrVar2.b |= 4096;
        if (!h()) {
            advp advpVar = a;
            amfp b3 = amfp.b(((amfr) amfqVar.b).i);
            if (b3 == null) {
                b3 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            advr.d(advpVar, "Analytics are disabled. Ignoring Clearcut event of type %d", Integer.valueOf(b3.dg));
            return;
        }
        int intValue = ((Integer) acpq.E().D().a()).intValue();
        if (intValue == -1) {
            amilVar = null;
        } else {
            aozy createBuilder4 = amil.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amil amilVar2 = (amil) createBuilder4.b;
            amilVar2.b |= 1;
            amilVar2.c = intValue;
            amilVar = (amil) createBuilder4.s();
        }
        if (amilVar != null) {
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar3 = (amfr) amfqVar.b;
            amfrVar3.r = amilVar;
            amfrVar3.b |= 2048;
        }
        abnr abnrVar = c;
        abnrVar.getClass();
        abnq g2 = abnrVar.g(amfqVar.s());
        g2.i(-1);
        if (aczf.B()) {
            acjj acjjVar = i;
            acjjVar.getClass();
            ListenableFuture f2 = agkx.f(acjjVar.o());
            adnx adnxVar = new adnx(g2, 4);
            anen anenVar = j;
            anenVar.getClass();
            aktp.aa(f2, adnxVar, anenVar);
            return;
        }
        g2.c();
    }
}
