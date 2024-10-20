package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvd extends gtm {
    public Context c;
    public gsb d;
    public WorkDatabase e;
    public List f;
    public gud g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public volatile hau j;
    public final gqg k;
    public gpx l;
    public hgi m;
    private final arwe p;
    public static final String a = gsy.b("WorkManagerImpl");
    private static gvd n = null;
    private static gvd o = null;
    public static final Object b = new Object();

    /* JADX WARN: Type inference failed for: r10v1, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public gvd(Context context, final gsb gsbVar, gpx gpxVar, WorkDatabase workDatabase, final List list, gud gudVar, gqg gqgVar) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
        if (!isDeviceProtectedStorage) {
            gsy gsyVar = new gsy(gsbVar.h);
            synchronized (gsy.a) {
                if (gsy.b == null) {
                    gsy.b = gsyVar;
                }
            }
            this.c = applicationContext;
            this.l = gpxVar;
            this.e = workDatabase;
            this.g = gudVar;
            this.k = gqgVar;
            this.d = gsbVar;
            this.f = list;
            gpxVar.getClass();
            ?? r10 = gpxVar.d;
            r10.getClass();
            arwe e = arwi.e(r10);
            this.p = e;
            final WorkDatabase workDatabase2 = this.e;
            this.m = new hgi((Object) workDatabase2, (byte[]) null);
            gud gudVar2 = this.g;
            final ?? r7 = gpxVar.b;
            gudVar2.a(new gts() { // from class: gug
                @Override // defpackage.gts
                public final void a(gyg gygVar, boolean z) {
                    r7.execute(new eex(list, gygVar, gsbVar, workDatabase2, 7));
                }
            });
            this.l.b(new ForceStopRunnable(applicationContext, this));
            Context context2 = this.c;
            String str = guo.a;
            context2.getClass();
            if (gzw.a(context2, gsbVar)) {
                gzn gznVar = (gzn) workDatabase.A();
                rh rhVar = new rh(new gze(gznVar, gih.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)), 17);
                gid gidVar = gznVar.a;
                ghv b2 = gidVar.b();
                String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
                strArr.getClass();
                giw giwVar = b2.c;
                armo f = giwVar.f(strArr);
                Object obj = f.a;
                arrn.J(e, null, null, new aghm(new akee(asar.a(armd.m(new akee(new gjb(armd.m(new asaa(new giq(giwVar, (int[]) f.b, (String[]) obj, null))), gidVar, rhVar), new gum(null), 6))), new gun(context2, null), 10), (arpe) null, 7), 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gvd m(Context context) {
        gvd gvdVar;
        Object obj = b;
        synchronized (obj) {
            synchronized (obj) {
                gvdVar = n;
                if (gvdVar == null) {
                    gvdVar = o;
                }
            }
            return gvdVar;
        }
        if (gvdVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof gsa) {
                n(applicationContext, ((gsa) applicationContext).a());
                gvdVar = m(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return gvdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0322, code lost:
    
        r2 = r0.f().entrySet();
        r4 = new java.util.LinkedHashMap(defpackage.arrn.r(defpackage.aqjn.i(defpackage.aqjn.J(r2, 10)), 16));
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0349, code lost:
    
        r3 = (java.util.Map.Entry) r2.next();
        r5 = (java.lang.Class) r3.getKey();
        r3 = (java.util.List) r3.getValue();
        r5 = defpackage.armd.f(r5);
        r6 = new java.util.ArrayList(defpackage.aqjn.J(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0374, code lost:
    
        r6.add(defpackage.armd.f((java.lang.Class) r3.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0382, code lost:
    
        r3 = new defpackage.armo(r5, r6);
        r4.put(r3.a, r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x038f, code lost:
    
        r2 = new boolean[r4.size()];
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03a3, code lost:
    
        r4 = (java.util.Map.Entry) r3.next();
        r5 = (defpackage.artf) r4.getKey();
        r4 = ((java.util.List) r4.getValue()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03bf, code lost:
    
        r6 = (defpackage.artf) r4.next();
        r10 = r1.k.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03cc, code lost:
    
        if (r10 >= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ce, code lost:
    
        r11 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03da, code lost:
    
        if (r6.d(r1.k.get(r10)) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03e0, code lost:
    
        if (r11 < 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03e3, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03dc, code lost:
    
        r2[r10] = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e6, code lost:
    
        if (r10 < 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03e8, code lost:
    
        r10 = r1.k.get(r10);
        r6.getClass();
        r10.getClass();
        r0.h.put(r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0425, code lost:
    
        throw new java.lang.IllegalArgumentException("A required type converter (" + r6.b() + ") for " + r5.b() + " is missing in the database configuration.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e5, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0426, code lost:
    
        r3 = r1.k.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r8 = r31.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x042d, code lost:
    
        if (r3 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x043a, code lost:
    
        r0.d = r1.f;
        r0.e = new defpackage.gzx(r1.g, 1, null);
        r2 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x044b, code lost:
    
        if (r2 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x044d, code lost:
    
        defpackage.arro.b("internalQueryExecutor");
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0453, code lost:
    
        r0.b = defpackage.arwi.e(defpackage.arsd.an(r2).plus(new defpackage.aryj(null)));
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0469, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x046b, code lost:
    
        defpackage.arro.b("coroutineScope");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0471, code lost:
    
        r2 = ((defpackage.asep) r3).a;
        r3 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0477, code lost:
    
        if (r3 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (defpackage.gvd.o != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0479, code lost:
    
        defpackage.arro.b("internalTransactionExecutor");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x047f, code lost:
    
        r0.c = r2.plus(defpackage.arsd.an(r3));
        r0.g = r1.e;
        r3 = r0.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x048f, code lost:
    
        if (r3 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0491, code lost:
    
        defpackage.arro.b("connectionManager");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0497, code lost:
    
        r1 = r3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x049b, code lost:
    
        if (r1 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x049d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04b2, code lost:
    
        if (((defpackage.gjm) r3) != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04b4, code lost:
    
        r3 = r0.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r8.getClass();
        r10 = new defpackage.gpx(r32.c);
        r1 = r8.getApplicationContext();
        r1.getClass();
        r2 = r10.b;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04b6, code lost:
    
        if (r3 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b8, code lost:
    
        defpackage.arro.b("connectionManager");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04be, code lost:
    
        r1 = r3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c2, code lost:
    
        if (r1 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04c4, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04d9, code lost:
    
        if (((defpackage.gjl) r3) != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04db, code lost:
    
        r0 = (androidx.work.impl.WorkDatabase) r0;
        r2 = r8.getApplicationContext();
        r2.getClass();
        r1 = r2.getApplicationContext();
        r1.getClass();
        r3 = new defpackage.gwz(r1, r10);
        r1 = r2.getApplicationContext();
        r1.getClass();
        r4 = new defpackage.gxb(r1, r10);
        r1 = r2.getApplicationContext();
        r1.getClass();
        r5 = new defpackage.gxj(r1, r10);
        r1 = r2.getApplicationContext();
        r1.getClass();
        r10 = new defpackage.gqg(r2, r3, r4, r5, new defpackage.gxl(r1, r10));
        r11 = new defpackage.gud(r8.getApplicationContext(), r32, r10, r0);
        r1 = defpackage.gve.a;
        r0.getClass();
        defpackage.gvd.o = new defpackage.gvd(r8.getApplicationContext(), r32, r10, r0, r1.a(r8, r32, r10, r0, r10, r11), r11, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x054b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r8.getResources().getBoolean(com.google.android.apps.messaging.R.bool.workmanager_test_configuration) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04c6, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04ce, code lost:
    
        if ((r3 instanceof defpackage.ghn) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04d0, code lost:
    
        r3 = ((defpackage.ghn) r3).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x054d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r6 = new defpackage.gic(r1, androidx.work.impl.WorkDatabase.class, null);
        r6.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x049f, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a7, code lost:
    
        if ((r3 instanceof defpackage.ghn) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04a9, code lost:
    
        r3 = ((defpackage.ghn) r3).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0430, code lost:
    
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0434, code lost:
    
        if (r2[r3] != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r6.f = r2;
        r6.d.add(new defpackage.gtr());
        r6.a(defpackage.gtx.c);
        r6.a(new defpackage.gue(r1, 2, 3));
        r6.a(defpackage.gty.c);
        r6.a(defpackage.gtz.c);
        r6.a(new defpackage.gue(r1, 5, 6));
        r6.a(defpackage.gua.c);
        r6.a(defpackage.gub.c);
        r6.a(defpackage.guc.c);
        r6.a(new defpackage.gvg(r1));
        r6.a(new defpackage.gue(r1, 10, 11));
        r6.a(defpackage.gtt.c);
        r6.a(defpackage.gtu.c);
        r6.a(defpackage.gtv.c);
        r6.a(defpackage.gtw.c);
        r6.a(new defpackage.gue(r1, 21, 22));
        r6.m = false;
        r6.n = true;
        r1 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0436, code lost:
    
        if (r4 >= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0438, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x056f, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected type converter " + r1.k.get(r3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02a5, code lost:
    
        r6 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02a7, code lost:
    
        if (r3 >= r4) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0123, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02ad, code lost:
    
        if (r6 < 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0570, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x057c, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0584, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01a6, code lost:
    
        r22 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x019a, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0132, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0136, code lost:
    
        if (r6.g != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0138, code lost:
    
        r6.g = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x013b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x013d, code lost:
    
        r6.f = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0057, code lost:
    
        if (defpackage.arsd.M("androidx.work.workdb") != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0127, code lost:
    
        if (r6.g != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x005f, code lost:
    
        if (defpackage.d.F("androidx.work.workdb", ":memory:") != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0061, code lost:
    
        r7 = new defpackage.gic(r1, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
        r7.h = new defpackage.guq(r1);
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x058c, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0594, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0595, code lost:
    
        defpackage.gvd.n = defpackage.gvd.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0129, code lost:
    
        r6.g = defpackage.sq.b;
        r6.f = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0141, code lost:
    
        r1 = r6.k;
        r2 = r6.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0149, code lost:
    
        if (r1.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014b, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0153, code lost:
    
        if (r1.hasNext() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0155, code lost:
    
        r3 = ((java.lang.Number) r1.next()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0167, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r3)) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0175, code lost:
    
        throw new java.lang.IllegalArgumentException(defpackage.a.bV(r3, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0176, code lost:
    
        r1 = r6.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0178, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017a, code lost:
    
        r1 = new defpackage.gkn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
    
        r18 = r1;
        r2 = r6.b;
        r3 = r6.c;
        r7 = r6.o;
        r13 = r6.d;
        r15 = r6.i;
        r11 = r2.getSystemService("activity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0195, code lost:
    
        if ((r11 instanceof android.app.ActivityManager) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0197, code lost:
    
        r11 = (android.app.ActivityManager) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019b, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a1, code lost:
    
        if (r11.isLowRamDevice() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a3, code lost:
    
        r22 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a8, code lost:
    
        r11 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01aa, code lost:
    
        if (r11 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ac, code lost:
    
        r12 = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ae, code lost:
    
        if (r12 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b7, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b8, code lost:
    
        r1 = new defpackage.ghm(r2, r3, r18, r7, r13, r15, r22, r11, r12, r6.m, r6.n, r6.j, r6.e, r6.l);
        r0 = (defpackage.gid) defpackage.gvf.bz(defpackage.armd.d(r6.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f2, code lost:
    
        throw new defpackage.armn((byte[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f3, code lost:
    
        r0.j = new defpackage.ktk(r1, (defpackage.arqr) new defpackage.rh(r0, 19));
        r0.f = r0.a();
        r2 = new java.util.LinkedHashMap();
        r3 = r0.g();
        r4 = new java.util.ArrayList(defpackage.aqjn.J(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0225, code lost:
    
        r4.add(defpackage.armd.f((java.lang.Class) r3.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0233, code lost:
    
        r3 = defpackage.aqjn.aE(r4);
        r4 = r3.size();
        r5 = new boolean[r4];
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0241, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0246, code lost:
    
        if (r3.hasNext() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0248, code lost:
    
        r6 = (defpackage.artf) r3.next();
        r10 = r1.l.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0255, code lost:
    
        if (r10 >= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0257, code lost:
    
        r11 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0263, code lost:
    
        if (r6.d(r1.l.get(r10)) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026a, code lost:
    
        if (r11 < 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x026d, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0265, code lost:
    
        r5[r10] = true;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026f, code lost:
    
        if (r7 >= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0271, code lost:
    
        r2.put(r6, r1.l.get(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x029a, code lost:
    
        throw new java.lang.IllegalArgumentException("A required auto migration spec (" + r6.b() + ") is missing in the database configuration.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x029b, code lost:
    
        r3 = r1.l.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a2, code lost:
    
        if (r3 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02af, code lost:
    
        r3 = new java.util.LinkedHashMap(defpackage.aqjn.i(r2.size()));
        r2 = r2.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ca, code lost:
    
        r4 = (java.util.Map.Entry) r2.next();
        r3.put(defpackage.armd.d((defpackage.artf) r4.getKey()), r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e2, code lost:
    
        r2 = r0.s().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f0, code lost:
    
        r3 = (defpackage.gjk) r2.next();
        r4 = r1.n;
        r5 = r3.a;
        r6 = r3.b;
        r4 = r4.a;
        r5 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0306, code lost:
    
        if (r4.containsKey(r5) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0308, code lost:
    
        r4 = (java.util.Map) r4.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x030e, code lost:
    
        if (r4 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0310, code lost:
    
        r4 = defpackage.arnw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x031a, code lost:
    
        if (r4.containsKey(java.lang.Integer.valueOf(r6)) == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x031c, code lost:
    
        r1.n.f(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e8 A[Catch: all -> 0x059b, LOOP:9: B:119:0x03b9->B:132:0x03e8, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0045, B:18:0x006e, B:20:0x0125, B:22:0x0129, B:23:0x0141, B:25:0x014b, B:26:0x014f, B:28:0x0155, B:32:0x016a, B:33:0x0175, B:35:0x0176, B:37:0x017a, B:38:0x017f, B:40:0x0197, B:42:0x019d, B:45:0x01a8, B:47:0x01ac, B:49:0x01b0, B:50:0x01b7, B:51:0x01b8, B:53:0x01ec, B:54:0x01f2, B:56:0x01f3, B:57:0x021f, B:59:0x0225, B:61:0x0233, B:62:0x0241, B:64:0x0248, B:66:0x0257, B:73:0x0265, B:75:0x0271, B:77:0x027b, B:78:0x029a, B:80:0x029b, B:83:0x02af, B:84:0x02c4, B:86:0x02ca, B:88:0x02e2, B:89:0x02ea, B:91:0x02f0, B:93:0x0308, B:95:0x0310, B:96:0x0312, B:99:0x031c, B:105:0x0322, B:106:0x0343, B:108:0x0349, B:109:0x036e, B:111:0x0374, B:113:0x0382, B:115:0x038f, B:116:0x039d, B:118:0x03a3, B:119:0x03b9, B:121:0x03bf, B:123:0x03ce, B:130:0x03dc, B:132:0x03e8, B:134:0x03fa, B:135:0x0425, B:139:0x0426, B:142:0x043a, B:144:0x044d, B:145:0x0453, B:147:0x046b, B:148:0x0471, B:150:0x0479, B:151:0x047f, B:153:0x0491, B:154:0x0497, B:157:0x04b0, B:159:0x04b4, B:161:0x04b8, B:162:0x04be, B:165:0x04d7, B:167:0x04db, B:169:0x054b, B:171:0x04c7, B:173:0x04cc, B:175:0x04d0, B:179:0x054d, B:181:0x04a0, B:183:0x04a5, B:185:0x04a9, B:188:0x0430, B:194:0x054e, B:195:0x056f, B:196:0x02a5, B:198:0x02a9, B:204:0x0575, B:205:0x057c, B:207:0x057d, B:208:0x0584, B:212:0x0134, B:214:0x0138, B:216:0x013d, B:217:0x004f, B:219:0x0059, B:221:0x0061, B:222:0x0585, B:223:0x058c, B:224:0x058d, B:225:0x0594, B:226:0x0595, B:227:0x0599), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b4 A[Catch: all -> 0x059b, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0045, B:18:0x006e, B:20:0x0125, B:22:0x0129, B:23:0x0141, B:25:0x014b, B:26:0x014f, B:28:0x0155, B:32:0x016a, B:33:0x0175, B:35:0x0176, B:37:0x017a, B:38:0x017f, B:40:0x0197, B:42:0x019d, B:45:0x01a8, B:47:0x01ac, B:49:0x01b0, B:50:0x01b7, B:51:0x01b8, B:53:0x01ec, B:54:0x01f2, B:56:0x01f3, B:57:0x021f, B:59:0x0225, B:61:0x0233, B:62:0x0241, B:64:0x0248, B:66:0x0257, B:73:0x0265, B:75:0x0271, B:77:0x027b, B:78:0x029a, B:80:0x029b, B:83:0x02af, B:84:0x02c4, B:86:0x02ca, B:88:0x02e2, B:89:0x02ea, B:91:0x02f0, B:93:0x0308, B:95:0x0310, B:96:0x0312, B:99:0x031c, B:105:0x0322, B:106:0x0343, B:108:0x0349, B:109:0x036e, B:111:0x0374, B:113:0x0382, B:115:0x038f, B:116:0x039d, B:118:0x03a3, B:119:0x03b9, B:121:0x03bf, B:123:0x03ce, B:130:0x03dc, B:132:0x03e8, B:134:0x03fa, B:135:0x0425, B:139:0x0426, B:142:0x043a, B:144:0x044d, B:145:0x0453, B:147:0x046b, B:148:0x0471, B:150:0x0479, B:151:0x047f, B:153:0x0491, B:154:0x0497, B:157:0x04b0, B:159:0x04b4, B:161:0x04b8, B:162:0x04be, B:165:0x04d7, B:167:0x04db, B:169:0x054b, B:171:0x04c7, B:173:0x04cc, B:175:0x04d0, B:179:0x054d, B:181:0x04a0, B:183:0x04a5, B:185:0x04a9, B:188:0x0430, B:194:0x054e, B:195:0x056f, B:196:0x02a5, B:198:0x02a9, B:204:0x0575, B:205:0x057c, B:207:0x057d, B:208:0x0584, B:212:0x0134, B:214:0x0138, B:216:0x013d, B:217:0x004f, B:219:0x0059, B:221:0x0061, B:222:0x0585, B:223:0x058c, B:224:0x058d, B:225:0x0594, B:226:0x0595, B:227:0x0599), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04db A[Catch: all -> 0x059b, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:13:0x0018, B:15:0x0020, B:17:0x0045, B:18:0x006e, B:20:0x0125, B:22:0x0129, B:23:0x0141, B:25:0x014b, B:26:0x014f, B:28:0x0155, B:32:0x016a, B:33:0x0175, B:35:0x0176, B:37:0x017a, B:38:0x017f, B:40:0x0197, B:42:0x019d, B:45:0x01a8, B:47:0x01ac, B:49:0x01b0, B:50:0x01b7, B:51:0x01b8, B:53:0x01ec, B:54:0x01f2, B:56:0x01f3, B:57:0x021f, B:59:0x0225, B:61:0x0233, B:62:0x0241, B:64:0x0248, B:66:0x0257, B:73:0x0265, B:75:0x0271, B:77:0x027b, B:78:0x029a, B:80:0x029b, B:83:0x02af, B:84:0x02c4, B:86:0x02ca, B:88:0x02e2, B:89:0x02ea, B:91:0x02f0, B:93:0x0308, B:95:0x0310, B:96:0x0312, B:99:0x031c, B:105:0x0322, B:106:0x0343, B:108:0x0349, B:109:0x036e, B:111:0x0374, B:113:0x0382, B:115:0x038f, B:116:0x039d, B:118:0x03a3, B:119:0x03b9, B:121:0x03bf, B:123:0x03ce, B:130:0x03dc, B:132:0x03e8, B:134:0x03fa, B:135:0x0425, B:139:0x0426, B:142:0x043a, B:144:0x044d, B:145:0x0453, B:147:0x046b, B:148:0x0471, B:150:0x0479, B:151:0x047f, B:153:0x0491, B:154:0x0497, B:157:0x04b0, B:159:0x04b4, B:161:0x04b8, B:162:0x04be, B:165:0x04d7, B:167:0x04db, B:169:0x054b, B:171:0x04c7, B:173:0x04cc, B:175:0x04d0, B:179:0x054d, B:181:0x04a0, B:183:0x04a5, B:185:0x04a9, B:188:0x0430, B:194:0x054e, B:195:0x056f, B:196:0x02a5, B:198:0x02a9, B:204:0x0575, B:205:0x057c, B:207:0x057d, B:208:0x0584, B:212:0x0134, B:214:0x0138, B:216:0x013d, B:217:0x004f, B:219:0x0059, B:221:0x0061, B:222:0x0585, B:223:0x058c, B:224:0x058d, B:225:0x0594, B:226:0x0595, B:227:0x0599), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x054c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(android.content.Context r31, defpackage.gsb r32) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvd.n(android.content.Context, gsb):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gtm
    public final gtd a(String str) {
        str.getClass();
        gvf gvfVar = this.d.m;
        ?? r1 = this.l.b;
        r1.getClass();
        return gvf.bI(gvfVar, "CancelWorkByTag_".concat(str), r1, new gqx(this, str, 6, null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gtm
    public final gtd b(String str) {
        str.getClass();
        gvf gvfVar = this.d.m;
        ?? r1 = this.l.b;
        r1.getClass();
        return gvf.bI(gvfVar, "CancelWorkByName_".concat(str), r1, new gqx(str, this, 5));
    }

    @Override // defpackage.gtm
    public final gtd c(UUID uuid) {
        return gvf.t(uuid, this);
    }

    @Override // defpackage.gtm
    public final gtd d(List list) {
        if (!list.isEmpty()) {
            return new gup(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // defpackage.gtm
    public final gtd e(String str, gso gsoVar, List list) {
        return new gup(this, str, gsoVar, list).a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gtm
    public final gtd f() {
        WorkDatabase workDatabase = this.e;
        gsb gsbVar = this.d;
        gpx gpxVar = this.l;
        workDatabase.getClass();
        gsbVar.getClass();
        gpxVar.getClass();
        ?? r2 = gpxVar.b;
        r2.getClass();
        return gvf.bI(gsbVar.m, "PruneWork", r2, new gqu(workDatabase, 7));
    }

    @Override // defpackage.gtm
    public final gti g(String str, gso gsoVar, List list) {
        if (!list.isEmpty()) {
            return new gup(this, str, gsoVar, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // defpackage.gtm
    public final ListenableFuture h(ico icoVar) {
        WorkDatabase workDatabase = this.e;
        gpx gpxVar = this.l;
        workDatabase.getClass();
        gpxVar.getClass();
        return gvf.aj(workDatabase, gpxVar, new gzy(icoVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gtm
    public final gtd j(String str, int i, kkc kkcVar) {
        gso gsoVar;
        if (i != 3) {
            if (i == 2) {
                gsoVar = gso.KEEP;
            } else {
                gsoVar = gso.REPLACE;
            }
            return new gup(this, str, gsoVar, Collections.singletonList(kkcVar)).a();
        }
        gvf gvfVar = this.d.m;
        ?? r1 = this.l.b;
        r1.getClass();
        return gvf.bI(gvfVar, "enqueueUniquePeriodic_".concat(str), r1, new bp(this, str, kkcVar, 3));
    }

    public final void o() {
        synchronized (b) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public final void p() {
        gvf gvfVar = this.d.m;
        gvc gvcVar = new gvc(this, 0);
        boolean be = gvf.be();
        if (be) {
            try {
                gvf.bd("ReschedulingWork");
            } catch (Throwable th) {
                if (be) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        gvcVar.a();
        if (be) {
            Trace.endSection();
        }
    }

    public final void q(gyg gygVar, int i) {
        this.l.b(new gzz(this.g, new hgi(gygVar), true, i));
    }
}
