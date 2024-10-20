package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import j$.util.Optional;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxn extends SQLiteOpenHelper {
    public final qxq e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final AtomicReference i;
    public final Object j;
    public final alhr k;
    public final agna l;
    public final DatabaseErrorHandler m;
    DatabaseErrorHandler n;
    public final adwp o;
    private final Context q;
    private final Optional r;
    private final armf s;
    private final armf t;
    private final xnv u;
    private final armf v;
    private final String w;
    private final Map x;
    private final jat y;
    private static final xze p = xze.g("Bugle", "DatabaseHelperBasic");
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final alhr b = albo.D(new msu(17));
    static final uuf c = uuh.f(uuh.b, "cursor_window_size", 4194304);
    public static final uuf d = uuh.h(uuh.b, "larger_cursor_window_logging_tags", "partOffsetQuery|+loadMessages");

    public qxn(Context context, armf armfVar, Optional optional, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, xnv xnvVar, jat jatVar, armf armfVar7, Map map, adwp adwpVar, agna agnaVar) {
        super(context, agnaVar.a, null, qxq.b(agnaVar), null);
        String str;
        this.i = new AtomicReference();
        this.j = new Object();
        this.m = new DefaultDatabaseErrorHandler();
        this.q = context;
        this.x = map;
        this.o = adwpVar;
        this.l = agnaVar;
        this.e = ((qxr) armfVar.b()).a(agnaVar);
        this.r = optional;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.s = armfVar5;
        this.t = armfVar6;
        this.u = xnvVar;
        this.y = jatVar;
        this.v = armfVar7;
        this.k = albo.D(new msu(16));
        if (agnaVar.b.equals("$primary")) {
            str = "bugle_db";
        } else {
            str = agnaVar.a;
        }
        this.w = str;
    }

    private final SQLiteDatabase d() {
        SQLiteDatabase b2;
        akrh e;
        String str = this.w;
        if (str == null) {
            b2 = SQLiteDatabase.create(null);
        } else {
            File databasePath = this.q.getDatabasePath(str);
            akrh e2 = aktp.e("DatabaseHelperBasic#getOrCreateDatabase directory operations");
            try {
                if (a.getAndSet(false)) {
                    databasePath.delete();
                }
                String parent = databasePath.getParent();
                parent.getClass();
                File file = new File(parent);
                file.mkdirs();
                if (!file.exists()) {
                    p.m("Unable to create directory for database storage");
                }
                e2.close();
                try {
                    b2 = b(databasePath.toString());
                } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteFullException e3) {
                    File file2 = new File(databasePath.toString().concat("-shm"));
                    boolean exists = file2.exists();
                    boolean delete = file2.delete();
                    xyo e4 = p.e();
                    e4.H("handled first exception opening database");
                    e4.H(e3.toString());
                    e4.H("-shm file existed:");
                    e4.I(exists);
                    e4.H("-shm file deleted:");
                    e4.I(delete);
                    e4.q();
                    b2 = b(databasePath.toString());
                    ((mbl) this.f.b()).c("Bugle.Datamodel.UnableToOpenDatabaseDeleteShmThenOpenSucceeded.Counts");
                }
            } catch (Throwable th) {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        onConfigure(b2);
        agna agnaVar = this.l;
        int version = b2.getVersion();
        int a2 = qxq.a(agnaVar.c);
        long c2 = this.u.c();
        aozy createBuilder = amjs.a.createBuilder();
        String str2 = this.l.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amjs amjsVar = (amjs) apagVar;
        str2.getClass();
        amjsVar.b |= 32;
        amjsVar.i = str2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amjs amjsVar2 = (amjs) apagVar2;
        amjsVar2.b |= 2;
        amjsVar2.d = version;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amjs amjsVar3 = (amjs) apagVar3;
        int i = 4;
        amjsVar3.b |= 4;
        amjsVar3.e = a2;
        if (version == 0) {
            i = 2;
        } else if (version <= a2) {
            if (version < a2) {
                i = 3;
            } else {
                i = 1;
            }
        }
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amjs amjsVar4 = (amjs) createBuilder.b;
        int i2 = i - 1;
        amjsVar4.c = i2;
        amjsVar4.b |= 1;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        onDowngrade(b2, version, a2);
                    }
                } else {
                    onUpgrade(b2, version, a2);
                }
            } else if (agnc.c.e()) {
                e = aktp.e("DatabaseHelperBasic#createSchema");
                try {
                    ((uci) this.i.get()).k.a(b2);
                    uci uciVar = (uci) this.i.get();
                    uciVar.r(new mrm(this, uciVar, a2, 5));
                    e.close();
                } finally {
                }
            } else {
                e = aktp.e("DatabaseHelperBasic#createSchema");
                try {
                    b2.beginTransaction();
                    try {
                        ((uci) this.i.get()).k.a(b2);
                        this.e.d((uci) this.i.get());
                        b2.setVersion(a2);
                        b2.setTransactionSuccessful();
                        e.close();
                    } finally {
                        b2.endTransaction();
                    }
                } finally {
                }
            }
            p.o(a.cp(agnc.i(b2), "sqlite version is "));
            onOpen(b2);
            if (this.l.b.equals("$primary")) {
                for (sey seyVar : (Set) ((apxx) this.s).a) {
                    seyVar.a();
                    seyVar.b();
                }
            }
            return b2;
        } finally {
        }
    }

    private static boolean e(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z;
        Cursor query = sQLiteDatabase.query("sqlite_master", null, "type = 'trigger' AND name = ?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (query != null) {
                query.close();
            }
            return z;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x021d A[Catch: all -> 0x024e, TRY_LEAVE, TryCatch #8 {all -> 0x024e, blocks: (B:144:0x01ec, B:146:0x021d, B:149:0x0244, B:152:0x0246, B:153:0x024d, B:142:0x01d2), top: B:141:0x01d2, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0244 A[Catch: all -> 0x024e, TRY_ENTER, TryCatch #8 {all -> 0x024e, blocks: (B:144:0x01ec, B:146:0x021d, B:149:0x0244, B:152:0x0246, B:153:0x024d, B:142:0x01d2), top: B:141:0x01d2, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.sqlite.SQLiteDatabase a() {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxn.a():android.database.sqlite.SQLiteDatabase");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[Catch: SQLiteDiskIOException -> 0x006f, SQLiteCantOpenDatabaseException | SQLiteDiskIOException -> 0x0071, all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:3:0x0006, B:28:0x0025, B:30:0x0034, B:31:0x003b, B:32:0x003c, B:6:0x003d, B:9:0x0053, B:11:0x005e, B:18:0x0047, B:21:0x004e, B:24:0x0074, B:25:0x0077), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.database.sqlite.SQLiteDatabase b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "DatabaseHelperBasic#openOrCreateDatabase"
            akrh r0 = defpackage.aktp.e(r0)
            qxl r1 = new qxl     // Catch: java.lang.Throwable -> L82
            r2 = 0
            r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> L82
            r9.n = r1     // Catch: java.lang.Throwable -> L82
            alhr r1 = defpackage.qxn.b     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L82
            utz r1 = (defpackage.utz) r1     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L82
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L82
            r3 = 0
            r4 = r2
            r5 = r3
        L23:
            if (r4 <= r1) goto L3d
            armf r10 = r9.f     // Catch: java.lang.Throwable -> L82
            java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L82
            mbl r10 = (defpackage.mbl) r10     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "Bugle.Datamodel.UnableToOpenDatabaseExceededRetries.Counts"
            r10.c(r1)     // Catch: java.lang.Throwable -> L82
            if (r5 != 0) goto L3c
            android.database.sqlite.SQLiteDiskIOException r10 = new android.database.sqlite.SQLiteDiskIOException     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "doOpenDatabase was never called"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L82
            throw r10     // Catch: java.lang.Throwable -> L82
        L3c:
            throw r5     // Catch: java.lang.Throwable -> L82
        L3d:
            agmt r6 = defpackage.agnc.c     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            boolean r6 = r6.d()     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            if (r6 != 0) goto L47
        L45:
            r6 = r3
            goto L53
        L47:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            r7 = 28
            if (r6 >= r7) goto L4e
            goto L45
        L4e:
            qxm r6 = new qxm     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            r6.<init>(r9, r2)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
        L53:
            android.database.DatabaseErrorHandler r7 = r9.n     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            r8 = 805306384(0x30000010, float:4.656622E-10)
            android.database.sqlite.SQLiteDatabase r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r10, r6, r8, r7)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            if (r4 <= 0) goto L6b
            armf r7 = r9.f     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            java.lang.Object r7 = r7.b()     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            mbl r7 = (defpackage.mbl) r7     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
            java.lang.String r8 = "Bugle.Datamodel.OpenSucceedAfterRetries.Counts"
            r7.e(r8, r4)     // Catch: android.database.sqlite.SQLiteDiskIOException -> L6f android.database.sqlite.SQLiteCantOpenDatabaseException -> L71 java.lang.Throwable -> L82
        L6b:
            r0.close()
            return r6
        L6f:
            r6 = move-exception
            goto L72
        L71:
            r6 = move-exception
        L72:
            if (r5 == 0) goto L77
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L82
        L77:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L82
            r7 = 50
            defpackage.albo.bz(r7, r5)     // Catch: java.lang.Throwable -> L82
            int r4 = r4 + 1
            r5 = r6
            goto L23
        L82:
            r10 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r0 = move-exception
            r10.addSuppressed(r0)
        L8b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxn.b(java.lang.String):android.database.sqlite.SQLiteDatabase");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ((maq) this.t.b()).b();
        yyb.am();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            boolean z = true;
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            xyl.k(qxq.i(sQLiteDatabase));
            Cursor rawQuery = sQLiteDatabase.rawQuery("pragma journal_mode", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        if (rawQuery.getString(0).equals("wal")) {
                            rawQuery.close();
                            xyl.k(z);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            z = false;
            xyl.k(z);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        akrh e = aktp.e("DatabaseHelperBasic#onDowngrade");
        try {
            this.y.x((agnw) this.i.get(), this.l, i, i2).onDowngrade();
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        akrh e = aktp.e("DatabaseHelperBasic#onUpgrade");
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        try {
            albo.T(z);
            ((uci) this.i.get()).k.a(sQLiteDatabase);
            this.y.x((agnw) this.i.get(), this.l, i, i2).onUpgrade();
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
