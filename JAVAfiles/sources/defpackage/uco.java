package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface uco {
    Cursor a(Cursor cursor, ude udeVar);

    int e(Exception exc, int i, ude udeVar);

    Closeable l(ude udeVar);

    void m(SQLiteDatabase sQLiteDatabase);

    boolean n();
}
