package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udw implements uco {
    private final armf d;
    private static final xze c = xze.g("BugleDatabase", "DatabaseWrapperBusyHandler");
    public static final uuf a = uuh.e(uuh.b, "SqliteLockedHandlerRetryIterations", 20);
    public static final uuf b = uuh.f(uuh.b, "SqliteLockedHandlerBackoffMillis", 50);

    public udw(armf armfVar) {
        this.d = armfVar;
    }

    @Override // defpackage.uco
    public final int e(Exception exc, int i, ude udeVar) {
        if (!(exc instanceof SQLiteDatabaseLockedException)) {
            return 1;
        }
        if (i >= ((Integer) a.e()).intValue()) {
            return 3;
        }
        c.q("got SQLiteDatabaseLockedException");
        if (i == 0) {
            ((mbl) this.d.b()).c("Bugle.Datamodel.DatabaseLocked.Counts");
        }
        albo.bz(((Long) b.e()).longValue(), TimeUnit.MILLISECONDS);
        return 2;
    }

    @Override // defpackage.uco
    public final /* synthetic */ Closeable l(ude udeVar) {
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return true;
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
