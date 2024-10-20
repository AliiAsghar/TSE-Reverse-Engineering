package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkl extends SQLiteOpenHelper {
    private final Context a;
    private final gke b;
    private final boolean c;
    private boolean d;
    private final gkq e;
    private boolean f;
    private final mka g;

    public gkl(Context context, String str, mka mkaVar, gke gkeVar, boolean z) {
        super(context, str, null, 23, new qxl(mkaVar, 1));
        this.a = context;
        this.g = mkaVar;
        this.b = gkeVar;
        this.c = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this.e = new gkq(str, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final gkj a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return gvf.bp(this.g, sQLiteDatabase);
    }

    public final gkd b() {
        boolean z;
        SQLiteDatabase c;
        gkd a;
        File parentFile;
        try {
            gkq gkqVar = this.e;
            if (!this.f && getDatabaseName() != null) {
                z = true;
            } else {
                z = false;
            }
            gkqVar.a(z);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z2 = this.f;
            if (databaseName != null && !z2 && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                c = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    c = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof gkk) {
                        gkk gkkVar = (gkk) th;
                        Throwable th2 = gkkVar.a;
                        int i = gkkVar.b;
                        int i2 = i - 1;
                        if (i != 0) {
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (th2 instanceof SQLiteException) {
                                                th = th2;
                                            } else {
                                                throw th2;
                                            }
                                        } else {
                                            throw th2;
                                        }
                                    } else {
                                        throw th2;
                                    }
                                } else {
                                    throw th2;
                                }
                            } else {
                                throw th2;
                            }
                        } else {
                            throw null;
                        }
                    }
                    if ((th instanceof SQLiteException) && databaseName != null && this.c) {
                        this.a.deleteDatabase(databaseName);
                        try {
                            c = c();
                        } catch (gkk e) {
                            throw e.a;
                        }
                    } else {
                        throw th;
                    }
                }
            }
            if (this.d) {
                close();
                a = b();
            } else {
                a = a(c);
            }
            return a;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            gkq gkqVar = this.e;
            Map map = gkq.a;
            boolean z = gkqVar.b;
            gkqVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d) {
            int i = this.b.f;
            if (sQLiteDatabase.getVersion() != 23) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new gkk(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            gke gkeVar = this.b;
            gkj a = a(sQLiteDatabase);
            Cursor b = a.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (b.moveToFirst()) {
                    if (b.getInt(0) == 0) {
                        z = true;
                    }
                }
                armd.i(b, null);
                ((gig) gkeVar).c.b(a);
                if (!z) {
                    gif a2 = ((gig) gkeVar).c.a(a);
                    if (!a2.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(a2.b)));
                    }
                }
                gig.b(a);
                for (gvf gvfVar : ((gig) gkeVar).b) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new gkk(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            ((gig) this.b).a(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new gkk(4, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x000a, B:15:0x0027, B:17:0x002c, B:22:0x0043, B:24:0x0051, B:27:0x005d, B:28:0x007a, B:29:0x0092, B:32:0x00bf, B:34:0x00c4, B:37:0x00df, B:40:0x00e6, B:41:0x00eb, B:42:0x00ec, B:43:0x00ee, B:46:0x00f3, B:47:0x00f4, B:48:0x00fd, B:50:0x0103, B:52:0x010d, B:55:0x0113, B:56:0x0114, B:59:0x0116, B:60:0x0119, B:68:0x007e, B:69:0x0081, B:70:0x0082, B:72:0x008f, B:73:0x011a, B:74:0x012b, B:82:0x012f, B:83:0x0132, B:45:0x00ef, B:36:0x00dd, B:31:0x00b8, B:19:0x0037, B:21:0x003d, B:9:0x0016, B:11:0x001d, B:65:0x007c, B:79:0x012d), top: B:6:0x000a, inners: #0, #2, #3, #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x000a, B:15:0x0027, B:17:0x002c, B:22:0x0043, B:24:0x0051, B:27:0x005d, B:28:0x007a, B:29:0x0092, B:32:0x00bf, B:34:0x00c4, B:37:0x00df, B:40:0x00e6, B:41:0x00eb, B:42:0x00ec, B:43:0x00ee, B:46:0x00f3, B:47:0x00f4, B:48:0x00fd, B:50:0x0103, B:52:0x010d, B:55:0x0113, B:56:0x0114, B:59:0x0116, B:60:0x0119, B:68:0x007e, B:69:0x0081, B:70:0x0082, B:72:0x008f, B:73:0x011a, B:74:0x012b, B:82:0x012f, B:83:0x0132, B:45:0x00ef, B:36:0x00dd, B:31:0x00b8, B:19:0x0037, B:21:0x003d, B:9:0x0016, B:11:0x001d, B:65:0x007c, B:79:0x012d), top: B:6:0x000a, inners: #0, #2, #3, #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0082 A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x000a, B:15:0x0027, B:17:0x002c, B:22:0x0043, B:24:0x0051, B:27:0x005d, B:28:0x007a, B:29:0x0092, B:32:0x00bf, B:34:0x00c4, B:37:0x00df, B:40:0x00e6, B:41:0x00eb, B:42:0x00ec, B:43:0x00ee, B:46:0x00f3, B:47:0x00f4, B:48:0x00fd, B:50:0x0103, B:52:0x010d, B:55:0x0113, B:56:0x0114, B:59:0x0116, B:60:0x0119, B:68:0x007e, B:69:0x0081, B:70:0x0082, B:72:0x008f, B:73:0x011a, B:74:0x012b, B:82:0x012f, B:83:0x0132, B:45:0x00ef, B:36:0x00dd, B:31:0x00b8, B:19:0x0037, B:21:0x003d, B:9:0x0016, B:11:0x001d, B:65:0x007c, B:79:0x012d), top: B:6:0x000a, inners: #0, #2, #3, #4, #5, #6, #7 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkl.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.a(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new gkk(3, th);
        }
    }
}
