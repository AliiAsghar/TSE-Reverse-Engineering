package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uci implements agnw {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl");
    public static final alwo b = alwo.p();
    public static final alwo c = alwo.o("writelock-perf");
    static final ThreadLocal d = new uca();
    public final xnv e;
    public final agna f;
    public final uco[] g;
    public final Context j;
    public final ucd k;
    private final armf l;
    public final ReentrantLock h = new ReentrantLock(true);
    public final ucg i = new ucg(this);
    private final agcp m = new agcp(new tbv(this, 9));

    public uci(Context context, armf armfVar, rzx rzxVar, xnv xnvVar, agna agnaVar, alog alogVar) {
        this.j = context;
        this.l = armfVar;
        this.k = new ucd(rzxVar);
        this.e = xnvVar;
        this.f = agnaVar;
        this.g = (uco[]) alogVar.toArray(new uco[0]);
    }

    public static final ueg V() {
        return (ueg) u().removeLast();
    }

    private static ude X(udf udfVar, String str, agni agniVar, alhr alhrVar, agnw agnwVar) {
        udd b2 = ude.b();
        b2.c(agniVar);
        b2.h = str;
        b2.d(udfVar);
        b2.c = alhrVar;
        b2.b = agnwVar;
        return b2.a();
    }

    private static ude Y(udf udfVar, String str, agni agniVar, alhr alhrVar, alhr alhrVar2, agnw agnwVar, boolean z, ContentValues contentValues) {
        udd b2 = ude.b();
        b2.c(agniVar);
        b2.h = str;
        b2.d(udfVar);
        b2.a = alhrVar;
        b2.c = alhrVar2;
        b2.b = agnwVar;
        b2.b(z);
        b2.i = contentValues;
        return b2.a();
    }

    private final ude Z(agni agniVar, agmp agmpVar) {
        udf udfVar = udf.READ;
        tor torVar = new tor(agmpVar, 17);
        udd b2 = ude.b();
        b2.c(agniVar);
        b2.h = null;
        b2.d(udfVar);
        b2.c = torVar;
        b2.b = this;
        b2.b(false);
        b2.j = agmpVar.a;
        return b2.a();
    }

    private static Throwable aa(Closeable[] closeableArr, int i) {
        Closeable closeable = closeableArr[i];
        if (closeable != null) {
            try {
                closeableArr[i] = null;
                closeable.close();
            } catch (Throwable th) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleDatabase");
                ((alvg) ((alvg) ((alvg) i2).g(th)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "closePluginStack", (char) 745, "DatabaseInterfaceImpl.java")).q("Caught exception closing DatabasePlugin Closeable");
                return th;
            }
        }
        return null;
    }

    private final void ab() {
        List list = (List) R(new ubq(this, 3), m(udf.END_SCOPE, new agni("DatabasePlugin#endScope"), new rxm(8), this));
        if (anfi.a("bugle.enable_runnables_execution_in_silo_batches", "bugle")) {
            ac(list);
            return;
        }
        if (list != null) {
            akrh e = aktp.e("DatabaseWrapperImpl.deferredRunnables");
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((aiim) it.next()).k();
                }
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
    }

    private final void ac(List list) {
        akrh e;
        if (list != null && !list.isEmpty()) {
            akrh e2 = aktp.e("DatabaseWrapperImpl.deferredRunnables");
            try {
                EnumMap enumMap = new EnumMap(agnt.class);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aiim aiimVar = (aiim) it.next();
                    ((List) Map.EL.computeIfAbsent(enumMap, aiimVar.c, new tvq(16))).add(aiimVar);
                }
                ArrayList<Pair> arrayList = new ArrayList();
                for (agnt agntVar : agnt.values()) {
                    if (enumMap.containsKey(agntVar)) {
                        arrayList.add(Pair.create(agntVar, (List) enumMap.get(agntVar)));
                    }
                }
                for (Pair pair : arrayList) {
                    rui ruiVar = new rui(pair, 11);
                    try {
                        if (pair.first != agnt.NO_TXN && pair.first != agnt.NO_TXN_EXCLUDING_SCOPE) {
                            A("run-after-complete-in-txn", ruiVar);
                        }
                        ruiVar.run();
                        e.close();
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    e = aktp.e("DatabaseWrapperImpl::run-after-complete-no-txn");
                }
                e2.close();
            } catch (Throwable th3) {
                try {
                    e2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    private final void ad(Runnable runnable, ude udeVar) {
    }

    private static void ae(uco[] ucoVarArr, Closeable[] closeableArr, int i, ude udeVar) {
        while (i < ucoVarArr.length) {
            closeableArr[i] = ucoVarArr[i].l(udeVar);
            i++;
        }
    }

    public static ucn l(String str, ContentValues contentValues, int i) {
        String g = agnc.g(i);
        String str2 = " ";
        if (g != null) {
            str2 = a.bW(g, " ", " ");
        }
        return ucn.a("INSERT" + str2 + "INTO " + str + " (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().collect(Collectors.joining(","))) + ") VALUES (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().map(new tyl(contentValues, 7)).collect(Collectors.joining(","))) + ")", null);
    }

    public static ude m(udf udfVar, agni agniVar, alhr alhrVar, agnw agnwVar) {
        udd b2 = ude.b();
        b2.c(agniVar);
        b2.h = null;
        b2.d(udfVar);
        b2.c = alhrVar;
        b2.b = agnwVar;
        b2.b(false);
        return b2.a();
    }

    public static Deque u() {
        Deque deque = (Deque) d.get();
        deque.getClass();
        return deque;
    }

    @Override // defpackage.agnw
    public final void A(String str, Runnable runnable) {
        s(str, new tor(runnable, 16));
    }

    @Override // defpackage.agnw
    public final void B(Uri uri) {
        C(uri, null);
    }

    @Override // defpackage.agnw
    public final void C(Uri uri, String str) {
        Deque u = u();
        if (str != null) {
            alvw m = b.m();
            m.X(alwp.a, "BugleDatabase");
            ((alwl) m.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 1014, "DatabaseInterfaceImpl.java")).J("%s notifying change. stack %d; uri %s", str, Integer.valueOf(u.size()), uri);
        }
        if (u.isEmpty()) {
            akrh e = aktp.e("DatabaseWrapperImpl#notifyChangeAfterCommit");
            try {
                this.j.getContentResolver().notifyChange(uri, null);
                e.close();
                return;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        agkx.c(this, uri.toString(), akto.j(new rvz(this, str, uri, 10)));
    }

    @Override // defpackage.agnw
    public final /* synthetic */ void D(String str, Runnable runnable) {
        agkx.c(this, str, runnable);
    }

    @Override // defpackage.agnw
    public final void E(boolean z) {
        ad(new hwm(this, z, 5, null), m(udf.WRITE, new agni("DatabasePlugin#setTransactionSuccessful"), new rxm(18), this));
    }

    public final void F(Exception exc, String str) {
        boolean delete = this.j.getDatabasePath(str).delete();
        alvw h = b.h();
        h.X(alwp.a, "BugleDatabase");
        ((alwl) ((alwl) ((alwl) h).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "wipeDbOnFailedUpgrade", 1232, "DatabaseInterfaceImpl.java")).t("got DatabaseUpgradeException; File.delete returned %b", Boolean.valueOf(delete));
        Iterator it = ((Set) ((apxx) this.l).a).iterator();
        while (it.hasNext()) {
            ((rzw) it.next()).a();
        }
        try {
            agkg.a(((gte) gvf.ar(this.j).a("verified_sms_work_manager_tag")).c);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.agnw
    public final /* synthetic */ boolean G() {
        return agkx.d(this);
    }

    @Override // defpackage.agnw
    public final boolean H(agmp agmpVar) {
        return ((Boolean) R(new ubq(agmpVar, 0), Z(new agni("DatabasePlugin#moveCursorToFirst"), agmpVar))).booleanValue();
    }

    @Override // defpackage.agnw
    public final boolean I(agmp agmpVar) {
        return ((Boolean) R(new ubq(agmpVar, 5), Z(new agni("DatabasePlugin#moveCursorToLast"), agmpVar))).booleanValue();
    }

    @Override // defpackage.agnw
    public final boolean J(agmp agmpVar) {
        return ((Boolean) R(new ubq(agmpVar, 2), Z(new agni("DatabasePlugin#moveCursorToNext"), agmpVar))).booleanValue();
    }

    @Override // defpackage.agnw
    public final boolean K(agmp agmpVar, int i) {
        return ((Boolean) R(new ubv(agmpVar, i, 1), m(udf.READ, new agni("DatabasePlugin#moveCursorToPosition"), new rxm(12), this))).booleanValue();
    }

    @Override // defpackage.agnw
    public final boolean L(agmp agmpVar) {
        return ((Boolean) R(new ubq(agmpVar, 4), Z(new agni("DatabasePlugin#moveCursorToPrevious"), agmpVar))).booleanValue();
    }

    public final boolean M() {
        if (agnc.c.e() && !this.h.isHeldByCurrentThread()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final uce N(agni agniVar) {
        boolean z;
        Level level;
        boolean z2 = true;
        if (agnc.c.e()) {
            SQLiteDatabase k = k();
            if (!this.h.isHeldByCurrentThread() && k.inTransaction()) {
                z = false;
            } else {
                z = true;
            }
            albo.T(z);
            boolean z3 = false;
            int i = 0;
            while (!this.h.tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    try {
                        ucg ucgVar = this.i;
                        uch uchVar = ucgVar.a;
                        if (uchVar != null) {
                            String co = a.co((String) DesugarArrays.stream(uchVar.a.getStackTrace()).map(new tvq(18)).collect(Collectors.joining("\n at ")), uchVar.b.toString(), " ==> ");
                            String str = (String) Collection.EL.stream(ucgVar.b).map(new tvq(17)).collect(Collectors.joining(","));
                            if (xyp.j()) {
                                level = Level.INFO;
                            } else {
                                level = Level.WARNING;
                            }
                            alvg a2 = a.a(level);
                            a2.X(alwp.a, "BugleDatabase");
                            int i2 = i + 1;
                            ((alvg) a2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl$WriteLockHistory", "emitLoggingForSlowToAcquireWriteLock", 192, "DatabaseInterfaceImpl.java")).J("kind of slow getting the write lock; wait seconds %s; held by %s;\nhistory:%s", Integer.valueOf(i2), co, str);
                            if (xyp.d() && i2 == z2) {
                                alwo alwoVar = c;
                                synchronized (agnc.d) {
                                    for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                                        ((alwl) alwoVar.a(level).h("com/google/android/libraries/databaseannotations/support/D26rHelper", "dumpAllThreads", 267, "D26rHelper.java")).t("thread dump %s", entry.getKey().getName());
                                        StackTraceElement[] value = entry.getValue();
                                        int length = value.length;
                                        int i3 = 0;
                                        while (i3 < length) {
                                            ((alwl) alwoVar.a(level).h("com/google/android/libraries/databaseannotations/support/D26rHelper", "dumpAllThreads", 269, "D26rHelper.java")).t("  at %s", value[i3]);
                                            i3++;
                                            alwoVar = alwoVar;
                                        }
                                    }
                                }
                                z2 = true;
                                i = 1;
                            } else {
                                i = i2;
                                z2 = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (InterruptedException unused) {
                        alvw i4 = b.i();
                        i4.X(alwp.a, "BugleDatabase");
                        ((alwl) ((alwl) i4).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "acquireWriteLock", 262, "DatabaseInterfaceImpl.java")).q("interruped while locking the write lock");
                        z2 = true;
                        z3 = true;
                    }
                } finally {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (this.h.getHoldCount() == z2) {
                ucg ucgVar2 = this.i;
                ucgVar2.a = new uch(Thread.currentThread(), agniVar);
                ucgVar2.a(agniVar, z2);
            }
            return new ubq(this, 10);
        }
        return new ueh(1);
    }

    @Override // defpackage.agnw
    public final long O(String str, ContentValues contentValues) {
        return ((Long) T(new ubt(this, str, contentValues, 3), X(udf.INSERT, str, new agni("insert-", str), new ubu(str, contentValues, 2, null), this))).longValue();
    }

    @Override // defpackage.agnw
    public final long P(String str, ContentValues contentValues) {
        int i = 4;
        return ((Long) T(new ubt(this, str, contentValues, i), X(udf.INSERT, str, new agni("insertOrThrow-", str), new ubu(str, contentValues, i, null), this))).longValue();
    }

    @Override // defpackage.agnw
    public final long Q(final String str, final ContentValues contentValues, final int i) {
        return ((Long) T(new uce() { // from class: ubr
            @Override // defpackage.uce
            public final Object a() {
                return Long.valueOf(uci.this.k().insertWithOnConflict(str, null, contentValues, i));
            }
        }, X(udf.INSERT, str, new agni("insertWithOnConflict-", str), new mrm(str, contentValues, i, 6, null), this))).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        r1[r7] = r1[r7] + 1;
        ae(r13.g, r2, r7, r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[LOOP:3: B:42:0x00b3->B:43:0x00b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(defpackage.uce r14, defpackage.ude r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uci.R(uce, ude):java.lang.Object");
    }

    final Cursor S(uce uceVar, ude udeVar) {
        Cursor cursor = (Cursor) R(uceVar, udeVar);
        cursor.getCount();
        int length = this.g.length;
        while (true) {
            length--;
            if (length >= 0) {
                cursor = this.g[length].a(cursor, udeVar);
            } else {
                return cursor;
            }
        }
    }

    public final Object T(uce uceVar, ude udeVar) {
        return R(new ubt(this, udeVar, uceVar, 1), udeVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.agnw
    public final void U(String str, Runnable runnable, agnt agntVar) {
        ueg uegVar;
        Integer num;
        if (agntVar == agnt.NO_TXN_EXCLUDING_SCOPE) {
            uegVar = (ueg) Collection.EL.stream(u()).filter(new trt(5)).findFirst().orElse(null);
        } else {
            uegVar = (ueg) u().peekFirst();
        }
        if (uegVar == null) {
            runnable.run();
            aktp.ag(null);
            return;
        }
        uqg h = uegVar.h();
        if (str != null && (num = (Integer) h.a.get(str)) != null) {
            ((aiim) h.b.get(num.intValue())).j();
        }
        if (str != null) {
            h.a.put(str, Integer.valueOf(h.b.size()));
        }
        akul.g(d.m(new gst(h, runnable, agntVar, 4)));
    }

    @Override // defpackage.agnw
    public final agcp W() {
        return this.m;
    }

    @Override // defpackage.agnw
    public final int a(String str, String str2, String[] strArr, agny agnyVar) {
        return ((Integer) T(new uby(this, str, str2, strArr, 2), Y(udf.DELETE, str, agnyVar.c, new ubz(0), new tdw(str, str2, strArr, 5), this, agnyVar.b, null))).intValue();
    }

    @Override // defpackage.agnw
    public final int b(SQLiteStatement sQLiteStatement) {
        return ((Integer) T(new ubq(sQLiteStatement, 7), m(udf.RAW_SQL, new agni("DatabasePlugin#executeStatement"), new rxm(13), this))).intValue();
    }

    @Override // defpackage.agnw
    public final int c(SQLiteStatement sQLiteStatement, agni agniVar) {
        sQLiteStatement.getClass();
        return ((Integer) R(new ubq(sQLiteStatement, 1), m(udf.RAW_SQL, agniVar, new rxm(5), this))).intValue();
    }

    @Override // defpackage.agnw
    public final int d(agmp agmpVar) {
        return ((Integer) R(new ubq(agmpVar, 9), Z(new agni("DatabasePlugin#getCountForCursor"), agmpVar))).intValue();
    }

    @Override // defpackage.agnw
    public final int e(final String str, final ContentValues contentValues, final String str2, final String[] strArr, agpu agpuVar) {
        return ((Integer) T(new uce() { // from class: ubs
            @Override // defpackage.uce
            public final Object a() {
                return Integer.valueOf(uci.this.k().updateWithOnConflict(str, contentValues, str2, strArr, 0));
            }
        }, Y(udf.UPDATE, str, agpuVar.d, new rxm(9), new rka(str, contentValues, str2, strArr, 8), this, agpuVar.c, contentValues))).intValue();
    }

    @Override // defpackage.agnw
    public final long f(String str, String str2, String[] strArr) {
        return ((Long) R(new uby(this, str, str2, strArr, 1), X(udf.QUERY, str, new agni("queryCount"), new rxm(11), this))).longValue();
    }

    @Override // defpackage.agnw
    public final Cursor g(String str, String[] strArr) {
        return S(new ubt(this, str, strArr, 2), m(udf.QUERY, agni.c, new ubu(str, strArr, 0), this));
    }

    @Override // defpackage.agnw
    public final Cursor h(String str, String[] strArr, agpf agpfVar) {
        ubt ubtVar = new ubt(this, str, strArr, 0);
        agni agniVar = agpfVar.r;
        udf udfVar = udf.QUERY;
        if (agniVar == null) {
            agniVar = agni.a;
        }
        agni agniVar2 = agniVar;
        alhr alhrVar = agpfVar.u;
        if (alhrVar == null) {
            alhrVar = new rxm(10);
        }
        return S(ubtVar, Y(udfVar, null, agniVar2, alhrVar, new ubu(str, strArr, 3), this, agpfVar.q, null));
    }

    @Override // defpackage.agnw
    public final Cursor i(String str, String[] strArr, agpf agpfVar, CancellationSignal cancellationSignal) {
        try {
            uby ubyVar = new uby(this, str, strArr, cancellationSignal, 0);
            udf udfVar = udf.QUERY;
            agni agniVar = agpfVar.r;
            if (agniVar == null) {
                agniVar = agni.a;
            }
            agni agniVar2 = agniVar;
            alhr alhrVar = agpfVar.u;
            if (alhrVar == null) {
                alhrVar = new rxm(19);
            }
            try {
                return S(ubyVar, Y(udfVar, null, agniVar2, alhrVar, new ubu(str, strArr, 5), this, agpfVar.q, null));
            } catch (OperationCanceledException e) {
                e = e;
                throw new agpd(e);
            }
        } catch (OperationCanceledException e2) {
            e = e2;
        }
    }

    @Override // defpackage.agnw
    public final SQLiteDatabase j() {
        return k();
    }

    public final SQLiteDatabase k() {
        ucd ucdVar = this.k;
        if (ucdVar.d != null && Thread.currentThread() == ucdVar.d) {
            SQLiteDatabase sQLiteDatabase = ucdVar.e;
            sQLiteDatabase.getClass();
            return sQLiteDatabase;
        }
        Future future = (Future) ucdVar.a.get();
        future.getClass();
        try {
            try {
                return (SQLiteDatabase) albo.bQ(future);
            } catch (IllegalStateException unused) {
                ListenableFuture listenableFuture = (ListenableFuture) ucdVar.a.get();
                if (listenableFuture != null) {
                    akul g = akul.g(albo.bJ(listenableFuture));
                    if (aiut.g()) {
                        return (SQLiteDatabase) g.get();
                    }
                    rzx rzxVar = ucdVar.f;
                    return (SQLiteDatabase) agkg.a(g);
                }
                throw new IllegalStateException("no waiting future set");
            } catch (ExecutionException e) {
                return ucd.b(e);
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new ucb("Interrupted exception during database initialization", e2);
        } catch (ExecutionException e3) {
            return ucd.b(e3);
        }
    }

    @Override // defpackage.agnw
    public final agna n() {
        return this.f;
    }

    @Override // defpackage.agnw
    public final akul o() {
        Thread currentThread = Thread.currentThread();
        ucd ucdVar = this.k;
        if (currentThread == ucdVar.d) {
            return aktp.ag(null);
        }
        return ucdVar.c.h(new uhw(1), andi.a);
    }

    public final Closeable p(ueg uegVar) {
        u().addLast(uegVar);
        return new ubx(0);
    }

    @Override // defpackage.agnw
    public final Object q(alhr alhrVar) {
        Object obj;
        try {
            u();
            boolean isEmpty = u().isEmpty();
            ad(new rui(this, 12), m(udf.BEGIN_SCOPE, new agni("DatabasePlugin#beginScope"), new rxm(20), this));
            if (isEmpty) {
                akrh e = aktp.e("executeInScope");
                try {
                    obj = alhrVar.get();
                    e.close();
                } finally {
                }
            } else {
                obj = alhrVar.get();
            }
            E(true);
            return obj;
        } finally {
            ab();
        }
    }

    @Override // defpackage.agnw
    public final Object r(alhr alhrVar) {
        return s("AnonymousExecuteInTransaction", alhrVar);
    }

    @Override // defpackage.agnw
    public final Object s(String str, alhr alhrVar) {
        return t(new agni(str), alhrVar, agnv.a().c());
    }

    @Override // defpackage.agnw
    public final Object t(agni agniVar, final alhr alhrVar, agnv agnvVar) {
        boolean z;
        boolean z2;
        agni agniVar2;
        udf udfVar;
        if (agnvVar.a && !agnc.c.e()) {
            z = false;
        } else {
            z = true;
        }
        albo.U(z, "withoutSqliteTransaction can only be used if useExplicitWriteLock is enabled");
        boolean z3 = agnvVar.a;
        final boolean z4 = !z3;
        if (!z3 && agkx.d(this)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            agni agniVar3 = new agni(agniVar, "-BEGIN");
            if (agkx.d(this)) {
                udfVar = udf.BEGIN_NESTED_TRANSACTION;
            } else {
                udfVar = udf.BEGIN_TRANSACTION;
            }
            AtomicReference atomicReference = new AtomicReference(false);
            ad(new rvz((Object) this, (Object) atomicReference, (Object) agniVar3, 11, (short[]) null), m(udfVar, agniVar3, new rxm(15), this));
            ((Boolean) atomicReference.get()).booleanValue();
        } else {
            p(new uei(this, this.f, agniVar));
        }
        try {
            uce uceVar = new uce() { // from class: ubw
                @Override // defpackage.uce
                public final Object a() {
                    Object obj = alhrVar.get();
                    if (z4) {
                        uci.this.E(true);
                    }
                    return obj;
                }
            };
            udf udfVar2 = udf.EXECUTE_IN_TRANSACTION_BODY;
            if (z2) {
                agniVar2 = agni.c;
            } else {
                agniVar2 = new agni(agniVar, "-BODY");
            }
            Object R = R(uceVar, m(udfVar2, agniVar2, new ubz(1), this));
            if (!z3) {
                y(new agni(agniVar, "-END"));
            } else {
                V().b();
            }
            return R;
        } catch (Throwable th) {
            if (!z3) {
                y(new agni(agniVar, "-END"));
            } else {
                V().b();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public final List v(boolean z) {
        Object b2;
        ueg V = V();
        boolean isEmpty = u().isEmpty();
        boolean allMatch = Collection.EL.stream(u()).allMatch(new trt(6));
        albo.C(V);
        if (isEmpty) {
            akrh e = aktp.e("DatabaseWrapperImpl.inTransactionDeferredRunnableList");
            try {
                HashMap hashMap = new HashMap();
                Iterator it = V.h().c.entrySet().iterator();
                while (it.hasNext()) {
                    ucf ucfVar = (ucf) ((Map.Entry) it.next()).getValue();
                    if (ucfVar != null && (b2 = ucfVar.b()) != null) {
                        hashMap.put(Integer.valueOf(ucfVar.a()), b2);
                    }
                }
                uqg h = V.h();
                int size = h.d.size();
                for (int i = 0; i < size; i++) {
                    agnu agnuVar = (agnu) h.d.get(i);
                    hashMap.get(Integer.valueOf(i));
                    agnuVar.a();
                }
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
        if (z) {
            k().endTransaction();
        }
        V.b();
        V.getClass();
        if (!V.e()) {
            alwo alwoVar = b;
            alvw i2 = alwoVar.i();
            i2.X(alwp.a, "BugleDatabase");
            ((alwl) ((alwl) i2).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 923, "DatabaseInterfaceImpl.java")).q("endTransaction without setting successful.");
            alvw i3 = alwoVar.i();
            i3.X(alwp.a, "BugleDatabase");
            alwl alwlVar = (alwl) i3;
            alwlVar.Z(alwk.MEDIUM);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 924, "DatabaseInterfaceImpl.java")).q("endTransaction called at");
        }
        if (isEmpty) {
            uqg h2 = V.h();
            if (!V.f()) {
                Iterator it2 = h2.b.iterator();
                while (it2.hasNext()) {
                    ((aiim) it2.next()).j();
                }
            } else if (!h2.b.isEmpty()) {
                return h2.b;
            }
        } else if (allMatch) {
            uqg h3 = V.h();
            if (V.f()) {
                Stream filter = Collection.EL.stream(h3.b).filter(new trt(7));
                int i4 = alog.d;
                return (alog) filter.collect(alls.a);
            }
        }
        return new ArrayList();
    }

    public final void w() {
        agna a2;
        Iterator descendingIterator = u().descendingIterator();
        while (descendingIterator.hasNext()) {
            ueg uegVar = (ueg) descendingIterator.next();
            if (uegVar != null && (a2 = uegVar.a()) != null && !uegVar.d()) {
                agna agnaVar = this.f;
                int i = a2.d;
                int i2 = agnaVar.d;
                if (i > i2) {
                    String str = agnaVar.b;
                    throw new IllegalStateException("cannot begin transaction on " + i2 + "/" + str + " already holding " + i + "/" + str);
                }
                return;
            }
        }
    }

    @Override // defpackage.agnw
    public final void x() {
        ad(new rui(this, 10), m(udf.CLOSE, new agni("DatabasePlugin#close"), new rxm(16), this));
    }

    public final void y(agni agniVar) {
        udf udfVar;
        ubq ubqVar = new ubq(this, 8);
        if (Collection.EL.stream(u()).filter(new qxp(this.f.b, 18)).count() > 1) {
            udfVar = udf.END_NESTED_TRANSACTION;
        } else {
            udfVar = udf.END_TRANSACTION;
        }
        List list = (List) R(ubqVar, m(udfVar, agniVar, new rxm(14), this));
        ac(list);
        ac(list);
    }

    @Override // defpackage.agnw
    public final void z(final String str) {
        if (agnc.c.e()) {
            T(new uce() { // from class: ubp
                @Override // defpackage.uce
                public final Object a() {
                    uci uciVar = uci.this;
                    albo.T(uciVar.M());
                    uciVar.k().execSQL(str);
                    return 1L;
                }
            }, m(udf.RAW_SQL, new agni("DatabasePlugin#execSQL1"), new rxm(6), this));
        } else {
            ad(new ryv(this, str, 11), m(udf.RAW_SQL, new agni("DatabasePlugin#execSQL1"), new rxm(7), this));
        }
    }
}
