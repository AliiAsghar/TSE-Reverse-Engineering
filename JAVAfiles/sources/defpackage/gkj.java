package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkj implements gkd {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final arml b = armd.b(3, ry.h);
    public static final arml c = armd.b(3, ry.g);

    public gkj(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.gkd
    public final Cursor a(gki gkiVar) {
        Cursor rawQueryWithFactory = this.d.rawQueryWithFactory(new qxm(new jle(gkiVar, 1), 1), gkiVar.b(), e, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.gkd
    public final Cursor b(String str) {
        return a(new gkc(str));
    }

    @Override // defpackage.gkd
    public final String c() {
        return this.d.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.gkd
    public final void d() {
        this.d.beginTransaction();
    }

    @Override // defpackage.gkd
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.gkd
    public final void f() {
        this.d.endTransaction();
    }

    @Override // defpackage.gkd
    public final void g(String str) {
        this.d.execSQL(str);
    }

    @Override // defpackage.gkd
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.gkd
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override // defpackage.gkd
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override // defpackage.gkd
    public final gkp k(String str) {
        SQLiteStatement compileStatement = this.d.compileStatement(str);
        compileStatement.getClass();
        return new gkp(compileStatement);
    }

    @Override // defpackage.gkd
    public final void l(Object[] objArr) {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
