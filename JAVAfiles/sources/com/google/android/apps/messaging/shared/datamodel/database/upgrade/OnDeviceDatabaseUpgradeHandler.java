package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import defpackage.a;
import defpackage.agmg;
import defpackage.agna;
import defpackage.agnc;
import defpackage.agnr;
import defpackage.agns;
import defpackage.agnw;
import defpackage.agoi;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alog;
import defpackage.alst;
import defpackage.alsx;
import defpackage.amvm;
import defpackage.armf;
import defpackage.lvh;
import defpackage.qq;
import defpackage.qxp;
import defpackage.qxq;
import defpackage.qxr;
import defpackage.roi;
import defpackage.rsi;
import defpackage.rtz;
import defpackage.rug;
import defpackage.rzo;
import defpackage.rzp;
import defpackage.rzq;
import defpackage.rzu;
import defpackage.rzv;
import defpackage.sky;
import defpackage.smk;
import defpackage.smu;
import defpackage.smv;
import defpackage.sna;
import defpackage.snb;
import defpackage.snf;
import defpackage.snh;
import defpackage.sni;
import defpackage.sxu;
import defpackage.tbo;
import defpackage.tqc;
import defpackage.trt;
import defpackage.uj;
import defpackage.utz;
import defpackage.wzp;
import defpackage.xjn;
import defpackage.xjo;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OnDeviceDatabaseUpgradeHandler {
    static final int ODD_EVEN_SEMANTICS_START_POINT = 42000;
    private static final xze log = xze.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private final xjo conversationCustomizer;
    private final armf<rtz> conversationDatabaseOperations;
    private final CustomUpgradeSteps customUpgradeSteps;
    private final agnw database;
    private final qxq databaseHelperUtils;
    private final int newVersion;
    private final int oldVersion;
    private final armf<Boolean> skipUpgradePrecheckForBackupDb;
    private final armf<wzp> syncManager;
    PriorityQueue<agns> upgradeSteps = makeQueue();
    private final alog<Method> allManualUpgradesSteps = getAllCustomUpgradeSteps();

    /* renamed from: -$$Nest$fgetcustomUpgradeSteps */
    public static /* bridge */ /* synthetic */ CustomUpgradeSteps m194$$Nest$fgetcustomUpgradeSteps(OnDeviceDatabaseUpgradeHandler onDeviceDatabaseUpgradeHandler) {
        return onDeviceDatabaseUpgradeHandler.customUpgradeSteps;
    }

    public OnDeviceDatabaseUpgradeHandler(CustomUpgradeSteps customUpgradeSteps, armf<wzp> armfVar, Map<String, agns> map, armf<rtz> armfVar2, qxr qxrVar, xjo xjoVar, armf<Boolean> armfVar3, agnw agnwVar, agna agnaVar, int i, int i2) {
        this.customUpgradeSteps = customUpgradeSteps;
        this.syncManager = armfVar;
        this.conversationDatabaseOperations = armfVar2;
        this.databaseHelperUtils = qxrVar.a(agnaVar);
        this.conversationCustomizer = xjoVar;
        this.database = agnwVar;
        this.oldVersion = i;
        this.newVersion = i2;
        filterUpgradesForDatabase(map, agnaVar.b).filter(new rsi(18)).forEach(new rug(this, 12));
        this.skipUpgradePrecheckForBackupDb = armfVar3;
    }

    private static int checkAndUpdateVersion(int i, int i2) {
        if (i >= i2) {
            return i2;
        }
        throw new rzp(-1L, i2, i, "missing upgrade handler", null);
    }

    public static Stream<agns> filterUpgradesForDatabase(Map<String, agns> map, String str) {
        return Collection.EL.stream(map.entrySet()).filter(new qxp(str, 16)).map(new rzq(7));
    }

    private static List<Method> getAfterGeneratedUpgradeMethods(alog<Method> alogVar) {
        int i = 19;
        return (List) Collection.EL.stream(alogVar).filter(new rsi(i)).collect(Collectors.toCollection(new roi(i)));
    }

    private static alog<Method> getAllCustomUpgradeSteps() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Method method : CustomUpgradeSteps.class.getDeclaredMethods()) {
            if (method.getName().startsWith("upgradeToVersion")) {
                if (method.getReturnType() == Void.TYPE) {
                    if (method.getParameterTypes().length == 1) {
                        if (method.getParameterTypes()[0] == agnw.class) {
                            if (!Modifier.isStatic(method.getModifiers())) {
                                albo.C((rzo) getAnnotationOrThrow(method, rzo.class));
                                arrayList.add(method);
                            } else {
                                throw new IllegalStateException("method " + method.getName() + " should not be static");
                            }
                        } else {
                            throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseInterface parameter");
                        }
                    } else {
                        throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseWrapper parameter");
                    }
                } else {
                    throw new IllegalStateException("method " + method.getName() + " should return void");
                }
            }
        }
        if (arrayList.size() > 0) {
            z = true;
        }
        albo.U(z, "didn't find any upgrade methods; check proguard config");
        return alog.E(new lvh(9), arrayList);
    }

    public static <T extends Annotation> T getAnnotationOrThrow(Method method, Class<T> cls) {
        T t = (T) method.getAnnotation(cls);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("expected annotation of type ".concat(String.valueOf(String.valueOf(cls))));
    }

    private static List<Method> getUpgradeMethods(alog<Method> alogVar) {
        return (List) Collection.EL.stream(alogVar).filter(new rsi(20)).collect(Collectors.toCollection(new roi(19)));
    }

    private Runnable getUpgradeRunnable(final int i, final List<agnr> list, final boolean z) {
        return new Runnable() { // from class: rzr
            @Override // java.lang.Runnable
            public final void run() {
                OnDeviceDatabaseUpgradeHandler.this.m197xc036c121(z, i, list);
            }
        };
    }

    private static boolean isBackupDb(agnw agnwVar) {
        agna n;
        if (agnwVar != null && (n = agnwVar.n()) != null) {
            return Objects.equals(n.b, "backup");
        }
        return false;
    }

    private boolean isCurrentThreadInTransaction() {
        return this.database.G();
    }

    public static /* synthetic */ boolean lambda$filterUpgradesForDatabase$0(String str, Map.Entry entry) {
        return ((String) entry.getKey()).startsWith(String.valueOf(str).concat("+"));
    }

    public static /* synthetic */ agns lambda$filterUpgradesForDatabase$1(Map.Entry entry) {
        return (agns) entry.getValue();
    }

    public static /* synthetic */ boolean lambda$getAfterGeneratedUpgradeMethods$0(Method method) {
        return ((rzo) getAnnotationOrThrow(method, rzo.class)).a();
    }

    public static /* synthetic */ int lambda$getAllCustomUpgradeSteps$0(Method method, Method method2) {
        return versionForMethod(method) - versionForMethod(method2);
    }

    public static /* synthetic */ boolean lambda$getUpgradeMethods$0(Method method) {
        if (!((rzo) getAnnotationOrThrow(method, rzo.class)).a()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ smv[] lambda$loadConversationCustomization$0(smu smuVar) {
        return new smv[]{smuVar.b, smuVar.q, smuVar.E, smuVar.G, smuVar.F, smuVar.N, smuVar.M};
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$1(snh snhVar) {
        snhVar.b(new rzq(2), new rzq(3), new rzq(4), new rzq(5), new rzq(6));
        return snhVar;
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$2(snh snhVar) {
        snhVar.d(tqc.UNARCHIVED);
        return snhVar;
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$3(snh snhVar) {
        snhVar.U(new agoi("conversations.notification_enabled", 1, 0));
        return snhVar;
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$4(snh snhVar) {
        snhVar.U(new agoi("conversations.notification_vibration", 1, 0));
        return snhVar;
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$5(snh snhVar) {
        snhVar.U(new agmg("conversations.notification_sound_uri", 6));
        return snhVar;
    }

    public static /* synthetic */ snh lambda$loadConversationCustomization$6(snh snhVar) {
        snhVar.e(2);
        return snhVar;
    }

    public static /* synthetic */ int lambda$makeQueue$0(agns agnsVar, agns agnsVar2) {
        int a = agnsVar.a();
        int a2 = agnsVar2.a();
        if (a != a2) {
            return a - a2;
        }
        if (agnsVar.b() != agnsVar2.b()) {
            return agnsVar.b() - agnsVar2.b();
        }
        if (TextUtils.equals(agnsVar.d(), agnsVar2.d())) {
            return agnsVar.d().compareTo(agnsVar2.d());
        }
        return agnsVar.hashCode() - agnsVar2.hashCode();
    }

    public static /* synthetic */ boolean lambda$new$0(agns agnsVar) {
        return agnsVar.e();
    }

    private static uj<xjn> loadConversationCustomization() {
        uj<xjn> ujVar = new uj<>();
        snf e = sni.e();
        e.w("loadConversationCustomization");
        e.e(new rzq(1));
        e.h(new rzq(0));
        sna snaVar = (sna) e.b().n();
        while (snaVar.moveToNext()) {
            try {
                ujVar.f(yyb.cE(snaVar.L()), new xjn(snaVar.E(), !snaVar.au(), !snaVar.av(), snaVar.aa(), snaVar.f(), snaVar.s()));
            } catch (Throwable th) {
                try {
                    snaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        snaVar.close();
        return ujVar;
    }

    static PriorityQueue<agns> makeQueue() {
        return new PriorityQueue<>(50, new lvh(10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void precheck(int i, int i2, agnw agnwVar) {
        alog alogVar = agnwVar.n().f;
        int i3 = ((alsx) alogVar).c;
        int i4 = 0;
        while (i4 < i3) {
            alst alstVar = (alst) alogVar.get(i4);
            i4++;
            if (alstVar.a(Integer.valueOf(i))) {
                long j = i;
                throw new rzp(j, i2, j, "oldVersion is in invalid range:" + alstVar.b.b().toString() + ":" + alstVar.c.b().toString(), null);
            }
        }
    }

    private void rebuildAvatars() {
        xze xzeVar = log;
        xzeVar.o("begin rebuildAvatars.");
        ((rtz) this.conversationDatabaseOperations.b()).N();
        xzeVar.o("completed rebuildAvatars.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (defpackage.ahjj.x(r2) != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void rebuildTriggers(defpackage.agnw r6) {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.j()
            defpackage.qxq.e(r0)
            agna r0 = r6.n()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "$primary"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L17
            goto L27
        L17:
            java.lang.String[] r0 = defpackage.qxq.e
            int r2 = r0.length
            r2 = r1
        L1b:
            r3 = 16
            if (r2 >= r3) goto L27
            r3 = r0[r2]
            r6.z(r3)
            int r2 = r2 + 1
            goto L1b
        L27:
            defpackage.qxq.h(r6)
            qxq r0 = r5.databaseHelperUtils
            boolean r2 = defpackage.xxy.a()     // Catch: defpackage.apba -> La0
            if (r2 == 0) goto L5b
            qif r2 = r0.m     // Catch: defpackage.apba -> La0
            qid r2 = r2.a()     // Catch: defpackage.apba -> La0
            int r3 = r2.j     // Catch: defpackage.apba -> La0
            qic r3 = defpackage.qic.b(r3)     // Catch: defpackage.apba -> La0
            if (r3 != 0) goto L42
            qic r3 = defpackage.qic.UNSPECIFIED_STATUS     // Catch: defpackage.apba -> La0
        L42:
            boolean r3 = defpackage.ahjj.x(r3)     // Catch: defpackage.apba -> La0
            r4 = 1
            if (r3 != 0) goto L59
            int r2 = r2.l     // Catch: defpackage.apba -> La0
            qic r2 = defpackage.qic.b(r2)     // Catch: defpackage.apba -> La0
            if (r2 != 0) goto L53
            qic r2 = defpackage.qic.UNSPECIFIED_STATUS     // Catch: defpackage.apba -> La0
        L53:
            boolean r2 = defpackage.ahjj.x(r2)     // Catch: defpackage.apba -> La0
            if (r2 == 0) goto L61
        L59:
            r1 = r4
            goto L61
        L5b:
            qif r1 = r0.m     // Catch: defpackage.apba -> La0
            boolean r1 = r1.g()     // Catch: defpackage.apba -> La0
        L61:
            if (r1 == 0) goto La8
            alpr r1 = new alpr     // Catch: defpackage.apba -> La0
            r1.<init>()     // Catch: defpackage.apba -> La0
            armf r0 = r0.l     // Catch: defpackage.apba -> La0
            java.lang.Object r0 = r0.b()     // Catch: defpackage.apba -> La0
            java.util.Set r0 = (java.util.Set) r0     // Catch: defpackage.apba -> La0
            java.util.Iterator r0 = r0.iterator()     // Catch: defpackage.apba -> La0
        L74:
            boolean r2 = r0.hasNext()     // Catch: defpackage.apba -> La0
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()     // Catch: defpackage.apba -> La0
            uld r2 = (defpackage.uld) r2     // Catch: defpackage.apba -> La0
            java.util.List r2 = r2.a()     // Catch: defpackage.apba -> La0
            r1.j(r2)     // Catch: defpackage.apba -> La0
            goto L74
        L88:
            alpt r0 = r1.g()     // Catch: defpackage.apba -> La0
            aluq r0 = r0.listIterator()     // Catch: defpackage.apba -> La0
        L90:
            boolean r1 = r0.hasNext()     // Catch: defpackage.apba -> La0
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()     // Catch: defpackage.apba -> La0
            java.lang.String r1 = (java.lang.String) r1     // Catch: defpackage.apba -> La0
            r6.z(r1)     // Catch: defpackage.apba -> La0
            goto L90
        La0:
            r0 = move-exception
            xze r1 = defpackage.qxq.k
            java.lang.String r2 = "Can't process(rebuild/skip) CMS triggers: unable to decide CMS status"
            r1.r(r2, r0)
        La8:
            utz r0 = defpackage.lqg.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb7
            return
        Lb7:
            java.lang.String[] r0 = defpackage.syr.a
            uqg r0 = defpackage.syr.c
            java.lang.Object r0 = r0.c
            agmh r0 = (defpackage.agmh) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "smarts_personalization_decayed_feature_values"
            java.lang.String r0 = defpackage.lgc.d(r1, r0)
            r6.z(r0)
            java.lang.String[] r0 = defpackage.szd.a
            nej r0 = defpackage.szd.c
            java.lang.Object r0 = r0.a
            agmh r0 = (defpackage.agmh) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "smarts_personalization_normalized_feature_values"
            java.lang.String r0 = defpackage.lgc.d(r1, r0)
            r6.z(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler.rebuildTriggers(agnw):void");
    }

    static void rebuildViews(agnw agnwVar) {
        qxq.f(agnwVar.j());
        qxq.g(agnwVar);
    }

    private alhr<Integer> rebuildViewsUpgradeStep(final int i, final int i2) {
        return new alhr() { // from class: rzs
            @Override // defpackage.alhr
            public final Object get() {
                return OnDeviceDatabaseUpgradeHandler.this.m201x96e19b29(i, i2);
            }
        };
    }

    private void startSafeResync() {
        xze xzeVar = log;
        xzeVar.o("begin startSafeResync.");
        uj<xjn> loadConversationCustomization = loadConversationCustomization();
        new tbo().d();
        new sxu().d();
        new sky().d();
        new smk().d();
        new snb().d();
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            this.conversationCustomizer.a = loadConversationCustomization;
        } else {
            ((wzp) this.syncManager.b()).o(loadConversationCustomization);
        }
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            ((wzp) this.syncManager.b()).k(amvm.DATABASE_UPGRADE_RESYNC);
        } else {
            ((wzp) this.syncManager.b()).n();
        }
        xzeVar.o("completed startSafeResync.");
    }

    public static int versionForMethod(Method method) {
        try {
            return Integer.parseInt(method.getName().substring(16));
        } catch (NumberFormatException e) {
            xyo b = log.b();
            b.H("invalid upgrade method: ");
            b.H(method.getName());
            b.q();
            throw new rzp("invalid upgrade method: ".concat(String.valueOf(String.valueOf(method))), e);
        }
    }

    int applyUpdatesCurrentVersion(int i, PriorityQueue<agns> priorityQueue) {
        return applyUpdatesCurrentVersion(i, priorityQueue, Integer.MAX_VALUE);
    }

    public int applyUpgrades(int i, int i2) {
        rzu rzuVar = new rzu(this, false, getUpgradeMethods(this.allManualUpgradesSteps));
        rzu rzuVar2 = new rzu(this, true, getAfterGeneratedUpgradeMethods(this.allManualUpgradesSteps));
        this.upgradeSteps.offer(rzuVar);
        this.upgradeSteps.offer(rzuVar2);
        try {
            int applyUpdatesCurrentVersion = applyUpdatesCurrentVersion(i, this.upgradeSteps, i2);
            this.upgradeSteps.remove(rzuVar);
            this.upgradeSteps.remove(rzuVar2);
            checkAndUpdateVersion(applyUpdatesCurrentVersion, i2);
            return i2;
        } catch (Throwable th) {
            this.upgradeSteps.remove(rzuVar);
            this.upgradeSteps.remove(rzuVar2);
            throw th;
        }
    }

    public void doFinalDataUpgradeWithExceptions(int i, int i2) {
        if (i != 20055) {
            if (alst.e(20000, 21000).a(Integer.valueOf(i)) || (i >= 21000 && i <= 21010)) {
                startSafeResync();
                log.o("Applying startSafeResync to fix foreign keys.");
            }
            if (i == 22000) {
                rebuildAvatars();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:13:0x0044, B:16:0x0054, B:20:0x004f), top: B:12:0x0044, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doSchemaUpgradeWithExceptions() {
        /*
            r7 = this;
            int r0 = r7.oldVersion
            int r1 = r7.newVersion
            agnw r2 = r7.database
            agcp r3 = r2.W()
            r7.precheck(r0, r1, r2)
            int r1 = r7.oldVersion
            int r2 = r7.newVersion
            if (r1 != r2) goto L14
            return
        L14:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L81
            java.lang.Object r2 = r3.a     // Catch: java.io.IOException -> L81
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.io.IOException -> L81
            java.lang.Object r2 = r2.get()     // Catch: java.io.IOException -> L81
            java.lang.Thread r2 = (java.lang.Thread) r2     // Catch: java.io.IOException -> L81
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 != r1) goto L29
            goto L2b
        L29:
            r2 = r4
            goto L2c
        L2b:
            r2 = r5
        L2c:
            defpackage.albo.T(r2)     // Catch: java.io.IOException -> L81
            java.lang.Object r2 = r3.a     // Catch: java.io.IOException -> L81
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.io.IOException -> L81
            r2.set(r1)     // Catch: java.io.IOException -> L81
            java.lang.Object r1 = r3.c     // Catch: java.io.IOException -> L81
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1     // Catch: java.io.IOException -> L81
            r1.incrementAndGet()     // Catch: java.io.IOException -> L81
            ucz r1 = new ucz     // Catch: java.io.IOException -> L81
            r2 = 10
            r1.<init>(r3, r2)     // Catch: java.io.IOException -> L81
            int r2 = r7.newVersion     // Catch: java.lang.Throwable -> L77
            int r3 = r2 + (-1)
            r6 = 42000(0xa410, float:5.8855E-41)
            if (r2 >= r6) goto L4f
        L4d:
            r4 = r5
            goto L54
        L4f:
            int r2 = r3 % 2
            if (r2 != 0) goto L54
            goto L4d
        L54:
            defpackage.albo.T(r4)     // Catch: java.lang.Throwable -> L77
            r7.applyUpgrades(r0, r3)     // Catch: java.lang.Throwable -> L77
            int r0 = r7.newVersion     // Catch: java.lang.Throwable -> L77
            alhr r0 = r7.rebuildViewsUpgradeStep(r0, r3)     // Catch: java.lang.Throwable -> L77
            agnw r2 = r7.database     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "OnDeviceDatabaseUpgradeHandler#doSchemaUpgradeWithExceptions"
            java.lang.Object r0 = r2.s(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L77
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L77
            int r2 = r7.newVersion     // Catch: java.lang.Throwable -> L77
            checkAndUpdateVersion(r0, r2)     // Catch: java.lang.Throwable -> L77
            r1.close()     // Catch: java.io.IOException -> L81
            return
        L77:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L81
        L80:
            throw r0     // Catch: java.io.IOException -> L81
        L81:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler.doSchemaUpgradeWithExceptions():void");
    }

    public void doUpgradeWithExceptions() {
        xze xzeVar = log;
        xyo c = xzeVar.c();
        c.H("Beginning schema upgrade.");
        c.x("oldVersion", this.oldVersion);
        c.x("newVersion", this.newVersion);
        c.q();
        doSchemaUpgradeWithExceptions();
        xyo c2 = xzeVar.c();
        c2.H("Beginning data upgrade.");
        c2.x("oldVersion", this.oldVersion);
        c2.x("newVersion", this.newVersion);
        c2.q();
        doFinalDataUpgradeWithExceptions(this.oldVersion, this.newVersion);
    }

    public PriorityQueue<agns> getUpgradeSteps() {
        return this.upgradeSteps;
    }

    /* renamed from: lambda$getUpgradeRunnable$0$com-google-android-apps-messaging-shared-datamodel-database-upgrade-OnDeviceDatabaseUpgradeHandler */
    public /* synthetic */ void m197xc036c121(boolean z, int i, List list) {
        if (z) {
            albo.T(!qxq.j(this.database));
        }
        try {
            this.database.j().setVersion(i);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((agnr) it.next()).a().run();
            }
        } catch (Exception e) {
            throw new rzp(a.bV(i, "failed upgrade step "), e);
        }
    }

    /* renamed from: lambda$getUpgradeSteps$0$com-google-android-apps-messaging-shared-datamodel-database-upgrade-OnDeviceDatabaseUpgradeHandler */
    public /* synthetic */ void m198x143a30bd(List list, int i) {
        boolean anyMatch = Collection.EL.stream(list).anyMatch(new trt(1));
        albo.U(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
        if (anyMatch) {
            this.database.z("PRAGMA FOREIGN_KEYS = 0");
            albo.T(!qxq.j(this.database));
        }
        try {
            this.database.A("OnDeviceDatabaseUpgradeHandler#getUpgradeSteps", new qq(this, this.database.j().getVersion(), getUpgradeRunnable(i, list, anyMatch), 16, (byte[]) null));
            albo.U(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (anyMatch) {
                this.database.z("PRAGMA FOREIGN_KEYS = 1");
            }
        } catch (Throwable th) {
            albo.U(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (anyMatch) {
                this.database.z("PRAGMA FOREIGN_KEYS = 1");
            }
            throw th;
        }
    }

    /* renamed from: lambda$getUpgradeSteps$1$com-google-android-apps-messaging-shared-datamodel-database-upgrade-OnDeviceDatabaseUpgradeHandler */
    public /* synthetic */ void m199xccc6f11c(int i, Runnable runnable) {
        if (i == this.database.j().getVersion()) {
            runnable.run();
            return;
        }
        throw new rzv("current version changed after entering transaction -- check for a second process running upgrade steps");
    }

    /* renamed from: lambda$new$1$com-google-android-apps-messaging-shared-datamodel-database-upgrade-OnDeviceDatabaseUpgradeHandler */
    public /* synthetic */ void m200x77575b3d(agns agnsVar) {
        this.upgradeSteps.offer(agnsVar);
    }

    /* renamed from: lambda$rebuildViewsUpgradeStep$0$com-google-android-apps-messaging-shared-datamodel-database-upgrade-OnDeviceDatabaseUpgradeHandler */
    public /* synthetic */ Integer m201x96e19b29(int i, int i2) {
        boolean z;
        if (i == qxq.b(this.database.n())) {
            if (this.database.j().getVersion() == i2) {
                z = true;
            } else {
                z = false;
            }
            albo.T(z);
            if (this.database.n().b.equals("$primary")) {
                rebuildViews(this.database);
                rebuildTriggers(this.database);
            }
            this.database.j().setVersion(i);
        } else {
            this.database.j().setVersion(i2);
        }
        return Integer.valueOf(i);
    }

    public void onDowngrade() {
        try {
            if (this.database.n().e) {
                xyo e = log.e();
                e.H("Ignoring database downgrade");
                e.z("db handle", this.database.n().b);
                e.x("oldVersion", this.oldVersion);
                e.x("newVersion", this.newVersion);
                e.q();
                return;
            }
        } catch (Throwable th) {
            log.r("Failed to ignore DB downgrade", th);
        }
        xyo b = log.b();
        b.H("Database downgrade requested forcing db rebuild!");
        b.x("oldVersion", this.oldVersion);
        b.x("newVersion", this.newVersion);
        b.q();
        throw new rzp(this.oldVersion, this.newVersion, -1L, "onDowngrade not supported", null);
    }

    public void onUpgrade() {
        xze xzeVar = log;
        xyo c = xzeVar.c();
        c.H("Database upgrade started.");
        c.x("oldVersion", this.oldVersion);
        c.x("newVersion", this.newVersion);
        c.q();
        if (this.oldVersion != this.newVersion) {
            try {
                if (agnc.c.l) {
                    doUpgradeWithExceptions();
                    xzeVar.o("Finished database upgrade");
                    return;
                }
                throw new rzv("not primary process");
            } catch (Exception e) {
                if (e instanceof rzv) {
                    throw e;
                }
                xyo b = log.b();
                b.H("Failed to perform db upgrade.");
                b.x("oldVersion", this.oldVersion);
                b.x("newVersion", this.newVersion);
                b.r(e);
                throw new rzp(this.oldVersion, this.newVersion, this.database.j().getVersion(), "failed in doUpgradeWithExceptions", e);
            }
        }
    }

    private Runnable getUpgradeSteps(int i, PriorityQueue<agns> priorityQueue) {
        agns peek;
        ArrayList arrayList = new ArrayList();
        do {
            peek = priorityQueue.peek();
            if (peek == null || peek.a() != i) {
                break;
            }
            arrayList.add(peek.c(this.database));
            priorityQueue.poll();
            if (peek.e()) {
                priorityQueue.offer(peek);
            }
        } while (!peek.f());
        return new qq(this, arrayList, i, 15, (char[]) null);
    }

    public int applyUpdatesCurrentVersion(int i, PriorityQueue<agns> priorityQueue, int i2) {
        int a;
        while (true) {
            agns peek = priorityQueue.peek();
            if (peek != null && (a = peek.a()) <= i2) {
                Runnable upgradeSteps = getUpgradeSteps(a, priorityQueue);
                if (a <= i) {
                    log.o(a.bV(i, "Ignoring upgrade database to version (already past that) "));
                } else {
                    xze xzeVar = log;
                    xzeVar.o(a.bV(a, "Upgrading database to version "));
                    upgradeSteps.run();
                    xzeVar.o(a.bV(a, "Upgraded database to version "));
                    i = a;
                }
            }
        }
        return i;
    }
}
