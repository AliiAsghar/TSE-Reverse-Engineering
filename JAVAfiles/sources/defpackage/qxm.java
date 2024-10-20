package defpackage;

import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxm implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qxm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [arqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, android.database.Cursor] */
    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        if (this.b != 0) {
            String[] strArr = gkj.a;
            return this.a.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
        SQLiteCursor sQLiteCursor = new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        String sQLiteQuery2 = sQLiteQuery.toString();
        if (Collection.EL.stream((alog) ((qxn) this.a).k.get()).anyMatch(new ncc(sQLiteQuery2, 19)) || sQLiteQuery2.contains("/* use_custom_cursor_window_for_testing */")) {
            sQLiteCursor.setWindow(new CursorWindow("bugle-cursor-window", ((Long) qxn.c.e()).longValue()));
        }
        return sQLiteCursor;
    }
}
