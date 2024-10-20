package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcb {
    public static final xze a = xze.g("BugleNetwork", "RemoteInstanceDatabaseOperations");
    public final agnq b;
    public final xnv c;
    private final apwt d;

    public vcb(agnq agnqVar, xnv xnvVar, apwt apwtVar) {
        this.b = agnqVar;
        this.c = xnvVar;
        this.d = apwtVar;
    }

    public static thj a(String str) {
        thj thjVar = new thj();
        tib tibVar = new tib(tid.a);
        tibVar.w("RemoteRegistrationsTable#whereUserId");
        tibVar.d(new vbk(str, 8));
        tibVar.c((thw) tid.d.a);
        thjVar.U(new agme("remote_registrations_table.tachyon_registration_id", 3, tibVar.b()));
        return thjVar;
    }

    public static boolean l(aqga aqgaVar) {
        if (aqgaVar.d.size() > 0 && aqgaVar.d.contains(Integer.valueOf(vbe.ETOUFFEE.g))) {
            return true;
        }
        return false;
    }

    public static boolean m(aqga aqgaVar) {
        if (aqgaVar.d.size() > 0 && aqgaVar.d.contains(Integer.valueOf(vbe.ETOUFFEE_GROUPS.g))) {
            return true;
        }
        return false;
    }

    public final alog b(alog alogVar) {
        akrh e = aktp.e("RemoteInstanceDatabaseOperations#getExistingRegistrations#forMany");
        try {
            see a2 = seg.a();
            a2.w("getExistingRegistrations2");
            a2.c(new vbk(alogVar, 2));
            alog cR = ((sea) a2.b().n()).cR();
            e.close();
            return cR;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog c(String str) {
        akrh e = aktp.e("RemoteInstanceDatabaseOperations#getExistingRegistrations$forOne");
        try {
            see a2 = seg.a();
            a2.w("getExistingRegistrations1");
            a2.c(new vbk(str, 9));
            alog cR = ((sea) a2.b().n()).cR();
            e.close();
            return cR;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog d(alog alogVar) {
        Object apply;
        akrh e = aktp.e("RemoteInstanceDatabaseOperations#getFreshRemoteInstances");
        try {
            Instant minus = this.c.f().minus(Duration.ofMillis(((Long) utw.P.e()).longValue()));
            thr thrVar = new thr(thu.a);
            thrVar.w("+getFreshRemoteInstances");
            apply = new uzn(alogVar, minus, 3, null).apply(new tht());
            thrVar.k(new agpw((tht) apply));
            alog t = thrVar.b().t();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alpt e(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new vbi(10));
        int i = alog.d;
        return (alpt) Collection.EL.stream(alogVar).filter(new uhe((alpt) Collection.EL.stream(d((alog) map.collect(alls.a))).map(new vbi(9)).collect(alls.b), 5)).collect(alls.b);
    }

    public final void f(String str, String str2, rvd rvdVar, Optional optional, Long l, Instant instant) {
        agnw d;
        agnw d2;
        agnw d3;
        agnw d4;
        thd a2 = thk.a();
        a2.i(str2);
        a2.c(rvdVar.a(vbe.ETOUFFEE));
        a2.d(rvdVar.a(vbe.ETOUFFEE_GROUPS));
        a2.h(rvdVar);
        a2.g(this.c.f());
        a2.b(instant);
        if (l == null) {
            a2.f(false);
        } else {
            a2.f(true);
            a2.j(l.longValue());
        }
        if (optional.isPresent()) {
            a2.e(((aozb) optional.get()).H());
        }
        thc a3 = a2.a();
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "remote_registrations_table", a3, new tbe(d, 16), new swb(10));
        tpk b = tid.b();
        b.e(str);
        b.f(str2);
        thv d5 = b.d();
        d3 = agnc.d("$primary");
        d4 = agnc.d("$primary");
        agnc.a(d4, "remote_user_id_to_registration_id", d5, new tbe(d3, 19), new swb(13));
    }

    public final void g(String str, boolean z) {
        Iterator it = ((Set) this.d.b()).iterator();
        while (it.hasNext()) {
            ((tsy) it.next()).a(str, z);
        }
    }

    public final void h(thc thcVar) {
        i(thcVar, false);
    }

    public final void i(thc thcVar, boolean z) {
        akrh e = aktp.e("RemoteInstanceDatabaseOperations#setHasEncryption");
        try {
            thi thiVar = new thi();
            thiVar.aj("setHasEncryption#update");
            thiVar.d(true);
            if (z) {
                thiVar.e(true);
            }
            thiVar.h(new vbk(thcVar, 6));
            thiVar.a().e();
            tib tibVar = new tib(tid.a);
            tibVar.w("setHasEncryption");
            tibVar.d(new vbk(thcVar, 7));
            thx thxVar = (thx) tibVar.b().n();
            while (thxVar.moveToNext()) {
                try {
                    g(thxVar.c(), true);
                } finally {
                }
            }
            thxVar.close();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean j(Set set, alpu alpuVar, Function function) {
        if (set.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        see a2 = seg.a();
        a2.w("RemoteInstanceDatabaseOperations#getRemoteInstancesStream");
        a2.c(new vbk(set, 13));
        a2.b().w().forEach(new iqp(function, hashSet, alpuVar, 12));
        return hashSet.equals(set);
    }

    public final boolean k(Set set, alpu alpuVar, Function function) {
        if (set.isEmpty()) {
            return false;
        }
        int i = 10;
        alpt alptVar = (alpt) Collection.EL.stream(set).map(new vbi(i)).collect(alls.b);
        alor alorVar = (alor) Collection.EL.stream(set).collect(alls.a(new vbi(i), Function$CC.identity()));
        alpu alpuVar2 = new alpu();
        boolean j = j(alptVar, alpuVar2, function);
        Collection.EL.stream(alpuVar2.a().d()).forEach(new rge(alorVar, alpuVar, 17));
        return j;
    }

    @Deprecated
    public final boolean n(alpu alpuVar, Set set) {
        if (set.isEmpty()) {
            return false;
        }
        int i = 10;
        alor alorVar = (alor) Collection.EL.stream(set).collect(alls.a(new vbi(i), Function$CC.identity()));
        HashSet hashSet = new HashSet();
        see a2 = seg.a();
        a2.w("RemoteInstanceDatabaseOperations#verifyAllParticipantsSupportGroupE2eeAndSetDevicesForScytaleSetupChatEndpoint");
        a2.c(new vbk(set, i));
        a2.b().w().forEach(new iqp(alorVar, hashSet, alpuVar, 11, (short[]) null));
        return hashSet.equals(set);
    }
}
