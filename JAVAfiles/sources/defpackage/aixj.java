package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class aixj implements ComponentCallbacks2 {
    public static final alvi a = alvi.m("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final algw d;
    public final List e;
    public final List f;
    public final Executor i;
    public ListenableFuture j;
    public boolean m;
    public final atal n;
    public final ahmn o;
    private final ancr q;
    private ScheduledFuture t;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final asqc p = new asqc(this, null);
    private final andy r = new adnx(this, 17);
    public int k = 0;
    private boolean s = false;
    public boolean l = false;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List, java.lang.Object] */
    @Deprecated
    public aixj(Context context, ScheduledExecutorService scheduledExecutorService, ahmn ahmnVar, ancr ancrVar, akyr akyrVar) {
        this.q = ancrVar;
        this.c = scheduledExecutorService;
        this.o = ahmnVar;
        this.i = new anew(scheduledExecutorService);
        this.b = context;
        this.d = (algw) akyrVar.b;
        this.e = akyrVar.a;
        this.f = akyrVar.c;
        this.n = (atal) akyrVar.d;
    }

    public static andc a(ListenableFuture listenableFuture, Closeable... closeableArr) {
        listenableFuture.getClass();
        return andc.b(new lff(closeableArr, 3), andi.a).e(new xsj(listenableFuture, 11), andi.a);
    }

    public static SQLiteDatabase e(Context context, File file, atal atalVar, algw algwVar, List list, List list2) {
        SQLiteDatabase h = h(context, atalVar, file);
        try {
            if (i(h, atalVar, algwVar, list, list2)) {
                h.close();
                h = h(context, atalVar, file);
                try {
                    akrh e = aktp.e("Configuring reopened database.");
                    try {
                        albo.U(!i(h, atalVar, algwVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        e.close();
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    h.close();
                    throw new aixf("Failed to open database.", e);
                } catch (IllegalStateException e3) {
                    e = e3;
                    h.close();
                    throw new aixf("Failed to open database.", e);
                } catch (Throwable th3) {
                    h.close();
                    throw th3;
                }
            }
            return h;
        } catch (SQLiteException e4) {
            h.close();
            throw new aixf("Failed to open database.", e4);
        } catch (Throwable th4) {
            h.close();
            throw th4;
        }
    }

    public static boolean f(Context context, atal atalVar) {
        int i = atalVar.a;
        if (!((ActivityManager) context.getSystemService("activity")).isLowRamDevice()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean g(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        boolean z;
        int version = sQLiteDatabase.getVersion();
        ((alvg) ((alvg) a.d()).h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).r("Database version is %d", version);
        int i = ((alsx) list).c;
        if (version <= i) {
            z = true;
        } else {
            z = false;
        }
        albo.Y(z, "Can't downgrade from version %s to version %s", version, i);
        agrk agrkVar = new agrk(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                try {
                    if (version != ((alsx) list).c) {
                        akrh e = aktp.e("Applying upgrade steps");
                        try {
                            Iterator<E> it = ((alog) list).subList(version, ((alsx) list).c).iterator();
                            while (it.hasNext()) {
                                ((aixp) it.next()).a(agrkVar);
                            }
                            e.close();
                            sQLiteDatabase.setVersion(((alsx) list).c);
                        } catch (Throwable th) {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    alur it2 = ((alog) list2).iterator();
                    if (!it2.hasNext()) {
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (version != sQLiteDatabase.getVersion()) {
                            return true;
                        }
                        return false;
                    }
                    throw null;
                } catch (SQLiteDatabaseLockedException e2) {
                    e = e2;
                    throw new aixi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteFullException e3) {
                    e = e3;
                    throw new aixi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteOutOfMemoryException e4) {
                    e = e4;
                    throw new aixi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteTableLockedException e5) {
                    e = e5;
                    throw new aixi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (InterruptedException e6) {
                    throw new aixi("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
                }
            } catch (SQLiteDiskIOException e7) {
                e = e7;
                throw new aixi("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (Throwable th3) {
                throw new aixh(th3);
            }
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    private static SQLiteDatabase h(Context context, atal atalVar, File file) {
        int i;
        boolean f = f(context, atalVar);
        if (f) {
            i = 805306368;
        } else {
            i = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new aixf("Failed to open database.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    private static boolean i(SQLiteDatabase sQLiteDatabase, atal atalVar, algw algwVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = atalVar.b.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return g(sQLiteDatabase, list, list2);
    }

    public final andc b() {
        ListenableFuture listenableFuture;
        boolean z;
        ListenableFuture bH;
        aktp.d();
        akrh akrhVar = null;
        try {
            synchronized (this.h) {
                int i = this.k + 1;
                this.k = i;
                if (this.j == null) {
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.U(z, "DB was null with nonzero refcount");
                    akrhVar = aktp.e("Opening database");
                    try {
                        ListenableFuture bN = albo.bN(this.q, this.i);
                        albo.bR(bN, this.r, this.c);
                        bH = ancj.f(bN, akto.a(new agui(this, 20)), this.i);
                    } catch (Exception e) {
                        bH = albo.bH(e);
                    }
                    this.j = bH;
                }
                listenableFuture = this.j;
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            ListenableFuture bJ = albo.bJ(listenableFuture);
            if (akrhVar != null) {
                akrhVar.b(bJ);
            }
            return a(bJ, new ucz(this, 12)).e(akto.e(new xsj(this, 10)), andi.a);
        } finally {
            if (akrhVar != null) {
                akrhVar.close();
            }
        }
    }

    public final void c() {
        if (this.k == 0 && this.j != null) {
            if (this.s) {
                d();
                return;
            }
            this.t = this.c.schedule(new ahsa(this, 13), 60L, TimeUnit.SECONDS);
            if (!this.m) {
                albo.bR(this.j, new adnx(this, 18), this.i);
            }
        }
    }

    public final void d() {
        this.i.execute(new ahsa(this, 14));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        boolean z;
        synchronized (this.h) {
            if (i >= 40) {
                z = true;
            } else {
                z = false;
            }
            this.s = z;
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
