package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acre extends SQLiteOpenHelper {
    private static final acyz a = aczd.a(186226088);

    public acre(Context context) {
        super(context, "undelivered_messages", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final void a() {
        try {
            getWritableDatabase().delete("not_yet_delivered_messages", null, null);
        } catch (SQLiteException e) {
            advr.i(e, "Not able to delete undelivered messages info.", new Object[0]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS not_yet_delivered_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, user_id TEXT NOT NULL, message_id TEXT NOT NULL, UNIQUE (user_id, message_id));");
        } catch (SQLiteReadOnlyDatabaseException e) {
            advr.i(e, "Failed during onCreate.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
            } else {
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
